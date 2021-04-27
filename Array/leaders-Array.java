class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
            ArrayList<Integer> list = new ArrayList<>();
            int max = arr[n-1];
            list.add(max);
            for(int i=n-2; i >=0; i--){
                if(arr[i] >= max){
                    list.add(arr[i]);
                    max = arr[i];
                }
            }
            Collections.reverse(list);
            return list;
    }
}
