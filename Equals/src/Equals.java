
import javax.swing.JApplet;
import java.util.*;

public class Equals extends JApplet {

   String name;
   int rollno;
    public void Equals(String name,int rollno) {
        this.name=name;
        this.rollno=rollno;
    }
    public static void main(String[] args){
        Equals s1=new Equals();
        s1.Equals("rakesh", 120);
        System.out.println(s1);
    }
}

