class Solution {
    class Pair{
        String str;
        int len;
        Pair(String str,int len){
            this.str = str;
            this.len = len;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        Queue<Pair> q = new LinkedList<>();
        set.remove(beginWord);
        q.add(new Pair(beginWord,1));
        while(!q.isEmpty()){
            Pair p = q.poll();
            String str = p.str;
            int len = p.len;
            if(str.equals(endWord))return len;
            for(int i=0;i<str.length();i++){
                char org = str.charAt(i);
                for(char j='a';j<='z';j++){
                    if (j == org) continue; // skip same character
                    StringBuilder sb = new StringBuilder(str);
                    sb.setCharAt(i, j);
                    String nw = sb.toString();
                    if(set.contains(nw)){
                        set.remove(nw);
                        q.add(new Pair(nw,len+1));
                    }
                }
            }
        }
        return 0;
    }
}