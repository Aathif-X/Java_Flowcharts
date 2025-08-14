import java.util.*;
public class Fcp033{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int temp=N;
int sum=0;
int r=0;
while(N!=0){
r=N%10;
sum=sum*10+r;
N=N/10;
}
if(temp==sum){
System.out.println("yes");
}
else{System.out.println("no");}
}
}