
package arraylsdemo;

import java.util.*;


public class ArraylsDemo {
//11, 41, 102, 194......N
// i = 1
// j = 0
// n < N
// n = 11,
// n = n + (3 * i * 10) + (j)
// n = n + (3 * i * 10) + (j)
// n = n + (3 * i * 10) + (j)
// Shiv Pratap Singh
// SPS
    //Rakesh Kumar
    //RK

    public static void main(String[] args) {
        /* ArrayList<String> al = new ArrayList<>();
         al.add("ravi");
         al.add("rastogi");
         al.add("raju");
         for (String j : al) {
         System.out.println(j);
         }
         Iterator it = al.iterator();
         while (it.hasNext()) {
         System.out.println(it.next());
         }
         }*/
        Scanner sc = new Scanner(System.in);
        /* int s=11;
         System.out .println("enter ur number of element");
         int N=sc.nextInt();
         for(int i = 1, j = 0 ;  i <= N ; i++, j++)   
         {
         s=s+(3*10*i)+j;
         System.out.println("your required serise is= "+s);
         }
         */
//        System.out.println("enter ur name");
//        String name = sc.nextLine();
//        //System.out.print(name.charAt(0));
//        for (int i = 0; i < name.length(); i++) { //5
//            String temp = name.charAt(i) + ""; // 3
//            if (i == 0 && name.charAt(i) != ' ') { // 4
//                System.out.print(temp.toUpperCase()); // 2
//            }
//            else if (name.charAt(i) != ' ' && name.charAt(i - 1) == ' ') { // 5
//                System.out.print(temp.toUpperCase()); // 2
//
//            } 
//            else {
//                
//            } // O(14N + c) // O(N)
//        }
          int[] array = new int[5];
          int n = 97;
          for(int i = 0; i < 5; i++) {
              array[i] = n++;
          }
          
          char[] name = {'S', 'H', 'I', 'V'} ;
         
          
          String val = "S-H-I-V-";
          String story = "One day, I was sitting in my garden, suddenly a lady came infront of me. She bend towards me and served me a cup of tea.";
          System.out.println(val.replace('-', '\0'));
          System.out.println(story.replace("sitting", "waiting"));
          System.out.println(story.compareTo("WAITING"));
          
    }

}
