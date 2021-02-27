// vector is thread safe 
import java.util.*;

public class Vectors {
    
    
    public static void main(String[] args) {
        
        TreeSet<Integer> set = new TreeSet<>();
        
        
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
        
        SortedSet set1 = set.headSet(3);   // element less then 3 will be stored
        System.out.println(set1);
        
        SortedSet set2 = set.tailSet(3);   // element greater then 3 will be stored
        System.out.println(set2);
        
    }
    
}
