package annotations.demo1;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface AnnotationCustom {

    public enum Priority {LOW, MED, HIGH};
    Priority priority() default Priority.LOW;
    String author() default "Vivek";

}
