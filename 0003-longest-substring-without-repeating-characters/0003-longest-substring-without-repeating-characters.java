class Solution {
  
    public int lengthOfLongestSubstring(String s) {
         boolean[] seen=new boolean[128];
        int start=0;
        int maxlength=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            while(seen[ch]){
                seen[s.charAt(start)]=false;
                start++;
            }
            seen[ch]=true;
            maxlength= Math.max(maxlength, i-start + 1);
        }
        return maxlength;
    }
    public static void main(String[] args){
            Solution sol=new Solution();
            System.out.println("abcabcbb");
            System.out.println("bbbbb");
            System.out.println("pwwkew");
    }
    
}
    
