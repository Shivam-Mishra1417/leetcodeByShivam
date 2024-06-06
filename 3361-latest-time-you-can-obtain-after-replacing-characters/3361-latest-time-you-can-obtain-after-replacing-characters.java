class Solution {
    public String findLatestTime(String s) {
        char[] nc = s.toCharArray();

        if (nc[0] == '?') {
            if (nc[1] > '1' && nc[1] != '?')
                nc[0] = '0';
            else
                nc[0] = '1';
        }

        if (nc[1] == '?') {
            if (nc[0] == '0')
                nc[1] = '9';
            else
                nc[1] = '1';
        }

        if (nc[3] == '?') {
            nc[3] = '5';
        }

        if (nc[4] == '?')
            nc[4] = '9';
        return new String(nc);
    }
}