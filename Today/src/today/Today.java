package today;
import java.util.Scanner;
public class Today {
public static void main(String[] args)
{
    /*
    Scanner sc = new Scanner(System.in);
    
    System.out.println("User name");
    String name=sc.nextLine();
    
    System.out.println("Age");
    float age=sc.nextFloat();
    
    System.out.println("marital_Status");
   String marital=sc.nextLine();
   
    System.out.println("Teliphone Number");
    int tel=sc.nextInt();
    
    System.out.println("User name= "+name);
    System.out.println("you have enterd ur age = "+age);
    System.out.println("marital_Status = "+marital);
    System.out.println("your Tel no.= "+tel);
    sc.close();*/
  
    for(int i = 1; i <= 50; i++)
    { if(i % (3*5) == 0) 
    {System.out.println("FizzBuzz");}
     else if(i % 5 == 0) 
    { System.out.println("Buzz"); }
            else if(i % 3 == 0) 
            {  System.out.println("Fizz");}
            else{ System.out.println(i);}

    }
    
}
}
