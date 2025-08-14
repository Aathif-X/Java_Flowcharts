import java.util.*;
public class Fcp036{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int n=sc.nextInt();
int i=1;
int hcf=1;
int min=m;
if(n<m){
min=n;
}
while(i<=min){
if(m%i==0){
if(n%i==0){
hcf=i;
}
}
i=i+1;
}
int lcm=(m*n)/hcf;
System.out.println(hcf);
System.out.println(lcm);
}
}
