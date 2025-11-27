class Solution {
    public void merge(int l,int mid,int r,int arr[]){
        int arr1[] = new int[mid-l+1];
        int arr2[] = new int[r-mid];
        for(int i=0;i<arr1.length;i++){
            arr1[i] = arr[i+l];
        }
        // int k = arr1.length;
        for(int j=0;j<arr2.length;j++){
            arr2[j] = arr[j+mid+1];
        }
        int i = 0;
        int j =0;
        int k=l;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr[k] = arr1[i++];
            }else{
                arr[k] = arr2[j++];
            }
            k++;
        }
        while(i<arr1.length){
            arr[k++]=arr1[i++];
        }
        while(j<arr2.length){
            arr[k++]=arr2[j++];
        }
        // for(int w=0;w<arr.length;w++){
        //     System.out.print(arr[w]+" ");
        // }
        // System.out.println();
    }
    public void f(int l,int r,int nums[]){
        if(l<r){
            int mid = l+(r-l)/2;
            f(l,mid,nums);
            f(mid+1,r,nums);
            merge(l,mid,r,nums);
        }
    }
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        if(n==1)return nums;
        int l = 0;
        int r = n-1;
        f(l,r,nums);
        return nums;
    }
}