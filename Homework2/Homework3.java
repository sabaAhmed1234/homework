class Homework3 {
public static void main(String[] args)
{
     double arae,width,length,circum;

     java.util.Scanner input = new java.util.Scanner(System.in);
     System.out.print("please enter the length  \n");
     length=input.nextDouble();
     System.out.print("please enter the width  \n");
     width=input.nextDouble();
     arae=length*width;
     circum=2*(length+width);
     System.out.println("arae = "+arae);
     System.out.println("*********");
     System.out.println("circum = "+circum);




}


}