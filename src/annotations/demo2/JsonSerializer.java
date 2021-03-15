package annotations.demo2;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class JsonSerializer {

    public String serialize(Object object) {
        try {
            Class<?> aClass = Objects.requireNonNull(object).getClass();
            Map<String, String> jsonFields = new HashMap<>();

            for (Field field: aClass.getDeclaredFields()) {
                field.setAccessible(true);
                if (field.isAnnotationPresent(JsonField.class)) {
                    jsonFields.put(getKey(field), (String) field.get(object));
                }
            }

            return toJsonString(jsonFields);

        } catch (IllegalAccessException iae) {
            throw new IllegalArgumentException("Bad Fields");
        }
    }

    private String toJsonString(Map<String, String> jsonMap) {
        String json = jsonMap.entrySet()
                .stream()
                .map(entry -> "\""  + entry.getKey() + "\":\"" + entry.getValue() + "\"")
                .collect(Collectors.joining(","));
        System.out.println(json);
        return "{" + json + "}";
    }

    private static String getKey(Field field) {
        String annoValue = field.getAnnotation(JsonField.class).value();

        if (annoValue.isEmpty()) {
            return field.getName();
        }

        return annoValue;
    }

}
