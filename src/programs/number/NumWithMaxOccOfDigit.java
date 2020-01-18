package programs.number;

public class NumWithMaxOccOfDigit {

    public static void main(String[] args) {

        int[] arr = {1, 123, 11, 11312, 24111141};

        System.out.print(numWithMaxOccOfDigit(4, arr));
    }

    private static int numWithMaxOccOfDigit(int k, int[] arr) {
        if (arr.length <= 0)
            return -1;

        int result = 0;
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 0;

            while (num%10 > 0) {
                if(num%10 == k)
                    count++;
                num = num/10;
            }

            if(count > maxCount) {
                result = arr[i];
                maxCount = count;
            }
        }

        return result;
    }

}
