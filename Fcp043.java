import java.util.*;
public class Fcp043{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int X=sc.nextInt();
float sum1=0.0f;
for(int i=1;i<=N;i++){
float sum=1;
for(int j=1;j<=i;j++){
sum=sum*X;}
sum1=sum1+(sum/i);}
float d=sum1*10;
int c=(int)d;
int v=c%10;
if(v==6||v==7||v==8||v==9){
System.out.println((int)(sum1+1));}
else{
System.out.println((int)sum1);}
}}
