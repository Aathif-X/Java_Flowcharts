import java.util.*;
public class Fcp029{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int sum=0;
while(N!=0){
sum = sum+(N % 10);
N=N/10;
}
System.out.println(sum);
}
}