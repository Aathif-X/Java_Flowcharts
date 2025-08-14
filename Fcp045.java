import java.util.*;
public class Fcp045{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int space =0;
int star=0;
for(int i=1;i<=N;i++){
if(i<=N){
space= N-i;
star= (i*2)-1;
}
for(int j=1;j<=space;j++){
System.out.print(" ");
}
for(int k=1;k<=star;k++){
System.out.print("* ");
}
System.out.println();
}




}}