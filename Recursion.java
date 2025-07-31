// Recursion 
// when a function calls itself 
// until a specific condition is met 
// import java.util.*;
// public class Recursion{
//     public static void f(){
//         System.out.println(1);
//         f();
//     }
//     public static void main(String args[]){
//         f();
//     }
// }
//after some time stack is full which is called as segmentation fault or stack overflow 
//ie. why infinite recursion not run 

// import java.util.*;
// public class Recursion{
//     public static void f(int c){
//         if(c==1000){
//             return;
//         }
//         System.out.println(c);
//         c++;
//         f(c);
//     }
//     public static void main(String args[]){
//         f(0);
//     }
// }

//Recursion Tree 

// 2/22
// Basic recursion problem 
//print name 5 times 
// import java.util.*;
// public class Recursion{
//     public static void f(int i,int n){
//         if(i>n){
//             return;
//         }
//         System.out.println("sam");
//         f(i+1,n);
//     }
//     public static void main(String args[]){
//         int i=1;
//         int n=5;
//         f(i,n);
//     }
// }

//printLinearly from 1 to N
// import java.util.*;
// public class Recursion{
//     public static void f(int i,int n){
//         if(i>n){
//             return;
//         }
//         System.out.println(i);
//         f(i+1,n);
//     }
//     public static void main(String args[]){
//         int i=1;
//         int n=5;
//         f(i,n);
//     }
// }


//printLinearly from N to 1
// import java.util.*;
// public class Recursion{
//     public static void f(int n,int i){
//         if(n<i){
//             return;
//         }
//         System.out.println(n);
//         f(n-1,i);
//     }
//     public static void main(String args[]){
//         int i=1;
//         int n=5;
//         f(n,i);
//     }
// }


//printLinearly from 1 to N by backtracking 
// import java.util.*;
// public class Recursion{
//     public static void f(int i,int n){
//         if(i>n){
//             return;
//         }
//         f(i,n-1);
//         System.out.println(n);
//     }
//     public static void main(String args[]){
//         int i=1;
//         int n=5;
//         f(i,n);
//     }
// }

//printLinearly from N to 1 by backtracking 
// import java.util.*;
// public class Recursion{
//     public static void f(int i,int n){
//         if(i>n){
//             return;
//         }
//         f(i+1,n);
//         System.out.println(i);
//     }
//     public static void main(String args[]){
//         int i=1;
//         int n=5;
//         f(i,n);
//     }
// }

//3/22
// Parameterized and functional Recursion 
//parameterized 
// import java.util.*;
// public class Recursion{
//     public static void sum(int i,int sum){
//         if(i<1){
//             System.out.println(sum);
//             return;
//         }
//         sum(i-1,sum+i);
//     }
//     public static void main(String args[]){
//         sum(10,0);
//     }
// }

//functional 
// import java.util.*;
// public class Recursion{
//     public static int sum(int i){
//         if(n==0){
//             return 0;
//         }
//         return n+f(n-1);
//     }
//     public static void main(String args[]){
//         System.out.println(sum(10));
//     }
// }

//factorial of n 
// import java.util.*;
// public class Recursion{
//     public static int factorial(int n){
//         if(n==0){
//             return 1;
//         }
//         return n*factorial(n-1);
//     }
//     public static void main(String args[]){
//         System.out.println(factorial(5));
//     }
// }

// 4/22
// Reverse of an array 
// M1 - using two variables left and right 
// import java.util.*;
// public class Recursion{
//     public static void reverse(int l,int r,int arr[]){
//         if(l>=r){
//             return;
//         }
//         int temp = arr[l];
//         arr[l] = arr[r];
//         arr[r] = temp;
//         reverse(l+1,r-1,arr);
//     }
//     public static void main(String args[]){
//         int n=5;
//         int arr[] = {1,2,3,4,2};
//         int l = 0;
//         int r = n-1;
//         reverse(l,r,arr);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
// }
 
// M2 - Using one variable only i 
// import java.util.*;
// public class Recursion{
//     public static void reverse(int i,int n,int arr[]){
//         if(i>=n/2){
//             return;
//         }
//         int temp = arr[i];
//         arr[i] = arr[n-i-1];
//         arr[n-i-1] = temp;
//         reverse(i+1,n,arr);
//     }
//     public static void main(String args[]){
//         int n=5;
//         int arr[] = {1,2,3,4,2};
//         int i=0;
//         reverse(i,n,arr);
//         for( i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
// }

// check if a string is palindrome or not 
// import java.util.*;
// public class Recursion{
//     public static boolean palindrome(String s,int i,int n){
//         if(i>=n/2){
//             return true;
//         }
//         if(s.charAt(i)!=s.charAt(n-i-1)){
//             return false;
//         }
//         return palindrome(s, i+1, n);
//     }
//     public static void main(String args[]){
//         String s ="madaM";
//         int n = s.length();
//         int i = 0;
//         System.out.println(palindrome(s,i,n));
//     }
// }

//fibonacci Number
// import java.util.*;
// public class Recursion{
//     public static int fibonacci(int n){
//         if(n==0||n==1){
//             return n;
//         }
//         return fibonacci(n-1)+fibonacci(n-2);
//     }
//     public static void main(String args[]){
//         int n=4;
//         System.out.println(fibonacci(n));
//     }
// }

// 6/22
// printing all subsequences 

// import java.util.*;

// public class Recursion{

//     public static void main(String[] args) {
//         String str = "abc";
//         List<String> result = new ArrayList<>();
//         printSubseq(str, 0, "", result);
//         System.out.println("Subsequences are: " + result);
//     }

//     public static void printSubseq(String str, int idx, String curr, List<String> rer) {
//         if (idx == str.length()) {
//             result.add(curr);
//             return;
//         }
//         printSubseq(str,idx+1,curr+str.charAt(idx),res);
//         printSubseq(str,idx+1,curr,res);
//     }
// }



// import java.util.*;
// public class Recursion {

//     public static void main(String[] args) {
//         int[] arr = {3, 1, 2};
//         List<List<Integer>> result = new ArrayList<>();
        
//         generateSubsequences(arr, 0, new ArrayList<>(), result);
        
//         // Print all subsequences
//         System.out.println("Subsequences are: " + result);
//     }

//     public static void generateSubsequences(int[] arr, int index, List<Integer> current, List<List<Integer>> result) {
//         // Base case: If we've processed all elements
//         if (index == arr.length) {
//             result.add(new ArrayList<>(current)); // Add a copy of current to result
//             return;
//         }

//         // Include the current element
//         current.add(arr[index]);
//         generateSubsequences(arr, index + 1, current, result);

//         // Exclude the current element (backtrack)
//         current.remove(current.size() - 1);
//         generateSubsequences(arr, index + 1, current, result);
//     }
// }

// 7/22 
//printing subsequences where sum is k 
// import java.util.*;

// public class Recursion {

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 1};
//         int k = 2;
        
//         List<Integer> current = new ArrayList<>();
//         System.out.println("Subsequences with sum " + k + " are:");
//         findSubsequencesWithSumK(arr, 0, current, 0, k);
//     }

//     public static void findSubsequencesWithSumK(int[] arr, int index, List<Integer> current, int currentSum, int targetSum) {
//         // Base case: If we've processed all elements
//         if (index == arr.length) {
//             if (currentSum == targetSum) {
//                 System.out.println(current);
//             }
//             return;
//         }

//         // Include the current element
//         current.add(arr[index]);
//         findSubsequencesWithSumK(arr, index + 1, current, currentSum + arr[index], targetSum);

//         // Exclude the current element (backtrack)
//         current.remove(current.size() - 1);
//         findSubsequencesWithSumK(arr, index + 1, current, currentSum, targetSum);
//     }
// }

// printing one subsequence as answer 
// public class PrintOneSubsequence {

//     // Helper method to print one subsequence
//     public static boolean printOneSubsequence(String str, String result) {
//         // Base case: when the input string is empty
//         if (str.isEmpty()) {
//             System.out.println(result); // Print one subsequence
//             return true; // Indicate that we've printed one subsequence
//         }

//         // Include the first character
//         if (printOneSubsequence(str.substring(1), result + str.charAt(0))) {
//             return true; // Stop further recursion if subsequence is printed
//         }

//         // Exclude the first character
//         if (printOneSubsequence(str.substring(1), result)) {
//             return true; // Stop further recursion if subsequence is printed
//         }

//         return false; // This won't execute as we'll print one subsequence early
//     }

//     public static void main(String[] args) {
//         String input = "abc";
//         printOneSubsequence(input, "");
//     }
// }

// 9/22   quick sort -> 
// ascending sort 
// import java.util.* ; 
// public class Recursion {
//     public static int f(List<Integer>arr,int low ,int high){
//         int pivot = arr.get(low);
//         int i = low;
//         int j = high;
//         while(i<j){
//             while(arr.get(i)<=pivot&&i<=high-1){
//                 i++;
//             }
//             while(arr.get(j)>pivot&&j>=low){
//                 j--;
//             }
//             if(i<j){
//                 Collections.swap(arr,i,j);
//             }
//         }
//         Collections.swap(arr,low,j);
//         return j;
//     }
//     public static List<Integer> quickSort(List<Integer> arr,int low,int high){
//         // Write your code here.
//         if(low<high){
//             int pIndex = f(arr,low,high);
//             quickSort(arr,low,pIndex-1);
//             quickSort(arr,pIndex+1,high);
//         }
//         return arr;
//     }
//     public static void main(String args[]){
//         List<Integer> arr= new ArrayList<>();
//         arr.add(4);
//         arr.add(6);
//         arr.add(2);
//         arr.add(5);
//         arr.add(7);
//         arr.add(9);
//         arr.add(1);
//         arr.add(3);
//         int low = 0;
//         int high = arr.size()-1;
//         List<Integer> list = quickSort(arr,low,high);
//         int c=0;
//         while(c!=arr.size()){
//             System.out.print(arr.get(c)+" ");
//             c++;
//         }
//         return;
//     }
// }

// descending sort 
// import java.util.*;
// public class Recursion{
//     public static int partition(List<Integer>arr,int low,int high){
//         int i=low;
//         int j=high;
//         int pivot = arr.get(low);
//         while(i<j){
//             while(arr.get(i)>=pivot&&i<=high-1){
//                 i++;
//             }
//             while(arr.get(j)<pivot&&j>=low){
//                 j--;
//             }
//             if(i<j){
//                 Collections.swap(arr,i,j);
//             }
//         }
//         Collections.swap(arr,low,j);
//         return j;
//     }
//     public static List<Integer> quickSort(List<Integer>arr ,int low,int high){
//         if(low<high){
//             int pIndex = partition(arr,low,high);
//             quickSort(arr,low,pIndex-1);
//             quickSort(arr,pIndex+1,high);
//         }
//         return arr;
//     }
//     public static void main(String args[]){
//         List<Integer> arr= new ArrayList<>();
//         arr.add(4);
//         arr.add(6);
//         arr.add(2);
//         arr.add(5);
//         arr.add(7);
//         arr.add(9);
//         arr.add(1);
//         arr.add(3);
//         List<Integer> l = quickSort(arr,0,arr.size()-1);
//         int c=0;
//         while(c!=l.size()){
//             System.out.print(arr.get(c)+" ");
//             c++;
//         }
//         return;
//     }
// }

//10/22
// Combinational Sum ->
//11/22/
// Combinational Sum 2 ->
// class Solution {
//     public static void cs(int ind,int arr[],int target,List<List<Integer>> ans,List<Integer>ds){

//             if(target==0){
//                 ans.add(new ArrayList<>(ds));
//                 return;
//             }
//         for(int i=ind;i<arr.length;i++){
//             if(i>ind&&arr[i]==arr[i-1])continue;
//             if(arr[i]>target)break;
//             ds.add(arr[i]);
//             cs(i+1,arr,target-arr[i],ans,ds);
//             ds.remove(ds.size()-1);
    
//         }
        
//     }
//     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//         List<List<Integer>> ans = new ArrayList<>();
//         Arrays.sort(candidates);
//         List<Integer> ds = new ArrayList<>();
//         cs(0,candidates,target,ans,ds);
//         return ans;
//     }
// }

// 11/22
// subset sum 1 
// class Solution {
//     void SS(int ind,int sum,ArrayList<Integer>arr,int n,ArrayList<Integer>subSum){
//         if(ind==n){
//             subSum.add(sum);
//             return;
//         }
//         SS(ind+1,sum+arr.get(ind),arr,n,subSum);
//         SS(ind+1,sum,arr,n,subSum);
//     }
//     ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
//         // code here
//         ArrayList<Integer> subSum = new ArrayList<>();
//         SS(0,0,arr,n,subSum);
//         Collections.sort(subSum);
//         return subSum;
//     }
// }

// 12/22
// subset sum 2 
class Solution {
    public void ss(int ind,int arr[],List<List<Integer>> ans,List<Integer> ds){
        ans.add(new ArrayList<>(ds));
        for(int i=ind;i<arr.length;i++){
            if(i!=ind && arr[i]==arr[i-1])continue;
            ds.add(arr[i]);
            ss(ind+1,arr,ans,ds);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(nums);
        ss(0,nums,ans,ds);
        return ans;
    }
}