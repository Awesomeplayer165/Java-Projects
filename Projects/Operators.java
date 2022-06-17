class Operators {
    public static void main(String[] args) {
        /*
        Write a program that converts temperature from Fahrenheit to Celsius.
        The formula for conversion is: C = 5 / 9 * ( F - 32 ).
         */

        float fahrenheit = Float.parseFloat(args[0]);
        float celsius    = (fahrenheit - 32) * 5/9;
        System.out.println(celsius);


        int a = 10;
        a = (--a) + (++a);
        int b = (a++) + (a--);
        System.out.println(a+" "+b);

        int w, x, y, z;
        x = 2;
        y = 6;
        z = ++x + y--;
        /*
        x = 3
        y = 5
        z = 8
         */
        w = ++z - x++;
        /*
        x = 4
        y = 5
        z = 9
        w = 6
         */
        System.out.println((x*2) + " " + (y-1) + " " + (w-z)); // 8 4 -3

        /*
        Create an array having five strings. Print the length of the largest string.
        Use the previous array and find the length of the smallest string.
        Print the difference between the length of the largest and smallest strings.
         */

        String[] names = new String[] { "Jacob", "Nathan", "Roneet", "Alexander", "May" };

        String largestItem = "";

        for (String name: names) {
            largestItem = (name.length() > largestItem.length()) ? name : largestItem;
        }

        System.out.println(largestItem);
    }
}