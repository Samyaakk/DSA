// 1/22
// when threeare function call waiting it's called segmentation fault or stack overflow 
// condition used to stop the recursion is called base condition
//recursion tree 
//recursion is calling the function itself 
//stack overflow /stack space -> space where yet to completed are stored 

// import java.util.*;
// import java.util.Scanner;
// public class Main{
   
//     public static void f(int a,int cnt){
    
//         if(cnt ==a){
//             return ;
//         }
//             System.out.println(cnt);
//             cnt++;
            
//             f(a,cnt);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//         int cnt =0;
//         f(a,cnt);
//     }
// }
// 2/22
// print name n times 
// import java.util.*;
// import java.util.Scanner;
// public class Main{
//     public static void f(int i,int n){
//         if(i>n){
//             return ;
//         }
//         System.out.println("Samyak");
//         f(i+1,n);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n =sc.nextInt();
        
//         f(1,n);
//     }
// }
//print numbers from 1 to n 
// import java.util.*;
// public class Main{
//     public static void f(int i,int n){
//         if(i>n){
//             return;
//         }
//         System.out.println(i);
//         i++;
//         f(i,n);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         f(1,a);
//     }
// }
//print numbers from n to 1 
// import java.util.*;
// public class Main{
//     public static void f(int n,int i){
//         if(n<i){
//             return;
//         }
//         System.out.println(n);
//         n--;
//         f(n,i);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         f(n,1);
//     }
// }
//print numbers from 1 to n but without +1 operator 
// here comes backtracking 
// import java.util.*;
// import java.util.Scanner;
// public class Main{
//     public static void f(int a,int b){
//         if(a<1){
//             return;
//         }
//         f(a-1,b);
//         System.out.println(a);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         f(a,a);
//     }
// }
//print numbers from n to 1 using backtracking 
// import java.util.*;
// import java.util.Scanner;
// public class Main{
//     public static void f(int a, int b){
//         if(a>b){
//             return ;
//         }
//         f(a+1,b);
//         System.out.println(a);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         f(1,a);
//     }
// }
// 3/22
// parameterized and functional recursion  
// import java.util.*;
// import java.util.Scanner;
// public class Main{
//     public static void f(int n,int sum){
//         if(n<1){
//             System.out.println(sum);
//             return ;
//         }
//         f(n-1,sum+n);
//     }
//     public static void main(String args[]){
//         Scanner sc=  new Scanner(System.in);
//         int n = sc.nextInt();
//         f(n,0);
//     }
// }
// import java.util.*;
// import java.util.Scanner;
// public class Main{
//     public static int f(int n){
//         if(n==0){
//             return 0;
//         }
//         return n+f(n-1);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = f(n);
//         System.out.println(sum);
//     }
// }
//product of n numbers 
// tc-> n calls O(n)
// sc-> n stacks O(n)
// import java.util.*;
// public class Main{
//     public static int f(int n){
//         if(n==1){
//             return 1;
//         }
//         return n*f(n-1);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
//         int Prod = f(n);
//         System.out.println(Prod);
//     }
// }
//4/22
//functional recursion calls 
//reversing an array 
// import java.util.*;
// public class Main{
//     public static void Swap(int arr[],int a,int b){
//         int temp = arr[a];
//         arr[a]=arr[b]; 
//         arr[b] = temp ;
//     }
//     public static void reverse(int arr[],int l,int r){
//         if(l>=r){
//             return;
//         }
//         Swap(arr,l,r);
//         reverse(arr,l+1,r-1);
//     }
//     public static void main(String args[]){
//         Scanner sc=  new Scanner (System.in);
//         int arr[] = {1,2,3,4,5};
//         reverse(arr,0,arr.length-1);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }
//array reverse without using two different variables 
//check if string is palindrome 
//tc - > O(n/2)
//sc -> O(n/2)
// import java.util.*;
// public class Main{
//     public static boolean palindrome(String s,int n,int i){
//         if(i>=n/2){
//             return true;
//         }
//         if(s.charAt(i)!=s.charAt(n-i-1)){
//             return false;
//         }
//         return  palindrome(s,n,i+1);
//     }
//     public static void main (String args[]){
//         String s = "madam";
//         int n=s.length();
//         boolean b=palindrome(s,n,0);
//         System.out.println(b);
//     }
// }
// import java.util.*;
// public class Main{
//     public static void main(String args[]){
//         int arr[] = {13,46,24,52,20,9};
//         for(int i=0;i<arr.length-1;i++){
//             int min = i;
//             for(int j=i+1;j<n;j++){
//                 if(arr[j]<arr[min]){
//                     min=j;
//                 }
//             }
//             int temp = arr[min];
//             arr[min] = arr[i];
//             arr[i]  = temp;
//         }
//     }
// }
// 5/22
// Multiple recursion calls 
//fibo  tc -> 2^n ie. exponential in nature 
// import java.util.*;
// public class Main{
//     public static int fib(int n){
//         if(n<=1){
//             return n;
//         }
//         return fib(n-1)+fib(n-2);
//     }
//     public static void main(String args[]){
//         int a= fib(6);
//         System.out.println(a);
//     }
// }
// 6/22
//Print all subsequences -> a contigous /non-contigous sequence which follows the order 
//13/315
// Hashing
// prestore and fetching something 
// Number hashing 
// import java.util.*;
// import java.util.Scanner;
// public class Main{
//     public static void main(String args[]){
//         Scanner sc=  new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         //precompute
//         int hash[] = new int[100000000];
//         for(int i=0;i<n;i++){
//             hash[arr[i]]+=1;
//         }
//         int q = sc.nextInt();
//         while(q>0){
//             int no;
//             no=sc.nextInt();
//             //fetch
//             System.out.println(hash[no]);
//             q--;
//         }
//     }
// }
// //if you declare array global then array will go upto 10^8 hash arr size 
// //if you declare local or inside main more then 10^7 it will give you segmantation fault 
// Character hashing for the particulare and all ie. 256
// import java.util.*;
// import java.util.Scanner;
// public class Main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         int hash[] = new int[256];
//         for(int i=0;i<s.length();i++){
//             hash[s.charAt(i)-'a']++;
//         }
//         int q=sc.nextInt();
//         while(q>0){
//             char c;
//             c=sc.next().charAt(0);
//             System.out.println(hash[c]);
//             q--;
//         }
//     }
// }
// number hashing for no's > then 10^7 uses stl in c++ and collection in java
//here's map benefecial as if if the no.is 12 so by basic you need to create array of 13 size but in maps it will only take it's key value ie. 1 mermoery
// import java.util.*;
// public class Main{
//     public static void main(String args[]){
//         int n;
//         Scanner sc = new Scanner(System.in);
//         n=sc.nextInt();
//         int arr[]  = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] =  sc.nextInt();
//         }
//         Map<Integer,Integer>mpp= new HashMap<>();
//         for(int i=0;i<n;i++){
//             mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
//         }
//         int q;
//         q=sc.nextInt();
//         while(q>0){
//             int no;
//             no=sc.nextInt();
//             System.out.println(mpp.getOrDefault(no,0));
//             q--;
//         }
//         for(Map.Entry<Integer,Integer>it:mpp.entrySet()){
//             System.out.println(it.getKey()+" -> "+it.getValue());
//         }
//     }
// }
// TC -> time complexity of these maps 
// storing and fetching both takes log n in best , average , worst cases 
// import java.util.*;
// public class Main{
//     public static void main(String args[]){
//         Map<String, Integer> mpp = new HashMap<>();
//         mpp.put("samyak",1);
//         mpp.put("sharma",2);
//         System.out.println("u: "+mpp);
//         for(Map.Entry<String,Integer>entry:mpp.entrySet()){
//             System.out.println(entry.getKey()+" -> "+entry.getValue());
//         }
//     }
// }

// import java.util.*;

// public class Main {
//     public static String largestNumber(int[] nums) {
//         String[] arr = new String[nums.length];
        
//         // Convert to string
//         for (int i = 0; i < nums.length; i++) {
//             arr[i] = String.valueOf(nums[i]);
//         }

//         // Custom sort
//         Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

//         // Handle all zeros
//         if (arr[0].equals("0")) return "0";

//         // Combine result
//         StringBuilder sb = new StringBuilder();
//         for (String s : arr) {
//             sb.append(s);
//         }

//         return sb.toString();
//     }

//     public static void main(String[] args) {
//         int[] nums = {2, 3, 5, 30, 34};
//         System.out.println("Largest number: " + largestNumber(nums));
//     }
// }

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt(); // number of test cases
//         while (t-- > 0) {
//             int n = sc.nextInt();
//             int k = sc.nextInt();

//             List<Pair> healthPoints = new ArrayList<>();
//             for (int i = 0; i < n; i++) {
//                 long x = sc.nextLong();
//                 healthPoints.add(new Pair(x, i + 1));
//             }

//             for (int i = 0; i < n; i++) {
//                 long mod = healthPoints.get(i).first % k;
//                 if (mod == 0) mod = k;
//                 healthPoints.get(i).first = mod;
//             }

//             Collections.sort(healthPoints, (a, b) -> {
//                 if (a.first == b.first) {
//                     return Long.compare(a.second, b.second); // ascending index
//                 }
//                 return Long.compare(b.first, a.first); // descending mod value
//             });

//             for (Pair p : healthPoints) {
//                 System.out.print(p.second + " ");
//             }
//             System.out.println();
//         }
//     }

//     static class Pair {
//         long first;
//         long second;

//         public Pair(long first, long second) {
//             this.first = first;
//             this.second = second;
//         }
//     }
// }

// 6
// import java.util.*;
// public class Main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         long t = sc.nextLong();
//         while(t-->0){
//             long n = sc.nextLong();
//             long k = sc.nextLong();
//             long q = sc.nextLong();
//             long arr[] = new long[(int)n];
//             for(int i=0;i<(int)n;i++){
//                 arr[i] = sc.nextLong();
//                 arr[i] = (arr[i]>q)?0:1;
//             }
//             long coo = 0;
//             long w = 0;
//             for(int i=0;i<(int)n;i++){
//                 if(arr[i]==1){
//                     coo++;
//                 }else{
//                     if(coo>=k){
//                         long diff = coo-k+1;
//                         w+=(diff*(diff+1))/2;
//                     }
//                     coo=0;
//                 }
//             }
//             if(coo>=k){
//                 long diff = coo-k+1;
//                 w+=(diff*(diff+1))/2;
//             }
//             System.out.println(w);
//         }
//     }
// }

// 7
// import java.util.*;
// public class Main{
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         int t = sc.nextInt();
//         while(t-->0){
//             int n = sc.nextInt();
//             int arr[] = new int[n];
//             int arr2[] = new int[n];
//             for(int i=0;i<n;i++){
//                 arr[i] = sc.nextInt();
//             }
//             for(int i=0;i<n;i++){
//                 arr2[i] = sc.nextInt();
//             }
//             int c1=1;
//             int c2 =1;
//             int mc1=1;
//             int mc2 =1;
//             int maxe1 = 0;
//             int maxe2=0;
//             for(int i=0;i<n;i++){
//                 if(arr[i]==arr[i+1]){
//                     c1++;
//                 }else{
//                     if(mc1<c1){
//                         mc1=c1;
//                         maxe1 = arr[i];
//                     }
//                     c1=1;
                    
//                 }
//                 if(arr2[i]==arr2[i+1]){
//                     c2++;
//                 }else{
//                    if(mc2<c2){
//                         mc2=c2;
//                         maxe2 = arr2[i];
//                     }
//                     c2=1;
//                 }
//             }
//             int cf1=0;
//             int cf2=0;
//             int mcf1=0;
//             int mcf2=0;
//             for(int i=0;i<n;i++){
//                 if(arr[i]==maxe2){
//                     cf1++;
//                 }
//                 if(arr2[i]==maxe1){
//                     cf2++;
//                 }
//             }
//         }
//     }
// }
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();

//         while (t-- > 0) {
//             int n = sc.nextInt();
//             long[] a = new long[n];
//             long[] b = new long[n];

//             for (int i = 0; i < n; i++) {
//                 a[i] = sc.nextLong();
//             }

//             for (int i = 0; i < n; i++) {
//                 b[i] = sc.nextLong();
//             }
//             if(n==1){
//                 if(a[0]==b[0])System.out.println(2);
//                 else System.out.println(1);
//             }
//             long[] longestSubarrayA = new long[2 * n + 1];
//             long[] longestSubarrayB = new long[2 * n + 1];

//             long counter = 1;

//             // Process array a
//             for (int i = 1; i < n; i++) {
//                 if (a[i] == a[i - 1]) {
//                     counter++;
//                 } else {
//                     longestSubarrayA[(int) a[i - 1]] = Math.max(longestSubarrayA[(int) a[i - 1]], counter);
//                     counter = 1;
//                 }
//             }
//             longestSubarrayA[(int) a[n - 1]] = Math.max(longestSubarrayA[(int) a[n - 1]], counter);

//             counter = 1;

//             // Process array b
//             for (int i = 1; i < n; i++) {
//                 if (b[i] == b[i - 1]) {
//                     counter++;
//                 } else {
//                     longestSubarrayB[(int) b[i - 1]] = Math.max(longestSubarrayB[(int) b[i - 1]], counter);
//                     counter = 1;
//                 }
//             }
//             longestSubarrayB[(int) b[n - 1]] = Math.max(longestSubarrayB[(int) b[n - 1]], counter);

//             long maxFreq = -1;
//             for (int i = 1; i < 2 * n; i++) {
//                 maxFreq = Math.max(maxFreq, longestSubarrayA[i] + longestSubarrayB[i]);
//             }
//             if(n!=1){
//             System.out.println(maxFreq);
//             }
//         }
//     }
// }

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int q = sc.nextInt();  // Number of test cases

//         while (q-- > 0) {
//             int n = sc.nextInt();

//             int[] a = new int[n + 1]; // 1-indexed
//             int[] b = new int[n + 1];

//             for (int i = 1; i <= n; i++) {
//                 a[i] = sc.nextInt();
//             }

//             for (int i = 1; i <= n; i++) {
//                 b[i] = sc.nextInt();
//             }

//             int[] fa = new int[2 * n + 2];
//             int[] fb = new int[2 * n + 2];

//             // For array a
//             int p = 1;
//             for (int i = 2; i <= n; i++) {
//                 if (a[i] != a[i - 1]) {
//                     fa[a[i - 1]] = Math.max(fa[a[i - 1]], i - p);
//                     p = i;
//                 }
//             }
//             fa[a[n]] = Math.max(fa[a[n]], n - p + 1);

//             // For array b
//             p = 1;
//             for (int i = 2; i <= n; i++) {
//                 if (b[i] != b[i - 1]) {
//                     fb[b[i - 1]] = Math.max(fb[b[i - 1]], i - p);
//                     p = i;
//                 }
//             }
//             fb[b[n]] = Math.max(fb[b[n]], n - p + 1);

//             // Combine results
//             int ans = 0;
//             for (int i = 1; i <= 2 * n; i++) {
//                 ans = Math.max(ans, fa[i] + fb[i]);
//             }

//             System.out.println(ans);
//         }
//     }
// }

// import java.util.*;
// public class Main{
//     public static void main(String args[]){
//         Scanner sc=  new Scanner(System.in);
//         int t = sc.nextInt();
//         sc.nextLine();
//         while(t-->0){
//             int n = sc.nextInt();
//             sc.nextLine();
//             String s = sc.nextLine();
//             boolean pa[] = new boolean[26];
//             int parr[] = new int[n];
//             int sarr[] = new int[n];
//             int up=0;
//             int us=0;
//             boolean sa[] = new boolean[26];
//             for(int i=0;i<n;i++){
//                 if(!pa[s.charAt(i)-'a']){
//                     pa[s.charAt(i)-'a']=true;
//                     up++;
//                 }
//                 parr[i]=up;
//             }
//             for(int i=n-1;i>=0;i--){
//                 if(!sa[s.charAt(i)-'a']){
//                     sa[s.char At(i)-'a']=true;
//                     us++;
//                 }
//                 sarr[i]=us;
//             }
//             int res = 0;
//             for(int i=0;i<n-1;i++){
//                 res = Math.max(res,parr[i]+sarr[i+1]);
//             }
//             System.out.println(res);
//         }
//     }
// }

// import java.util.*;
// public class Main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         while(t-->0){
//             int n = sc.nextInt();
//             int a = 1;
//             int b = n-1;
//             for(int i=2;i*i<=n;i++){
//                 if(n%i==0){
//                     a=n/i;
//                     b=n-a;
//                     break;
//                 }
//             }
//             System.out.println(a+" "+b);
//         }
//     }
// }

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int t = sc.nextInt();  // number of test cases
//         while (t-- > 0) {
//             long n = sc.nextLong(); // input length
//             char color = sc.next().charAt(0); // input character
//             String s = sc.next(); // input string

//             s = s + s;  // concatenate string with itself
//             n = n * 2;

//             long lastGreenIndex = -1;
//             long maxSeconds = Integer.MIN_VALUE;

//             for (int i = (int) n - 1; i >= 0; i--) {
//                 if (s.charAt(i) == 'g') {
//                     lastGreenIndex = i;
//                 }
//                 if (s.charAt(i) == color) {
//                     long difference = lastGreenIndex - i;
//                     maxSeconds = Math.max(maxSeconds, difference);
//                 }
//             }

//             System.out.println(maxSeconds);
//         }
//     }
// }

// import java.util.*;
// public class Main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int Power = sc.nextInt();
//         int arr[] = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         Arrays.sort(arr);
//         int l=0;
//         int r=n-1;
//         int c=0;
//         int sum = 0;
//         int tp=2;
//         int d=0;
//         for(int i=0;i<n;i++){
//             if(arr[i]>Power){
//                 d++;
//             }
//         }
//         if(d==n){
//             System.out.println(n);
//         }else{
//         while(l<r){
//             if(arr[r]>Power){
//                 r--;
//                 c++;
//             }else if(arr[r]*tp>Power){
//                 c++;
//                 l++;
//                 r--;
//                 tp=2;
//             }else{
//                 l++;
//                 tp++;
//             }
//         }
//         System.out.println(c);
//     }
//     }
// }

// import java.util.*;
// public class Main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int k=sc.nextInt();
//         int b=sc.nextInt();
//         int s=sc.nextInt();
//         int ld = k*b+1;
//         int rem = s-ld;
//         int arr[] = new int[n];
//         Arrays.fill(arr,0);
//         if(rem==0){
//             arr[n-1]=ld;
//         }else{
//             int val = rem/k;
//             int allval = val/(n-1);
//         }
//     }
// }

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
        
//         while (t-- > 0) {
//             long n = sc.nextLong();
//             long k = sc.nextLong();
//             long b = sc.nextLong();
//             long s = sc.nextLong();

//             long minimum_s = k * b;
//             long maximum_s = (k * b) + (k - 1) * n;

//             if (s < minimum_s || s > maximum_s) {
//                 System.out.println("-1");
//             } else {
//                 long[] ans = new long[(int)n];
//                 ans[0] = minimum_s;
//                 s -= minimum_s;

//                 for (int i = 0; i < n; i++) {
//                     long add = Math.min(k - 1, s);
//                     ans[i] += add;
//                     s -= add;
//                 }

//                 for (long num : ans) {
//                     System.out.print(num + " ");
//                 }
//                 System.out.println();
//             }
//         }
//     }
// }
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();  // number of test cases

//         while (t-- > 0) {
//             int n = sc.nextInt();
//             long x = sc.nextLong();
//             long[] a = new long[n];

//             for (int i = 0; i < n; i++) {
//                 a[i] = sc.nextLong();
//             }

//             // Construct segments: [a[i] - x, a[i] + x]
//             List<long[]> segments = new ArrayList<>();
//             for (int i = 0; i < n; i++) {
//                 segments.add(new long[]{a[i] - x, a[i] + x});
//             }

//             long ans = 0;
//             long l = segments.get(0)[0];
//             long r = segments.get(0)[1];

//             for (int i = 1; i < n; i++) {
//                 l = Math.max(l, segments.get(i)[0]);
//                 r = Math.min(r, segments.get(i)[1]);

//                 if (l > r) {
//                     ans++;
//                     l = segments.get(i)[0];
//                     r = segments.get(i)[1];
//                 }
//             }

//             System.out.println(ans);
//         }
//     }
// }


// import java.util.*;
// public class Main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         while(t-->0){
//             int n = sc.nextInt();
//             int arr[] = new int[n];
//             for(int i=0;i<n;i++){
//                 arr[i] = sc.nextInt();
//             }
//             int c=0;
//             for(int i=0;i<arr.length;i++){
//                 if(arr[i]>n){
//                     c++;
//                     System.out.print(-1);break;
//                 }
//             }
//             if(c==0){
//                 int res[] = new int[n];
//                 int noc = -1;
//                 for(int i=0;i<n;i++){
//                     if(arr[i]==i){
//                         noc = i;
//                     }
//                 }
//                 res[noc] = noc;
//                 int i;
//                 if(noc==1){
//                     i=2;
//                 }
//                 for( i=1;i<=n;i++){
//                     if(i==noc)continue;
//                     else res[i]=res[i+1];
//                 }
//                 for(i=0;i<n;i++){
//                     System.out.print(res[i]+" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;

// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();  // Read number of test cases
//         while (t-- > 0) {
//             int n = sc.nextInt();  // Length of string
//             int k = sc.nextInt();  // Window size
//             sc.nextLine();         // Consume the leftover newline

//             String s = sc.nextLine(); // Read the full string like "BBWWWBB"
//             char[] arr = s.toCharArray();

            
//             int prefarr[] = new int[n+1];
//             for(int w=0;w<n;w++){
//                prefarr[w+1]= prefarr[w]+((arr[w]=='W')?1:0);
//             }
//             int change = Integer.MAX_VALUE;
//             for(int w=0;w<=n-k;w++){
//                 change = Math.min(change,prefarr[w+k]-prefarr[w]);
//             }
//             System.out.println(change);
//         }
//     }
// }



