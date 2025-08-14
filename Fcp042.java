import java.util.*;
public class Fcp042{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int a=0;
int b=1;
int c=0;
int i=1;
if(N==1){System.out.println(a); }
else { System.out.println(a);
System.out.println(b);
while(i<=N-2){
c=a+b;
System.out.println(c);
a=b;
b=c;
i++;
}
}


}}