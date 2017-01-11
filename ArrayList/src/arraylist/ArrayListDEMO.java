
package arraylist;

import java.util.Iterator;


public class ArrayListDEMO {

    
    public static void main(String[] args)
    {
        
         ArrayList<String> al;
        al = new ArrayList<String>();
         
        al.add("Ravi");
        al.add("Raju");
        al.add("Rastogi");
        
        Iterator itr=al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }  
        
    }
    
}
