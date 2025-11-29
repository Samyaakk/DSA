class Solution {
    public int findMin(int n) {
        // code here
        int arr[] = new int[4];
        arr[0] = 10;
        arr[1] = 5;
        arr[2] = 2;
        arr[3] = 1;
        int c = 0;
        for(int i=0;i<4;i++){
            while(n>=arr[i]){
                c++;
                n = n-arr[i];
            }
        }
        return c;
    }
}
