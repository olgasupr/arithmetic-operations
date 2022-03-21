package src;

public class Main {

    public static void main(String[] args) {
	//Program that performs all arithmetic operations and prints the results to the console
        int val1 = 5, val2 = 12;
        //addition
        System.out.println("The sum of two values is: " + (val1+val2));

        //subtraction
        System.out.println("val2 minus val1 equals: " + (val2 - val1));

        //multiplication
        System.out.println("val1 multiplied by val2 equals: " + (val1*val2));

        //division
        System.out.println("val2 divided by val1 equals: " + ((float)val2/(float)val1));

        //modular operation
        System.out.println("val2 % val1 equals: " + (val2 % val1));
    }
}
