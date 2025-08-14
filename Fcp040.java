import java.util.*;
public class Fcp040{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int max=0;
int max1=0;
for(int i=0;i<N;i++){
int x=sc.nextInt();
if(i==0){
max=x;
max1=0;
}else{
if(max-x<0){
int t=max;
max=x;
max1=t;
}else{
if(max1-x<0){
max1=x;
}}}}
System.out.println(max1);
}}
