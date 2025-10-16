class Solution {
    public boolean isPalindrome(String s) {
        char arr[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            char c = arr[i];
            c= Character.toLowerCase(c);
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }
        String s1 = sb.toString();
        String s2 = new String(sb.reverse().toString());
        System.out.println(s1);
        System.out.println(s2);
        return s1.equals(s2);
    }
}