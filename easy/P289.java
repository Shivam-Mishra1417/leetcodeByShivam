package sm;

import java.util.Arrays;

public class P289 {

	public static void main(String[] args) {
		int[][] b = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
		gameOfLife(b);
		for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++) {
            	System.out.print(b[i][j]);
            }
            System.out.println();
            }
	}
public static void gameOfLife(int[][] board) {
	int[][] nb = new int[board.length][board[0].length];
//	for(int i=0;i<board.length;i++){
//        for(int j=0;j<board[0].length;j++) {
//        	nb[i][j] = board[i][j];
//        }
//	}
	//System.arraycopy(board, 0, nb, 0, board.length);
	for(int i=0;i<board.length;i++)
		nb[i] = board[i].clone();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                String s = ""+getVal(i-1,j-1,nb)+getVal(i-1,j,nb)+getVal(i-1,j+1,nb)
                    +getVal(i,j-1,nb)+getVal(i,j+1,nb)+
                    getVal(i+1,j-1,nb)+getVal(i+1,j,nb)+getVal(i+1,j+1,nb);
                
                s = s.replace("0","");
               if(board[i][j]==1){ 
                   if(s.length()<2 | s.length()>3)
                         board[i][j]=0;                                        
                                  }
                else{
                    if(s.length() ==3)
                        board[i][j]=1;
                }
                
            }
            
        }
    }
        public static int getVal(int i, int j, int[][] board){
            
            if((i>=0 && j>=0) && (i<board.length && j<board[0].length))
                return board[i][j];
            else 
                return 0;
            
            
        }
    
}
