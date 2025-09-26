class Solution {
    int hr(int i,int arr[]){
        int prev2 = arr[0];
        int prev =0;
        if(arr.length>1)prev = Math.max(arr[0],arr[1]);
        else return arr[0];
        for(int w=2;w<arr.length;w++){
            int nt = prev;
            int t = 0;
            if(w-2>=0)t = arr[w]+prev2;
            int curr = Math.max(t,nt);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
    int maxValue(int[] arr) {
        // code here
        int n = arr.length;
        if(n==1)return arr[0];
        int ar1[] = new int[n-1];
        int ar2[] = new int[n-1];
        for(int i=0;i<n-1;i++){
            ar1[i] = arr[i];
        }
        for(int j=1;j<n;j++){
            ar2[j-1] = arr[j];
        }
        int a1 = hr(0,ar1);
        int a2 = hr(0,ar2);
        return Math.max(a1,a2);
    }
}
