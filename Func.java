//check if no is prime or not 
// import java.util.*;
// public class Func{
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Enter the Number: ");
//         int a=sc.nextInt();
//         if(a==2){
//             System.out.println("Smallest Prime Number");
//             return ;
//         }
//         for(int i=2;i<a;i++){
//             if(a%i==0){
//                 System.out.println("Not a Prime Number");
//                 return ;
//             }
//         }
//         System.out.println("Is a Prime Number");
//     }
// }
//function and then prime no 
// import java.util.*;
// public class Func{
//     public static boolean isPrime(int n){
//         if(n==1){
//             return false;
//         }
//         for(int i=2;i<n;i++){
//             if(n%i==0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]){
//         for(int i=1;i<=100;i++){
//             if(isPrime(i)==true){
//                 System.out.print(i+" ");
//             }
//         }
//     }
// }
//convert from binary to decimal
// import java.util.*;
// public class Func{
//     public static void main(String args[]){
//         int n=1000;
//         int b=n;
//         int sum=0;
//         int i=0;
//         while(b>0){
//             int ld = b%10;
//             sum=sum+(ld*(int)Math.pow(2,i++));
//             // System.out.println(sum);
//             b=b/10;
//         }
//         System.out.println("Decimal value is : "+sum);
//     }
// }
// convert decimal to binary 
// import java.util.*;
// public class Func{
//     public static void main(String args[]){
//         int pow = 0 ;
//         int n=10;
//         int b=n;
//         while(b>0){
            
//         }
//     }
// }
// import java.util.Scanner;
// import java.util.regex.Pattern;

// public class Func {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Read the number of queries
//         int queryCount = scanner.nextInt();
//         scanner.nextLine(); // Consume the newline character

//         // Pattern to match strings that start and end with the same character
//         Pattern pattern = Pattern.compile("^(a.*a|b.*b|a|b)$");

//         for (int i = 0; i < queryCount; i++) {
//             String input = scanner.nextLine();
//             if (pattern.matcher(input).matches()) {
//                 System.out.println("True");
//             } else {
//                 System.out.println("False");
//             }
//         }

//         scanner.close();
//     }
// }
// import java.util.Scanner;
// import java.util.regex.Pattern;

// public class Func {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Read the number of queries
//         int queryCount = scanner.nextInt();
//         scanner.nextLine(); // Consume the newline character

//         // Array to store the inputs
//         String[] inputs = new String[queryCount];

//         // Read all inputs first
//         for (int i = 0; i < queryCount; i++) {
//             inputs[i] = scanner.nextLine();
//         }

//         // Pattern to match strings that start and end with the same character
//         Pattern pattern = Pattern.compile("^(a.*a|b.*b|a|b)$");

//         // Check each input and store the results
//         boolean[] results = new boolean[queryCount];
//         for (int i = 0; i < queryCount; i++) {
//             results[i] = pattern.matcher(inputs[i]).matches();
//         }

//         // Print all results
//         for (int i = 0; i < queryCount; i++) {
//             System.out.println(results[i] ? "True" : "False");
//         }

//         scanner.close();
//     }
// }
// import java.util.*;
// import java.util.Scanner;
// import java.util.regex.Pattern;
// public class Func{
//     public static void main(String args[]){
//         Scanner scanner = new Scanner(System.in);
//         int queryCount = scanner.nextInt();
//         scanner.nextLine(); 

        
//         String[] inputs = new String[queryCount];

        
//         for (int i = 0; i < queryCount; i++) {
//             inputs[i] = scanner.nextLine();
//         }
        
//         Pattern pattern = Pattern.compile("^(a.*a|b.*b|a|b)$");
        
//         boolean[] results = new boolean[queryCount];
        
//         for (int i = 0; i < queryCount; i++) {
//             results[i] = pattern.matcher(inputs[i]).matches();
//         }
        
//         for (int i = 0; i < queryCount; i++) {
//                         System.out.println(results[i] ? "True" : "False");
//                     }
//     }
// }
import java.util.*;
public class Func{
    public static void main(String args[]){
        
    }
}