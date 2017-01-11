package prime_nm;

import javax.swing.JApplet;

class Prime
{
   /* int flag=0;
    public void prime(int n)
    {
        int m=n/2;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                System.out.println(n+" =number is not prime");
                flag=1;
                break;
            }
            if(flag==0)
            {
                System.out.println(n+" =number is prime");
            }
        }
    }
}
public class Prime_nm {   
    public static void main(String[] args) {
        Prime m=new Prime();
        m.prime(50);
        System.out.println(m.toString());
    }
    */
   // public class Equals extends JApplet {

   String name;
   int rollno;

    private Prime(String f, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void Prime(String name,int rollno) {
        this.name=name;
        this.rollno=rollno;
    }
    public static void main(String[] args){
        Prime s1=new Prime("F",1);
        Prime s2=new Prime("R",1);
        Prime s3=new Prime("F",1);
        Prime s4=s1;
        System.out.println(s1.equals(s2));
         System.out.println(s1.equals(s3));
          System.out.println(s1.equals(s4));
    }
}

