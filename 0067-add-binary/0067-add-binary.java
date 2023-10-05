class Solution {
    public String addBinary(String a, String b) {
        
        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();

        int index=0,al=ac.length-1,bl=bc.length-1;
        String res="";
        char e = '0';
        while(true){
            //System.out.println((al-index)+" <> "+(bl-index));
            if(al-index<0 && bl-index<0) break;
            char a1 = (al-index>=0)?ac[al-index]:'0';
            char b1 = (bl-index>=0)?bc[bl-index]:'0';
          //  System.out.println(a1+"  "+b1);
            if(a1!=b1)
            if(e=='0'){
            res='1'+res;
            }
            else{
                res= '0'+res;
                e='1';
            }
            else{
                if(a1=='0'){
                    res = e+""+res;
                    e='0';
                }
                else{
                    res = e+""+res;
                    e='1';
                }
                
                }
                index++;
              //  System.out.println("res = "+res);
        }
        if(e=='0')
        return res;
        else return '1'+res;
    }
}