package programs.stream;

import java.util.stream.IntStream;

public class S1PrimeNumber {
    public static void main(String[] args) {
        System.out.println(countPrime(10));
        printPrime(10);
    }

    private static void printPrime(int upTo) {
        IntStream.range(2, upTo)
                .filter(S1PrimeNumber::isPrime)
                .forEach(System.out::println);
    }

    private static long countPrime(int upTo) {
        return IntStream.range(2, upTo)
                .filter(S1PrimeNumber::isPrime)
                .count();
    }


    private static boolean isPrime(int number) {
        return IntStream.range(2, number)
                .allMatch(x -> (number % x) != 0);
    }

}
