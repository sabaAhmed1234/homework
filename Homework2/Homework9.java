class Homework9 {
public static void main(String[] args)
{
     int number1,number2,sum,difference,product,average;

     java.util.Scanner input = new java.util.Scanner(System.in);
     System.out.print("please enter the number one \n");
     number1=input.nextInt();
     System.out.print("please enter the number two  \n");
     number2=input.nextInt();
     sum=number1+number2;
     difference=number1-number2;
     product=number1*number2;
     average=sum/2;
     System.out.println("the sum = "+sum);
     System.out.println("*********");
     System.out.println("difference = "+difference);
     System.out.println("*********");
     System.out.println("product = "+product);
     System.out.println("*********");
     System.out.println("average = "+average);
     System.out.println("*********");
     System.out.println("distance="+Math.abs(difference));
     System.out.println("min="+Math.min(number1,number2));
     System.out.println("max="+Math.max(number1,number2));











}


}