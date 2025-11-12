class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = 0;
        int start = 0;

        HashMap<Character,Integer> map = new HashMap<>();

        for(int end = 0; end<s.length();end++){
            char ch = s.charAt(end);
            if(map.containsKey(ch)&&map.get(ch)>= start){
                start = map.get(ch)+1;
            }
            map.put(ch,end);
            len = Math.max(len,end-start+1);
        }
        return len;

    }
}