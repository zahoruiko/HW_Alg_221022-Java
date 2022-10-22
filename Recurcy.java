public class Recurcy {

    public static void main(String[] args) {
        System.out.print("Сумма цифр натурального числа 179: " + sumOfDigs(179));
        System.out.println();
        System.out.print("Является ли число 8 степенью 2: ");
        checkPowerOfTwo(8);
        System.out.print("Является ли число 3 степенью 2: ");
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

