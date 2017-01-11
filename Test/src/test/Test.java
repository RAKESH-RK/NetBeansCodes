package test;

//1st:--there is description about inheritance and single inheritance.
/*
class Parent
{
    int a=19,b=12;
    void showf()
    {
    //int a=19,b=12;
       //NOTE
       // inheritance me child class parent class ke method and variable
        //ko use kr sakta hai lekin child class parent class ke method ke andar
        //ke variable ko use nhi kr sakata,

   System.out.print("parent class  ");
   System.out.println("pa="+a+", pb="+b);
    }
}
class Child extends Parent
//INHERITANCE PROVIDE KARNE KELIYE HI pridefined extends key word use hota hai
{
    void showc()
    {
        System.out.println("child class");
        System.out.println("ca="+a+", cb="+b);
    }
}
    
class Test
{
 public static void main(String[] args)
 {
     Child v=new Child();
     //inheritance ki vajah se hm yha parent class ke object bina banaye 
            // usake method & variable ko use kr pa rhe hai 
     v.showc();
     v.showf();     
    }
} 
========================================================================
*/
/*
//2nd:--multileval inheritance
class GrandFather
{
    int m=60,n=55;
    void showg()
    {
         System.out.println("grand father class ");
        System.out.println("mg= "+m+", ng= "+n);
    }
}
class Parent extends GrandFather
{
    int a=19,b=12;
    void showf()
    {
    //int a=19,b=12;
       //NOTE
       // inheritance me child class parent class ke method and variable
        //ko use kr sakta hai lekin child class parent class ke method ke andar
        //ke variable ko use nhi kr sakata,

   System.out.print("parent class  ");
   System.out.println("pa="+a+", pb="+b);
    }
}
class Child extends Parent
//INHERITANCE PROVIDE KARNE KELIYE HI pridefined extends key word use hota hai
{
    void showc()
    {
        System.out.println("child class");
        System.out.println("ca="+a+", cb="+b);
    }
}
    
class Test
{
 public static void main(String[] args)
 {
     Child v=new Child();
     //inheritance ki vajah se hm yha parent class ke object bina banaye 
            // usake method & variable ko use kr pa rhe hai 
     v.showc();
     v.showf();   
     v.showg();
    }
}
============================================================================
*/
/*
//3rd:-- hirarical inheritance
class Parent
{
    int m=60,n=55;
    void showg()
    {
         System.out.println(" father class ");
        System.out.println("mg= "+m+", ng= "+n);
    }
}
class Child1 extends Parent
{
    void showc1()
    {
        System.out.print("child1 class ");
        System.out.println("father's methods & variable in child1"+"ch1="+m+", ch1="+n);
    }
}
class Child2 extends Parent
{
    void showc2()
    {
        System.out.println("father class in child2 class");
        System.out.println(" father's methods & variablein child 2"+"ch2="+m+", ch2="+n);
    }
}
    
class Test
{
 public static void main(String[] args)
 {
     Child1 v=new Child1();
      v.showc1();
      v.showg();
       Child2 b=new Child2();
     b.showc2();   
     b.showg();
    }
}
=============================================================================
*/
/*yha pr ab aap ko yh sochane ki jarurat hai ki kya hoga agr
parent class and child class ke pass same name ke method ho,
aap yha pe 1st program me jake soche

es tarah ke condition me hmesh child class hi eecute hota hai 
es tarah ke condition ko metod overloading kahate hai*/
/*
class Parent
{
    int a=19,b=12;
    void showf()
    {
   System.out.print("parent class  ");
   System.out.println("pa="+a+", pb="+b);
    }
}
class Child extends Parent
{
    void showf()
    {
        System.out.println("child class");
        System.out.println("ca="+a+", cb="+b);
    }
}
    
class Test
{
 public static void main(String[] args)
 {
     Child v=new Child(); 
     v.showf();
     v.showf();
}
}
//aise condition me keval child class hi execute hota hai ese solve karne ke 
/*liye hm next program me dekhenge ese solve do tarike se ho sakta hai 
     1-ki parent class ka bhi object bna le child class me ya main method me,
     pr aisa kane se hme do bar object bana pdega  
     2-ki hm perdefind super keyword use kr le */  
     /*output
child class
ca=19, cb=12
child class
ca=19, cb=12
==============================================================================
*/
/*
class Parent
{
    int a=19,b=12;
    void showf()
    {
   System.out.print("parent class  ");
   System.out.println("pa="+a+", pb="+b);
    }
}
class Child extends Parent
{
    void showf()
    {
        Parent p=new Parent();
        p.showf();
        System.out.println("child class");
        System.out.println("ca="+a+", cb="+b);
    }
}
    
class Test
{
 public static void main(String[] args)
 {
     Child v=new Child(); 
     v.showf();
     v.showf();
}
}
=============================================================================
*/
/*
class Parent
{
    int a=19,b=12;
    void showf()
    {
   System.out.print("parent class  ");
   System.out.println("pa="+a+", pb="+b);
    }
}
class Child extends Parent
{
    void showf()
    {
        super.showf();
        //yha per dhyan de aur privious program se corilate kre
        System.out.println("child class");
        System.out.println("ca="+a+", cb="+b);
    }
}
    
class Test
{
 public static void main(String[] args)
 {
     Child v=new Child(); 
     v.showf();
     v.showf();
}
}*/
/*output
parent class  pa=19, pb=12
child class
ca=19, cb=12
parent class  pa=19, pb=12
child class
ca=19, cb=12
==========================================================================
*/
/*final keyword
  final keyword ka use inheritan ko rokane(ristict) ke liye bna hai jo ki kewal 
method overloading ke time hi hota hai. 
*/
/*
class Parent
{
    int a=19,b=12;
   final void showf()//yha pr dhyan do final use hua hai
    {
   System.out.print("parent class  ");
   System.out.println("pa="+a+", pb="+b);
    }
}
class Child extends Parent
{
    void differ()//difrent hai to tk hai
   //void showf() //tb galat hai qki yha restiction ho jayega inheritance ka
    {
       // super.showf();
        //yha per dhyan de aur privious program se corilate kre
        System.out.println("child class");
        System.out.println("ca="+a+", cb="+b);
    }
}
    
class Test
{
 public static void main(String[] args)
 {
     Child v=new Child(); 
     v.showf();
}
}
=========================================================================
*/
//abstraction
/*
abstract class Father
{
    int i=20;
    static
    {
             System.out.println("static load at time of class loading");
    }
    void show1()
    {
        System.out.println("father class none abstract method");
    }
    abstract void show2();
    Father()
    {
        System.out.println("thus abstract class can have constructur");
    }
}
class Child extends Father
{
    void show2()
    {
        i++;
        System.out.println(i);
        System.out.println("father class abstract method");
    }
}
public class Test
{
    public static void main(String[] args)
    {
        Child m=new Child();
        m.show2();
        m.show1();
        
    }
}
=====================================================================
*/
//interface
interface Aptech
{
    int a=20;
    System.out.println("java");
   // void course();
    public abstract void course();
}
class Student1 implements Aptech
{
    public void course()
    {
        System.out.println("java");
      int b=34;
      System.out.println(++b);
        System.out.println(a);
    }
}
class Student2 implements Aptech
{
    public void course()
    {
        System.out.println("android");
    }
}
public class Test
{
    public static void main(String[] args)
    {
        Student1 a=new Student1();
            a.course();
             Student2 b=new Student2();
            b.course();
    }
}

