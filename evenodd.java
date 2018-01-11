import java.util.Scanner;
class evenodd{
public static void main(String []args)
{
  int num;
  Scanner s = new Scanner(System.in);
System.out.println("Enter the number");
num=s.nextInt();
s.close();
if(num%2==0)
System.out.println("Even");
else
System.out.println("Odd");
}}
