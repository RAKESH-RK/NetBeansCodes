package array;
import java.util.Scanner;
/**author RAKESH
 */
public class ArrayReverse {
 public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       System.out.println("u hv entered no.= "+n);
       /*
      for(int j=n;j>0;j--)
       {
          //System.out.print("-");
           //for(int i=1; i<=( (j * 2)-(j-1)); i++)
           for(int i=1; i<=j-1; i++)
           {
               System.out.print(" ");
           }
           for(int k=1;k<=j;k++)
           {
               System.out.print("*");
           }
           System.out.println();
          // o/p
          //    ####*****
           //   ###****
           //   ##***
           //   #**
           //   *
       }
       */
       /*
       int m=0,r=0;
       for(int i=n;i>=1;i--)//n=given number
       {   m++;
           System.out.print(i+" ");
           for(int j=1;j<=i-1;j++)
           {
               System.out.print("/");   
           }
           for(int k=1;k<=m;k++)
           {
               System.out.print("*");
           }
           System.out.println("");
       }
       for(int i=n;i>=1;i--)
       { 
           r++;
           System.out.print(i+" ");
           for(int j=1;j<=r;j++)
           {
               System.out.print("/");
           }
           for(int k=1;k<=n-r;k++)
           {
               System.out.print("*");
           }
           System.out.println("");
       }
      */
       
//       
//        int m=0,r=0;
//       for(int i=0;i<n;i++)//n=given number
//       {   m++;
//           System.out.print(i+" ");
//           for(int j=1;j<n-i;j++)
//           {
//               System.out.print("/");   
//           }
//           for(int k=1;k<2+i;k++)
//           {
//               System.out.print(" * ");
//           }
//           System.out.println("");
//       }
//       for(int i=n;i>=1;i--)
//       { 
//           r++;
//           System.out.print(i+" ");
//           for(int j=1;j<=r;j++)
//           {
//               System.out.print("/");
//           }
//           for(int k=1;k<=n+1-r;k++)
//           {
//               System.out.print(" * ");
//           }
//           System.out.println("");
//       }
//      
     /*  
       for(int i = 0; i < n; i++) {
           for(int k = n; k > i; k--) // N
            System.out.print(" ");
           for(int j = 0; j < i; j++) //N
            System.out.print("* ");
           System.out.println();
       }
       
       //N(N + N) = N*N + N*N = 2*N*N = 2*N^2 = N^2
       //N^2
       
       for(int i = n; i > 0; i--) {
           for(int k = i; k < n; k++)
            System.out.print(" ");
           for(int j = 0; j < i; j++)
            System.out.print("* ");
           System.out.println();
       }
       */
      // Scanner sc=new Scanner(System.in);
         //Scanner sc=new Scanner(System.in);
       
       /*
       String prime="" ,notPrime="";
       int i=1,j=0;
       for(i=1;i<=n;i++)
       {
           int count=0;
            for(j=i;j>=1;j--)
            {
            if(i%j==0)
            {  
               count++;
               System.out.println(count);
            }
            }
            if(count==2)
            {
                prime=prime+i+" ";
            }
            if(count>2){
                notPrime=notPrime+i+" ";
            }
      
       }
       System.out.println("not prime is= "+notPrime);
       System.out.println("prime is= "+prime);*/
       
       
       int count=0;
       for(int i=n;i>=2;i--)
       {
           if (n%i==0){
               count++;
           }
           //System.out.print("prime" +count);
       }
       if(count==1){
       System.out.print("prime== " +n);
       }
       if(count>1){
       System.out.print("Not prime== " +n);
       }
 }
}
