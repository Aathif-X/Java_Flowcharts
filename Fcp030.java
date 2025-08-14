import java.util.*;
public class Fcp030{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int x=0;
int c=0;
for(int i =1;i<=n;i++){
x=i*i;
if(x==n){
c=c+1;}}
if(c==1){System.out.println("Yes");}

else{System.out.println("No");}

}
}
