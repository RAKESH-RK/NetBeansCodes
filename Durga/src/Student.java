
public class Student {
String name;
int rollno;
/*Student(String name,int rollno){
this.name=name;
this.rollno=rollno;}
public boolean equals(Object obj){
//try{
    String name1=this.name;
int rollno1=this.rollno;
Student s=(Student)obj;
String name2=s.name;
int rollno2=s.rollno;
if(name1.equals(name2) &&rollno1==rollno2){
return true;}
else{
return false; }}*/
//catch(ClassCastException e){return false;}
//catch(NullPointerException e){return false;}


public static void main(String args[]){
/*Student s1=new Student("mn",1);
Student s2=new Student("sd",1);
Student s3=new Student("mn",1);
Student s4=s1;*/
    String s1=new String("rakesh");
     String s2=new String("rakesh");
System.out.println(s1.equals(s2));
//System.out.println(s1.equals(s3));
//System.out.println(s1.equals(s4));
System.out.println(s1.hashCode());
System.out.println(s2.hashCode());

//System.out.println(s1.equals(null));
//System.out.println(s1.equals(s2));}
}
}

 