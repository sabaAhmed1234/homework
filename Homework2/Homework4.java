class Homework4 {
public static void main(String[] args)
{
     int num1,num2,num3,num4,sum;
     float average;
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("please enter the four number\n");
    num1=input.nextInt();
    num2=input.nextInt();
    num3=input.nextInt();
    num4=input.nextInt();

    sum=num1+num2+num3+num4;
    average=sum/4;
    System.out.println("average = "+average);



}


}