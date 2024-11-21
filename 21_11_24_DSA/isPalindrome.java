class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();

        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(Character.isDigit(c) || Character.isLetter(c))
               sb.append(c);
        }

        String a = sb.toString();
        a = a.toLowerCase();
        sb.reverse();
        String b = sb.toString();
        b = b.toLowerCase();

        if(a.equals(b))
           return true;
        else
           return false;
    }
}
