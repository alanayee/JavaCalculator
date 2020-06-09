import java.util.Scanner;
public class calculator{
    public static void main(String [] args){
        Scanner inputs = new Scanner(System.in);
        System.out.println("Do you want to add, subtract, multiply, or divide?");
        System.out.println("Enter + for addition, - for subtraction, * for multiplication, or / for subtraction");
        String operation = inputs.nextLine();
        System.out.println("Enter first number: ");
        double number-1 = inputs.nextDouble();
        System.out.println("Enter second number: ");
        double number-2 = inputs.nextDouble();

        if (operation.equals("+")){
            double result = number-1 + number-2;
            System.out.println(result);
        }
        else if (operation.equals("-")){
            double result = Math.abs(number1 - number2);
            System.out.println(result);
        }
        else if (operation.equals("/")){
            double result = number1/number2;
            System.out.println(result);
        }

        else if(operation.equals("*")){
            double result = number1*number2;
            System.out.println(result);
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}

