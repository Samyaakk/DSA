class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            if(a[1]==b[1])return b[0]-a[0];
            return a[1]-b[1];
        });
        if(intervals.length==1)return 2;
        int c = 0;
        int m1 = -1;
        int m2 = -1;
        for(int i=0;i<intervals.length;i++){
            int l = intervals[i][0];
            int r = intervals[i][1];
            boolean m1in = (m1>=l);
            boolean m2in = (m2>=l);
            if(m1in&&m2in){
                continue;
            }else if(m2in){
                c+=1;
                m1 = m2;
                m2 = r;
            }else{
                c+=2;
                m1 = r-1;
                m2 = r;
            }
        }
        return c;
    }
}