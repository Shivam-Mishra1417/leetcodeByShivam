package sm;

import java.util.ArrayList;
import java.util.Arrays;

public class P2418 {

	
public String[] sortPeople(String[] names, int[] heights) {
        
        String [] newNames = new String[names.length];
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int index2=0;
        for(int j=0;j<names.length;j++) {
        	int max=0,index=-1;
        for(int i=0;i<names.length;i++)
        {
            if(heights[i] > max && !list.contains(i))
            {
                max=heights[i];
                index = i;
            }
            
        }
        list.add(index);
        newNames[index2] = names[index];
        	index2++;	
        }
        System.out.println(Arrays.toString(newNames));
        return newNames;
    }
}
