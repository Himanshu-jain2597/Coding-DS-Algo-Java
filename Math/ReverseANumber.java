int x = sum;
        int rem=0;
        int rev=0;
        while(x>0) {
            
            rem = x%10;
            rev = rev*10 + rem;
            x = x/10;
            
        }
        if(sum==rev) {
            return 1;
        } else {
            return 0;
        }
        // code here
    }
}
