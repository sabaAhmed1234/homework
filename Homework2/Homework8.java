class Homework8 {
public static void main(String[] args)
{
     double number,square,cube;
     double power;

     java.util.Scanner input = new java.util.Scanner(System.in);
     System.out.print("please enter number  \n");
     
     number=input.nextDouble();
     square=number*number;
     cube=number*number*number;
     System.out.println("square = "+square);
     System.out.println("*********");
     System.out.println("cube = "+cube);
     System.out.println("power = "+Math.pow(number,4));






}


}