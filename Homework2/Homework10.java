class Homework10 {
public static void main(String[] args)
{
     int number1,number2,sum,difference,product;
     double average;

     java.util.Scanner input = new java.util.Scanner(System.in);
     number1=20;
     number2=25;
     sum=number1+number2;
     difference=number1-number2;
     product=number1*number2;
     average=sum/2;
     System.out.println("the sum    \t"+sum);
     System.out.println("difference\t "+difference);
     System.out.println("product    \t"+product);
     System.out.println("average    \t"+average);
     System.out.println("distance:  \t"+Math.abs(difference));
     System.out.println("max :      \t"+Math.max(number1,number2));
     System.out.println("min :      \t"+Math.min(number1,number2));











}


}