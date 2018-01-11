import java.util.Scanner;
class largestnumber {
public static void main(String []args){
int a,b,c,temp,result=0;
Scanner s = new Scanner(System.in);
System.out.println("Enter First");
a=s.nextInt();
System.out.println("Enter Second");
b=s.nextInt();
System.out.println("Enter Third");
c=s.nextInt();
s.close();
temp=a>b?a:b;
result=temp>c?temp:c;
System.out.println("Largest is "+result);
}}
