import java.util.*;
public class reverse
{
public static void main(String []args)
{
int n;
int sum=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
while(n>0)
{
int rem=n%10;
sum=sum*10+rem;
n=n/10;
}
System.out.println(sum);
}
}
