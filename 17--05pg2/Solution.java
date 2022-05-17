package newPackRevision;
import java.util.*;

class solve
{
	static String bnk[] = {"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
    static ArrayList <String> possibleWords(int a[], int N)
    {
        // your code here 
    	String val = "";
    	for(int x : a)
    		val = val+x;
    	
       ArrayList<String> ans= kpc(val);
       return ans;
        
    }
    static ArrayList<String> kpc(String st)
    {
    	if(st.length()==0) {
    		ArrayList<String> y = new ArrayList<>();
    		y.add("");
    		return y;
    	}
    	
    	char ch = st.charAt(0);
    	String rS = st.substring(1);
    	
    	ArrayList<String> chSol = kpc(rS);
    	ArrayList<String> sol = new ArrayList<>();
    	
    	String firstSt = bnk[ch-'0'];
    	for(int i = 0 ;i<firstSt.length(); i++)
    	{
    		char c = firstSt.charAt(i);
    		for(String x : chSol)
    			sol.add(c + x);
    	}
    	
    	return sol;
    }
    
    
}
class Solution
{
    //Function to find the minimum element in sorted and rotated array.
    static int minNumber(int arr[], int low, int high)
    {
        // Your code here
       if(low == high)
       return arr[low];
       
       int mid = (low + high)/2;
       int m1= minNumber(arr,low,mid);
       int m2 = minNumber(arr,mid+1,high);
       
       return Math.min(m1,m2);
    }
}

