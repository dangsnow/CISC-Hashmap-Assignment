package fibsmart;
import java.util.HashMap;
import java.util.Map;

public class FibonacciMemoizationAlgorithm {
	public static int fib(int n) {
        Map<Integer, Integer> memoize = new HashMap<Integer, Integer>();
        memoize.put(0, 0);
        memoize.put(1,1);
        return fib(n, memoize);
    }

    public static int fib(int n, Map<Integer, Integer> memoize) {
    	
    	//since the number is stored in the array, it does not need to calculate the nth position fib more than once 
    	//like the traditional recursive/iterative method 
        if (memoize.containsKey(n)) {
            return memoize.get(n);
        } else {
        	//call the function recursively
            memoize.put(n, fib(n-1, memoize) + fib(n-2, memoize));
            return memoize.get(n);
        }
    }
    
    //For question 1a, the time complexity is O(1) and space complexity is O(n). 
    //It is better than recursive/iterative Fibonacci since the time complexity has improved significantly. 

}
