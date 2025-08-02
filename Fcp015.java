import java.util.*;
public class Fcp015{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
int A = sc.nextInt();
int B = sc.nextInt();
int C = sc.nextInt();
int D = sc.nextInt();
int big =0;
int big1=0;
if(A>B){big=A;}
else{big=B;}
if(big> C){big1=big;}
else{big1=C;}
if(big1>D)
{System.out.println(big1);}
else{System.out.println(D);}
}



}