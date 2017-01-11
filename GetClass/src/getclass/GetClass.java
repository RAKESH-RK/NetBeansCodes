package getclass;


import java.lang.reflect.Method;
import static java.nio.file.Files.size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class GetClass {
    public static void main(String[] args) {
       /* int count=0;
        Object o=new String("rakesh");
        Class c=o.getClass();
        System.out.println("fully qualified name of class : "+c.getName());
        Method[] m=c.getDeclaredMethods();
        System.out.println("method information");
        for(Method m1:m)
        {
            count++;
            System.out.println(m1.getName());
        }
    System.out.println("number of method"+count); */
    /*    int sum=1;
        for(int i=0;i<10;i++){
        sum=sum+i*2;
        System.out.println(sum);}*/
        
        
        
       Scanner s=new Scanner(System.in);
       TreeSet <Integer> mylist;
       mylist=new TreeSet<>();
       int n,i,num;
       System.out.println("Enter number of element");
       n=s.nextInt();
       for(i=0;i<n;i++)
       {
           num=s.nextInt();
           mylist.add(num);
       }
       System.out.println("your Array is ");
       Iterator it=mylist.iterator();
       while(it.hasNext()){
        System.out.println(it.next()+"\t" );}
       int size=mylist.size();
       System.out.println("\nlargest s = "+mylist.last());
       ArrayList<Integer> arr=new ArrayList<>();
       arr.addAll(mylist);
       System.out.println("Second Largest number is = "+arr.get(size-2) );
        
}
    
}