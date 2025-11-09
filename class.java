public class {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100 are:");

        for (int num = 2; num <= 100; num++) { // start from 2 since 1 is not prime
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        // Check divisibility up to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Not prime
            }
        }

        return true; // Prime number
    }
}

