class Solution {
    class Pair{
        String str;
        int len;
        Pair(String str,int len){
            this.str= str;
            this.len = len;
        }
    }
    public int wordLadderLength(String startWord, String targetWord,
                                String[] wordList) {
        // Code here
        Set<String> set = new HashSet<>();
        for(int i=0;i<wordList.length;i++){
            set.add(wordList[i]);
        }
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(startWord,1));
        set.remove(startWord);
        while(!q.isEmpty()){
            Pair p = q.poll();
            String str = p.str;
            int len = p.len;
            if(str.equals(targetWord))return len;
            for(int i=0;i<str.length();i++){
                char org  =str.charAt(i);
                for(char j='a';j<='z';j++){
                    if(org==j)continue;
                    StringBuilder sb = new StringBuilder(str);
                    sb.setCharAt(i,j);
                    String nw = sb.toString();
                    if(set.contains(nw)){
                        set.remove(nw);
                        q.add(new Pair(nw,len+1));
                    }
                }
            }
        }
        // System.out.println(set);
        return 0;
    }
}