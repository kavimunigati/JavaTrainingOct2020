package JavaSessions;

public class DecrementalAndIncrementalOperators {

	public static void main(String[] args) {
		 // ++ and --
		//++ is called incremental operator which increased the value by 1
		//-- is called decremental operator which decreases the value by 1
		
		int e = 5;
		System.out.println(e++);//post increment
		System.out.println(e);
		
	int f =	6;
	System.out.println(++f);//pre increment
	System.out.println(f);
		
	int g =9;
	System.out.println(g--);//post decrement
	System.out.println(g);
		
	int h =10;
	System.out.println(--h);//pre decrement.
	System.out.println(h);
	
    int a=1;
    int b =a++;//++ given after a is called post increment.
     //Current value of ‘a’ is used and then it is incremented by 1.
    /**int a=1;
     * int b =a++
     * which means 1(+a =2)
     * the value of b is 1 but then the value of a is the "+" added after "a" wherein 1+1=2
     * 
     */
    
   System.out.println(a);//2 value of a is 2 because of the post increment
    System.out.println(b);//1, value of b is 1 as it is taking the value of a directly.
    
    int c= 4;
    int d=++c;//Pre increment
    //  First ‘c’ is incremented by 1 and then it’s value is used
     System.out.println(c);
     System.out.println(d);
     
     
     int i = 11;
     //int j = i++;
     //int K =  i + j;
     int l= i++ + ++i;
     //int m =++j;
     
     /**Initially, i=11,

    		 i = i++ + ++i

    		 i = (i is used before increment) + (i is used after increment)

    		 i = 11(i=12) + 13(i=13)

    		 i = 11 + 13 = 24
     */
     System.out.println(i);
    // System.out.println(j);
     //System.out.println(K);
     System.out.println(l);
     //System.out.println(m);
     
     int n = 2;
     int o= n--;//post decrement
     //Current value of ‘i’ is used and then it is decremented by 1.
     System.out.println(n);
     System.out.println(o);
     
     int p=5;
     int q=--p;//pre decrement
     //Pre Decrement (--i) : First ‘i’ is decremented by 1 and then it’s value is used.
     System.out.println(p);
     System.out.println(q);
    
     int r =p++ - --p + ++p -p;
     System.out.println(r);
	}

}
