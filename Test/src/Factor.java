
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
class ArmSrtong{
    int c=0,a,temp;
    public void armstrong(int i){
      int n=i;
      while(n>0){
      a=n%10;
      n=n/10;
      c=c+a*a*a;}
      if(c==i){
      System.out.println(i+" = is arm Stron Number");}
      else{System.out.println(i+" == is not arm Stron Number");}
    }
    public void factor(int g)
    {
     int a=g,i,m=0;
      for(i=1;i<=a;i++)
     {
         if(a%i==0){
         System.out.print("factor of entered number is= "+i+",");
         m++;}
        }
        System.out.println("total number of factor of" + g +" is "+m);}
    public void prime(int number){
        int p=number,k,flag=0;
    for(int h=2;h<=p;h++){
    if(p%h==0){
    System.out.println(number+" = is not prime number");
    flag=1;
    break;}}
    if(flag==0){System.out.println(number+" =" + "" + " is not prime number");}
    }
    public void fibonocci(int number){
    int n=number,n1=0,n2=1,n3;int in=0;
    System.out.print("fibonocci series= "+n1+", "+n2+", ");
    for(int i=3;i<=n;i++){
    n3=n1+n2;
    System.out.print(n3+", ");
    n1=n2;
    n2=n3;
    in++;
    if(in%10==0){
    System.out.println("   ");}}
    }
    public void pallindrome(int number){
    int n=number,c=0;
    while(n>0){
    int g=n%10;
    n=n/10;
    c=g+10*c;
    if(c==number){
    System.out.println(c+" is pallindrome number");}
    }
    if(c!=number){
    System.out.println(number+" is not palindrome  number");}
}
}
public class Factor {
    public static void main(String args[]){
   Scanner scanner = new Scanner(System.in);
    System.out.print("enter your number for check ");
    int name = scanner.nextInt();
    System.out.println("you hava entered number is "+name);
        ArmSrtong b=new ArmSrtong();
        b.armstrong(name);
        b.factor(name);
        b.prime(name);
        b.fibonocci(name);
        b.pallindrome(name);
 }}