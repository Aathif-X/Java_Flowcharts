import java.util.*;
public class Fcp016{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
int x= sc.nextInt();
if(x%4==0){
if(x%100==0){
if(x%400==0){
System.out.println("Yes");}
else { System.out.println("No");    }} 
else { System.out.println("Yes");}} 
else { System.out.println("No"); }
    

}
}