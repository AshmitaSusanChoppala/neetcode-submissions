class Solution {
    public boolean isPalindrome(String s) {
       String str = "";

       StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        str = sb.toString();

       int p = 0;
       int q = str.length()-1;

       while(p<=q){
        if(str.charAt(p) != str.charAt(q)){
            return false;
        }
        p++;
        q--;
       }
       return true;
    }
}
