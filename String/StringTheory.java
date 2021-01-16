To take input a string 

Scanner sc = new Scanner(System.in);
String res  = sc.next();


To find length  of a string
res.length();

To insert element at ith index;
string str = res.substring(0,i) + ch + res.substring(i);


To remove an element at ith index;
String str = res.substring(0,i)+ res.substring(i+1);


To replace at ith index:- 
String str= res.substring(0,i) + ch + res.substring(i+1);
