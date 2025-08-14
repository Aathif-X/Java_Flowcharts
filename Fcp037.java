import java.util.*;
public class Fcp037{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int sum =0;
int temp=N;
for(int i=1;i<N;i++){
if(N%i==0){
sum=sum+i;
}
}
if(temp==sum){
System.out.println("Yes");}
else{System.out.println("No");}

}}