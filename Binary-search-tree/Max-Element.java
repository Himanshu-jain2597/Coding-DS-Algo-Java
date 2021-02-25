// right most will be maximum element 


static int maxValue(node node) 
{  
    /* loop down to find the rightmost leaf */
    node current = node; 
    while (current.right != null)  
        current = current.right; 
      
    return (current.data); 
} 
