
package demo8;

import java.util.regex.Pattern;

public class Demo8 {
   
public static void main(String[] args) {
  /*  System.out.println("? quantifier ....");  
System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)  
System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)  
System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)  
System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a comes more than one time)  
System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time)  
  
System.out.println("+ quantifier ....");  
System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)  
System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)  
System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)  
System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)  
  
System.out.println("* quantifier ....");  
System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times)  */

System.out.println(t2.i+t2.j);
System.out.println(Pattern.matches(".s", "as"));//true (2nd char is s)  
System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s)  
System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)  
System.out.println(Pattern.matches("..s", "ans"));//false (has more than 2 char)  
System.out.println(Pattern.matches("..s", "ads"));//true (3rd char is s)  
    
    }
    
}
