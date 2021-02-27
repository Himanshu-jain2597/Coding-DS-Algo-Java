// vector is thread safe 
import java.util.*;

public class Vectors {
    
    
    public static void main(String[] args) {
        
        Vector<Integer> vector =  new Vector<>();
        
        
        vector.add(4);
        vector.add(3);
        vector.add(2);
        
        
        ListIterator<Integer> list  = vector.listIterator();
        
        while(list.hasNext()) {
            
            System.out.println(list.next());
            
        }
        
        
        
    }
    
}
