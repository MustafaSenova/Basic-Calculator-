package Temp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number1,number2,result;
        int select;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number = ");
        number1 = input.nextInt();
        System.out.println("Enter your second number = ");
        number2 = input.nextInt();

        System.out.println("1-ADDING PROCESS / 2-SUBTRACTION / 3-DIVISION / 4-MULTIPLICATION ");
        System.out.println("Your Choice = ");
        select = input.nextInt();


        switch (select){
            case 1:
                result = number1 + number2 ;
                System.out.println("Result is " + result);
                break;
            case 2:
                result = number1 - number2 ;
                System.out.println("Result is " + result);
                break;
            case 3:
                result = (number1 / number2) ;
                System.out.println("Result is " + result);
                break;
            case 4:
                result = number1 * number2 ;
                System.out.println("Result is " + result);
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}
