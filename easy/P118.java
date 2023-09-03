package sm;
import java.util.ArrayList;
import java.util.List;

public class P118 {
	
	public static void main(String[] args) {
		System.out.println(generate(5));
	}
	 public static List<List<Integer>> generate(int numRows) {
	        List<List<Integer>> res = new ArrayList<List<Integer>>();
	        
	        ArrayList<Integer> tmp = new ArrayList<Integer>();
	        tmp.add(1);
	        res.add(tmp);
	        System.out.println(res);
	        for(int i=1;i<numRows;i++) {
	        	System.out.println("num - "+i);
	        	List<Integer> prev = res.get(i-1);
	        	System.out.println("prev -> "+prev);
	        	ArrayList<Integer> tmp2 = new ArrayList<Integer>();
	        	tmp2.add(1);
	        	int l = prev.size()+1;
	        	for(int j=1;j<l;j++) {
	        		if(j==l-1)
	        		tmp2.add(1);
	        		else {
	        			tmp2.add(prev.get(j) + prev.get(j-1));
	        			System.out.println("tmp2 - >"+tmp2);
	        		}
	        	}
	        	
	        	res.add(tmp2);
	        }
	        
	        return res;
	    }
}
