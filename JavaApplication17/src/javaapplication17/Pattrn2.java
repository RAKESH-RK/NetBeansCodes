
package javaapplication17;

import java.util.Scanner;


public class Pattrn2 {

    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
    System.out.print("enter the ");
    int n=input.nextInt();
   /* int p=n;
    for(int i=1;i<=1;i++)
        {
            System.out.print("*");
        }
        System.out.print(" ");
        p--;
    

    for(int k=1;k<=n;k++)
    {
        System.out.print("-");
    }
    System.out.println(" *");
    for(int m=1;m<=n;m++)
    {
        for(int i=1;i<=2*m-1;i++)
        {
            System.out.print("*");
        }
    System.out.println(" ");
           ====================
           */

           for(int j=n,p=1;j>=2;j--,p++)
{
for(int i=1;i<=n+p;i++)
System.out.print(" ");

for(int k=1;k<=2*j-1;k++)
System.out.print("*");
System.out.println("");
}

for(int i=1;i<=n-1;i++)
System.out.print(" ");

System.out.print("*");

for(int i=1;i<=n;i++)
System.out.print("-");

System.out.print("*");
System.out.println("");
int q=n-2;
for(int j=2;j<=n;j++)
{
for(int i=1;i<=q;i++)
System.out.print(" ");
q--;

for(int k=1;k<=2*j-1;k++)
System.out.print("*");

System.out.println("");
}
    }
    }
    

