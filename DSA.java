// 25/6/24
// Arrays 
//Linear Search
// import java.util.*;
// public class DSA{
//     public static int linearSearch(int arr[],int key){
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int arr[]={2,3,4,5,5,6,6,6,7,8,9,10};
//         int key=10;
//         int idx = linearSearch(arr,key);
//         if(idx==-1){
//             System.out.println("Not Found ");
//         }else{
//             System.out.println("Found at Index : "+idx);
//         }
//     }
// }

//Largest No. in Given array 
// import java.util.*;
// public class DSA{
//     public static int LargestEle(int arr[]){
//         int l=arr[0];
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>l){
//                 l=arr[i];
//             }
//         }
//         return l;
//     }
//     public static void main(String args[]){
//         int arr[] = {2,4,5,6,7,9,10,100};
//         int Largest = LargestEle(arr);
//         System.out.println("Largest Element is: "+Largest);
//     }
// }

//Binary Search Code 
// import java.util.*;
// public class DSA{
//     public static int binarySearch(int arr[],int key){
//         int start = 0 ;
//         int end  = arr.length-1;
//         while(start<=end){
//         int mid = (start+end)/2;
//         if(arr[mid]==key){
//             return mid;
//         }
//         if(arr[mid]<key){
//             start=mid+1;
//         }
//         if(arr[mid]>key){
//             end=mid-1;
//         }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int arr[] = {2,4,6,8,10};
//         int key=10;
//         int idx= binarySearch(arr,key);
//         if(idx==-1){
//             System.out.println("Key not found in array");
//         }else{
//             System.out.println("Key found at Index : "+idx);
//         }
//     }
// }
// tc-> Log(n)

//Reverse in Array 
// import java.util.*;
// public class DSA{
//     public static void main(String args[]){
//         //odd
//         // int arr[]={2,4,6,8,10};
//         //even
//         int arr[]={2,4,6,8};
//         for(int i=0;i<arr.length/2;i++){
//             int temp=arr[i];
//             arr[i]=arr[arr.length-i-1];
//             arr[arr.length-i-1]=temp;
//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }
// without using extra spaces ie. without creating a new array and running a backward loop 
//tc -> O(n)
//sc -> O(1)

// Pairs in Array 
// import java.util.*;
// public class DSA{
//     public static void main(String args[]){
//         int arr[] = {2,4,6,8,10};
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 System.out.print(arr[i]+","+arr[j]+"  ");
//             }
//             System.out.println();
//         }
//     }
// }
// tc->O(n^2)

//print Sub ARRay (brute force max subarray)
// import java.util.*;
// public class DSA{
//     public static void main(String args[]){
//         int arr[]={2,4,6,8,10};
//         int max=Integer.MIN_VALUE;
//         int min=Integer.MAX_VALUE;
//         for(int i=0;i<arr.length;i++){
//             for(int j=i;j<arr.length;j++){
//                 int sum=0;
//                 for(int k=i;k<=j;k++){
//                     System.out.print(arr[k]+",");
//                     sum+=arr[k];
//                 }
//                 if(sum>max){
//                     max=sum;
//                 }
//                 if(sum<min){
//                     min=sum;
//                 }
//                 System.out.println(" Subarray Sum : "+sum);
//             }
//             System.out.println();
//         }
//         System.out.println("Maximum Subarray Sum : "+max);
//         System.out.println("Maximum Subarray Sum : "+min);
//     }   
// }
// tc->O(n^3)

// Max subarray Prefix approach 
// import java.util.*;
// public class DSA{
//     public static void main(String args[]){
//         int arr[]={2,4,6,8,10};
//         int parr[]=new int[arr.length];
//         parr[0]=arr[0];
//         int max = Integer.MIN_VALUE;
//         for(int i=1;i<arr.length;i++){
//             parr[i]=parr[i-1]+arr[i];
//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.print(parr[i]+" ");
//         }
//         for(int j=0;j<arr.length;j++){
//             int sum=parr[j];
//             if(sum>max){
//                 max=sum;
//             }
//         }
//         for(int i=1;i<arr.length;i++){
//             // int sum=0;
//             for(int j=i;j<arr.length;j++){
//                 int sum=parr[j]-parr[i-1];
//                 if(sum>max){
//                     max=sum;
//                 }
//             }
//         }
//         System.out.println("Maximum Subarray Sum : "+max);
//     }
// }
// Tc->O(n^2)

//Kadane Algorithm max subarray sum 
// import java.util.*;
// public class DSA{
//     public static void main(String args[]){
//         int arr[] = {-2,-3,4,-1,-2,1,5,-3};
//         int ms=Integer.MIN_VALUE;
//         int cs=0;
//         for(int i=0;i<arr.length;i++){
//             cs=cs+arr[i];
//             if(cs<0){
//                 cs=0;
//             }
//             ms=Math.max(cs,ms);
//         }
//         System.out.println("Maximum Subarray Sum is : "+ms);
//     }
// }
// Tc -> O(n)

//Best time to buy and sell stock 
// import java.util.*;
// public class DSA{
// public static void main(String args[]){
//     int arr[]={7,1,5,3,6,4};
//     int bp = Integer.MAX_VALUE;
//     int mp=0;
//     for(int i=0;i<arr.length;i++){
//         if(bp<arr[i]){
//             int p=arr[i]-bp;
//             mp=Math.max(mp,p);
//         }else{
//             bp=arr[i];
//         }
//     }
//     System.out.println(mp);
// }
// }

//Trapping Rainwater Problem 
// import java.util.*;
// public class DSA{
//     public static int trappedRainwater(int height[]){
//         //calculate left max boundary -array
//         int leftMax[]=new int[height.length];
//         leftMax[0]=height[0];
//         for(int i=1;i<height.length;i++){
//             leftMax[i]=Math.max(height[i],leftMax[i-1]);
//         }
//         //calculate right max boundary -array
//         int rightMax[]=new int[height.length];
//         rightMax[height.length-1]=height[height.length-1];
//         for(int i=height.length-2;i>=0;i--){
//             rightMax[i]=Math.max(height[i],rightMax[i+1]);
//         }
//         int trappedWater=0;
//         //loop
//         for(int i=0;i<height.length;i++){
//             //water level = min(leftmax bound, rightmax bound)
//            int  waterLevel = Math.min(leftMax[i],rightMax[i]);
//            //trapped water = waterlevel-height[i]
//            trappedWater+=waterLevel-height[i];
//         }
//         return trappedWater;
//     }
//     public static void main (String args[]){
//         int height[] = {4,2,0,6,3,1,5};
//         System.out.println(trappedRainwater(height));
//     }
// }

// import java.util.*;
// public class DSA{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         while(t-->0){
//             int n = sc.nextInt();
//             int k = sc.nextInt();
//             long arr[] = new long[n];
//             for(int i=0;i<arr.length;i++){
//                 arr[i] = sc.nextLong();
//             }
//             int c=0;
//             Arrays.sort(arr);
//             int l=0;
//             int bidx=n-1;
//             for(int i=0;i<n;i++){
//                 if(arr[i]>k){
//                     bidx = i; 
//                     break;
//                 }
//             }
//             for(int i=0;i<bidx;i++){
//                 long temp = arr[i];
//                 arr[i] = arr[bidx-i-1];
//                 arr[bidx-i-1] = temp;
//             }
//             if(bidx==0){
//                 System.out.println(n);
//             }else{
//             arr[bidx-1]=-1;
//             for(int i=0;i<n;i++){
//                 arr[i] = arr[i]*2;
//                 int min = Integer.MAX_VALUE;
//                 for(int j=0;j<n;j++){
//                     if(arr[j]>0){
//                         if(Math.abs(k-arr[j])<min && k>arr[j]){
//                             min = j;
//                         }
//                     }
//                 }
//                 arr[min]=-1;
//             }
//             for(int i=0;i<n;i++){
//                 if(arr[i]!=-1){
//                     c++;
//                 }
//             }
//             System.out.println(c);
//         }}
//     }
// }
import java.util.*;

public class DSA {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // test cases
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long arr[] = new long[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextLong();
            }

            Arrays.sort(arr);
            int bidx = n;
for (int i = 0; i < n; i++) {
    if (arr[i] > k) {
        bidx = i;
        break;
    }
}
if(bidx==0){
    System.out.println(n);
}else{
// Reverse first bidx elements (i.e., those ≤ k)
for (int i = 0; i < bidx / 2; i++) {
    long temp = arr[i];
    arr[i] = arr[bidx - i - 1];
    arr[bidx - i - 1] = temp;
} 

            int count = 0;

            for(int i = 0; i < n; i++){
                if(arr[i] <= k){
                    count++;
                } else {
                    // Try doubling previous elements if needed
                    boolean used = false;
                    for(int j = 0; j < i; j++){
                        if(arr[j] != -1 && arr[j]*2 <= k){
                            arr[j] = -1; // mark used
                            count++;
                            used = true;
                            break;
                        }
                    }
                    if(!used) break;
                }
            }

            System.out.println(count);
        }}
    }
}
