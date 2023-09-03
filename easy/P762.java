package sm;

public class P762 {
public static void main(String[] args) {
	
	//System.out.println(countPrimeSetBits(1,32));
	System.out.println(0x55);
	System.out.println(Integer.toBinaryString(0x555555));
	for(int i=0;i<32;i++) {
		System.out.println(i>>>1);
	}
}
	
public static int countPrimeSetBits(int left, int right) {
        int res=0;
        for(int i =left;i<=right;i++){
            String bin = Integer.toBinaryString(i);
            int x = bin.replace("0", "").length();
            System.out.println(i+" -- "+x);
            if(isPrime(x)) {
            	//System.out.println(x+" is prime");
            	res++;
            }
        }
        
        return res;
    }
    
    public static boolean isPrime(int num){
        if(num==1) return false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0)
                return false;
        }
        return true;
        
    }
}
