class Solution {
    public boolean validWordSquare(List<String> words) {
        
        for(int i=0;i<words.size();i++){
            String a = words.get(i);
            String b = "";
            for(int j=0;j<words.size();j++){
                if(i<words.get(j).length()){
                   b += ""+words.get(j).charAt(i); 
                }   
            }
            if(!a.equals(b)) 
            return false;
        }
        return true;
    }
}