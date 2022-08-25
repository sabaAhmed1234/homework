class  Homewor7 {
public static void main(String[] args)
{
     double n,n1,n2;
     java.util.Scanner input = new java.util.Scanner(System.in);
     System.out.print("please enter three numbers\n");
     n=input.nextDouble();
     n1=input.nextDouble();
     n2=input.nextDouble();
     if(n<n1&&n1<n2||n>n1&&n1>n2){
         System.out.print(" in order \n");}
     else
     { System.out.print("not in order  \n");}
     
     


}


}