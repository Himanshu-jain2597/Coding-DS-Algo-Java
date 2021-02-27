// vector is thread safe 
import java.util.*;

public class Vectors {
    
    
    public static void main(String[] args) {
        
        HashSet<Integer> set = new HashSet<>();
        
        
        set.add(4);
        set.add(3);
        set.add(2);
        System.out.println(set.add(1));
        set.add(5);
        
        System.out.println(set.size());
        System.out.println(set.contains(4));
        System.out.println(set.isEmpty());
        
        Iterator<Integer> iterator  = set.iterator();
        
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        
    }
    
}
