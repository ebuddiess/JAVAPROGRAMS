import  java.util.Scanner;
class Circle
{
 public static void main(String [ ]args)
{
  double r , ar=0;
 Scanner s = new Scanner(System.in);
 System.out.println("Enter radius of circle");
 r=s.nextDouble();
s.close();
ar=3.14*r*r;
System.out.println("Area is "+ar);
}
}