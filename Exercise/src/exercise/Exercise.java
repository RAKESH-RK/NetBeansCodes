package exercise;
public class Exercise 
{
public static void main(String[] args) 
{
    boolean b=true;
    if(b==false)
    {
    System.out.println("hello");
    }
    else
    {
     System.out.println("hi");
    }
    int []s={1,2,4,6,8};
    for(int i=0;i<=4;i++)
    {
        System.out.println(s[i]);
    }
    for(int i:s)
    {
        System.out.println(i);
    }
}
}
