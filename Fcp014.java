import java.util.*;
public class Fcp014{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
int A = sc.nextInt();
int B = sc.nextInt();
int C = sc.nextInt();
int big =0;
if(A>B){big=A;}
else{big=B;}
if(big> C){
System.out.println(big);}
else{System.out.println(C);}
}
}