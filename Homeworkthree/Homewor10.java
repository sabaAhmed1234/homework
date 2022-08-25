class  Homewor10 {
public static void main(String[] args)
{
     int month;
     java.util.Scanner input = new java.util.Scanner(System.in);
     System.out.print("the mouths :\n 1: january .  \t2: february. \n");
     System.out.print(" 3: March.  \t4: april . \n");
     System.out.print(" 5: May .  \t6: june . \n");
     //System.out.print(" 1:february .  2:january . \n");

     System.out.print("please enter the month :\n");
     month=input.nextInt();
     if(month == 1){
         System.out.print(" 31 days \n");}
     if(month == 2)
     { System.out.print(" 28 days  \n");}
     if(month == 3){
     System.out.print(" 31 days \n");}
     if(month == 4)
     { System.out.print(" 30 days  \n");}
     if(month == 5){
     System.out.print(" 31 days \n");}
     if(month == 6)
     { System.out.print(" 31 days  \n");}
     
     
     
     


}


}