class Homework5 {
public static void main(String[] args)
{
     int num1,num2,swap;
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("please the two numbers you want to switch between :\n");
    num1=input.nextInt();
    num2=input.nextInt();
    swap=num1;
    num1=num2;
    num2=swap;

    System.out.println("num1 = "+num1);
    System.out.println("num2 = "+num2);




}


}