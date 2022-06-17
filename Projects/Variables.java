class Variables {
    public static void main(String[] args) {
        /*
        Create two variables and store numbers in them.
        Create another variable which can store the sum of those two numbers.
        Print all the variables in separate lines.

        Extend the previous exercise.
        Store the addition, subtraction, multiplication and division in different variables.
        Print all the variables.
         */

        int number1 = 34;
        int number2 = 10;

        int sumOfNumbers        =         number1 + number2;
        int differenceOfNumbers =         number1 - number2;
        int productOfNumbers    =         number1 * number2;
        float quotientOfNumbers = (float) number1 / number2;

        System.out.println(number1 + ", " + number2 + ", "  + sumOfNumbers);
        System.out.println(number1 + ", " + number2 + ", "  + differenceOfNumbers);
        System.out.println(number1 + ", " + number2 + ", "  + productOfNumbers);
        System.out.println(number1 + ", " + number2 + ", "  + quotientOfNumbers);

        /*
        Write a program that has three variables of different types.
        Each variable is supposed to have a constant value.
        Declare the variables accordingly and assign them a value.
        Print these three variables in the same line.
         */

        final char character = 97;
        final int number     = 12;
        final double decimal = 23.3;

        System.out.println(character + ", " + number + ", "  + decimal);
    }
}