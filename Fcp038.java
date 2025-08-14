import java.util.*;
public class Fcp038{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int r =0;
int c=0;
int temp=N;
if(N<10){c=1;}
else if(N<100){c=2;}
else if(N<1000){c=3;}
else if(N<10000){c=4;}
else if(N<100000){c=5;}
else if(N<1000000){c=6;}
else if(N<10000000){c=7;}
else{c=8;}
int sum1=0;
while(N!=0){
r=N%10;
int sum =1;
for(int i=1;i<=c;i++){
sum=sum*r;
}sum1=sum1+sum;
N=N/10;
}
if(temp == sum1){
System.out.println("Yes");}
else{System.out.println("No");}
}}