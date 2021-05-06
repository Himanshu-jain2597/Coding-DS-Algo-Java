 static int findPlatform(int arr[], int dep[], int n)
    {
            
            int plt_needed = 0;
            Arrays.sort(arr);
            Arrays.sort(dep);
            int result  = 1;
            int i=0,j=0;
            while(i<n&&j<n) {
                
                if(arr[i]<=dep[j]) {
                    plt_needed++;
                    i++;
                }
                else {
                    plt_needed--;
                    j++;
                }
                
                if(plt_needed>result) {
                    result = plt_needed;
                }
            }
            
        return result;
    }
