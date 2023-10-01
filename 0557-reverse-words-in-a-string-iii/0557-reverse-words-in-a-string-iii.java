class Solution {
   public static String reverseWords(String s) {
		String res = "", tmp = " ";
		for (int i = 0; i < s.length(); i++) {
			int index = s.length() - 1;
			if (!(s.charAt(index-i) == ' '))
				tmp += s.charAt(index-i);
			else {
			res = tmp + res;
            tmp = " ";

			}
		}
		res = tmp.substring(1) + res;
		return res;
	}
}