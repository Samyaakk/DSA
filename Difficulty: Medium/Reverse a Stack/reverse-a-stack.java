class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        List<Integer> list = new ArrayList<>();
        while(!st.isEmpty()){
            list.add(st.pop());
        }
        for(int i=0;i<list.size();i++){
            st.push(list.get(i));
        }
        
    }
}
