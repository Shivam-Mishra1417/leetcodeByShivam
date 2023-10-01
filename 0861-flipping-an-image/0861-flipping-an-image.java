class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        for(int i=0;i<image.length;i++){

            int l= 0, r = image[0].length-1;
            while(l<=r){
             // System.out.println(i+" ==> "+image[i][l]+"  888  "+image[i][r]+"  "+l+" "+r);   
             if(image[i][l]==image[i][r]){
                   // System.out.println(image[i][l]+"  B  "+image[i][r]);
                    if(l!=r){
                    image[i][l] = (image[i][l] ==0)?1:0;
                    image[i][r] = (image[i][r] ==0)?1:0;
                    }
                    else{
                      image[i][l] = (image[i][l] ==0)?1:0;  
                    }
                   // System.out.println(image[i][l]+"  A  "+image[i][r]);
               }
              
            l++;
            r--;
            }

            //System.out.println(Arrays.toString(image[i]));
        }

        return image;
    }
}