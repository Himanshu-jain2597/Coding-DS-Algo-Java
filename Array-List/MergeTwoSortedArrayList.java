public class Solution {
    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        
        ArrayList<Integer> mer = new ArrayList<>(a.size()+b.size());
        
        int i=0;
        int j=0;
        
        while(i<a.size()&&j<b.size()) {
            
            if(a.get(i)<b.get(j)) {
                
                mer.add(a.get(i));
                i++;
            }
            else {
                mer.add(b.get(j));
                j++;
            }
        }
        
        if(i<a.size()) {
        while(i<a.size()) {
            mer.add(a.get(i));
            i++;
        }
        }
        
        if(j<b.size()) {
        while(j<b.size()) {
            mer.add(b.get(j));
            j++;
        }
        }
        
        a.clear();
      for(Integer  val:mer) {
          a.add(val);
      }
        
        
    }
}
