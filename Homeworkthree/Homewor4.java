

class  Homewor4 {
public static void main(String[] args)
{
     int number;
     java.util.Scanner input = new java.util.Scanner(System.in);

     System.out.print("please enter the number :\n");
     number=input.nextInt();
     if(number<=10){
     System.out.print(" 2numbers \n");}
     else if(number<= 100)
     { System.out.print(" 2 numbers  \n");}
     else if(number<=1000){
     System.out.print(" 3 numbers \n");}
     else if(number<=10000)
     { System.out.print(" 4 numbers  \n");}
     else if(number<=100000){
     System.out.print(" 5 numbers \n");}
     else if(number<= 1000000)
     { System.out.print("6 numbers  \n");}
     
}
}