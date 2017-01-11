
package javaapplication16;

import java.util.Scanner;


public class Pratice15 {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=2;i--){
        for (int j=1;j<=n*2-(i-1);j++){//jo hai usase 1 km
            System.out.print(" ");
        }
        for(int k=1;k<=i*2-1;k++){//n ke dugane se 1 adhik
        System.out.print("*");
        }
        System.out.println();
        }
        for(int i=1;i<=n-1;i++){
            System.out.print(" ");
        }
            System.out.print("*");
        for(int i=1;i<=n;i++){
            System.out.print("-");
        }
        System.out.println("*");
        for(int i=2;i<=n;i++){
            for(int j=1;j<=n-i;j++ ){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
