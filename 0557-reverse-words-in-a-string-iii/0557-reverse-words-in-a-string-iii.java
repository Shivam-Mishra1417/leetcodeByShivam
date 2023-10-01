/*class Solution {
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
}*/

class Solution {
    public String reverseWords(String s) {
        int spaceIndex = 0;
        char[] chars = s.toCharArray();
        int i = 0;
        int length = chars.length;

        while (i < length) {
            while (chars[spaceIndex] != ' ' && spaceIndex != length - 1) {
                spaceIndex++;
            }
            if (spaceIndex == length - 1) {
                swap(i, spaceIndex, chars);
                break;
            } else {
                swap(i, spaceIndex - 1, chars);
            }
            spaceIndex++;
            i = spaceIndex;
        }
        return new String(chars);
    }

    private void swap(int start, int end, char[] chars) {
        while (start < end) {
            char temp = chars[start];
            chars[start++] = chars[end];
            chars[end--] = temp;
        }
    }
}