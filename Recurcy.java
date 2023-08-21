public class Recurcy {

    public static void main(String[] args) {
        System.out.print("The sum of the digits of the natural number 179: " + sumOfDigs(179));
        System.out.println();
        System.out.print("Is the number 8 a power of 2: ");
        checkPowerOfTwo(8);
        System.out.print("Is the number 3 a power of 2: ");
        checkPowerOfTwo(3);
    }

    public static int sumOfDigs(int number) {
        if(number < 10) {
            return number;
        } else {
            return number % 10 + sumOfDigs(number / 10);
        }
    }

    public static void checkPowerOfTwo(int number) {
        if(number == 2) {
            System.out.println("Yes");
        } else {
            if(number % 2 == 0) {
                checkPowerOfTwo(number / 2);
            } else {
                System.out.println("No");
            }
        }
    }
}

