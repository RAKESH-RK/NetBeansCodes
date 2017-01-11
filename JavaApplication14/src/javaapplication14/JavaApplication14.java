
package javaapplication14;

import java.util.Scanner;

public class JavaApplication14 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long n=sc.nextLong();
        int a1=0,a2=0,a3=0,a4=0,a5=0,a6=0,a7=0,a8=0,a9=0,a0=0;
        while(n>0){
        long d=n/10;
        long r=n%10;
        n=d;
       // System.out.println("r="+r);
        //System.out.println("d="+d);
        if(r==0){ a0++;}
        else if(r==1){a1++;}
         else if(r==2){a2++;}
         else if(r==3){a3++;}
         else if(r==4){a4++;}
         else if(r==5){a5++;}
         else if(r==6){a6++;}
         else if(r==7){a7++;}
         else if(r==8){a8++;}
         else if(r==9){a9++;}
       
        }
        System.out.println("0="+a0);
        System.out.println("1="+a1);
        System.out.println("2="+a2);
        System.out.println("3="+a3);
        System.out.println("4="+a4);
        System.out.println("5="+a5);
        System.out.println("6="+a6);
        System.out.println("7="+a7);
        System.out.println("8="+a8);
        System.out.println("9="+a9);
    
    }
    
}
