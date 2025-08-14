import java.util.*;
public class Fcp039{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int A = sc.nextInt();
int max=A;
int min=A;
for(int i =1;i<N;i++){
int X= sc.nextInt();
if(max<X){max=X;}
else{max=max;}
if(min>X){min=X;}
else{min=min;}
}
System.out.println(max);
System.out.println(min);


}}