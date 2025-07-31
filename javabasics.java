// 14/1/24
// public class javabasics{
//     public static void main(String args[]){
     
//     }
// }
// //boiler plate code = jo har bar likha jayega 

// //ouput in java
// 1. print = system.out.print("      ");qoutes are called string 
// 2. println = system.out.println("    ");
// 3. \n 
// public class javabasics {
//     public static void main(String args[]){
//         System.out.print("Hello World \n");
//         System.out.print("Hello world ");
//         System.out.println("Hello world ");
//         System.out.println("new line ");
//         System.out.print("1 2 3 4 5");

//     }
// }
////statement terminator(;)


//printing a pattern 
// public class javabasics {
//     public static void main(String args[]){
//         System.out.println("* * * *");
//         System.out.println("* * *");
//         System.out.println("* *");
//         System.out.println("*");
//     }
// }


//variables in java 
// literals and variables 
//memory 
// every information is stored in memory ie variables too.
// public class javabasics{
//     public static void main(String args[]){
//         int a=10;
//         int b=5;
//         System.out.println(a);
//         System.out.println(b);
//         String name = "Tony Stark ";
//         System.out.println(name);
//         a=b;
//         System.out.println(a);
//     }
// }


//data types 
//java is a typed language which means we need to
// define the type of variable 
//data types =  1 byte = 8 bits and 1 bit = 0/1
/*
byte 1 bytes (256 ie range )
short 2 
char 2 
boolean 1
int 4 
long 8
float 4 
double 8
*/
// public class javabasics {
//     public static void main(String args[]){
//         byte z = 8;
//         System.out.println(z);
//         char ch = 'a';
//         System.out.println(ch);
//         boolean var = true ; 
//         System.out.println(var);
//         float f = 23.34;
//         System.out.println(f);
//         int no =3;
//         System.out.println(no);
//         //long 
//         //double
//         //short 
//         // total 8 primitive data types. 
//     }
// }

// sum of a and b
// public class javabasics {
//     public static void main(String args[]){
//         int a =5 ;
//         int b= 10 ; 
//         int sum = a + b;
//         System.out.println(sum);
//     }
// }

//comments you know single line and multiline

//input in java
//here util is package 
//Scanner class ka object sc 
// system ke output ke liye system.out to input ke liye system .in 
// sc name can be changed as it is the object 
// sc. next sirf space tk hi capture karta hai agr apne input ke beech mein space dedi to age ka ignore kar dega .
//so to store space we use sc.nextLine()
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         Scanner sc =new Scanner (System.in);
//         // String input = sc.next();
//         // System.out.println(input);
//         // String output = sc.nextLine();
//         // System.out.println(output);
//         // int no = sc.nextInt();
//         // System.out.println(no);
//         // float price =sc.nextFloat();
//         // System.out.println(price);
//         // double king  = sc.nextDouble();
//         // System.out.println(king );
//         // boolean bear = sc.nextBoolean();
//         // System.out.println(bear);
//         // short s=sc.nextShort();
//         // System.out.println (s);
//         // long l = sc.nextLong();
//         // System.out.println(l);
//     }
// }

//sum of a and b by taking input by user with help of scanner class 
// import java.util.*;
// public class javabasics {
//     public static void main(String args[]){
//         Scanner sc =new Scanner (System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int sum= a+b;
//         System.out.println(sum);
//     }
// }

// product of a and b
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         int a = sc.nextInt();
//         int b= sc.nextInt();
//         int prod = a*b;
//         System.out.println(prod);
//     }
// }

//area of circle 
// java kisi bhi decimal value ko float le leta hai isse bachne ke liye conversion kiya hai float like ke at rhs . 
// agr hume directly us decimal value ko float karna hai to hum last mein us decimal value ke f laga sakte hai to use compiler float manta hai .
// import java.util.*;
// public class javabasics {
//     public static void main(String args[]){
//         Scanner sc =new Scanner (System.in);
//         float radius = sc.nextFloat();
//         float area = (float)(3.14 * radius * radius);
//         System.out.println(area);
//     }
// }

//type conversion 
// conversion happens when type compatible and when destination type > source type 
//byte>short>int>float>long>double
// also called implicit , widening ,type  conversion in java
// other wise there is lossy conversion 

//type casting 
// when we are ready to have a lossy conversion 
//also called narrowing , explicit , lossy conversion
// import java.util.*;
// public class javabasics {
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         float a =23.34f;
//         int b =(int)a;
//         System.out.println(b);
//         char ch = 'a';
//         int c=ch;
//         System.out.println(c);
//     }
// }

// type promotion expression (a+b*d/c)
// java automatically promote byte , short , char to int type 
// if one operand is long float double then all converts to largest 
// import java.util.*;
// public class javabasics {
//     public static void main(String args[]){
//         // char a = 'a';
//         // char b = 'b';
//         // char  c =a-b;
//         // System.out.println((int)(b));
//         // System.out.println((int)(a));
//         // System.out.println(a);
//         // System.out.println(a-b);
//         // short a = 5;
//         // byte b= 25;
//         // char c= 'c';
//         // byte bt = (byte)(a+b+c);
//         // System.out.println(bt);
//     }
// }
// import java.util.*;
// public class javabasics{
//         int a = 10 ;
//         float b= 32.23f;
//         long c= 332;
//         double d =32;
//         double ans = a +b+c+d;
//         System.out.println(ans);
//     }
// }

//how code rums in java
// jre = java runtime environment
// file or source code ---> compiler ---> bytecode ---> jvm (java virtual machine) ---> native code 
// c++ is not a portable language but java is .java code can be run anywhere .
// from source code to byte code it is called compilation and the rest is execution . 
//byte code to native code is execution . 

// ************************************************************************************************************************
// 16/1/24
//arithmetic operators ie binary operators
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int a=10;
//         int b=5;
//         System.out.println("add = " + (a+b));
//         System.out.println("subtract = " +(a-b));
//         System.out.println("multiply = "+(a*b));
//         System.out.println("divide = "+(a/b));
//         System.out.println("remainder = "+(a%b));
//     }
// }

// unary operators
// pre increment and post increment 
// pre decrement and post dncrement 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int a = 10 ;
//         int b = ++a;
//         System.out.println(a);
//         System.out.println(b);
//         int c= 10;
//         int d=c++;
//         System.out.println(c);
//         System.out.println(d);
//         int e = 10 ;
//         int f = --e;
//         System.out.println(e);
//         System.out.println(f);
//         int g = 10;
//         int h = g--;
//         System.out.println(g);
//         System.out.println(h);

//     }
// }

// relational operators (6)
// == , != , > , < ,>= ,<= which returns boolean value 
// import java.util.*;
// public class javabasics {
//     public static void main(String args[]){
//         int a =10;
//         int b = 5 ;
//         System.out.println(a==b);
//         System.out.println(a!=b);
//         System.out.println(a>b);
//         System.out.println(a<b);
//         System.out.println(a>=b);
//         System.out.println(a<=b);
//     }
// }

// logical operators 
// && , || , ! 
// logican and , logical or , logical not 
// import java.util.*;
// public class javabasics {
//     public static void main(String args[]){
//         System.out.println((3>2)&&(6>0));
//         System.out.println((3<2)&&(6>0));
//         System.out.println((3>2)&&(6<0));
//         System.out.println((3<2)&&(6<0));
//         System.out.println((3>2)||(6>0));
//         System.out.println((3<2)||(6>0));
//         System.out.println((3>2)||(6<0));
//         System.out.println((3<2)||(6<0));
//         System.out.println(!(3>2));
//         System.out.println(!(2>3));
//     }
// }

// assignment operator
//  =,+=,-=,*=,/=
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int a =10;
//         a+=10;
//         int b= 5;
//         System.out.println(b);
//         b+=10;
//         System.out.println(b);
//         b-=5;
//         System.out.println(b);
//         b*=100;
//         System.out.println(b);
//         b/=10;
//         System.out.println(a);
//         System.out.println(b);
//         a%=5;
//         System.out.println(a);
//     }
// }

// ***********************************************************************************
// 20/1/24
//conditional statements 

//if else statements 
// import java.util.*;

// public class javabasics {
//     public static void main(String[] args){
//         int age =16 ;
//         if(age>=18){
//             System.out.println("adult: drive , vote");
//         }
//         if(age>13 && age<18){
//             System.out.println("Teenager");
//         }else{
//             System.out.println("not adult");
//         }
//     }
// }
    
//Largest of two numbers 
// import java.util.*;
// public class javabasics {
//     public static void main(String args[]){
//         int a = 10 ;
//         int b = 5 ; 
//         if(a>=b){
//             System.out.println("A is greater then B ");
//         }else{
//             System.out.println("B is greater then A ");
//         }
//     }
// }

//If a no is odd or even 
// import java.util.*;
// public class javabasics {
//     public static void main(String args[]){
//         int a = 3;
//         if(a%2==0){
//             System.out.println("A is an even number ");
//         }else{
//             System.out.println("A is an Odd number ");
//         }
//     }
// }

//else if statements 
// import java.util.*;
// public class javabasics {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         if(a>=18){
//             System.out.println("Adult");
//         }else if(a>13&&a<18){
//             System.out.println("Teenager");
//         }else{
//             System.out.println("Kid");
//         }

//     }
// }

//income tax calculator 
// import java.util.*;
// public class javabasics {
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         int a = sc.nextInt();
//         if(a<500000){
//             int tax = 0;
//             System.out.println("tax = 0 % = "+tax );
//         }else if (a>500000 && a < 1000000){
//             int tax = (int)(.2*a);
//             System.out.println("tax = 20 % = "+tax );
//         }else {
//             int tax = (int)(.3*a);
//             System.out.println("tax = 30 % = "+tax );
//         }
//     }
// }

//Largest of Three Numbers 
// import java.util.*;
// public class javabasics {
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         int a =sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         if(a>=b && a>=c){
//             System.out.println("A is the Largest ");
//         }else if (b>=c){
//             System.out.println("B is the Largest ");
//         }else {
//             System.out.println("C is the Largest ");
//         }
//     }
// }

//Ternary Operator 3 operands 
// import java.util.*;
// public class javabasics {
//     public static void main(String args[]){
//     int a=10 ;
//     int b = 5;
//      int  larger=((a>b)?5:3);
//      System.out.println(larger);
//      int number  = 4; 
//      String type = ((number%2==0)?"Even":"Odd");
//      System.out.println(type);
//     }
// }

//Student Pass or Fail 
// import java.util.*;
// public class javabasics {
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         int marks  = sc.nextInt();
//         String result = ((marks>=33)?"Pass":"Fail");
//         System.out.println(result);
//     }
// }

//Switch Statement 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         int num = sc.nextInt();
//         switch(num){
//             case 1 : System.out.println("samosa");
//             break;
//             case 2 : System.out.println("Burger");
//             break;
//             case 3 : System.out.println("Mango Shake");
//             break;
//             default: System.out.println("We Wake Up ");
//         }
//     }
// }
// we can also use char in place of num type 

//Calculator 
// import java.util.*;
// public class javabasics {
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         char operator = sc.next().charAt(0);

//         switch (operator ){
//             case '+':System.out.println(a+b);
//             break;
//             case '-' : System.out.println(a-b);
//             break;
//             case '*' : System.out.println(a*b);
//             break;
//             case '/' : System.out.println(a/b);
//             break;
//             case '%' : System.out.println(a%b);
//             break;
//             default : System.out.println("Wrong Operator");
//         }
//     }
// }

// "Home Work "
// Q1
// import java.util.*;
// public class javabasics {
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         int a = sc.nextInt();
//         if(a>=0){
//             System.out.println("A Positive Number");
//         }else{
//             System.out.println("A Negative Number");
//         }
//     }
// }

// Q2
// import java.util.*;
// public class javabasics {
//     public static void main(String args[]){
//         double temp = 103.5;
//         if(temp>100){
//             System.out.println("You have a Fever ");
//         }else{
//             System.out.println("You Dont have a Fever ");
//         }
//     }
// }

//Q3
// import java.util.*;
// public class javabasics {
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         int day = sc.nextInt();

//         switch (day){
//             case 1:System.out.println("Monday");
//             break;
//             case 2: System.out.println("Tuesday");
//             break;
//             case 3: System.out.println("Wednesday");
//             break;
//             case 4: System.out.println("Thursday");
//             break;
//             case 5: System.out.println("Friday");
//             break;
//             case 6: System.out.println("Saturday");
//             break;
//             case 7:System.out.println("Sunday");
//             break;
//             default: System.out.println("Mystery Day");
//         }
//     }
// }

// Q4
// import java.util.*;
// public class javabasics {
//     public static void main(String args[]){
//         int a = 63 , b =36 ;
//         boolean x = (a<b)?true:false;// in boolean true and false must be small only 
//         int y = (a>b)?a:b;
//         System.out.println(x);
//         System.out.println(y);
//         //x = false 
//         // y = 63 
//     }
// }

// Q6
// import java.util.*;
// public class javabasics {
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         int year = sc.nextInt();
    
//         if(year % 4 == 0 ){
//             if(year %100 == 0 ){
//                 if(year%400==0){
//                     System.out.println(year+" is a Leap Year ");
                
//                 }else{
//                     System.out.println(year+" is not a Leap Year ");
                    
//                 }
//             }else{
//             System.out.println(year+" is not a Leap Year ");
//             }
//         }else{
//             System.out.println(year+" is not a Leap Year ");
            
//         }
//     }
// }

// $$Alternate Solution Q6
// import java.util.*;
// public class javabasics {
//     public static void main(String args[]){
//         Scanner sc =new Scanner (System.in);
//         int year = sc.nextInt();
        
//         boolean x= (year % 4 )==0;
//         boolean y= (year % 100)!=0;
//         boolean z =( (year % 400)==0 && (year % 100 == 0));

//         if(x && (y || z)){
//             System.out.println(year + " is a Leap Year");
//         }else{
//             System.out.println(year + " is not a Lear Year ");
//         }
//     }
// }
// **********************************************************************************************
// 20/1/24
//Loops 

// While Loop
// import java.util.*;
// public class javabasics {
//     public static void main(String args[]){
//         int counter = 0 ;
//         while(counter <10){
//             System.out.println("Hello World");
//             counter++;
//         }
//         System.out.println("Completed ");
//     }
// }

// Number from 1 to 10 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int counter =1 ; 
//         while(counter<=10){
//             System.out.println(counter);
//             counter ++ ;
//         }
//         System.out.println("Numbers Printed from 1 to 10 ");
//     }
// }

//Numbers from 1 to n 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         Scanner sc =new Scanner (System.in);
//         int counter = sc.nextInt();
//         int c = 1;
//         while(c<=counter){
//             System.out.print(c+" ");
//             c++;
//         }
//         System.out.println("\nNumbers Printed from 1 to "+counter);
//     }
// }

//Sum of First N Natural Numbers 
// import java.util.*;
// public class javabasics {
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         int Range = sc.nextInt();
//         int c = 1 ;
//         int Sum=0;
//         while(c<=Range){
//             Sum+=c;
//             c++;
//         }
//         System.out.println("Sum of First N Natural Number is: "+Sum);
//     }
// }

//For Loop 
// import java.util.*;
// public class javabasics {
//     public static void main(String args[]){
//         for(int i=0;i<10;i++){
//             System.out.println("Hello World");
//         }
//         System.out.println("Hello World Printed 10 times ");
//     }
// }

//Print Square Pattern 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         for(int i=0;i<4;i++){
//         System.out.println("* * * *");
//         }
//         System.out.println("Square Pattern Printed With Stars ");
//     }
// }

//Print Reverse of Number 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         Scanner sc =new Scanner (System.in);
//         int num = sc.nextInt();
//         int a = num ;
//         while(a>0){
//             int ld = a%10;
//             System.out.print(ld);
//             a=a/10;
//         }
//     }
// }

//Reversing the Given number 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int n = 10899;
//         int rev =0;
//         while(n>0){
//             int ld = n%10;
//             rev=rev*10+ld;
//             n/=10;
//         }
//         System.out.println("Reverse of the Given Number is "+rev);
//     }
// }

//Do While Loop 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int c =1;
//         do{
//             System.out.println("Hello World");
//             c++;
//         } while(c<=10);
//     }
// }

//Break Statement 
// To exit the loop ie. here from for loop 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         for(int i=1 ; i<=5 ;i++){
//             if(i==3){
//                 break;
//             }
//             System.out.println(i);
//         }
//         System.out.println("i am out of the loop ");
//     }
// }

//Keep entering numbers until user enter multiple of 10 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         Scanner sc =new Scanner (System.in);
        
//         while(true){
//             int num =sc.nextInt();
//             if(num%10==0){
//                 break;
//             }
//             System.out.println(num+" ");
//         }
//     }
// }

//Continue Statement 
// to skip an iteration 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         for(int i=1;i<=5;i++){
//             if(i==3){
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }

//Display all numbers entered by user except multiple of 10 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         Scanner sc =new Scanner (System.in);
//         do{
//             int num =sc.nextInt();
//             if(num%10==0){
//                 continue;
//             }
//             System.out.println(num);
//         }while(true);
//     }
// }

//Checking if a number is prime or not 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         int num = sc.nextInt();
//         int c = 0;
//         if(num ==2 ){
//             System.out.println("2 is a Prime Number ");
//         }else{
//         for(int i=2;i<num;i++){
//             if(num%i==0){
//                 c++;
//             }
//         }
//         if(c==0){
//             System.out.println(num+" is a Prime Number ");
//         }else{
//             System.out.println(num+" is not a Prime Number ");
//         }
//         }
//     }
// }

//Alternate sol 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         int num = sc.nextInt();
//            int c = 0;
//         if(num ==2 ){
//             System.out.println("2 is a Prime Number ");
//         }else{
//         for(int i=2;i<Math.sqrt(num);i++){
//             if(num%i==0){
//                 c++;
//             }
//         }
//         if(c==0){
//             System.out.println(num+" is a Prime Number ");
//         }else{
//             System.out.println(num+" is not a Prime Number ");
//         }
//         }
//     }
// }

// Home Work
// Q1 Hello is printed twice 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         for(int i =0 ;i <5;i++){
//             System.out.println("Hello");
//             i+=2;
//         }
//     }
// }

// Q2 Sum of odd and even integer's
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int choice=1 ;
//         int es =0 ;
//         int os= 0 ;
//         Scanner sc = new Scanner (System.in);
//         do{
//         int n = sc.nextInt();
//         if(n%2==0){
//             es+=n;
//         }else{
//             os+=n;
//         }
//         choice =sc.nextInt();
//         }while(choice==1);
//         System.out.println("Sum of even Integer's :"+es);
//         System.out.println("Sum of Odd Integer's :"+os);
//     }
// }

// Q3 factorial of any number n 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         Scanner sc =new Scanner (System.in);
//         int n = sc.nextInt();
//         for(int i=n-1;i>=1;i--){
//             n*=i;
//         }
//         System.out.println(n);
//     }
// }

// Q4 code for table of any number n
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         Scanner sc  = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=10;i++){
//             System.out.println(n+" * "+i+" = "+(n*i));
//         }
//     }
// }

// Q5 = i is printed after the for loop which is wrong 
// *******************************************************************************
// 21/1/24
//Arrays

//Operations in Arrays
//creation of arrays in the ways = 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int marks[]=new int [50];
//         int numbers[]={1,2,3};
//         int moreNumbers[]={4,5,6};
//         String fruit[]={"Apple","Banana","Mango"};
//     }
// }

// Arrays as Function Argument
// pass by value and (pass by reference (in arrays))
//Arrays are static and are pass by reference so when there is an update it occurs in the main function 
// import java.util.*;
// public class javabasics {
//     public static void update(int marks[],int nonChangable){
//         nonChangable = 10 ;
//         for(int i=0;i<marks.length;i++){
//             marks[i]=marks[i]+1;
//         }
//     }
//     public static void main(String args[]){
//         int marks[]={1,2,3,4,5};
//         int nonChangable = 5;
//         update(marks,nonChangable);
//         System.out.println(nonChangable);
//         //print our marks 
//         for(int i=0;i<marks.length;i++){
//             System.out.print(marks[i]+" ");
//         }
//         System.out.println();
//     }
// }

//Linear Search 
// import java.util.*;
// public class javabasics{
//     public static int linearSearch(int marks[],int key){
//         for(int i=0;i<marks.length;i++){
//             if(marks[i]==key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int marks[]={2,3,4,3,5,6,4,6,6,7};
//         // String menu[]={"dosa","chole bature","jai ho"};
//         int key = 7;
//         int index = linearSearch(marks,key);
//         if(index == -1){
//             System.out.println("Key Not Found");
//         }else{
//             System.out.println("Key Found At Index : "+ index);
//         }
//     }
// }
// time complexity O(n)

// Largest in Array
// import java.util.*;
// public class javabasics{
//     public static int getLargest(int numbers[]){
//         int largest = Integer.MIN_VALUE;//-infinity
//         for(int i=0;i<numbers.length;i++){
//             if(largest<numbers[i]){
//                 largest = numbers[i];
//             }
//         }
//         return largest ;
//     }
//     public static int getSmallest(int numbers[]){
//         int smallest = Integer.MAX_VALUE;
//         for(int i=0;i<numbers.length;i++){
//             if(smallest>numbers[i]){
//                 smallest=numbers[i];
//             }
//         }
//         return smallest;
//     }
//     public static void main(String args[]){
//         int numbers[]={1,2,3,4,5,6};
//         int LargeNo=getLargest(numbers);
//         System.out.println(LargeNo);
//         int SmallNo=getSmallest(numbers);
//         System.out.println(SmallNo);
//     }
// }
// Tc = O(n)

// Binary Search Code (Prerequisite = Array must be sorted )
// import java.util.*;
// public class javabasics{
//     public static int binarySearch(int numbers[],int key){
//         int start = 0,end = numbers.length-1;
//         while(start<=end){
//             int mid = (start+end)/2;
//             if(numbers[mid]==key){//found
//                 return mid;
//             }
//             if(numbers[mid]<key){//right
//                 start=mid+1;
//             }else{//left
//                 end = mid-1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int numbers[]={2,25,250,2500,25000};
//         int key =2500;
//         System.out.println("Index for Key is : "+binarySearch(numbers,key));
//     }
// }
// tc = O(log n)
//tc directly proportional to log2n
// linear search > binary search (tc)

// Reverse of An Array
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int numbers[]={1,2,3,4,5,6,7,8,9,10};
//         for(int i=(numbers.length)-1;i>=0;i--){
//             System.out.print(numbers[i]+" ");
//         }
//     }
// }
//patience is important 

// Alternate Way
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int numbers [ ]= {1,2,3,4,5,6,7,8,9};
//         int start = 0; 
//         int end = numbers.length-1;
//         while(start<end){
//             int temp = numbers[start];
//             numbers[start]=numbers[end];
//             numbers[end]=temp;
//             start++;
//             end--;
//         }
//         for(int i=0;i<numbers.length;i++){
//             System.out.print(numbers[i]+" ");
//         }
//     }
// }

//Pairs in Array
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int pair[]={2,3,4,5,6};
//         int tp =0 ;
//         for(int i=0;i<pair.length;i++){
//             for(int j=i+1;j<pair.length;j++){
//                 System.out.print(pair[i]+","+pair[j]+" ");
//                 tp++;
//             }
//             System.out.println();
//         }
//         System.out.print("Total No of Pairs : "+tp);//formula for total pairs = ((n)(n-1))/2
//     }
// }
// tc = O(n^2)

//Print Sub Arrays
// subarray is a continious part of array
//total subarray = ((n)*(n+1))/2
// import java.util.*;
// public class javabasics {
//     public static void main(String args[]){
//         int arr [ ] = { 2,4,6,8,10};
//         int ts = 0;
//         int totalsum = 0;
//         int maxss=0;
//         for(int i= 0 ;i<arr.length;i++){
//             int sum = 0;
//             for(int j=i;j<arr.length;j++){
//                 for(int k=i;k<=j;k++){
//                     System.out.print(arr[k]+" ");//subarray
//                     // sum+=arr[k];
//                 }
//                 ts++;
//                 sum+=arr[j];
//                 if(maxss<sum){
//                     maxss=sum;
//                 }
                
//                 System.out.println("\nSum of the Subarray : "+sum);
//             }
//             totalsum+=sum;
//             System.out.println("\nTotal Sum of the Subarray : "+ totalsum);
//         }
//         System.out.println("Total Subarray's : "+ts);
//         System.out.println("Total Subarray's Sum : "+totalsum);
//         System.out.println("Maximum Subarray sum is : "+maxss);
//     }
// }

//Max SubArray Sum (Brute Force )
// import java.util.*;
// public class javabasics{
    
//     public static void main(String args[]){
//         int min = Integer.MAX_VALUE;
//         int max = Integer.MIN_VALUE;
//         int arr []={1,-2,6,-1,3};
//         for(int i=0;i<arr.length;i++){
//             for(int j=i;j<arr.length;j++){
//                 int sum = 0;
//                 for(int k =i;k<=j;k++){
//                     System.out.print(arr[k]+" ");
//                     sum+=arr[k];
//                 }
//                 System.out.println();
//                 System.out.println("Sum of subarray is: "+sum);
//                 if(sum>max){
//                     max=sum;
//                 }
//             }
//             System.out.println();
//         }
//         System.out.println("MAx Subarray Sum is : "+max);
//         System.out.println();
//     }
// }

// ALternate
// import java.util.*;
// public class javabasics{
//     public static void printSubarr(int arr[]){
//         int cs = 0 ;
//         int ms = Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             int s= i;
//             for(int j = i ;j<arr.length;j++){
//                 int end = j;
//                 cs=0;
//                 for(int k=s;k<=end;k++){
//                     cs+=arr[k];
//                 }
//                 System.out.println("curr sum : "+cs);
//                 if(ms<cs){
//                     ms=cs;
//                 }

//             }
//         }
//         System.out.println("Max subarr sum : "+ms);
//     }
//     public static void main(String args[]){
//         int arr[]={2,4,6,8,10};
//         printSubarr(arr);
//     }
// } 

//Alternate
// import java.util.*;
// public class javabasics{
//     public static void printSubarr(int arr[]){
//         int min = Integer.MAX_VALUE;
//         int max = Integer.MIN_VALUE;
//         int cs = 0;
//         int ts = 0;
//         for(int i=0;i<arr.length;i++){
//             int s = i;
//             for(int j=i;j<arr.length;j++){
//                 int e = j;
//                 cs=0;
//                 for(int k=s;k<=e;k++){
//                     cs+=arr[k];
//                 }
//                 if(max<cs){
//                     max=cs;
//                 }
//             }
//         }
//         System.out.println("Max Sub Array Sum is : "+max);
//     }
//     public static void main(String args[]){
//     int arr []= {1,2,3,4,5,6,7};
//     printSubarr(arr);
//     }
// }
// Tc = O(n^3) for all three 

//Prefix Sum Approach== prefix[end]-prefix[start-1]
// import java.util.*;
// public class javabasics{
//     public static void prefixsum(int arr[]){
//         int cs = 0;
//         int ms = Integer.MIN_VALUE;
//         int prefix[]=new int[arr.length];

//         //calculate prefix array
//         prefix[0]=arr[0];
//         for(int i=1;i<arr.length;i++){
//             prefix[i]+=prefix[i-1]+arr[i];
//         }

//         for(int i=0;i<arr.length;i++){
//             int s=i;
//             for(int j=i;j<arr.length;j++){
//                 int e = j;
//                 cs = s==0?prefix[e]:prefix[e]-prefix[s-1];
//                 if(ms<cs){
//                     ms=cs;
//                 }
//             }
//         }
//         System.out.println("Maximum Sub Array sum : "+ ms);
//     }
//     public static void main(String args[]){
//         int arr[]={1,-2,6,-1,3};
//         prefixsum(arr);
//     }
// }
// // TC = O(n^2)

//Kadane's Algorithm (IMPORTANT)
//+ve + +ve = +ve 
//+ve + (small )-ve = +ve
//-ve + (small)+ve = -ve
//when sum comes -ve take it as zero 
// in the case where all no's are negative it will give 0 as result but there must be a negative no so we have to write special case for the same 
// import java.util.*;
// public class javabasics {
//     public static void Kadanes(int arr[]){
//         int ms = Integer.MIN_VALUE;
//         int cs = 0;
//         for(int i=0;i<arr.length;i++){
//             cs+=arr[i];
//             if(cs<0){
//                 cs=0;
//             }
//             ms=Math.max(cs,ms);
//         }
//         System.out.println("Our Max Sum : "+ms);
//     }
//     public static void main(String args[]){
//         int arr[]={-2,-3,4,-1,-2,1,5,-3};
//         Kadanes(arr);
//     }
// }
// TC = O(n)

//Trapping Rain Water (left max and right max then their min)
//(waterlevel-barlevel)*width=trapped water 
//water level = min(maxleft,maxright)
// when bars are 1 or 2 no water is trapped
//Auxiliary Arrays(helper) for (leftmax and rightmax)
// 1. min no of bars >2
// 2. water is not trapped in sorted bars ie. (ascending and descending bars )
// 3. 
// import java.util.*;
// public class javabasics{
//     public static int trapwater(int arr[]){
//         //calculate leftMax boundary - array
//         int leftMax []=new int[arr.length];
//         leftMax[0]=arr[0];
//         for(int i=1;i<arr.length;i++){
//             leftMax[i]=Math.max(arr[i],leftMax[i-1]);
//         }
//         //calculate rightMax boundary -array
//         int rightMax[]=new int[arr.length];
//         rightMax[arr.length-1]=arr[arr.length-1];
//         for(int i=arr.length-2;i>=0;i--){
//             rightMax[i]=Math.max(arr[i],rightMax[i+1]);
//         }
//         int trapwater = 0;
//         //loop
//         int n = arr.length;
//         for(int i=0;i<n;i++){
//             //waterlevel = min(LeftMax bound,RightMax bound)
//             int waterlevel = Math.min(leftMax[i],rightMax[i]);

//             //trapped water = waterlevel - height
//             trapwater +=waterlevel-arr[i];
//         }
//         return trapwater;
//     }
//     public static void main(String args[]){
//         int arr[]={4,2,0,6,3,2,5};
//         int a = trapwater(arr);
//         System.out.println("Trapped Water : "+a);
//     }
// }
// TC = O(n)

//Best Time to buy and sell stocks 
// import java.util.*;
// public class javabasics{
//     public static void byAsellstock(int arr[]){
//         int p = 0;
//         int bp = Integer.MAX_VALUE;
//         int mp = Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(bp<arr[i]){
//                 p=arr[i]-bp;
//                 if(p>mp){
//                     mp=p;
//                 }
//             }else{
//                 bp=arr[i];
//             }
//         }
//         System.out.println("Maximum Profit : "+mp);
//     }
//     public static void main(String args[]){
//         int arr[]={7,1,5,3,6,4};
//         byAsellstock(arr);
//     }
// }
// Tc=O(n)

// HomeWork
//Q1 unique or duplicate element
// import java.util.*;
// public class javabasics{
//     public static boolean duplicateorunique(int arr3[]){
//         for(int i=0;i<arr3.length;i++){
//             for(int j=i+1;j<arr3.length;j++){
//                 if(arr3[i]==arr3[j]){
//                     return true;
//                 }
//             }
//         }
//         return false ;
//     }
//     public static void main(String args[]){
//         int arr1[]={1,2,3,1};
//         int arr2[]={1,2,3,4};
//         int arr3[]={1,1,1,3,3,4,3,2,4,2};
//         boolean b = duplicateorunique(arr3);
//         System.out.println(b);
//     }
// }

// Q2 pivot element
// import java.util.*;
// public class javabasics{
//     public static pivotele(int arr1[],int key){
//         int s = 0; 
//         int e = arr1.length;
//         int mid=(s+e)/2;
//         if(arr1[mid] == key ){
//             System.out.println("Pivot key is at index : ",mid);
//         }else if(arr1[mid]<key){

//         }
//     }
//     public static void main(String args[]){
//         int arr1[]={4,5,6,7,0,1,2};
//         int key = 0;
//     }
// }

// import java.util.*;
// public class javabasics{
//     public static void tripletsum(int arr[]){
//         int n=arr.length;
//         boolean found=false;
//         System.out.print("[");
//         for(int i=0;i<n-2;i++){
//             for(int j=i+1;j<n-1;j++){
//                 for(int k=j+1;k<n;k++){
//                     if((arr[i]+arr[j]+arr[k])==0){
//                         if(found){
//                             System.out.println(",");
//                         }
//                         System.out.print("["+arr[i]+","+arr[j]+","+arr[k]+"]");
//                         found=true;
//                     }
//                 }
//             }
//         }
//         System.out.println("]");
//     }
//     public static void main(String args[]){
//         int arr[] = {-1,0,1,2,-1,-4};
//         tripletsum(arr);
//     }
// }
// import java.util.Arrays;

// public class javabasics {
//     public static void tripletSum(int arr[]) {
//         int n = arr.length;
//         boolean found = false;

//         Arrays.sort(arr);

//         System.out.print("[");
//         for (int i = 0; i < n - 2; i++) {
//             if (i > 0 && arr[i] == arr[i - 1]) {
//                 continue; // Skip duplicate elements in the outer loop
//             }

//             for (int j = i + 1; j < n - 1; j++) {
//                 if (j > i + 1 && arr[j] == arr[j - 1]) {
//                     continue; // Skip duplicate elements in the middle loop
//                 }

//                 for (int k = j + 1; k < n; k++) {
//                     if (k > j + 1 && arr[k] == arr[k - 1]) {
//                         continue; // Skip duplicate elements in the inner loop
//                     }

//                     if ((arr[i] + arr[j] + arr[k]) == 0) {
//                         if (found) {
//                             System.out.print(", ");
//                         }
//                         System.out.print("[" + arr[i] + ", " + arr[j] + ", " + arr[k] + "]");
//                         found = true;
//                     }
//                 }
//             }
//         }
//         System.out.println("]");
//     }

//     public static void main(String args[]) {
//         int arr[] = {-1, 0, 1, 2, -1, -4};
//         tripletSum(arr);
//     }
// }

// ************************************************************************************************************************
// 24/1/24
// Sorting

//Bubble Sort 
// import java.util.*;
// public class javabasics{
//     public static void bubbleSort(int arr[]){
//         for(int turn=0;turn<arr.length;turn++){
//             for(int j=0;j<arr.length-turn-1;j++){
//                 if(arr[j+1]<arr[j]){
//                     //swap
//                     int temp = arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//     }
//     public static void printArr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         int arr[]={5,4,1,3,2};
//         bubbleSort(arr);
//         printArr(arr);
//     }
// }
// even if arrays are already sorted then also tc = O(n^2)
// outer loop n times 
// inner loop n-1 times 
// tc = O(n^2)
//optimized bubble sort code for the already sorted array(Home work)

//Seclection Sort 
//pick the smallest (from unsorted) , put it at the beginning 
// import java.util.*;
// public class javabasics{
//     public static void selectionSort(int arr[]){
//         for(int i=0;i<arr.length-1;i++){
//             int min = i;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[min]>arr[j]){
//                     min=j;
//                 }
//             }
//         //swap 
//         int temp = arr[min];
//         arr[min] = arr[i];
//         arr[i] = temp;
//         }
//     }
//     public static void printArr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         int arr[]={5,4,1,3,2};
//         selectionSort(arr);
//         printArr(arr);
//     }
// }
// TC = O(n^2)

//Insertion Sort
//pick an element (from unsorted part ) & place it in the right position in sorted part 
// import java.util.*;
// public class javabasics{
//     public static void InsertionSort(int arr[]){
//         for(int i=1;i<arr.length;i++){
//             int curr=arr[i];
//             int prev=i-1;
//             //finding out the correct position to insert 
//             while(prev>=0 && arr[prev]>curr){
//                 arr[prev+1]=arr[prev];
//                 prev--;
//             }
//             //insertion 
//             arr[prev+1]=curr;
//         for(int k=0;k<arr.length;k++){
//             System.out.print(arr[k]+" ");
//         }
//         System.out.println();
//     }}
//     public static void printArr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main (String args[]){
//         int arr[]= {5,4,1,3,2};
//         InsertionSort(arr);
//         printArr(arr);

//     }
// }
//TC = O(n^2)

//Counting Sort 
//creating another count array and storing the frequency of the no's 
// import java.util.*;
// public class javabasics{
//     public static void countingSort(int arr[]){
//         int largest = Integer.MIN_VALUE;
//           //finding the largest element 
//         for(int i=0;i<arr.length;i++){
//             largest=Math.max(largest,arr[i]);
//         }
//          //creat another array count and saving the frequency 
//         int count[]=new int[largest+1];
//         for(int i=0;i<arr.length;i++){
//             count[arr[i]]++;
//         }
//         //sorting and equating the values in original array
//         int j = 0;
//         for(int i=0;i<count.length;i++){
//             while(count[i]>0){
//                 arr[j]=i;
//                 j++;
//                 count[i]--;
//             }
//         }
//     }
//     public static void printArr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]+" ");
//         }
//         System.out.println();
//     }
// public static void main(String args[]){
//     int arr[]={1,4,1,3,2,4,3,7};
//     countingSort(arr);
//     printArr(arr);
// }
// }
// TC =-- O(n)(almost)

// Inbuilt Sort
// import java.util.Arrays;
// Arrays.sort(arr);
//Arrays.sort(arr,starting index, ending index)
// TC = O(nlogn);
// for ascending order
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int arr[]={5,4,1,3,2};
//         // Arrays.sort(arr);
//         // Arrays.sort(arr,0,2);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }
//for descending order 
// import java.util.Collections;
// Arrays.sort(arr,Collections.reverseOrder())
// Arrays.sort(arr,si,ei,collections.reverseOrder())
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         Integer arr[]={5,4,1,3,2}; //this is an object for integer class 
//         // Arrays.sort(arr,Collections.reverseOrder());
//         Arrays.sort(arr,2,5,Collections.reverseOrder());
//         for(Integer i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

//HOME WORK
// Q To apply bubble, selection  , insertion , counting and inbuilt sort in a particular array
// import java.util.*;
// public class javabasics{
//     public static void countingSort(int arr[]){
//         int largest = Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             largest = Math.max(largest,arr[i]);
//         }
//         int count[] = new int[largest+1];
//         for(int i=0;i<arr.length;i++){
//             count[arr[i]]++;
//         }
//         int j= 0;
//         for(int i=0;i<count.length;i++){
//             while(count[i]>0){
//                 arr[j]=i;
//                 j++;
//                 count[i]--;
//             }
//         }
//     }
//     public static void insertionSort(int arr[]){
//         for(int i=1;i<arr.length;i++){
//             int curr=arr[i];
//             int prev = i-1;
//             while(prev>=0 && arr[prev]>curr){
//                 arr[prev+1]=arr[prev];
//                 prev--;
//             }
//             arr[prev+1]=curr;
//         }
//     }
//     public static  void selectionSort(int arr[]){
//         for(int i=0;i<arr.length-1;i++){
//             int min = i;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[min]>arr[j]){
//                     min=j;
//                 }
//             }
//             //swap
//             int temp = arr[min];
//             arr[min] = arr[i];
//             arr[i] = temp;
//         }
//     }
//     public static void bubbleSort(int arr[]){
//         for(int i= 0 ;i<arr.length;i++){
//             for(int j=0;j<arr.length-1-i;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp =arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//     }
//     public static void printArr(Integer arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         Integer arr[]={3,6,2,1,8,7,4,5,3,1};
//         // bubbleSort(arr);
//         // selectionSort(arr);
//         // insertionSort(arr);
//         // countingSort(arr);
//         // Arrays.sort(arr);
//         // Arrays.sort(arr,0,6);
//         // Arrays.sort(arr,Collections.reverseOrder());
//         printArr(arr);
//     }
// }

// Extra Topic 
//Merge Sort = O(nlogn)
// import java.util.*;
// public class javabasics{
//     public static void conquer(int arr[],int si,int mid,int ei){
//         int merged[]=new int[ei-si+1];
//         int idx1 = si;
//         int idx2 = mid+1;
//         int x =0;
//         //O(n)
//         while(idx1<=mid && idx2<=ei){
//             if(arr[idx1]<=arr[idx2]){
//                 merged[x++]=arr[idx1++];
//             }else{
//                 merged[x++]=arr[idx2++];
//             }
//         }
//         while(idx1<=mid){
//             merged[x++]=arr[idx1++];
//         }
//         while(idx2<=ei){
//             merged[x++]=arr[idx2++];
//         }
//         for(int i=0,j=si;i<merged.length;i++,j++){
//             arr[j]=merged[i];
//         }
//     }
//     public static void divide(int arr[],int si,int ei){
//         // mid = (si+ei)/2;
//         int mid = si + (ei-si)/2;
//         if(si>=ei){
//             return ;
//         }
//         //O(logn)
//         divide(arr,si,mid);
//         divide(arr,mid+1,ei);
//         conquer(arr,si,mid,ei);
//     }
//     public static void main(String args[]){
//         int arr[]={6,3,9,5,2,8};
//         int n = arr.length;
//         divide(arr,0,n-1);
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
// }

// **************************************************************************************************************************************************
// 25/1/24
// Functions and Methods 

// Function = block of code which perform a particular function assigned to it 
            //   also the reusable part of code 
// // Syntax = returnType name(){
//     //body
//     return statement;
// }
//Syntax with parameters 
// the names of parameters can be different for the main function and the created function but their types are same 
//Function call
//vo functiion jo classes ke andr likhe jate hain unhe methods kehte hain 
//java mein sare function class ke andr hi likhte hain to 
// methods and function are same for java
//formal parameters are the ones written with types when to include in the function
//actual parameters are the ones written without data type when to call a function 
// What happens in memory  ?
// == variable and function both ocuppy memory space 
// function occuppy the stack space 
// call by value and call by reference 
//writing swap function 
// java always calls by value 
// ie. it makes copy so there is no change in the original function 
//product of a and b 
//factorial of a no 
//Binomial Coefficient 
// import java.util.*;
// public class javabasics{
//     public static int factorial(int a){
//         int fact =1 ;
//         for(int i=1;i<=a;i++){
//             fact*=i;
//         }
//         return fact;
//     }
//     public static void binoCoeff(int n,int r){
//         int a = factorial(n);
//         int b = factorial(r);
//         int c = factorial(n-r);
//         int d = a/(b*c);
//         System.out.println(d);
//     }
//     public static void main(String args[]){
//         Scanner sc  = new Scanner (System.in);
//         int n = sc.nextInt();
//         int r = sc.nextInt();
//         binoCoeff(n,r);
//     }
// }

// Inbuilt and User defined methods
// user def=factorial , sum ,product
// inbuilt = Math(pow,sqrt,max),sc.nextInt()

// Function Overloading 
// Multiple functions with the same name but different parameters 
// multiply(int a ,int b);
// multiply(float a,float b);
// multiply(double a,double b);
// multiply (int a, int b ,int c);

//Overloading using parameters 
// f1: int sum(int a ,int b){
//     return a+b;
// }
// f2: int sum(int a,int b,int c){
//     return a+b+c;
// }
// java only checks the function name and their parameters if they are same then it will give error 
// example : int sum(int a, int b)
//           float sum(int a,int b)   error 

//Overloading using datatypes 
// f1: int sum (int a,int b){
//     return a+b;
// }
// f2: float sum(float a, float b){
//     return a+b;
// }

//check if a no is prime or not 
// import java.util.*;
// public class javabasics{
//     // public static boolean isPrime(int a){
//     //     for(int i= 2;i<a;i++){
//     //         if(a%i==0){
//     //             return false;
//     //         }
//     //     }
//     //     return true;
//     // }
//     public static boolean isPrime(int a){
//         if(a==1){
//             System.out.println("not prime");
//             return false ;
            
//         }
//         for(int i=2;i<Math.sqrt(a);i++){
//             if(a%i==0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         int a = sc.nextInt();
//         boolean b  = isPrime(a);
//         System.out.println(b);
//     }
// }

// To Print All Primes in a Range 
// import java.util.*;
// public class javabasics{
//     public static void PrimesinRange(int a){
//         for(int i=2;i<=a;i++){
//             int c= 0;
//             for(int j=2;j<i;j++){
                
//                 if(i%j==0){
//                     c++;
//                 }
//             }if(c==0){
//             System.out.print(i+" ");
//             }
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         int a = sc.nextInt();
//         PrimesinRange(a);
//     }
// }



//Block Scope 
// {                 block of code 
//     .... 
//     .....
// }
// access modifiers for class scope ie. public private and protected.

//Method Scope 
// if a variable is defined inside inbuilt function then it can be used only for that function block
// but if a variable is defined in main function we can use it in whole code 

//HOMEWORK
// Q1 , Q2 ,Q3 ,  Q4 , Q5
// import java.util.*;
//     public class javabasics{
//         public static boolean isPalindrome(int a){
//             int b=a;
//             int rn=0;
//             int i=0;
//             while(b>0){
//                 int d = b%10;
//                 // rn += Math.pow(10,i)*d;
//                 // i++;
//                 rn=rn*10+d;
//                 b/=10;
//                 // System.out.print(d);
//             }
//             System.out.println("Reverse of no is: "+ rn);
//             if(rn==a){
//                 return true;
//             }else{
//                 return false;
//             }
//         }
//         public static void SumofDig(int b){
//             int a =b;
//             int sum = 0;
//             while(a>0){
//                 int d = a%10;
//                 sum+=d;
//                 a/=10;
//             }
//             System.out.println(sum);
//         }
//         public static void AvgOfNo(int a ,int b ,int c){
//             int avg = (a+b+c)/3;
//             System.out.println("Avg of 3 No's : "+avg);
//         }
//         public static boolean isEven(int a){
//             if(a%2==0){
//                 return true;
//             }else{
//                 return false;
//             }
//         }
//         public static void main(String args[]){
//             Scanner sc = new Scanner (System.in);
//             int a = sc.nextInt();
//             int b = sc.nextInt();
//             int c = sc.nextInt();
//             AvgOfNo(a,b,c);
//             boolean d = isEven(a);
//             System.out.println("The no is Even: "+d);
//             int e = Math.min(a,b);
//             int f = Math.max(a,b);
//             int g = (int)(Math.sqrt(a));
//             int h = (int)(Math.pow(3,2));
//             // double i = Math.average(23.23,50.32);
//             int j = Math.abs(-234);
//             System.out.println(e+" "+f+" "+g+
//             " "+h+" "+j);
//             SumofDig(c);
//             boolean z=isPalindrome(a);
//             System.out.println("The no is Palindrome : "+z);
//         }

//     }
//     //doubt in Math.avg

// ***********************************************************************************************************************************************************************************
// 6/02/2024
// OOPS
//Objects are entities in the real world 
//classes are group of these entities 
//we should keep the first letter of class name as capital and first letter of function small letter
//make other classes after the public class to avoid the error condition
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         Pen p1 = new Pen();//created a pen object //object are created in heap 
//         p1.setColor("Blue");
//         System.out.println(p1.color);
//         p1.setTip(5);
//         System.out.println(p1.tip);
//         p1.color="Yellow";
//         System.out.println(p1.color);
//     }
// }
// class Pen{
//     String color;
//     int tip;
//     void setColor(String newColor){
//         color = newColor;
//     }
//     void setTip(int newTip){
//         tip = newTip;
//     }
// }

// class Student{
//     String name;
//     int age;
//     float percentage;//cgpa
//     void calcPercentage(int phy,int chem ,int math){
//         percentage=(phy+chem+math)/3;
//     }
// }
//Access Modifiers or specifiers 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         BankAccount myAcc=new BankAccount();
//         myAcc.username="samyaksharma";
//         myAcc.setPassword("abcdefghi");
//         //here password can't be accesed as it's private 
//     }
// }
// class BankAccount{
//     public String username;
//     private String password;
//     public void setPassword(String pwd){
//         password=pwd;
//     }
// }
    //    within class : withing package : outside package by subclass only : outside package 
// private = Y       N       N       n
// Default = Y       Y       N       n 
// Protected = y    y        y        N
// public =  y       y      y        y 
//getters and setters 
// get : to return the value 
// set : to modify the value 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//        Pen p1 = new Pen();
//        p1.setColor("Blue");
//        System.out.println(p1.getColor());
//        p1.setTip(5);
//        System.out.println(p1.getTip());
//        p1.setColor("Yellow");
//        System.out.println(p1.getColor()); 
//     }
// }
// class Pen{
//     private String color;
//     private int tip;
//     int getColor(){
//         return this.color;
//     }
//     int getTip(){
//         return this.tip;
//     }
//     void setColor(String newColor){
//         this.color=newColor;
//     }
//     void setTip(int tip){
//         this.tip=tip;
//     }
// }
//This : this keyword is used to refer to the current object 

//4 pillars of oops = encapsulation , inheritance , abstraction , polymorphism 
//Encapsulation
// Encapsulation is defined as the wrapping up of data & methods under a singel unit . 
// it also implements data hiding .
//data & methods are nothing but properties and functions repectively 
// useless / sensitive data== private /def /prot ie...DATA HIDING

//Constructors 
// it's a special method wich is invoked automatically at the time of object creation . 
// -Constructors have the same name as class or structure . 
// -Constructors don't have a return type . (Not even void )
// -Constructors are only called once,at object creation.
// -Memory allocation happens when constructor is called .
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         Student s1 = new Student("Samyak");
//         System.out.println(s1.name);
//     }
// }
// class Student {
//     String name;
//     int roll;
//     Student(){
//         System.out.println("Constructor is called ");
//     }
//     Student(String name){
//         System.out.println("Constructor with parameter is called");
//         this.name=name;
//     }
// }

//Types of Constructors 
// Non - parametrized || parameterized || copy constructor 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//        Student s1 = new Student();
//        Student s2 = new Student("shradha");
//        System.out.println(s2.name);
//        Student s3 = new Student(123);
//        System.out.println(s3.roll); 
//     }
// }
// class Student{
//     String name;
//     int roll;
//     Student(){
//         System.out.println("Constructor is called ");
//     }
//     Student(String name){
//         this.name = name;
//     }
//     Student(int roll){
//         this.roll=roll;
//     }
// }
//Constructor Overloading = when we create different types of constructor and then program itself know which constructor is to be called acc. to object
//this is also example of polymorphism

//Copy Constructor 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//        Student s1 = new Student();
//        s1.name="Samyak";
//        s1.roll=234;
//        s1.password="abcd";
//        s1.marks[0]=100;
//        s1.marks[1]=90;
//        s1.marks[2]=80;
//        Student s2 = new Student(s1);//copy
//        s2.password = "xyz";
//        s1.marks[2]=100;
//        for(int i=0;i<3;i++){
//         System.out.println(s2.marks[i]);
//        }
//     }
// }
// class Student{
//     String name;
//     int roll;
//     String password;
//     int marks[];

//     //Copy Constructor (Shallow)
//     // Student (Student s1){
//     //     marks=new int[3];
//     //     this.name=s1.name;
//     //     this.roll=s1.roll;
//     //     this.marks=s1.marks;
//     // }
//     //deep copy Constructor 
//     Student(Student s1){
//         marks=new int[3];
//         this.name=s1.name;
//         this.roll=s1.roll;
//         for(int i=0;i<marks.length;i++){
//             this.marks[i]=s1.marks[i];
//         }
//     }

//     Student(){
//         marks=new int[3];
//         System.out.println("Constructor is called ");
//         this.marks=marks;
//     }
//     Student(String name){
//         marks=new int[3];
//         this.name = name;
//         this.marks=marks;

//     }
//     Student(int roll){
//         marks=new int[3];
//         this.roll=roll;
//         this.marks=marks;

//     }
// }
//Shallow and Deep copy 
// shallow = where we copy references , changes reflect 
// deep  copy = changes don't reflect ;
//lazy copy 

//Destructors 
//balance is important 
//if there is a constructor then there must be destructor 
//Garbage collector is there in java wich automatically deletes object 
//so we don't write destructor in java 

//Inheritance 
// Inheritence is when properties & methods of base class are passed on to a derived class.
// class a (parent class ,base class ) ===>>> class b (derived class , child class)
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//        Fish shark = new Fish();
//        shark.eat();
//        Dog dobby = new Dog();
//        dobby.eat();
//        dobby.legs=5;
//        System.out.println(dobby.legs);
//     }
// }
// //base class 
// class Animal {
//     String color; 
//     void eat(){
//         System.out.println("eats");
//     }
//     void breathe(){
//         System.out.println("breathes");
//     }
// }
// //Derived class || sub class 
// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("Swims in water");
//     }
// }
// class Mammal extends Animal{
//     int legs;
// }
// class Dog extends Mammal{
//     String breed;
// }
//Types of inheritence 
// Single level inheritence 
// base class ----> derived class 
// animal -> fish
//Multi level inheritence 
// base class ----> derived class ----> derived class
//animal -> mammals -> dogs
//Hierarchial Inheritance 
// baseclass --> derived class || derived class 
// animal->fish||bird||mammal 
//Hybrid inheritence 
//Multiple inheritence (not in java )but indirectly we can apply with help of interfaces 
//Plymorphism = many +forms 
// compile time polymorphism(static)->method overloading
// run time polymorphism(dynamic)->method overriding
//Method overloading 
// Multiple functions with the same name but different parameters 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//        Calculator calc = new Calculator();
//        System.out.println(calc.sum(1,2));
//        System.out.println(calc.sum((float)(1.5),(float)(2.5)));//we have to write float here as java takes all decimal as double values
//        System.out.println(calc.sum(1,2,3));
//     }
// }
// class Calculator {
//     int sum(int a,int b){
//         return a+b;
//     }
//     int sum(int a, int b, int c){
//         return a+b+c;
//     }
//     float sum(float a,float b){
//         return a+b;
//     }
// }

//Method Overriding 
// when parent and child class both contain the same function with different defination 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         Deer d = new Deer();
//         d.eat();
//     }
// }
// class Animal{
//     void eat(){
//         System.out.println("eats anything");
//     }
// }
// class Deer extends Animal{
//     void eat(){
//         System.out.println("eats grass only");
//     }
// }
// whenever we create child class object then it will call child class function only.

//Packages in java
// package is a group of similar types of classes , interfaces and sub-packages. 
// inbuilt and userdefined packages 

//Abstraction (meanign khayal)
// Hiding all the unnecessary details and showing only the important parts to the user. 
//abstract classes and interfaces 
//we give idea but not implementation

//Abstract classes

//******************************************************************************************************************************************** */
// 22/02/24
// Strings
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         char arr[]={'a','b','c','d'};
//         String str = "abcd";
//         String str1 = new String("xyz");
//         //String are immutable (Most important)
//         //String as input 
//         Scanner sc =new Scanner (System.in);
//         // String name;
//         //next takes one word as input
//         // name=sc.next();
//         // System.out.println(name);
//         //so we use nextline to avoid space and take whole line as input 
//         String nam=sc.nextLine();
//         System.out.println(nam);
//         //String are not only used for character or words but we can write anything in 
//         //double inverted quotes ex.: symbol,no,etc....
//         String fullName="Tony Stark";
//         System.out.println(fullName.length());
//         //to find out the length of the string we use strname.length() function
//         //concatenation
//         String firstName="Samyak";
//         String lastName="Sharma";
//         String name=firstName+" "+lastName;
//         System.out.println(name);
//         //to find out specific char or at particular index of string
//         //we use charAt() function 
//         System.out.println(name.charAt(1));
//         //printing complete stiring char by char
//         for(int i=0;i<name.length();i++){
//             System.out.print(name.charAt(i)+" ");
//         }
//         System.out.println();
//         // questions on string 
//         // 1.printing vowels only 
//         // 2.printing consonants only 
//         // 3.printing special char
//         // 4.print uppercase or lowercase
//         // 5.print nos.

//     }
// }
// Q1 Check if String is palindrome or not 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         String a = sc.nextLine();
//         String b="";
//         for(int i=a.length()-1;i>=0;i--){
//             b+=a.charAt(i);
//         }
//         System.out.println(b);
//         if(b.equals(a)){
//             System.out.println("Palindrom Strings");
//         }else{
//             System.out.println("Random Strings");
//         }
//     }
// }
// Alternate loop(0 to n/2) tc= O(n);
// import java.util.*;
// public class javabasics{
//     public static boolean isPalindrome(String str){
//         for(int i=0;i<str.length()/2;i++){
//             int n=str.length();
//             if(str.charAt(i)!=str.charAt(n-1-i)){
//                 //not a palindrome
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]){
//         String str = "racecar";
//         System.out.println(isPalindrome(str));
//     }
// }
// q2 given a route containing 4 directions (wesn) find shortest path 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         String str = "WNEENESENNN";
//         int x=0;
//         int y=0;
//         for(int i=0;i<str.length();i++){
//             if(str.charAt(i)=='N'){
//                 y+=1;
//             }else if(str.charAt(i)=='S'){
//                 y-=1;
//             }else if(str.charAt(i)=='W'){
//                 x-=1;
//             }else{
//                 x+=1;
//             }
//         }
//         System.out.println(x+" "+y);
//         double d = Math.sqrt(Math.pow((x),2)+Math.pow((y),2));
//         System.out.println(d);
//     }
// }
//alternate
// import java.util.*;
// public class javabasics{
//     public static float getShortestPath(String path){
//         int x=0,y=0;
//         for(int i=0;i<path.length();i++){
//             char dir = path.charAt(i);
//             if(dir=='S'){
//                 y--;
//             }else if(dir=='N'){
//                 y++;
//             }else if(dir=='W'){
//                 x--;
//             }else{
//                 x++;
//             }
//         }
//         int x2=x*x;
//         int y2=y*y;
//         return (float)Math.sqrt(x2+y2);
//     }
//     public static void main(String args[]){
//         String path = "WNEENESENNN";
//         System.out.println(getShortestPath(path));
//     }
// }
//String function compare 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         String s1="Tony";
//         String s2="Tony";
//         String s3 = new String("Tony");
//         if(s1==s2){
//             System.out.println("String equal");
//         }else{
//             System.out.println("Strings not equal");
//         }
//         if(s1==s3){
//             System.out.println("String equal");
//         }else{
//             System.out.println("Strings not equal");
//         }
// // we can not use == as it cheques the object or memory address 
// //here s1 and s2 will be stored in same address 
// // but new keyword creates new memory address that's why not equal
// //so to compare two strings according to their value we use 
// //.equals function 
//         if(s1.equals(s2)){
//             System.out.println("Equal");
//         }else{
//             System.out.println("Not Equal");
//         }
//         if(s1.equals(s3)){
//             System.out.println("Equal");
//         }else{
//             System.out.println("not equal");
//         }
//     }
// }
//String substring 
// import java.util.*;
// public class javabasics{
//     public static String subString(String str,int si,int ei){
//         String substr="";
//         for(int i=si;i<ei;i++){
//             substr+=str.charAt(i);
//         }
//         return substr;
//     }
//     public static void main(String args[]){
//         //subtstring
//         String str = "Hello World";
//         System.out.println(str.substring(0,5));
//         System.out.println(subString(str,0,5));
//     }
// }
// Q3 print largest String or Lexicographic order
// import java.util.*;
// public class javabasics{
//     public static String isLexicographic(String s1,String s2,String s3){
//         int a =s1.length();
//         int b=s2.length();
//         int c=s3.length();
//         int max=0;

//         if(a<b && a<c){
//             max=a;
//         }else if(b<c){
//             max=b;
//         }else{
//             max=c;
//         }
//         String LS="";
//         for(int i=0;i<max;i++){
//             if((s1.charAt(i)>s2.charAt(i))&&(s1.charAt(i)>s1.charAt(i))){
//                 LS=s1;
//             }else if(s2.charAt(i)>s3.charAt(i)){
//                 LS=s2;
//             }else{
//                 LS=s3;
//             }
//         }
//         return "Largest String : "+LS;
//     }
//     public static void main(String args[]){
//         String s1="apple";
//         String s2="mango";
//         String s3="banana";
//         String s4="aaaaabcd";
//         String s5="aaamabz";
//         String s6="aaaaabce";
//         System.out.println(isLexicographic(s1,s2,s3));
//         System.out.println(isLexicographic(s4,s5,s6));


//     }
// }
//Alternate ie. use of compareTo() function 
//another compareToIgnoreCase() function 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         String fruits[]={"apple","mango","banana"};
//         String largest=fruits[0];
//         for(int i=1;i<fruits.length;i++){
//             if(largest.compareTo(fruits[i])<0){
//                 largest=fruits[i];
//             }
//         }
//         System.out.println(largest);
//     }
// }
//String Builder
//we have two types of memory heap and stack in cpu 
//String are immutable ie. one declared the no changes in the same.
//so to mute string there is StringBuilder which is mutable 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         StringBuilder sb = new StringBuilder("");
//         for(char ch = 'a';ch<='z';ch++){
//             sb.append(ch+" ");
//             //tc=O(26) with sb 
//             //tc=O(26*n^2) without sb
//         }
//         sb.toString();
//         // int a =10 ; a.toString() not possible but Integer a =10 ; a.toString() possible
//         System.out.println(sb);
//     }
// }
// Q4 for a given string convert each first letter of each word to uppercase 
// import java.util.*;
// public class javabasics{
//     public static String toUpperCase(String str){
//         StringBuilder sb =new StringBuilder("");
//         char ch = Character.toUpperCase(str.charAt(0));
//         sb.append(ch);
//         for(int i=1;i<str.length();i++){
//             if(str.charAt(i)==' ' && i<str.length()-1){
//                 sb.append(str.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));
//             }else{
//                 sb.append(str.charAt(i));
//             }
//         }
//         return sb.toString();
//     }
//     public static void main(String args[]){
//         String str = "hi, i am hanuman";
//         //to upper case = Character.toUpperCase(ch);
//         System.out.println(toUpperCase(str));
//     }
// }
// Q5 String Compression
// import java.util.*;
// public class javabasics{
//     public static String stringCompress(String str){
//         StringBuilder sb  = new StringBuilder("");
//         int c=1;
//         for(int i=0;i<str.length()-1;i++){
//             if((str.charAt(i))==(str.charAt(i+1))){
//                 if(i==str.length()-2){
//                     c++;
//                     sb.append(str.charAt(i));
//                     sb.append(c);
//                 }
//                 c++;
//             }else{
//                 sb.append(str.charAt(i));
//                 sb.append(c);
//                 c=1;
//                 if(i==str.length()-2){
//                     sb.append(str.charAt(i+1));
//                     sb.append(c);
//                 }
//             }
//         }
//     return sb.toString();
//         }
//     public static void main(String args[]){
//         // String str = "aapqrrkkkkkkkklllllo";
//         // String str= "abc";
//         String str = "aaaabbbdd";
//         System.out.println(stringCompress(str));
//     }
// }
// alternate O(n)
// import java.util.*;
// public class javabasics{
//     public static String compress(String str){
//         String newStr="";
//         for(int i=0;i<str.length();i++){
//             Integer count = 1;
//             while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
//                 count++;
//                 i++;
//             }
//             newStr+=str.charAt(i);
//             if(count>1){
//                 newStr+=count.toString();
//             }
//         }
//         return newStr;
//     }
//     public static void main(String args[]){
//         String str = "aaabbcccdd";
//         System.out.println(compress(str));
//     }
// }
//HW
// Q1 count how many times lower case vowels occured in userinput String . 
// import java.util.*;
// public class javabasics{
//     public static int noOfVowel(String str){
//         int v=0;
//         for(int i=0;i<str.length();i++){
//             if(str.charAt(i)=='a'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='e'){
//                 v++;
//             }
//         }
//         return v;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         System.out.println(noOfVowel(str));
//     }
// }
// Q2 To check if two string are anagrams or not
// import java.util.*;
// public class javabasics{
//     public static boolean areAnagrams(String s1,String s2){
//         boolean b=true;
//         for(int i=0;i<s1.length();i++){
//             int c=0,d=0,e=0;
//             for(int j=0;j<s2.length();j++){
//                 if(s1.charAt(i)==s2.charAt(j)){
//                     c++;
//                 }
//                 if(s2.charAt(i)==s1.charAt(j)){
//                     d++;
//                 }
//             }
//             if(c==0||d==0){
//                 b=false;
//             }
//         }
//         return b;
//         }
//     public static void main(String args[]){
//         String s1 = "heart";
//         String s2 = "earth";
//         System.out.println(areAnagrams(s1,s2));
//     }
// }
// Alternate
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         String s1 = "earth";
//         String s2 = "heart";
//         s1=s1.toLowerCase();
//         s2=s2.toLowerCase();
//         if(s1.length()==s2.length()){
//             char s1arr[]=s1.toCharArray();
//             char s2arr[]=s2.toCharArray();
//             Arrays.sort(s1arr);
//             Arrays.sort(s2arr);
//             boolean res=Arrays.equals(s1arr,s2arr);
//             System.out.println(res);
//         }
//     }
// }
// ***********************************************************************************************************************************
// 23/02/24
// Revision Strings 
// import java.util.*;
// public class javabasics{
//     public static boolean isPalindrome(String str){
//         int n = str.length();
//         for(int i=0;i<n/2;i++){
//             if(str.charAt(i)!=str.charAt(n-1-i)){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         System.out.println(isPalindrome(str));
//     }
// }
// import java.util.*;
// public class javabasics{
//     public static double shortestPath(String str){
//         int n  =str.length();
//         int x=0,y=0;
//         for(int i=0;i<str.length();i++){
//             if(str.charAt(i)=='N'){
//                 y++;
//             }else if(str.charAt(i)=='S'){
//                 y--;
//             }else if(str.charAt(i)=='W'){
//                 x--;
//             }else{
//                 x++;
//             }
//         }
//         return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         System.out.println(shortestPath(str));
//     }
// }
// import java.util.*;
// public class javabasics{
//     public static String largestString(String arr[]){
//         int n = arr.length;
//         for(int i=0;i<n;i++){
//             arr[i].toLowerCase();
//         }
//         String largest = arr[0];
//         for(int i=1;i<n;i++){
//             if(largest.compareTo(arr[i])<0){
//                 largest=arr[i];
//             }
//         }
//         return largest;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String arr[]={"JaiShreeRam","Hanuman","Sita","Krishna","Radha"};
//         System.out.println(largestString(arr));
//     }
// }
// import java.util.*;
// public class javabasics{
//     public static String Alphabets(String str){
//         StringBuilder sb = new StringBuilder("");
//         for(char i='a';i<='z';i++){
//             str+=i;
//             sb.append(i+" ");
//         }
//         // return str;
//         return sb.toString();
//     }
//     public static void main(String args[]){
//         String str ="";
//         System.out.println("Alphabetic Series: "+Alphabets(str));
//     }
// }
// import java.util.*;
// public class javabasics{
//     public static String toUpperCase(String str){
//         int n =str.length();
//         StringBuilder sb = new StringBuilder("");
//         sb.append(Character.toUpperCase(str.charAt(0)));
//         for(int i=1;i<n;i++){
//             if(str.charAt(i)==' '&&i<n-1){
//                 sb.append(str.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));
//             }else{
//                 sb.append(str.charAt(i));
//             }
//         }
//         return sb.toString();
//     }
//     public static void main(String args[]){
//         Scanner sc =new Scanner(System.in);
//         String str = sc.nextLine();
//         System.out.println(toUpperCase(str));
//     }
// }
// import java.util.*;
// public class javabasics{
//     public static String stringCompression(String str){
//         StringBuilder sb  = new StringBuilder("");
//         int c=1;
//         for(int i=0;i<str.length()-1;i++){
//             if(str.charAt(i)==str.charAt(i+1)){
//                 if(i==str.length()-2){
//                     c++;
//                     sb.append(str.charAt(i));
//                     sb.append(c);
//                 }
//                 c++;
//             }else{
//                 sb.append(str.charAt(i));
//                 sb.append(c);
//                 c=1;
//                 if(i==str.length()-2){
//                     sb.append(str.charAt(i+1));
//                     sb.append(c);
//                 }
//             }
//         }
//         return sb.toString();
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         System.out.println(stringCompression(str));
//     }
// }
// import java.util.*;
// public class javabasics{
//     public static String compress(String str){
//         String newStr="";
//         for(int i=0;i<str.length();i++){
//             Integer count = 1;
//             while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
//                 count++;
//                 i++;
//             }
//             newStr+=str.charAt(i);
//             if(count>1){
//                 newStr+=count.toString();
//             }
//         }
//         return newStr;
//     }
//     public static void main(String args[]){
//         String str = "aaabbcccdd";
//         System.out.println(compress(str));
//     }
// }
// import java.util.*;
// public class javabasics{
//     public static String cS(String str){
//         String s ="";
//         for(int i=0;i<str.length();i++){
//             Integer c=1;
//             while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
//                 c++;
//                 i++;
//             }
//             s+=str.charAt(i);
//             s+=c.toString();
//         }
//         return s;
//     }
//     public static void main(String args[]){
//         String str = "abcdef";
//         System.out.println(cS(str));
//     }
// }
// HW rev
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         Scanner sc =new Scanner(System.in);
//         String s = sc.nextLine();
//         int d=0;
//         for(int i=0;i<s.length();i++){
//             char c = s.charAt(i);
//             if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
//                 d++;
//             }
//         }
//         System.out.println(d);
//     }
// }
// import java.util.*;
// public class javabasics{
//     public static boolean areAnagrams(String s1,String s2){
//         boolean b=true;
//         for(int i=0;i<s1.length();i++){
//             int c=0,d=0;
//             for(int j=0;j<s2.length();j++){
//                 if(s1.charAt(i)==s2.charAt(j)){
//                     c++;
//                 }
//             }
//             for(int k=0;k<s2.length();k++){
//                 if(s2.charAt(k)==s1.charAt(i)){
//                     d++;
//                 }
//             }
        
//             if(c==0||d==0){
//                 b=false;
//             }
//         }
//         return b;
//         }
//     public static void main(String args[]){
//         String s1 = "caac";
//         String s2 = "ccca";
//         System.out.println(areAnagrams(s1,s2));
//     }
// }
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         String s1="haart";
//         String s2="earth";
//         s1=s1.toLowerCase();
//         s2=s2.toLowerCase();
//         if(s1.length()==s2.length()){
//             char[] s1arr = s1.toCharArray();
//             char[] s2arr = s2.toCharArray();
//             Arrays.sort(s1arr);
//             Arrays.sort(s2arr);
//             boolean res = Arrays.equals(s1arr,s2arr);
//             System.out.println(res);
//         }
//     }
// }
// ******************************************************************************************************************************************************************
// 24/02/24
// Bit Manipulation
// Binary Number System
//Decimal to binary 
//Binary to decimal
// BitWise Operators 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         System.out.println(5&6);
//         System.out.println(5|6);
//         System.out.println(5^6);
//         System.out.println(~5);
//         System.out.println(~0);
//         System.out.println(5<<2);
//         System.out.println(6>>1);
//     }
// }
//Q1 check if odd or even 
// import java.util.*;
// public class javabasics{
//     public static void oddOrEven(int n){
//         int bitMask=1;
//         if((n&bitMask)==0){
//             System.out.println("Even NO");
//         }else{
//             System.out.println("Odd no");
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n =sc.nextInt();
//         oddOrEven(n);
//     }
// }
// Q2 Get,set,update,clear ith bit
// import java.util.*;
// public class javabasics{
//     public static void getIthBit(int n,int b){
//         int bitMask = 1<<b;
//         // if(((n>>b)&(1))==1){
//         if((n & bitMask)==1){
//             System.out.println("Bit is 1");
//         }else{
//             System.out.println("Bit is 0");
//         }
//     }
//     public static int setIthBit(int n,int b){
//         int bitMask = 1<<b;
//         return n | bitMask;
//     }
//     public static int clearIthBit(int n,int b){
//         int bitMask = ~(1<<b);
//         return n & bitMask;
//     }
//     public static int updateIthBit(int n,int b,int newBit){
//         // if(newBit==0){
//         //     return clearIthBit(n,b);
//         // }else{
//         //     return setIthBit(n, b);
//         // }
//         n=clearIthBit(n,b);
//         int BitMask=newBit<<b;
//         return n|BitMask;
//     }
//     public static int  clearLastbBits(int n,int b){
//         int bitMask = (-1)<<b;
//         return n & bitMask;
//     }
//     public static int clearRangeOfBits(int n,int s,int e){
//         int bitMask1 = (~0)<<(e+1);
//         int bitMask2 = (1<<s)-1;
//         int fBitMask = bitMask1 | bitMask2;
//         return n & fBitMask;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the no: ");
//         int n = sc.nextInt();
//         System.out.print("Enter the bit no: ");
//         int b= sc.nextInt();
//         getIthBit(n, b);
//         System.out.println(setIthBit(n, b));
//         System.out.println(clearIthBit(n, b));
//         System.out.print("Enter the newBit : ");
//         int updateBit = sc.nextInt();
//         System.out.println(updateIthBit(n, b, updateBit));
//         System.out.println(clearLastbBits(n,b));
//         System.out.print("Enter the starting bit: ");
//         int s = sc.nextInt();
//         System.out.print("Enter the ending bit : ");
//         int e = sc.nextInt();
//         System.out.println(clearRangeOfBits(n,s,e));
//     }
// }
// Q2 check if no is power of 2 or not 
// import java.util.*;
// public class javabasics{
//     public static void isNoPowerOf2(int n){
//         if((n&(n-1))==0){
//             System.out.println("Power of 2 ");
//         }else{
//             System.out.println("Not power of 2");
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc  =new Scanner(System.in);
//         int n = sc.nextInt();
//         isNoPowerOf2(n);
//     }
// }
// Q3 Count set bits in a  number
// import java.util.*;
// public class javabasics{
//     public static int countSetBits(int n){
//         int c= 0 ; 
//         int b=n;
//         while(b>0){
//             if((b&(1))==1){
//                 c++;
//             }
//             b=b>>1;
//         }
//         return c;
//     }
//     public static void main(String args[]){
//         System.out.println(countSetBits(15));
//     }
// }
// Q4 Fast Exponentiation
// import java.util.*;
// public class javabasics{
//     public static int fastExpo(int a,int n){
//         int ans =1; 
//         while(n>0){
//             if((n&1)!=0){
//                 ans=ans*a;
//             }
//             a=a*a;
//             n=n>>1;
//         }
//         return ans;
//     }
//     public static void main(String args[]){
//         System.out.println(fastExpo(3,5));
//     }
// }
// hw 
// modular exponentiation 
// import java.util.*;
// public class javabasics {
//     public static int getIthBit(int n,int b){
//         int bM=1<<b;
//         return n & bM;
//     }
//     public static int setIthBit(int n,int b){
//         int bM=1<<b;
//         return n|bM;
//     }
//     public static int clearIthBit(int n,int b){
//         int bM=~(1<<b);
//         return n&bM;
//     }
//     public static int updateIthBit(int n,int b,int nb){
//         // if(nb==0){
//         //     return clearIthBit(n, b);
//         // }else{
//         //     return setIthBit(n, b);
//         // }
//         n=clearIthBit(n, b);
//         int bM=(nb<<b);
//         return n|bM;
//     }
//     public static int clearLastbBits(int n,int b){
//         int bM= (-1)<<b;
//         return n&bM;
//     }
//     public static int clearRangeOfBits(int n,int s,int e){
//         int bM1 = (-1)<<(e+1);
//         int bM2 = (1<<s)-1;
//         System.out.println("asf"+bM2);
//         int fbM = bM1|bM2;
//         return n&fbM;
//     }
//     public static void main(String args[]){
//         System.out.println(getIthBit(10, 2));
//         System.out.println(setIthBit(10, 2));
//         System.out.println(clearIthBit(10, 1));
//         System.out.println(updateIthBit(10, 0, 1));
//         System.out.println(clearLastbBits(10,2));
//         System.out.println(clearRangeOfBits(15, 1, 3));
//     }
// }
// import java.util.*;
// public class javabasics{
//     public static boolean isEvenOrOdd(int n){
//         if((n&1)==0){
//             return true;
//         }else{
//             return false;
//         }
//     }
//     public static void main(String args[]){
//         System.out.println(isEvenOrOdd(15));
//     }
// }
// import java.util.*;
// public class javabasics{
//     public static boolean isPowerOf2(int n){
//         if((n&(n-1))==0){
//             return true;
//         }else{
//             return false;
//         }
//     }
//     public static void main(String args[]){
//         System.out.println(isPowerOf2(56));
//     }
// }
// import java.util.*;
// public class javabasics{
//     public static int countSetBits(int n){
//         int c=0;
//         int b=n;
//         while(b>0){
//             if((b&1)==1){
//                 c++;
//             }
//             b=b>>1;
//         }
//         return c;
//     }
//     public static void main(String args[]){
//         System.out.println(countSetBits(16));
//     }
// }
// import java.util.*;
// public class javabasics{
//     public static int fastExpo(int a , int b){
//         int ans=1;
//         while(b>0){
//             if((b&1)==1){
//             ans=ans*a;
//             }
//             a=a*a;
//             b=b>>1;
//         }
//         return ans;
//     }
//     public static void main(String args[]){
//         System.out.println(fastExpo(5,3));
//     }
// }
// hw
// Q1 x^x calculating 
//value will always be 0 
//done below code to find x power x by mistaken ly 
// import java.util.*;
// public class javabasics{
//     public static int xsquare(int x){
//         int ans = 1; 
//         int a=x;
//         while(a>0){
//             if((a&1)==1){
//                 ans=ans*x;
//             }
//             x*=x;
//             a=a>>1;
//         }
//         return ans;
//     }
//     public static void main(String args[]){
//         System.out.println(xsquare(3));
//     }
// }
// Q2 Swapping two numbers without using any other variable 
// import java.util.*;
// public class javabasics{
//     public static void swapTwoNumbers(int x,int y){
//         x=x^y;
//         y=x^y;
//         x=x^y;
//         System.out.println(x+" "+y);
//     }
//     public static void main(String args[]){
//         swapTwoNumbers(1,9);
//     }
// }
//Q3 Add 1 to integer using bit maniputlation 
// ~ operator negates the no then - isadded befor the no.
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         System.out.println("3 + 1 is "+ -~3);
//     }
// }
// Q4 from upper to lower case
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         for(char ch ='A';ch<='Z';ch++){
//             System.out.println((char)(ch|' '));
//         }
//     }
// }
// Q4 from lower to uppercase
// import java.util.*;
// public class javabasics {
//     public static void main(String args[]) {
//         for (char ch = 'a'; ch <= 'z'; ch++) {
//             System.out.println((char) (ch & '_'));
//         }
//     }
// }
// *********************************************************************************************************************************************************************/**
// 25/2/24
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int a = 5;
//         int b= 6;
//         System.out.println(a&b);
//         System.out.println(a|b);
//         System.out.println(a^b);
//         System.out.println(~1);
//         System.out.println(a>>1);
//         System.out.println(a<<1);
//     }
// }
// import java.util.*;
// public class javabasics{
//     public static boolean isOdd(int n){
//         if((n&1)==1){
//             return true;
//         }else{
//             return false;
//         }
//     }
//     public static void main(String args[]){
//         System.out.println(isOdd(10001));
//     }
// }
// import java.util.*;
// public class javabasics{
//     public static int getIthBit(int n,int b){
//         int bm=1<<b;
//         return n&bm;
//     }
//     public static int setIthBit(int n,int b){
//         int bm = 1<<b;
//         return n|bm;
//     }
//     public static int clearIthBit(int n,int b){
//         int bm = ~(1<<b);
//         return n&bm;
//     }
//     public static int updateIthBit(int n,int b,int nb){
//         // if(nb==1){
//         //     return setIthBit(n, b);
//         // }else{
//         //     return clearIthBit(n, b);
//         // }
//         n=clearIthBit(n,b);
//         int bm=nb<<b;
//         return n|bm;

//     }
//     public static int clearLastbBits(int n,int b){
//         int bm = (~1)<<b;
//         return n&bm;
//     }
//     public static int clearRangeOfBits(int n,int s,int e){
//         int bm1 = (-1)<<(e+1);
//         int bm2 = (1<<s)-1;
//         int fbm = bm1|bm2;
//         return n&fbm;
//     }
//     public static void main(String args[]){
//         System.out.println(getIthBit(10,2));
//         System.out.println(setIthBit(10,2));
//         System.out.println(clearIthBit(10,3));
//         System.out.println(updateIthBit(10,2,1));
//         System.out.println(clearLastbBits(10,1));
//         System.out.println(clearRangeOfBits(15,1,3));
//     }
// }
// import java.util.*;
// public class javabasics{
//     public static boolean isPowerOf2(int n){
//         if((n&(n-1))==0){
//             return true;
//         }else{
//             return false;
//         }
//     }
//     public static int totalSetBits(int n){
//         int c=0;
//         while(n>0){
//             if((n&1)==1){
//                 c++;
//             }
//             n>>=1;
//         }
//         return c;
//     }
//     public static int fastExpo(int a,int b){
//         int ans=1;
//         while(b>0){
//             if((b&1)==1){
//             ans=ans*a;
//             }
//             a*=a;
//             b>>=1;
//         }
//         return ans;
//     }
//     public static void main(String args[]){
//         System.out.println(isPowerOf2(256));
//         System.out.println(totalSetBits(256));
//         System.out.println(fastExpo(5,4));
//     }
// }
// hw 
// import java.util.*;
// public class javabasics{
//     public static int squareOfNo(int n){
//         int ans=1;
//         int a=n;
//         int b=n;
//         while(a>0){
//             if((a&1)==1){
//                 ans*=b;
//             }
//             b*=b;
//             a>>=1;
//         }
//         return ans;
//     }
//     public static void swapTwoNumbers(int a,int b){
//         System.out.println("Before Swap : "+a+" "+b);
//          a = a^b;
//          b = a^b;
//          a = a^b;
//         System.out.println("After Swap : "+a+" "+b);
//     }
//     public static void main(String args[]){
//         swapTwoNumbers(1,10);
//         System.out.println(squareOfNo(2));
//     }
// }
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         System.out.println("3 + 1 is " + -~3);
//     }
// }
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         for(char c='A';c<='Z';c++){
//             System.out.println((char)(c|' '));
//         }
//         for(char c='a';c<='z';c++){
//             System.out.println((char)(c&'_'));
//         }
//     }
// }
// **********************************************************************************************************************************************************************
//code for checking disting element in array with O(n)
// import java.util.Arrays;

// public class javabasics {
//     public static int[] findTwoDistinctNumbers(int[] arr) {
//         // Step 1: Find XOR of all elements in the array
//         int xorResult = 0;
//         for (int num : arr) {
//             xorResult ^= num;
//         }

//         // Step 2: Find the rightmost set bit in the XOR result
//         // This bit is set in one of the distinct numbers but not the other
//         int rightmostSetBit = 1;
//         while ((rightmostSetBit & xorResult) == 0) {
//             rightmostSetBit <<= 1;
//         }

//         // Step 3: Initialize two variables to store the distinct numbers
//         int distinctNum1 = 0;
//         int distinctNum2 = 0;

//         // Step 4: Partition the array into two groups based on the rightmost set bit
//         for (int num : arr) {
//             if ((num & rightmostSetBit) != 0) {
//                 distinctNum1 ^= num;
//             } else {
//                 distinctNum2 ^= num;
//             }
//         }

//         // The result will be the two distinct numbers in increasing order
//         return new int[]{Math.min(distinctNum1, distinctNum2), Math.max(distinctNum1, distinctNum2)};
//     }

//     public static void main(String[] args) {
//         int[] arr = {4, 2, 6, 3, 3, 2, 8, 4, 9, 7};
//         int[] result = findTwoDistinctNumbers(arr);
//         System.out.println(Arrays.toString(result));
//     }
// }
// import java.util.*;
// class javabasics{
//     //Function to return sum of count of set bits in the integers from 1 to n.
//     public static int countSetBits(int n){
//         int a =1;
//         int c=0;
//         while(a>0){
//             if((a&1)==1){
//                 c++;
//                 System.out.println(c);
//             }
//             if((a>>1)<=0){
//                 a++;
//             }else if(a==5){
//                 break;
//             }else {
//                 a>>=1;
//             }
//         }
//         return c;
//     }
//     public static void main(String args[]){
//         System.out.println(countSetBits(5));
//     }
// }
// import java.util.*;
// class javabasics {
//     // Function to return the sum of the count of set bits in the integers from 1 to n.
//     public static int countSetBits(int n) {
//         int count = 0;
//         for (int i = 1; i <= n; i++) {
//             int num = i;
//             while (num > 0) {
//                 num &= (num - 1);
//                 count++;
//             }
//         }
//         return count;
//     }

//     public static void main(String args[]) {
//         System.out.println(countSetBits(4));
//     }
// }
// ************************************************************************************************************
//26-02-24 (revision of basics till oops started (26th feb  to 29 th feb ))
//Print star pattern ,inverted star pattern , halfpyramid 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         System.out.println("Star Pattern: ");
//         for(int i=0;i<5;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         System.out.println("Inverted Star Pattern: ");
//         for(int i=0;i<5;i++){
//             for(int j=5;j>i;j--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         System.out.println("Half Pyramid Pattern: ");
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//         System.out.println("Character Pattern: ");
//         char a='a';
//         for(int i=0;i<5;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print(a);
//                 a++;
//             }
//             System.out.println();
//         }
//         System.out.println("No Pattern: ");
//         int no=1;
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(no);
//                 no++;
//             }
//             System.out.println();
//         }
//     }
// }
//Advanced Pattern 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         System.out.println("Hollow Rectangle Pattern: ");
//         for(int i=0;i<4;i++){
//             for(int j=0;j<5;j++){
//                 if(j==0 || j==4 ||i==0||i==3){
//                     System.out.print("*");
//                 }else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//         System.out.println("Inverted and Rotaed Half Pyramid Pattern: ");
//         for(int i=0;i<4;i++){
//             for(int j=0;j<4;j++){
//                 if(i+j>=3){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//         System.out.println("Inverted Half Pyramid with Numbers: ");
//         for(int i=1;i<=10;i++){
//             for(int j=1;j<=10-i+1;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//         System.out.println("Floyd's Triangle: ");
//         int c=1;
//         for(int i=0;i<10;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print(c+" ");
//                 c++;
//             }
//             System.out.println();
//         }
//         System.out.println("0-1 Triangle: ");
//         for(int i=0;i<5;i++){
//             for(int j=0;j<=i;j++){
//                 if(((i+j)%2)==0){
//                     System.out.print("1 ");
//                 }else{
//                     System.out.print("0 ");
//                 }
//             }
//             System.out.println();
//         }
//         System.out.println("Butterfly Pattern: ");
//         for(int i=1;i<=4;i++){
//             //stars - i
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             //spaces
//             for(int j=1;j<=2*(4-i);j++){
//                 System.out.print("  ");
//             }
//             //stars
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         for(int i=4;i>=0;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             for(int j=1;j<=2*(4-i);j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         System.out.println("Solid Rhombus Pattern: ");
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5-i;j++){
//                 System.out.print("  ");
//             }
//             System.out.println("* * * * *");
//         }
//         System.out.println("Hollow Rhombus Pattern: ");
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5-i;j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=5;j++){
//                 if(i==1||i==5||j==1||j==5){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//         System.out.println("Diamond Pattern: ");
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5-i;j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=(i*2)-1;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         for(int i=5;i>=1;i--){
//             for(int j=1;j<=5-i;j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=(i*2)-1;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
//hw
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         System.out.println("No pyramid Pattern: ");
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=(n-i);j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//         System.out.println("Palindromic Pattern with no System: ");
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print("  ");
//             }
//             for(int j=i;j>=1;j--){
//                 System.out.print(j+" ");
//             }
//             for(int j=2;j<=i;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }
// *********************************************************************************************************************************************************
// 28/02/24
// FUNCTION AND METHODS revision
// import java.util.*;
// public class javabasics{
//     public static int factorial(int n){
//         int a=n;
//         int b=1;
//         int fact=1;
//         while(b<=a){
//             fact=fact*b;
//             b++;
//         }
//         return fact;
//     }
//     public static int binomialCoeff(int a,int b){
//         int c=factorial(a);
//         int d=factorial(b);
//         int e=factorial(a-b);
//         return c/(d*e);
//     }
//     public static boolean isPrime(int a){
//         for(int i=2;i<Math.sqrt(a);i++){
//             if(a%i==0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void PrimeinRange(int a,int b){
//         for(int i=a;i<=b;i++){
//             if(isPrime(i)){
//                 System.out.print(i+" ");
//             }
//         }
//     }
//     public static int BinarytoDecimal(int a){
//         int b=a;
//         int d=0;
//         int c=-1;
//         // int e=2;
//         while(b>0){
//             c++;
//             if(b%10==1){
//                 d=d+(int)(Math.pow(2,c));
//             }
//             b=b/10;
//         }
//         return d;
//     }
//     public static void DecimaltoBinary(int a){
//         int b=a;
//         // int bn=0;
//         StringBuilder s=new StringBuilder("");
//         while(b>0){
//             int ld = b%2;
//             s=s.append(ld);
//             b=b/2;
//         }
//         System.out.print(s.reverse());
//     }
//     public static void main(String args[]){
//         System.out.println(factorial(5));
//         System.out.println(binomialCoeff(5,2));
//         System.out.println(isPrime(3));
//         PrimeinRange(50,100);
//         DecimaltoBinary(50);
//         System.out.println();
//         System.out.println(BinarytoDecimal(1111));
//     }
// }
// HW
//q1 java method to compute avg of 3 no
// import java.util.*;
// public class javabasics{
//     public static double avgOf3(int a,int b,int c){
//         return (a+b+c)/3.0;
//     }
//     public static void main(String args[]){
//         System.out.println(avgOf3(10,20,30));
//     }
// }
//q2 method isEven to find if even or not 
// import java.util.*;
// public class javabasics{
//     public static boolean isEven(int a){
//         if(a%2==0){
//             return true;
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         System.out.println(isEven(10));
//     }
// }
// q3 to check if palindrome or not
// import java.util.*;
// public class javabasics{
//     public static boolean isPalindrome(int a){
//         int d=0;
//         int b=a;
//         while(b>0){
//             int ld=b%10;
//             d=ld+(d*10);
//             b=b/10;
//         }
//         if(d==a){
//             return true;
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         System.out.println(isPalindrome(121213));
//     }
// }
//q4 usage of Math class 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int a=10;
//         int b=100;
//         System.out.println(Math.min(a,b));
//         System.out.println(Math.max(a,b));
//         System.out.println(Math.sqrt(b));
//         System.out.println(Math.pow(b,a));
//         System.out.println(Math.abs(a-b));
//     }
// }
// q5 to find sum of digits of integer
// import java.util.*;
// public class javabasics{
//     public static int SumofInteger(int a){
//         int b=0;
//         while(a>0){
//             int ld=a%10;
//             b+=ld;
//             a/=10;
//         }
//         return b;
//     }
//     public static void main(String args[]){
//         System.out.println(SumofInteger(12345));
//     }
// }

// ARRAYS revision
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         Scanner sc =new Scanner(System.in);
//         int key=5;
//         int arr[]=new int[10];
//         for(int i=0;i<10;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<10;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//         // linear search 
//         int c=0;
//         for(int i=0;i<10;i++){
//             if(arr[i]==key){
//                 c++;
//                 System.out.println("Key found at index : "+i+" and the time complexity of code is : O(n)");
//             }
//         }
//         if(c==0){
//             System.out.println("key not found ");
//         }
//         //Largest element 
//         int large=Integer.MIN_VALUE;
//         for(int i=0;i<10;i++){
//             if(large<arr[i]){
//                 large=arr[i];
//             }
//         }
//         System.out.println("The largest Element in the given array is : " +large);
//         //smallest element 
//         int small = Integer.MAX_VALUE;
//         for(int i=0;i<10;i++){
//             if(small>arr[i]){
//                 small=arr[i];
//             }
//         }
//         System.out.println("The Smallest Element in the Array is : "+small);
//         // binary search 
//         int start = 0;
//         int end = 10-1;
//         int mid = (start+end)/2;
//         int f=0;
//         while(start<=end){
//             if(arr[mid]==key){
//                 f++;
//                 System.out.println("Key found at index : "+mid+" and the time complexity of code is O(log n)");
//                 break;
//             }else if(arr[mid]<key){
//                 start=mid+1;
//             }else{
//                 end=mid-1;
//             }
//         }
//         if(f==0){
//             System.out.println("Key not found ");
//         }
//         //reverse of array 
//         System.out.println("The Reverse of an Array is: ");
//         for(int i=arr.length-1;i>=0;i--){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//         //pairs in array 
//         System.out.println("The Pairs possible with time complexity O(n^2) in Array are: ");
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr.length;j++){
//                 System.out.print("( "+arr[i]+","+arr[j]+" ) ");
//             }
//         }
//     }
// }
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         // int arr[]={2,4,6,8,10};
//         // int arr[]={1,-2,6,-1,3};
//         int s=0;
//         int min=Integer.MAX_VALUE;
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             for(int j=i;j<arr.length;j++){
//                 int d=0;
//                 for(int k=i;k<=j;k++){
//                     System.out.print(arr[k]+" ");
//                     s+=arr[k];
//                     d+=arr[k];
//                 }
//                 System.out.print(" ");
//                 if(min>d){
//                     min=d;
//                 }
//                 if(max<d){
//                     max=d;
//                 }
//             }
//             System.out.println();
//         }
//         System.out.println("The sum of all subarrays is : "+s);
//         System.out.println("Minimun subarray sum is : "+min);
//         System.out.println("Maximum subarray sum is : "+max);
//     }
// }
//Brute force approach maximum subarray sum 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int arr[]={1,-2,6,-1,3};
//         int max=Integer.MIN_VALUE;
//         int min=Integer.MAX_VALUE;
//         for(int i=0;i<arr.length;i++){
//             for(int j=i;j<arr.length;j++){
//                 int s=0;
//                 for(int k=i;k<=j;k++){
//                     System.out.print(arr[k]+" ");
//                     s+=arr[k];
//                 }
//                 System.out.print(" , ");
//                 if(min>s){
//                     min=s;
//                 }
//                 if(max<s){
//                     max=s;
//                 }
//             }
//             System.out.println();
//         }
//         System.out.println("Minimum Subarray sum is : "+min);
//         System.out.println("Maximum Subarray sum is : "+max);
//         System.out.println("Here the Complexity is O(n^3)");
//     }
// }
//prefix array approach Maximum subarray sum
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int max= Integer.MIN_VALUE;
//         int cs=0;
//         int arr[]={1,-2,6,-1,3};
//         int pa[]=new int[arr.length];
//         pa[0]=arr[0];
//         for(int i=1;i<arr.length;i++){
//             pa[i]=pa[i-1]+arr[i];
//         }
//         for(int i=0;i<arr.length;i++){
//             for(int j=i;j<arr.length;j++){
//                 cs= i == 0 ? pa[j] : pa[j]-pa[i-1];
//                 if(max<cs){
//                     max=cs;
//                 }
//             }
//         }
//         System.out.println(max);
//     }
// }
//kadane's algorithm Maximum Subarray sum 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int arr[]={1,-2,6,-1,3};
//         int max=Integer.MIN_VALUE;
//         int cs=0;
//         for(int i=0;i<arr.length;i++){
//             cs+=arr[i];
//             if(cs<0){
//                 cs=0;
//             }
//             if(max<cs){
//                 max=cs;
//             }
//         }
//         System.out.println("Maximum Subarray sum is : "+max);
//     }
// }
// rev of subarray sum 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int arr[]={-1,3,4,-2,7,0,1,-6};
//         int ms=Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             for(int j=i;j<arr.length;j++){
//                 int cs=0;
//                 for(int k=i;k<=j;k++){
//                     cs+=arr[k];
//                 }
//                 System.out.print(cs+" ");
//                 if(ms<cs){
//                     ms=cs;
//                 }
//             }
//         }
//         System.out.println();
//         System.out.println("ms is : "+ms);
//         int pa[]=new int[arr.length];
//         pa[0]=arr[0];
//         int s=0;
//         int mas=Integer.MIN_VALUE;
//         for(int i=1;i<arr.length;i++){
//             pa[i]=pa[i-1]+arr[i];
//         }
//         for(int i=0;i<arr.length;i++){
//             for(int j=i;j<arr.length;j++){
//                s = i==0 ? pa[j] : pa[j]-pa[i-1];
//                System.out.print(s+" ");
//                if(mas<s){
//                    mas=s;
//                }
//             }
//         }
//         System.out.println();
//         System.out.println("Mas is: "+mas);
//         int css=0;
//         int mss=Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(css<0){
//                 css=0;
//             }
//             css+=arr[i];
//             System.out.print(css+" ");
//             if(mss<css){
//                 mss=css;
//             }
//         }
//         System.out.println();
//         System.out.println("mss is : "+mss);
//     }
// }
//Trapping Rain water problem 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int arr[]={4,2,0,6,3,2,5};
//         int max1 = Integer.MIN_VALUE;
//         int max2 = Integer.MIN_VALUE;
//         int maxl[]= new int[arr.length];
//         int maxr[]=new int[arr.length];
//         for(int i=0;i<arr.length;i++){
//             if(max1<arr[i]){
//                 max1=arr[i];
//             }
//             maxl[i]=arr[i];
//         }
//         for(int i=arr.length-1;i>=0;i--){
//             if(max2<arr[i]){
//                 max2=arr[i];
//             }
//             maxr[i]=arr[i];
//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.print(maxl[i]+" ");
//         }
//         int wt=0;
//         for(int i=0;i<arr.length;i++){
//             int wl = Math.min(maxl[i],maxr[i]);
//              wt += wl-arr[i];
//             // System.out.println(wt+" ");
//         }
//     }
// }
//Best time to buy and sell stock problem
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int arr[]={6,5,4,3,2,1};
//         int d=0;
//         int min=Integer.MAX_VALUE;
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(min>arr[i]){
//                 min=arr[i];
//                 d=i;
//             }
//         }
//         System.out.println(min);
//         for(int i=d;i<arr.length;i++){
//             if(max<arr[i]){
//                 max=arr[i];
//             }
//         }
//         System.out.println(max);
//         System.out.println("Max profit : "+(max-min));
//     }
// }
//Alter
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int bp  = Integer.MAX_VALUE;
//         int mp=0;
//         int arr[]={7,1,5,3,6,4};
//         for(int i=0;i<arr.length;i++){
//             if(bp<arr[i]){
//                 int p=arr[i]-bp;
//                 mp=Math.max(mp,p);
//             }else{
//                 bp=arr[i];
//             }
//         }
//         System.out.println(mp);
//     }
// }
// ********************************************************************************************************************************************************
// 29/02/23
//small rev of arr
//brute force maxsubarr
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int arr[]={2,3,-1,5,3,-6,1};
//         int ts=0;
//         int ms=Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             for(int j=i;j<arr.length;j++){
//                 int s=0;
//                 for(int k=i;k<=j;k++){
//                     System.out.print(arr[k]+" ");
//                     ts+=arr[k];
//                     s+=arr[k];
//                 }
//                 if(ms<s){
//                     ms=s;
//                 }
//             }
//             System.out.println();
//         }
//         System.out.println("Total sum : "+ts);
//         System.out.println("Maximum sum : "+ms);
//     }
// }
//kadane's approach 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int arr[]={2,4,-2,4,-6,8,-2,1};
//         int cs=0;
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(cs<0){
//                 cs=0;
//             }
//             cs+=arr[i];
//             if(max<cs){
//                 max=cs;
//             }
//         }
//         System.out.println(max);
//     }
// }
//prefix array approach 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int arr[]={2,3,-1,5,3,-6,1};
//         int pa[]=new int[arr.length];
//         int ms=Integer.MIN_VALUE;
//         int cs=0;
//         pa[0]=arr[0];
//         for(int i=1;i<arr.length;i++){
//             pa[i]=pa[i-1]+arr[i];
//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.print(pa[i]+" ");
//         }
//         for(int i=0;i<arr.length;i++){
//             for(int j=i;j<arr.length;j++){
//                 cs = i==0 ? pa[j] : pa[j]-pa[i-1];
//                 if(ms<cs){
//                     ms=cs;
//                 }
//             }
//         }
//         System.out.println(ms);
//     }
// }
// Best time to buy and sell stock
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int arr[]={4,6,3,7,4,0};
//         int bp=Integer.MAX_VALUE;
//         int sp=Integer.MIN_VALUE;
//         int d=0;
//         for(int i=0;i<arr.length;i++){
//             if(bp>arr[i]){
//                 bp=arr[i];
//                 d=i;
//             }
//         }
//         for(int i=d;i<arr.length;i++){
//             if(sp<arr[i]){
//                 sp=arr[i];
//             }
//         }
//         int mp = sp-bp;
//         System.out.println("Max Profit : "+mp);
//     }
// }
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int arr[]={-4,2,10,3,-1};
//         int bp = Integer.MAX_VALUE;
//         int mp=Integer.MIN_VALUE;
//         int profit =0;
//         int c=0;
//         for(int i=0;i<arr.length;i++){
//         if(bp>arr[i]){
//             bp=arr[i];
//         }else{
//             c++;
//             profit = arr[i]-bp;
//             if(profit>mp){
//                 mp=profit;
//             }
//         }
//     }if(c==0){
//         System.out.println("0");
//     }else{
//         System.out.println(mp);
//     }
//     }
// }
//Trapping Rain Water 
// import java.util.*;
// public class javabasics{
//     public static int tr(int arr[]){
//         int leftMax[]=new int[arr.length];
//         leftMax[0]=arr[0];
//         for(int i=1;i<arr.length;i++){
//             leftMax[i]=Math.max(arr[i],leftMax[i-1]);
//         }
//         int rightMax[]=new int[arr.length];
//         rightMax[arr.length-1]=arr[arr.length-1];
//         for(int i=arr.length-2;i>=0;i--){
//             rightMax[i]=Math.max(arr[i],rightMax[i+1]);
//         }
//         int wt = 0;
//         for(int i=0;i<arr.length;i++){
//             int wl = Math.min(leftMax[i],rightMax[i]);
//             wt += wl - arr[i];
//         }
//         return wt;
//     }
//     public static void main(String args[]){
//         int arr[]={4,2,0,6,3,2,5};
//         System.out.println("Trapped water: "+tr(arr));
//     }
// }
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int arr[]={4,2,0,6,3,2,5};
//         int max=Integer.MIN_VALUE;
//         int max2=Integer.MIN_VALUE;
//         int n=arr.length;
//         int leftMax[]=new int[n];
//         // leftMax[0]=arr[0];
//         for(int i=0;i<n;i++){
//             if(max<arr[i]){
//                 max=arr[i];
//                 leftMax[i]=arr[i];
//             }else{
//                 leftMax[i]=leftMax[i-1];
//             }
//         }
//         int rightMax[]=new int[n];
//         for(int i=n-1;i>=0;i--){
//             if(max2<arr[i]){
//                 max2=arr[i];
//                 rightMax[i]=arr[i];
//             }else{
//                 rightMax[i]=rightMax[i+1];
//             }
//         }
//         int wt=0;
//         for(int i=0;i<n;i++){
//             int wl = Math.min(leftMax[i],rightMax[i]);
//             wt += wl - arr[i];
//         }
//         System.out.println(wt);
//     }
// }
// hw
// q1
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         boolean b=true;
//         int arr[]={1,1,1,3,3,4,3,2,4,2};
//         int c=0;
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]==arr[j]){
//                     c++;
//                 }
//             }
//         }
//         if(c==0){
//             b=false;
//         }
//         System.out.println(b);
//     }
// }
// q2
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int arr[]={4,5,6,7,0,1,2};
//         int target=3;
//         int c=0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==target){
//                 c++;
//                 System.out.println(i);
//             }
//         }
//         if(c==0){
//             System.out.println("-1");
//         }
//     }
// }
// q3
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int arr[]={7,6,4,3,1};
//         int bp = Integer.MAX_VALUE;
//         int sp = Integer.MIN_VALUE;
//         int profit=0;
//         int mp=0;
//         for(int i=0;i<arr.length;i++){
//             if(bp>arr[i]){
//                 bp=arr[i];
//             }else{
//                 sp =arr[i];
//                 profit = sp-bp;
//                 if(mp<profit){
//                     mp=profit;
//                 }
//             }
//         }
//         System.out.println(mp);
//     }
// }
//q4
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int arr[]={4,2,0,3,2,5};
//         int n=arr.length;
//         int leftMax[]=new int[n];
//         leftMax[0]=arr[0];
//         for(int i=1;i<arr.length;i++){
//             leftMax[i]=Math.max(arr[i],leftMax[i-1]);
//         }
//         int rightMax[]=new int[n];
//         rightMax[n-1]=arr[n-1];
//         for(int i=n-2;i>=0;i--){
//             rightMax[i]=Math.max(arr[i],rightMax[i+1]);
//         }
//         int wt=0;
//         for(int i=0;i<n;i++){
//             int wl = Math.min(leftMax[i],rightMax[i]);
//             wt+=wl-arr[i];
//         }
//         System.out.println("Water Trapped: "+wt);
//     }
// }
// q5
//  my code for triplets but returning duplicates 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int arr[]={-1,0,1,2,-1,-4};
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 for(int k=j+1;k<arr.length;k++){
//                     if(((arr[i]+arr[j]+arr[k])==0)&&(i!=j)&&(i!=k)&&(j!=k)){
                        
//                         System.out.print("["+arr[i]+","+arr[j]+","+arr[k]+"]");
                        
//                     }
//                 }
//             }
//         }

//     }
// }
//q code for triplets after removing duplicates 
// import java.util.Arrays;

// public class javabasics {

//     public static int[][] findTriplets(int[] nums) {
//         int n = nums.length;
//         Arrays.sort(nums); // Sort the array to handle duplicates

//         int[][] result = new int[n][3];
//         int count = 0;

//         for (int i = 0; i < n - 2; i++) {
//             if (i > 0 && nums[i] == nums[i - 1]) {
//                 continue; // Skip duplicates
//             }

//             int left = i + 1;
//             int right = n - 1;

//             while (left < right) {
//                 int sum = nums[i] + nums[left] + nums[right];
//                 if (sum == 0) {
//                     result[count][0] = nums[i];
//                     result[count][1] = nums[left];
//                     result[count][2] = nums[right];
//                     count++;
//                     // Skip duplicates
//                     while (left < right && nums[left] == nums[left + 1]) {
//                         left++;
//                     }
//                     while (left < right && nums[right] == nums[right - 1]) {
//                         right--;
//                     }
//                     left++;
//                     right--;
//                 } else if (sum < 0) {
//                     left++;
//                 } else {
//                     right--;
//                 }
//             }
//         }

//         return Arrays.copyOf(result, count);
//     }

//     public static void main(String[] args) {
//         int[] nums =  {-1,0,1,2,-1,-4};
//         int[][] triplets = findTriplets(nums);
//         for (int[] triplet : triplets) {
//             System.out.println(Arrays.toString(triplet));
//         }
//     }
// }
// Sorting the Array (Arrays.sort(nums)):
// We start by sorting the input array nums in ascending order. Sorting helps us handle duplicates efficiently.
// Initializing the Result Array (int[][] result) and Counter (count):
// We create a 2D array result to store the valid triplets.
// The count variable keeps track of the number of valid triplets found.
// Outer Loop (for (int i = 0; i < n - 2; i++)):
// We iterate through the array from index 0 to n - 3 (to avoid index out of bounds).
// The condition i < n - 2 ensures that we have enough elements for a triplet.
// Handling Duplicates (if (i > 0 && nums[i] == nums[i - 1])):
// If the current element is the same as the previous one, we skip it to avoid duplicate triplets.
// Two-Pointer Approach (while (left < right)):
// We use two pointers, left and right, to find triplets.
// left starts from i + 1, and right starts from the end of the array.
// Checking the Sum (int sum = nums[i] + nums[left] + nums[right]):
// We calculate the sum of the current triplet.
// Valid Triplet Found (if (sum == 0)):
// If the sum is zero, we found a valid triplet.
// We store it in the result array and increment the count.
// We also skip any duplicate elements by adjusting the pointers.
// Updating Pointers (left++ and right--):
// If the sum is less than zero, we move the left pointer to the right.
// If the sum is greater than zero, we move the right pointer to the left.
// Returning Valid Triplets (Arrays.copyOf(result, count)):
// We return a copy of the result array containing only the valid triplets (up to index count).
// Main Method (public static void main(String[] args)):
// In the main method, we create an example array nums and call the findTriplets function.
// We print each valid triplet.
// *********************************************************************************************************************************************************
// 29/02/24
// rev of String 
// q1 String is palindrome 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         String str="racecar";
//         // String s="";
//         // for(int i=str.length()-1;i>=0;i--){
//         //     s+=str.charAt(i);
//         // }
//         // if(str.equals(s)){
//         //     System.out.println("True");
//         // }else{
//         //     System.out.println("false");
//         // }
//         int c=0;
//         int d=0;
//         for(int i=0;i<str.length()/2;i++){
//             if((str.charAt(i))==(str.charAt(str.length()-i-1))){
//                 d++;
//             }else{
//                 c++;
                
//             }
//         }
//         // System.out.println(c);
//         if(c>0){
//             System.out.println("false");
//         }else{
//             System.out.println("true");
//         }
//     }
// }
//calculating distance 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         String str = "WNEENESENNN";
//         int x=0;
//         int y=0;
//         for(int i=0;i<str.length();i++){
//             if(str.charAt(i)=='N'){
//                 y++;
//             }else if(str.charAt(i)=='S'){
//                 y--;
//             }else if(str.charAt(i)=='W'){
//                 x--;
//             }else{
//                 x++;
//             }
//         }
//         System.out.println(Math.sqrt(Math.pow(x,2)+Math.pow(y,2)));
//     }
// }
//String function compare 
// usage of .substring method and equals method and more 
// q3 lexicographic
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         String s1 = "apple";
//         String s2 = "banana";
//         String s3 = "mango";
//         // int a=s1.length();
//         // int b=s2.length();
//         // int c=s3.length();
//         // int d=0;
//         // if(a>b&&a>c){
//         //     d=a;
//         // }else if(b>c){
//         //     d=b;
//         // }else{
//         //     d=c;
//         // }
//         // for(int i=0;i<d;i++){
//         //     if(s1.charAt(i)>s2.charAt(i)&&s1.charAt(i)>s3.charAt(i)){
//         //         System.out.println("s1 is largest ");
//         //         return;
//         //     }else if(s2.charAt(i)>s3.charAt(i)){
//         //         System.out.println("s2 is largest");
//         //         return;
//         //     }else{
//         //         System.out.println("s3 is largest");
//         //         return;
//         //     }
//         // }
//         // char c =s1.charAt(i);
//         if(s1.compareTo(s2)>0 && s2.compareTo(s3)>0){
//             System.out.println("S1 is greater ");
//         }else if(s2.compareTo(s3)>0){
//             System.out.println("S2 is greater");
//         }else {
//             System.out.println("S3 is greater");
//         }
//     }
// }
//why strings are immutable 
// string builder 
//q4 converting letter to upper case 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         String str = "Hello World I am here to make a great impact on the people ";
//         String s="";
//         for(int i=0;i<str.length();i++){
//             s+=Character.toUpperCase(str.charAt(i));
//         }
//         System.out.println(s);
//     }
// }
//String compression 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         String s = "ddddeeeesssjjjddddeeeeeksiek";
//         int c=0;
        // System.out.print(s.charAt(0));
        // for(int i=1;i<s.length();i++){
        //     if(s.charAt(i)==s.charAt(i-1)){
        //         c++;
        //     }else{
        //         c++;
        //         System.out.print(c);
        //         System.out.print(s.charAt(i));
        //         c=0;
        //         if(i==s.length()-1){
        //             c++;
        //             System.out.println(c);
        //         }
        //     }
        // }
        
        
//     }
// }
// import java.util.*;
// public class javabasics{
//     public static String cS(String str){
//         String s ="";
//         for(int i=0;i<str.length();i++){
//             Integer c=1;
//             while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
//                 c++;
//                 i++;
//             }
//             s+=str.charAt(i);
//             s+=c.toString();
//         }
//         return s;
//     }
//     public static void main(String args[]){
//         String str = "abcccddddddef";
//         System.out.println(cS(str));
//     }
// }
// hw
// q1
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         String s = sc.nextLine();
//         int d=0;
//         for(int i=0;i<s.length();i++){
//             char c= s.charAt(i);
//             if(s.charAt(i)=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
//                 d++;
//             }
//         }
//         System.out.println(d);
//     }
// }
// q2false,true
// q3 apnacoege
// q4 if two string are anagrams
// import java.util.*;
// public class javabasics{
//     public static void main (String args[]){
//         String s1 = "hear";
//         String s2 = "year";
//         int c=0,d=0;
//         boolean b=true;
//         if(s1.length()==s2.length()){
//         for(int i=0;i<s1.length();i++){
//             for(int j=0;j<s1.length();j++){
//                 if(s1.charAt(i)==s2.charAt(j)){
//                     c++;
//                 }
//                 if(s2.charAt(i)==s1.charAt(j)){
//                     d++;
//                 }
//             }
//             if(d==0||c==0){
//                 b=false;
//             }
//         }}else{
//             b=false;
//         }
//         System.out.println(b);
//     }
// }
// Alternate
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         String s1 = "earth";
//         String s2 = "heart";
//         s1=s1.toLowerCase();
//         s2=s2.toLowerCase();
//         if(s1.length()==s2.length()){
//             char s1arr[]=s1.toCharArray();
//             char s2arr[]=s2.toCharArray();
//             Arrays.sort(s1arr);
//             Arrays.sort(s2arr);
//             boolean res=Arrays.equals(s1arr,s2arr);
//             System.out.println(res);
//         }
//     }
// }
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         String s1="madam";
//         String s2 ="adamm";
//         s1=s1.toLowerCase();
//         s2=s2.toLowerCase();
//         char s1arr[]=s1.toCharArray();
//         char s2arr[]=s2.toCharArray();
//         Arrays.sort(s1arr);
//         Arrays.sort(s2arr);
//         System.out.println(Arrays.equals(s1arr,s2arr));
//     }
// }
// *******************************************************************************************************************************************************************
// super class = cellular phone 
// sub class smartphone 
// interface 1. wifi (take a list of available wifi)
// 2. camera(1. method for taking picture and 2. for making vedio)
// 3. browser()
// 4. calling (one for recieveing other for dialing
// )
// import java.util.*;
// public class javabasics{

//     private String name;

//     public javabasics(String name) {
//         this.name = name;
//     }

//     static class Prefixer {
//         private String prefix;

//         private Prefixer(String prefix) {
//             this.prefix = prefix;
//         }

//         public String getCompleteName(javabasics namer) {
//             return prefix + " " + namer.name;
//         }
//     }

//     public static void main(String[] args) {
//         javabasics namer = new javabasics("Doodle");
//         javabasics.Prefixer prefixer = new javabasics.Prefixer("Mr.");
//         System.out.println(prefixer.getCompleteName(namer));
//     }
// }
//Operating System 
//code for lock variable 
// class SimpleLock {
//     private boolean isLocked = false;

//     public synchronized void lock() throws InterruptedException {
//         while (isLocked) {
//             // If the lock is already taken, wait until it's released
//             wait();
//         }
//         isLocked = true;
//     }

//     public synchronized void unlock() {
//         isLocked = false;
//         // Notify a waiting thread that the lock is released
//         notify();
//     }
// }

// class MyThread extends Thread {
//     private SimpleLock lock;

//     public MyThread(SimpleLock lock) {
//         this.lock = lock;
//     }

//     public void run() {
//         try {
//             lock.lock();
//             // Critical section
//             System.out.println(Thread.currentThread().getName() + " is in the critical section");
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         } finally {
//             lock.unlock();
//         }
//     }
// }

// public class javabasics {
//     public static void main(String[] args) {
//         SimpleLock lock = new SimpleLock();

//         MyThread thread1 = new MyThread(lock);
//         MyThread thread2 = new MyThread(lock);

//         thread1.start();
//         thread2.start();
//     }
// }
//code for dekker's algorithm 
// class DekkerLock {
//     private boolean[] flag = new boolean[2];
//     private int turn = 0;

//     public void lock(int id) {
//         int other = 1 - id;
//         flag[id] = true;
//         while (flag[other]) {
//             if (turn == other) {
//                 flag[id] = false;
//                 while (turn == other) {
//                     // Busy-waiting until it's our turn
//                 }
//                 flag[id] = true;
//             }
//         }
//         flag[id]=false;
//     }

//     public void unlock(int id) {
//         int other = 1 - id;
//         turn = other;
//         flag[id] = false;
//     }
// }

// class Process implements Runnable {
//     private static DekkerLock dekkerLock = new DekkerLock();
//     private int id;

//     public Process(int id) {
//         this.id = id;
//     }

//     @Override
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             dekkerLock.lock(id);
//             try {
//                 System.out.println("Process " + id + " is in the critical section");
//                 // Simulate some work in the critical section
//                 Thread.sleep(100);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             } finally {
//                 dekkerLock.unlock(id);
//             }

//             // Simulate some non-critical section work
//             try {
//                 Thread.sleep(50);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// public class javabasics {
//     public static void main(String[] args) {
//         Thread process1 = new Thread(new Process(0));
//         Thread process2 = new Thread(new Process(1));

//         process1.start();
//         process2.start();
//     }
// }

//peterson's algorithm 
// class PetersonLock {
//     private boolean[] flag = new boolean[2];
//     private volatile int turn = 0;

//     public void lock(int id) {
//         int other = 1 - id;
//         flag[id] = true;
//         turn = other;
//         while (flag[other] && turn == other) {
//             // Busy-waiting until it's our turn
//         }
//     }

//     public void unlock(int id) {
//         flag[id] = false;
//     }
// }

// class Process implements Runnable {
//     private static PetersonLock petersonLock = new PetersonLock();
//     private int id;

//     public Process(int id) {
//         this.id = id;
//     }

//     @Override
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             petersonLock.lock(id);
//             try {
//                 System.out.println("Process " + id + " is in the critical section");
//                 // Simulate some work in the critical section
//                 Thread.sleep(100);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             } finally {
//                 petersonLock.unlock(id);
//             }

//             // Simulate some non-critical section work
//             try {
//                 Thread.sleep(50);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// public class javabasics {
//     public static void main(String[] args) {
//         Thread process1 = new Thread(new Process(0));
//         Thread process2 = new Thread(new Process(1));

//         process1.start();
//         process2.start();
//     }
// }

//semaphores 
// import java.util.concurrent.Semaphore;

// class SharedResource {
//     private Semaphore semaphore = new Semaphore(1); // Binary semaphore (mutex)

//     public void accessSharedResource() {
//         try {
//             semaphore.acquire(); // Wait (P operation)
//             // Critical section (access shared resource)
//             System.out.println(Thread.currentThread().getName() + " is accessing the shared resource");
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         } finally {
//             semaphore.release(); // Signal (V operation)
//         }
//     }
// }

// class MyThread extends Thread {
//     private SharedResource sharedResource;

//     public MyThread(SharedResource sharedResource) {
//         this.sharedResource = sharedResource;
//     }

//     @Override
//     public void run() {
//         sharedResource.accessSharedResource();
//     }
// }

// public class javabasics {
//     public static void main(String[] args) {
//         SharedResource sharedResource = new SharedResource();

//         Thread thread1 = new MyThread(sharedResource);
//         Thread thread2 = new MyThread(sharedResource);

//         thread1.start();
//         thread2.start();
//     }
// }
//prodcuer and consumer problem 
// import java.util.concurrent.ArrayBlockingQueue;
// import java.util.concurrent.BlockingQueue;

// class Buffer {
//     private BlockingQueue<Integer> buffer;

//     public Buffer(int capacity) {
//         this.buffer = new ArrayBlockingQueue<>(capacity);
//     }

//     public void produce(int item) throws InterruptedException {
//         buffer.put(item);
//     }

//     public int consume() throws InterruptedException {
//         return buffer.take();
//     }
// }

// class Producer implements Runnable {
//     private Buffer buffer;

//     public Producer(Buffer buffer) {
//         this.buffer = buffer;
//     }

//     @Override
//     public void run() {
//         try {
//             while (true) {
//                 int item = produceItem();
//                 buffer.produce(item);
//                 System.out.println("Produced: " + item);
//                 Thread.sleep(1000); // Simulating some production time
//             }
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//     }

//     private int produceItem() {
//         // Simulating the production of an item
//         return (int) (Math.random() * 100);
//     }
// }

// class Consumer implements Runnable {
//     private Buffer buffer;

//     public Consumer(Buffer buffer) {
//         this.buffer = buffer;
//     }

//     @Override
//     public void run() {
//         try {
//             while (true) {
//                 int item = buffer.consume();
//                 System.out.println("Consumed: " + item);
//                 Thread.sleep(1500); // Simulating some consumption time
//             }
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//     }
// }

// public class javabasics{
//     public static void main(String[] args) {
//         Buffer buffer = new Buffer(5); // Buffer with a capacity of 5

//         Thread producerThread = new Thread(new Producer(buffer));
//         Thread consumerThread = new Thread(new Consumer(buffer));

//         producerThread.start();
//         consumerThread.start();
//     }
// }

// reader writer 
// import java.util.concurrent.locks.ReadWriteLock;
// import java.util.concurrent.locks.ReentrantReadWriteLock;

// class SharedResource {
//     private int data = 0;
//     private ReadWriteLock lock = new ReentrantReadWriteLock();

//     public int readData() {
//         lock.readLock().lock();
//         try {
//             System.out.println(Thread.currentThread().getName() + " is reading data: " + data);
//             return data;
//         } finally {
//             lock.readLock().unlock();
//         }
//     }

//     public void writeData(int newData) {
//         lock.writeLock().lock();
//         try {
//             System.out.println(Thread.currentThread().getName() + " is writing data: " + newData);
//             data = newData;
//         } finally {
//             lock.writeLock().unlock();
//         }
//     }
// }

// class Reader implements Runnable {
//     private SharedResource sharedResource;

//     public Reader(SharedResource sharedResource) {
//         this.sharedResource = sharedResource;
//     }

//     @Override
//     public void run() {
//         while (true) {
//             int data = sharedResource.readData();
//             // Simulating some processing with the read data
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class Writer implements Runnable {
//     private SharedResource sharedResource;

//     public Writer(SharedResource sharedResource) {
//         this.sharedResource = sharedResource;
//     }

//     @Override
//     public void run() {
//         while (true) {
//             int newData = generateData();
//             sharedResource.writeData(newData);
//             // Simulating some processing after writing data
//             try {
//                 Thread.sleep(2000);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }

//     private int generateData() {
//         // Simulating the generation of new data
//         return (int) (Math.random() * 100);
//     }
// }

// public class javabasics {
//     public static void main(String[] args) {
//         SharedResource sharedResource = new SharedResource();

//         // Create multiple reader threads
//         for (int i = 0; i < 3; i++) {
//             Thread readerThread = new Thread(new Reader(sharedResource));
//             readerThread.start();
//         }

//         // Create multiple writer threads
//         for (int i = 0; i < 2; i++) {
//             Thread writerThread = new Thread(new Writer(sharedResource));
//             writerThread.start();
//         }
//     }
// }
//dining philosophers 
// import java.util.concurrent.ExecutorService;
// import java.util.concurrent.Executors;
// import java.util.concurrent.Semaphore;

// class DiningPhilosophers {
//     private Semaphore[] forks;
//     private Semaphore mutex;

//     public DiningPhilosophers(int numPhilosophers) {
//         forks = new Semaphore[numPhilosophers];
//         for (int i = 0; i < numPhilosophers; i++) {
//             forks[i] = new Semaphore(1); // Initialize each fork with a binary semaphore
//         }
//         mutex = new Semaphore(1); // Mutex for critical sections
//     }

//     public void takeForks(int philosopherId) throws InterruptedException {
//         mutex.acquire(); // Enter critical section
//         forks[philosopherId].acquire(); // Pick up the left fork
//         forks[(philosopherId + 1) % forks.length].acquire(); // Pick up the right fork
//         mutex.release(); // Exit critical section
//     }

//     public void releaseForks(int philosopherId) throws InterruptedException {
//         mutex.acquire(); // Enter critical section
//         forks[philosopherId].release(); // Put down the left fork
//         forks[(philosopherId + 1) % forks.length].release(); // Put down the right fork
//         mutex.release(); // Exit critical section
//     }

//     public void think(int philosopherId) throws InterruptedException {
//         System.out.println("Philosopher " + philosopherId + " is thinking.");
//         Thread.sleep(1000); // Simulating thinking
//     }

//     public void eat(int philosopherId) throws InterruptedException {
//         System.out.println("Philosopher " + philosopherId + " is eating.");
//         Thread.sleep(1500); // Simulating eating
//     }
// }

// class Philosopher implements Runnable {
//     private int id;
//     private DiningPhilosophers diningPhilosophers;

//     public Philosopher(int id, DiningPhilosophers diningPhilosophers) {
//         this.id = id;
//         this.diningPhilosophers = diningPhilosophers;
//     }

//     @Override
//     public void run() {
//         try {
//             while (true) {
//                 diningPhilosophers.think(id);
//                 diningPhilosophers.takeForks(id);
//                 diningPhilosophers.eat(id);
//                 diningPhilosophers.releaseForks(id);
//             }
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//     }
// }

// public class javabasics {
//     public static void main(String[] args) {
//         int numPhilosophers = 5;
//         DiningPhilosophers diningPhilosophers = new DiningPhilosophers(numPhilosophers);
//         ExecutorService executorService = Executors.newFixedThreadPool(numPhilosophers);

//         for (int i = 0; i < numPhilosophers; i++) {
//             Philosopher philosopher = new Philosopher(i, diningPhilosophers);
//             executorService.execute(philosopher);
//         }

//         // Uncomment the following line to allow the philosophers to continue indefinitely
//         // executorService.shutdown();
//     }
// }
//pattern matching bruteforce 
// public class javabasics {

//     public static int bruteForceStringMatch(String text, String pattern) {
//         int n = text.length();
//         int m = pattern.length();

//         for (int i = 0; i <= n - m; i++) {
//             int j = 0;
//             while (j < m && text.charAt(i + j) == pattern.charAt(j)) {
//                 j++;
//             }

//             if (j == m) {
//                 // Pattern found at position i in the text
//                 return i;
//             }
//         }

//         // Pattern not found in the text
//         return -1;
//     }

//     public static void main(String[] args) {
//         String text = "Hello, World!";
//         String pattern = "World";

//         int result = bruteForceStringMatch(text, pattern);

//         if (result != -1) {
//             System.out.println("Pattern found at position: " + result);
//         } else {
//             System.out.println("Pattern not found in the text.");
//         }
//     }
// }
// ***********************************************************************************************/
// 9/3/24
//2D ARRAYS
//Matrix multidimensional arrays 
//real life example photo and vedio 
//representation - rows and columns n*m
// import java.util.*;
// public class javabasics{
//     public static int smallestElement(int matrix[][]){
//         int min = Integer.MAX_VALUE;
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(matrix[i][j]<min){
//                     min=matrix[i][j];
//                 }
//             }
//         }
//         return min;
//     }
//     public static int largestElement(int matrix[][]){
//         int max = Integer.MIN_VALUE;
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(matrix[i][j]>max){
//                     max = matrix[i][j];
//                 }
//             }
//         }
//         return max;
//     }
//     public static boolean search (int matrix[][],int key){
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(matrix[i][j]==key){
//                     System.out.println("Found at cell ("+i+" , "+j+")");
//                     return true;
//                 }
//             }
//         }
//         System.out.println("key not found ");
//         return false;
//     }
//     public static void main(String args[]){
//         int matrix[][]=new int[3][3];
//         //total no of cells = row * column (3*3=9)
//         Scanner sc = new Scanner(System.in);
//         //data row wise input 
//         int n=matrix.length;
//         int m=matrix[0].length;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 matrix[i][j]=sc.nextInt();
//             }
//         }
//         // output
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//         System.out.println(search(matrix, 5));
//         System.out.println("Largest Element of the Matrix : "+largestElement(matrix));
//         System.out.println("Smallest Element of the Matrix : "+smallestElement(matrix));
//     }
// }
//2D Arrays in memory 
// 1d arrays are stored in contigious pattern 
//in 2d arrays there is concept of row major and column major 
// in java there is neither row major and column major 
// in java it is stored in independent arrays in contigious way(not compulsory) of same size but not address 
//spiral matrix 
// import java.util.*;
// public class javabasics{
//     public static void printSpiral(int matrix[][]){
//         int startRow = 0;
//         int startCol = 0;
//         int endRow = matrix.length-1;
//         int endCol = matrix[0].length-1;
//         while (startRow <= endRow && startCol <= endCol){
//             //top 
//             for(int j=startCol;j<=endCol;j++){
//                 System.out.print(matrix[startRow][j]+" ");;
//             }
//             //right 
//             for(int i=startRow+1;i<=endRow;i++){
//                 System.out.print(matrix[i][endCol]+" ");
//             }
//             //bottom 
//             for(int j=endCol-1;j>=startCol;j--){
//                 if(startRow==endRow){
//                     break;
//                 }
//                 System.out.print(matrix[endRow][j]+" ");
//             }
//             //left 
//             for(int i=endRow-1;i>=startRow+1;i--){
//                 if(startCol==endCol){
//                     break;
//                 }
//                 System.out.print(matrix[i][startCol]+" ");
//             }
//             endCol--;
//             endRow--;
//             startRow++;
//             startCol++;
//         }
//     }
//     public static void main(String args[]){
//         int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//         printSpiral(matrix);
//     }
// }
// import java.util.*;
// public class javabasics{
//     public static void spiralMatrix(int matrix[][]){
//         int sc = 0;
//         int sr = 0;
//         int ec = matrix[0].length-1;
//         int er = matrix.length-1;
//         while(sc<=ec && sr<=er){
//             //top 
//             for(int j=sc;j<=ec-1;j++){
//                 System.out.print(matrix[sr][j]+" ");
//             }
//             //right 
//             for(int i=sr;i<=er;i++){
//                 System.out.print(matrix[i][ec]+" ");
//             }
//             //bottom 
//             for(int j=ec-1;j>=sc;j--){
//                 if(sr==er){
//                     break;
//                 }
//                 System.out.print(matrix[er][j]+" ");
//             }
//             //left 
//             for(int i=er-1;i>=sr+1;i--){
//                 if(sc==ec){
//                     break;
//                 }
//                 System.out.print(matrix[i][sc]+" ");
//             }
//             sc++;
//             ec--;
//             sr++;
//             er--;
//         }
//     }
//     public static void main(String args[]){
//         int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//         spiralMatrix(matrix);
//     }
// }
//Diagonal Sum (n=m)(where n is even)(where n is odd)(O(n^2))
// import java.util.*;
// public class javabasics{
//     public static int diagonalSum(int matrix[][]){
//         int sump=0;
//         int sums=0;
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(i==j){
//                     sump+=matrix[i][j];
//                 }
//                 if((i+j)==matrix.length-1){
//                     sums+=matrix[i][j];
//                 }
//             }
//         }
//         if(matrix.length%2==0){
//             return sump+sums;
//         }else{
//             return sump+(sums-(matrix[matrix.length/2][matrix.length/2]));
//         }
//     }
//     public static void main(String args[]){
//         int matrix[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
//         // int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//         System.out.print(diagonalSum(matrix));
//     }
// }
// Diagonal sum if n is odd 
// import java.util.*;
// public class javabasics{
//     public static int diagonalSum(int matrix[][]){
//         int sums=0;
//         int sump=0;
//         int sumt=0;
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(i==j){
//                     sump+=matrix[i][j];
//                 }
//                 if((i+j)==matrix.length-1){
//                     sums+=matrix[i][j];
//                 }
//             }
//         }
//         sumt=sump+sums;
//         int a=matrix[matrix.length/2][matrix.length/2];
//         // return sump+(sums-matrix[matrix.length/2][matrix.length-2]);
//         return sumt-a;
//     }
//     public static void main(String args[]){
        // int matrix[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
//         System.out.print(diagonalSum(matrix));
//     }
// }
//diagonal sum O(n)
//fully optimized code 
// import java.util.*;
// public class javabasics{
//     public static int diagonalSum(int matrix[][]){
//         int sum=0;
//         for(int i=0;i<matrix.length;i++){
//             //pd
//             sum+=matrix[i][i];
//             //sd
//             if(i!=matrix.length-1-i){
//                 sum+=matrix[i][matrix.length-i-1];
//             }
//         }
//         return sum;
//     }
//     public static void main(String args[]){
//         // int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//         int matrix[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
//         System.out.println(diagonalSum(matrix));
//     }
// }
//Search in sorted matrix (row wise and col wise sorted )O(n^2)

// import java.util.*;
// public class javabasics{
//     public static boolean stairCaseSearch(int matrix[][],int key){//O(n+m)
//         int row = 0,col=matrix[0].length-1;
//         while(row<matrix.length && col>=0){
//             if(matrix[row][col]==key){
//                 System.out.println("Key found at index : "+row+" , "+col);
//                 return true;
//             }else if(key<matrix[row][col]){
//                 col--;
//             }else{
//                 row++;
//             }
//         }
//         System.out.println("Key not found ");
//         return false;
//     }
//     public static boolean binarySearch(int matrix[][],int key){//O(nlogn)
//         for(int i = 0;i<matrix.length;i++){

//          int low = 0;
//         int high  = matrix.length-1;
//         while(low<=high){
//             int mid = (low+high)/2;
//             int mide=matrix[i][mid];
//             if(mide==key){
//                 System.out.println("Key found at index : ("+i+" , "+mid+" )");
//                 return true;
//             }else if (mide<key){
//                 low = mid+1;
//             }else {
//                 high = mid-1;
//             }
//         }
//     }
//         return false;
//     }
//     public static boolean searchInSortedMatrix(int matrix[][],int key){
//         //brute force approach
//         int n=matrix.length;
//         int m=matrix[0].length;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(matrix[i][j]==key){
//                     System.out.println("Key found at ( "+ i+" , "+j+" )");
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
//         System.out.println(searchInSortedMatrix(matrix,33));
//         System.out.println(binarySearch(matrix, 33));
//         System.out.println(stairCaseSearch(matrix,33));
//     }
// }
//code for binary search 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int arr[]={2,10,20,40,50,90,120,230,345,2345};
//         int key = 20;
//         int start = 0;
//         int end = arr.length-1;
//         // System.out.println("fdsasdf");
//         while(start<end){
//             int mid = (start+end)/2;
//             if(arr[mid]==key){
//                 System.out.print("Key found at index "+mid);
//                 return;
//             }else if(key > arr[mid]){
//                 start=mid+1;
//             }else{
//                 end = mid-1;
//             }
//         }
//         System.out.println("key not found in array");
//     }
// }
//different codes for searching an element in sorted matrix
// import java.util.*;
// public class javabasics{
//     public static boolean SuitCaseB(int matrix[][],int key){//O(n+m) but taking the bottom left corner as start 
//         int row = matrix.length-1;
//         int col = 0;
//         while(col<matrix[0].length && row>=0){
//             if(matrix[row][col]==key){
//                 System.out.println("Key found at index ("+row+" , "+col+")");
//                 return true;
//             }else if(matrix[row][col]<key){
//                 col++;
//             }else{
//                 row--;
//             }
//         }
//         return false;
//     }
//     public static boolean SuitCase(int matrix[][],int key){//O(n+m) taking the starting point as top right corner
//         int row= 0 ;
//         int col = (matrix[0].length)-1;
//         while(row<matrix.length && col >=0){
//             if(matrix[row][col]==key){
//                 System.out.println("key found at index : ("+row+" , "+col+")");
//                 return true;
//             }else if(matrix[row][col]<key){
//                 row++;
//             }else{
//                 col--;
//             }
//         }
//         return false;
//     }
//     public static boolean BinarySearch(int matrix[][],int key){//O(nlogn)
//         for(int i=0;i<matrix.length;i++){
//             int s=0;
//             int e=matrix[0].length-1;
//             while(s<=e){
//                 int m=(s+e)/2;
//                 int me = matrix[i][m];
//                 if(me==key){
//                     System.out.println("Key found at index : ("+i+" , "+m+")");
//                     return true;
//                 }else if (me<key){
//                     e=m-1;
//                 }else{
//                     s=m+1;
//                 }
//             }
//         }
//         return false;
//     }
//     public static boolean BruteForce(int matrix[][],int key){//O(n^2)
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(matrix[i][j]==key){
//                     System.out.println("Key found at index :("+i+" , "+j+")");
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,49,50}};
//         int key = 33 ;
//         System.out.println(BruteForce(matrix,key));
//         System.out.println(BinarySearch(matrix,key));
//         System.out.println(SuitCase(matrix,key));
//         System.out.println(SuitCaseB(matrix,key));
//     }
// }
// HW
// q1 no of 7's in 2D array 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int matrix[][]={{4,7,8},{8,8,7}};
//         int key=7;
//         int c=0;
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(matrix[i][j]==key){
//                     c++;
//                 }
//             }
//         }
//         System.out.println(c);
//     }
// }
// q2 printing sum of no in second row of matrix
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int sum=0;
//         int matrix[][]={{1,4,9},{11,4,3},{2,2,3}};
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(i==1){
//                     sum+=matrix[i][j];
//                 }
//             }
//         }
//         System.out.println(sum);
//     }
// }
//q3 program to find transpose of a matrix 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int matrix[][]={{1,2,3},{4,5,6}};
//         int tMatrix[][]=new int[matrix[0].length][matrix.length];
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 tMatrix[j][i]=matrix[i][j];
//             }
//         }
//         for(int i=0;i<matrix[0].length;i++){
//             for(int j=0;j<matrix.length;j++){
//                 System.out.print(tMatrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }
// ***********************************************************************************
// class javabasics {
//     public void setZeroes(int[][] matrix) {
//         boolean fr = false,fc=false;
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(matrix[i][j]==0){
//                     if(i==0) fr=true;
//                     if(j==0) fc=true;
//                     matrix[0][j]=0;
//                     matrix[i][0]=0;
//                 }
//             }
//         }
//         for(int i=1;i<matrix.length;i++){
//             for(int j=1;j<matrix[0].length;j++){
//                 if(matrix[i][0]==0||matrix[0][j]==0){
//                     matrix[i][j]=0;
//                 }
//             }
//         }
//         if(fr){
//             for(int j=0;j<matrix[0].length;j++){
//                 matrix[0][j]=0;
//             }
//         }
//         if(fc){
//             for(int i=0;i<matrix.length;i++){
//                 matrix[i][0]=0;
//             }
//         }
//     }
// }
//zig - zag pattern 
// import java.util.*;
// public class javabasics{
//     public static void zigZagTraversal(int matrix[][]){
//         int r = matrix.length;
//         int c = matrix[0].length;
//         for(int i=1;i<=(r+c-1);i++){
//             int sc =Math.max(0,i-r);
//             int d=Math.min(r,i);
//             int count=Math.min(d,(c-sc));
//             for(int j=0;j<count;j++){
//                 System.out.print(matrix[d-j-1][sc+j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//         zigZagTraversal(matrix);
//     }
// }
// ***********************************************************************************************************************************************************
// 10/3/24
//revision of 2d array 
// import java.util.*;
// public class javabasics{
//         public static int Small(int matrix[][]){
//                 int min = Integer.MAX_VALUE;
//                 for(int i=0;i<matrix.length;i++){
//                         for(int j=0;j<matrix[0].length;j++){
//                                 if(min>matrix[i][j]){
//                                         min=matrix[i][j];
//                                 }
//                         }
//                 }
//                 return min;
//         }
//         public static int Large(int matrix[][]){
//                 int max=Integer.MIN_VALUE;
//                 for(int i=0;i<matrix.length;i++){
//                         for(int j=0;j<matrix[0].length;j++){
//                                 if(max<matrix[i][j]){
//                                         max=matrix[i][j];
//                                 }
//                         }
//                 }
//                 return max;
//         }
//         public static boolean Search(int matrix[][],int key){
//                 for(int i=0;i<matrix.length;i++){
//                         for(int j=0;j<matrix[0].length;j++){
//                                 if(matrix[i][j]==key){
//                                         return true;
//                                 }
//                         }
//                 }
//                 return false;
//         }
//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);
//                 int matrix[][] = new int[3][3];
//                 for(int i=0;i<matrix.length;i++){
//                         for(int j=0;j<matrix[0].length;j++){
//                                 matrix[i][j]=sc.nextInt();
//                         }
//                 }
//                 for(int i=0;i<matrix.length;i++){
//                         for(int j=0;j<matrix[0].length;j++){
//                                 System.out.print(matrix[i][j]+" ");
//                         }
//                         System.out.println();
//                 }
//                 System.out.println(Small(matrix));
//                 System.out.println(Large(matrix));
//                 System.out.println(Search(matrix,5));
//         }
// }
//Spiral Matrix 
// import java.util.*;
// public class javabasics{
//         public static void main(String args[]){
//                 int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//                 int sc = 0;
//                 int ec = matrix[0].length-1;
//                 int sr = 0;
//                 int er = matrix.length-1;
//                 while(sc<=ec && sr<=er){
//                         //top 
//                         for(int j=sc;j<=ec;j++){
//                                 System.out.print(matrix[sr][j]+" ");
//                         }
//                         //right 
//                         for(int i=sr+1;i<=er;i++){
//                                 System.out.print(matrix[i][ec]+" ");
//                         }
//                         //bottom 
//                         for(int j=ec-1;j>=sc;j--){
//                                 System.out.print(matrix[er][j]+" ");
//                         }
//                         //left
//                         for(int i=er-1;i>=sr+1;i--){
//                                 System.out.print(matrix[i][sc]+" ");
//                         }
//                         sr++;
//                         sc++;
//                         er--;
//                         ec--;
//                 }
//         }
// }
// Diagonal matrix O(n^2) & O(n)
// import java.util.*;
// public class javabasics{
//         public static int diagonalSum(int matrix[][]){//O(n^2)
//                 int sump=0;
//                 int sums=0;
//                 for(int i=0;i<matrix.length;i++){
//                         for(int j=0;j<matrix[0].length;j++){
//                                 if(i==j){
//                                         sump+=matrix[i][j];
//                                 }
//                                 if((i+j)==matrix.length-1){
//                                         sums+=matrix[i][j];
//                                 }
//                         }
//                 }
//                 int tesum = sump+sums;
//                 int tosum = sump+sums-matrix[matrix.length/2][matrix.length/2];
//                 if(matrix.length%2==0){
//                         return tesum;
//                 }
//                 return tosum;
//         }
//         public static int diagonalSuml(int matrix[][]){//O(n)
//                 int sump=0;
//                 int sums=0;
//                 for(int i=0;i<matrix.length;i++){
//                         sump+=matrix[i][i];
//                         sums+=matrix[i][matrix.length-1-i];
//                 }
//                 int sumo=sump+sums-matrix[matrix.length/2][matrix.length/2];
//                 int sume=sump+sums;
//                 if(matrix.length%2==0){
//                         return sume;
//                 }
//                 return sumo;
//         }
//         public static void main(String args[]){
//                 // int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//                 int matrix[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
//                 System.out.print(diagonalSum(matrix));
//                 System.out.print(diagonalSuml(matrix));
//         }
// }
//Search in rotated sorted matrix 
// import java.util.*;
// public class javabasics{
//         public static boolean BruteForce(int matrix[][],int key){
//                 for(int i=0;i<matrix.length;i++){
//                         for(int j=0;j<matrix[0].length;j++){
//                                 if(matrix[i][j]==key){
//                                         System.out.println("Key found at index : "+i+" , "+j);
//                                         return true;
//                                 }
//                         }
//                 }
//                 return false;
//         }
//         public static boolean BinarySearch(int matrix[][],int key){
//                 for(int i=0;i<matrix.length;i++){
//                         int start = 0;
//                         int end = matrix[0].length-1;
//                         while(start<=end){
//                                 int mid = (start+end)/2;
//                                 int mide = matrix[i][mid];
//                                 if(mide==key){
//                                         System.out.println("Key found at index : "+i+" , "+mid);
//                                         return true;
//                                 }else if(mide<key){
//                                         start=mid+1;
//                                 }else{
//                                         end=mid-1;
//                                 }
//                         }
//                 }
//                 return false;
//         }
//         public static boolean SuitCaseApproachUp(int matrix[][],int key){
//                 int sr=0;
//                 int er = matrix.length-1;
//                 int sc=matrix[0].length-1;
//                 while(sr<=er && sc>=0){
//                         if(matrix[sr][sc]==key){
//                                 System.out.println("Key found at index: "+sr+" , "+sc);
//                                 return true;
//                         }else if(matrix[sr][sc]<key){
//                                 sr++;
//                         }else{
//                                 sc--;
//                         }
//                 }
//                 return false;
//         }
//         public static boolean SuitCaseApproachDown(int matrix[][],int key){
//                 int sc=0;
//                 int sr = matrix.length-1;
//                 int er = 0;
//                 int ec = matrix[0].length-1;
//                 while(sr>=0 && sc<=ec){
//                         if(matrix[sr][sc]==key){
//                                 System.out.println("Key found at index : "+sr+" , "+sc);
//                                 return true;
//                         }else if(matrix[sr][sc]<key){
//                                 sc++;
//                         }else{
//                                 sr--;
//                         }
//                 }
//                 return false;
//         }
//         public static void main(String args[]){
//                 int matrix[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
//                 System.out.println(BruteForce(matrix,18));//O(n^2)
//                 System.out.println(BinarySearch(matrix,13));//O(nlogn)
//                 System.out.println(SuitCaseApproachUp(matrix,25));//O(matrix.length+matrix[0].length)||O(m+n)
//                 System.out.println(SuitCaseApproachDown(matrix,2));
//         }
// }
// ************************************************************************************************************************************
// 11/3/24 
// Sorting algorithms
//Bubble Sort 
// import java.util.*;
// public class javabasics{
// public static void bubbleSort(int arr[]){
//         for(int i=0;i<arr.length-1;i++){
//                 for(int j=0;j<arr.length-i-1;j++){
//                         if(arr[j]>arr[j+1]){
//                                 int temp=arr[j];
//                                 arr[j]=arr[j+1];
//                                 arr[j+1]=temp;
//                         }
//                 }
//         }
// }
// public static void printArr(int arr[]){

//         for(int i=0;i<arr.length;i++){
//                 System.out.print(arr[i]+" ");
//         }
// }
// public static void selectionSort(int arr[]){
//         for(int i=0;i<arr.length-1;i++){
//                 int min = i;
//                 for(int j=i+1;j<arr.length-1;j++){
//                 if(arr[min]>arr[j]){
//                                 min=j;
//                         }
//                 }
//                 // swap
//                 int temp = arr[min];
//                 arr[min]=arr[i];
//                 arr[i]=temp;
//         }
// }
// public static void insertionSort(int arr[]){
//         for(int i=1;i<arr.length;i++){
//                 int curr=arr[i];
//                 int prev=i-1;
//                 // finding out the correct position to insert
//                 while(prev>=0 && arr[prev]>curr){
//                         arr[prev+1]=arr[prev];
//                         prev--;
//                 }
//                 //insertion
//                 arr[prev+1]=curr;
//         }
// }
//         public static void main(String args[]){
//                 int arr[]={5,4,1,3,2};
//                 // bubbleSort(arr);
//                 // printArr(arr);
//                 // selectionSort(arr);
//                 // printArr(arr);
//                 insertionSort(arr);
//                 printArr(arr);
//         }
// }
//inbuilt sort 
// import java.util.*;
// public class javabasics{
//         public static void main(String args[]){
//                 int arr[]={5,4,3,1,2,7};
//                 Arrays.sort(arr,0,3);
//                 for(int i=0;i<arr.length;i++){
//                         System.out.print(arr[i]+" ");
//                 }
//                 System.out.println();
//                 Arrays.sort(arr);
//                 for(int i=0;i<arr.length;i++){
//                         System.out.print(arr[i]+" ");
//                 }
//                 System.out.println();
//                 //Arrays.sort(arr,Collections.reverseOrder());//it works with Integer not with int 
                
//         }
// }
//Counting Sort 
// import java.util.*;
// public class javabasics{
// public static void countingSort(int arr[]){
//         int largest = Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//                 largest = Math.max(largest,arr[i]);
//         }
//         int count[]=new int[largest+1];
//         for(int i=0;i<arr.length;i++){
//                 count[arr[i]]++;
//         }
//         //sorting 
//         int j=0;
//         for(int i=0;i<count.length;i++){
//                 while(count[i]>0){
//                         arr[j]=i;
//                         j++;
//                         count[i]--;
//                 }
//         }
// }
// public static void printArr(int arr[]){
// for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i]+" ");
// }}
//         public static void main(String args[]){
//                 int arr[]={5,4,1,3,2};
//                 countingSort(arr);
//                 printArr(arr);
//         }
// }
// import java.util.*;
// public class javabasics{
//         public static void bubbleSort(int arr[]){
//                 for(int i=0;i<arr.length-1;i++){
//                         for(int j=0;j<arr.length-i-1;j++){
//                                 if(arr[j]>arr[j+1]){
//                                         int temp = arr[j];
//                                         arr[j]=arr[j+1];
//                                         arr[j+1]=temp;
//                                 }
//                         }
//                 }
//         }
//         public static void printArr(int arr[]){
//                 for(int i=0;i<arr.length;i++){
//                         System.out.print(arr[i]+" ");
//                 }
//         }
//         public static void selectionSort(int arr[]){
//                 for(int i=0;i<arr.length-1;i++){
//                         int min = i;
//                         for(int j=i+1;j<arr.length-1;j++){
//                                 if(arr[min]>arr[j]){
//                                         min=j;
//                                 }
//                         }
//                         int temp = arr[min];
//                         arr[min]=arr[i];
//                         arr[i]=temp;
//                 }
//         }
//         public static void insertionSort(int arr[]){
//                 for(int i=0;i<arr.length-1;i++){
//                         int curr=arr[i];
//                         int prev=i-1;
//                         while(prev>=0&&arr[prev]>curr){
//                                 arr[prev+1]=arr[prev];
//                                 prev--;
//                         }
//                         arr[prev+1]=curr;
//                 }
//         }
//         public static void countingSort(int arr[]){
//                 int max= Integer.MIN_VALUE;
//                 for(int i=0;i<arr.length;i++){
//                         max= Math.max(max,arr[i]);
//                 }
//                 int ar[]  = new int[max+1];
//                 for(int i=0;i<arr.length;i++){
//                         ar[arr[i]]++;
//                 }
//                 int j=0;
//                 for(int i=0;i<ar.length;i++){
//                         while(ar[i]>0){
//                                 arr[j]=i;
//                                 j++;
//                                 ar[i]--;
//                         }
//                 }
//         }
//         public static void main(String args[]){
//                 int arr[]={5,4,2,3,1,7};
//                 // bubbleSort(arr);
//                 // selectionSort(arr);
//                 // insertionSort(arr);
//                 countingSort(arr);
//                 printArr(arr);
//         }
// }
// **************************************************************************************************************************************
// 12/3/24
// Hw and revision sorting 
// import java.util.*;
// public class javabasics{
//         public static void BubbleSort(int arr[]){
//                 for(int i=0;i<arr.length;i++){
//                         for(int j=0;j<arr.length-1;j++){
//                                 if(arr[j]>arr[j+1]){
//                                         int temp =arr[j];
//                                         arr[j]=arr[j+1];
//                                         arr[j+1]=temp;
//                                 }
//                         }
//                 }
//         }
//         public static void printArr(int arr[]){
//                 for(int i=0;i<arr.length;i++){
//                         System.out.print(arr[i]+" ");
//                 }
//         }
//         public static void SelectionSort(int arr[]){
//                 for(int i=0;i<arr.length;i++){
//                         int min = i;
//                         for(int j=i+1;j<arr.length;j++){
//                                 if(arr[j]<arr[min]){
//                                         min=j;
//                                 }
//                         }
//                         // System.out.print(min+" ");
//                         // System.out.println();
//                         int temp = arr[min];
//                         arr[min]=arr[i];
//                         arr[i]=temp;
//                 }
//         }
//         public static void insertionSort(int arr[]){
//                 for(int i=0;i<arr.length;i++){
//                         int curr=arr[i];
//                         int prev = i-1;
//                         // for(int j=i+1;j<arr.length-1;j++){

//                                 while(prev>=0 && curr<arr[prev]){
//                                         arr[prev+1]=arr[prev];
//                                         prev--;
//                                 }
//                                 arr[prev+1]=curr;
//                         // }
//                 }
//         }
//         public static void countingSort(int arr[]){
//                 int max=Integer.MIN_VALUE;
//                 for(int i=0;i<arr.length;i++){
//                         max=Math.max(arr[i],max);
//                 }
//                 int count[] = new int[max+1];
//                 for(int i=0;i<arr.length;i++){
//                         count[arr[i]]++;
//                 }
//                 int j=0;
//                 for(int i=0;i<count.length;i++){
//                         while(count[i]>0){
//                                 arr[j]=i;
//                                 j++;
//                                 count[i]--;
//                         }
//                 }
//         }
//         public static void main(String args[]){
//                 int arr[]={3,6,2,1,8,7,4,5,3,1};
//                 // BubbleSort(arr);
//                 // SelectionSort(arr);
//                 // insertionSort(arr);
//                 // countingSort(arr);
//                 printArr(arr);
//         }
// }
// import java.util.*;
// public class javabasics{
//         public static void printArr(int arr[]){
//                 for(int i=0;i<arr.length;i++){
//                         System.out.print(arr[i]+" ");
//                 }
//         }
//         public static void BubbleSort(int arr[]){
//                 for(int i=0;i<arr.length;i++){
//                         for(int j=0;j<arr.length-1;j++){
//                                 if(arr[j]>arr[j+1]){
//                                         int temp =arr[j];
//                                         arr[j]=arr[j+1];
//                                         arr[j+1]=temp;
//                                 }
//                         }
//                 }
//         }
//         public static void SelectionSort(int arr[]){
//                 for(int i=0;i<arr.length;i++){
//                         int min = i;
//                         for(int j=i+1;j<arr.length;j++){
//                                 if(arr[min]>arr[j]){
//                                         min=j;
//                                 }
//                         }
//                         int temp = arr[min];
//                         arr[min]=arr[i];
//                         arr[i]=temp;
//                 }
//         }
//         public static void InsertionSort(int arr[]){
//                 for(int i=0;i<arr.length;i++){
//                         int curr= arr[i];
//                         int prev= i-1;
//                         while(prev>=0 && curr<arr[prev]){
//                                 arr[prev+1]=arr[prev];
//                                 prev--;
//                         }
//                         arr[prev+1]=curr;
//                 }
//         }
//         public static void CountingSort(int arr[]){
//                 int max= Integer.MIN_VALUE;
//                 for(int i=0;i<arr.length;i++){
//                         max=Math.max(max,arr[i]);
//                 }
//                 int count[] = new int[max+1];
//                 for(int i=0;i<arr.length;i++){
//                         count[arr[i]]++;
//                 }
//                 int j=0;
//                 for(int i=0;i<count.length;i++){
//                         while(count[i]>0){
//                                 arr[j]=i;
//                                 j++;
//                                 count[i]--;
//                         }
//                 }
//         }
//         public static void main(String args[]){
//                 int arr[]={10,30,20,60,50,70,40};
//                 BubbleSort(arr);
//                 // SelectionSort(arr);
//                 // InsertionSort(arr);
//                 // CountingSort(arr);
//                 printArr(arr);
//         }
// }
// ********************************************************************************************************************************************
// 12/3/24 RECURSION
//recursion = f(x)=x^2
// f(f(x))=(x^2)^2
// x=2;
// f(x)=4;
// f(f(x))=16;
//factorials = f(n)=n*f(n-1)
// (n-1)*f(n-2);
//(n-2)*f(n-3)......................1;
//f(5)=5*f(4)...4*f(3)....3*f(2)....2*f(1).....1*f(0)=120
// in each step we bring out smaller problem but similar problem 
// 5! -> 4! ->3! ->2! (recursive function = which calls itsels for solving the problem)
// we must know the base case in the recursion ==base case is the one where recursion ends or the base case is the part of recusion which knows answer .
//recursion is a method of solving a computational problem where the solution depends on solution to smaller instances of same problem
//recursion makes a flow 
// 2 directions 1. top to down (towards base case )
// 2. down to up (combining the solutions for final soln)
// (main function -> func )
// (main function -> recfunc ->recfunc ->recfunc ->recfunc (base case )then return back with specific value  )
// 1. Base case is must 
// 2. kaam kya karna hai 
// 3. calling inner function 
// q1 print no's from n to 1 (Decreasing order)(recursion)
// import java.util.*;
// public class javabasics{
//         public static void printDec(int n){
//                 if(n==1){//base case 
//                         System.out.println(n);
//                         return;
//                 }
//                 System.out.print(n+" ");
//                 printDec(n-1);//calling function itself 
//         }
//         public static void main(String args[]){
//                 int n = 10 ; 
//                 printDec(n);
//         }
// }
// call stack 
// printDec n=1 1(base case)return (n==1)  while returning each call one by one get removed by itself 
// printDec n=2 2                                                                                    
// printDec n=3 3 
// printDec n=4 4 
// printDec n=5 5
// printDec n=6 6 
// printDec n=7 7 
// printDec n=8 8 
// printDec n=9 9 
// printDec n=10 10 
// main     n=10                  while return reach main but we have print the dec no from n to 1
// main to base case (stack up)
// base case to min (stack down)
//Stack Overflow 
// 1. lot of parameters with high Memory
// 2. too many recursive calls 
// these two situtations lead to stack overflow 
// that's why base case is necessary to stop the flow 
// q2 print numbers from n to 1 (increasing order)
// import java.util.*;
// public class javabasics{
//         public static void printInc(int n){
//                 if(n==1){
//                         System.out.print(n+" ");
//                         return ;
//                 }
//                 printInc(n-1);
//                 System.out.print(n+" ");
//         }
//         public static void main(String args[]){
//                 int n = 5;
//                 printInc(n);
//         }
// }
//call stack 
// printInc(1)n-1 (base case n==1 while returning printing the values and above call frames will be removed ) print 1
// printInc(2)n-1         print 2
// printInc(3)n-1         print 3
// printInc(4)n-1         print 4 
// printInc(5)n           print 5 
// main(5)n
// q3 print factorial on no n 
// import java.util.*;
// public class javabasics{
//         public static int factorial(int n){
//                 if(n==0){
//                         return 1;
//                 }
//                 int fnm1=factorial(n-1);
//                 int fn = n*fnm1;
//                 return fn;
//         }
//         public static void main(String args[]){
//                 int n=5;
//                 System.out.println(factorial(n));
//         }
// }
// q4 print sum of 1st n natural no's 
// import java.util.*;
// public class javabasics{
//         public static int Sum(int n){
//                 if(n==0){
//                         return 0;
//                 }
//                 int snm1 = Sum(n-1);
//                 int sn = n+snm1;
//                 return sn;
//         }
//         public static void main(String args[]){
//                 int n=0;
//                 System.out.println(Sum(n));
//         }
// }
//stack analysis
// q5 print nth fibonacci no 
// import java.util.*;
// public class javabasics{
//         public static int fiboNo(int n){
//                 if(n==0){
//                      return 0;
//                 }
//                 if(n==1){
//                      return 1;
//                 }
//                 int fn = fiboNo(n-1)+fiboNo(n-2);
//                 return fn;
//         }
//         public static void main(String args[]){
//                 int n=10;
//                 System.out.println(fiboNo(n));
//         }
// }
//single recursion call no tree formed O(n)space
// double recusion call tree formed O(2^n)space
// q6 check if array is sorted or not (ascending order )
// import java.util.*; //tc O(n)  sc O(n)
// public class javabasics{
//         public static boolean SortedArray(int arr[],int i){
//                 if(i==arr.length-1){
//                         return true;
//                 }
//                 if(arr[i]>arr[i+1]){
//                         return false;
//                 }
//                 return SortedArray(arr,i+1);
//         }
//         public static void main(String args[]){
//                 int arr[]={5,6};
//                 System.out.println(SortedArray(arr,0));

//         }
// }
//q7 waf to find the first occurence of element in array 
// import java.util.*;
// public class javabasics{
//         public static int firstOccurence(int arr[],int key,int i){
//                 if(arr[i]==key){
//                         return i;
//                 }
//                 if(i==arr.length-1){
//                         return -1;
//                 }
//                 return firstOccurence(arr,key,i+1);
//         }
//         public static void main(String args[]){
//                 int arr[]={8,3,6,9,5,10,2,5,3};
//                 System.out.println(firstOccurence(arr, 7, 0));
//         }
// }
// q8 waf to find the last occurrence of an element in an array
// import java.util.*;
// public class javabasics{
//         public static int lastOccurrence(int arr[],int key,int i){
//                 if(arr[i]==key){
//                         return i;
//                 }
//                 if(i==0){
//                         return -1;
//                 }
//                 return lastOccurrence(arr, key, i-1);
//         }
//         public static void main(String args[]){
//                 int arr[]={8,3,6,9,5,10,2,5,3};
//                 System.out.println(lastOccurrence(arr,5,arr.length-1));
//         }
// }
//lookforward then compare self
// import java.util.*;
// public class javabasics{
//         public static int lastOcc(int arr[],int key,int i){
//                 if(i==arr.length){
//                         return -1;
//                 }
//                 int isFound = lastOcc(arr,key,i+1);
//                 if(isFound!=-1){
//                         return isFound;
//                 }
//                 //check with self 
//                 if(arr[i]==key){
//                         return i;
//                 }
//                 return isFound;
//         }
//         public static void main(String args[]){
//                 int arr[]={8,3,6,9,5,10,2,5,3,5,5,5,5};
//                 System.out.println(lastOcc(arr,5,0));
//         }
// }
// q9 print x^n O(n)
// import java.util.*;
// public class javabasics{
//         public static int xpown(int x,int n){
//                 if(n==0){
//                         return 1;
//                 }
//                 int pow = x*xpown(x,n-1);
//                 return pow;
//         }
//         public static void main(String args[]){
//                 int x = 2;
//                 int n = 10 ; 
//                 System.out.println(xpown(x,n));
//         }
// }
// q10 optimized x^n O(logn)
// import java.util.*;
// public class javabasics{
//         public static int optPower(int a,int n){// still O(n) until we removed one calling to optpower with a variable 
//                 if(n==0){
//                         return 1;
//                 }
//                 int hp = optPower(a,n/2);
//                 // int hps=optPower(a,n/2)*optPower(a,n/2);
//                 int hps = hp*hp;
//                 if(n%2!=0){
//                         hps=a*hps;
//                 }
//                 return hps;
//         }
//         public static void main(String args[]){
//                 int a=2;
//                 int n=10;
//                 System.out.println(optPower(a,n));

//         }
// }
// rev
// import java.util.*;
// public class javabasics{
//         public static void printDec(int n){
//                 if(n==0){
//                         return ;
//                 }
//                 System.out.print(n+" ");
//                 printDec(n-1);
//         }
//         public static void printInc(int n){
//                 if(n==0){
//                         return ;
//                 }
//                 printInc(n-1);
//                 System.out.print(n+" ");
//         }
//         public static int factorial(int n){
//                 if(n==0||n==1){
//                         return 1;
//                 }
//                 int fact = n*factorial(n-1);
//                 return fact ;
//         }
//         public static int SumOfNos(int n){
//                 if(n==0){
//                         return 0;
//                 }
//                 if(n==1){
//                         return 1;
//                 }
//                 int sum = n+SumOfNos(n-1);
//                 return sum;
//         }
//         public static int FiboNo(int n){
//                 if(n==0){
//                         return 0;
//                 }
//                 if(n==1){
//                         return 1;
//                 }
//                 int fib = FiboNo(n-1)+FiboNo(n-2);
//                 return fib;
//         }
//         public static int FirstOcc(int arr[],int key,int i){
//                 if(arr[i]==key){
//                         return i;
//                 }
//                 if(i==arr.length){
//                         return -1;
//                 }
//                 return FirstOcc(arr,key,i+1);
//         }
//         public static int LastOcc(int arr[],int key,int i){
//                 if(i==arr.length){
//                         return -1;
//                 }
//                 int isFound = LastOcc(arr,key,i+1);
//                 if(isFound == -1 && arr[i]==key){
//                         return i;
//                 }
//                 // if(isFound!=-1){
//                 //         return isFound;
//                 // }
//                 // if(arr[i]==key){
//                 //         return i;
//                 // }
//                 return isFound;
                
//         }
//         public static boolean isSorted(int arr1[],int i){
//                 if(i==arr1.length-1){
//                         return true;
//                 }
//                 if(arr1[i]>arr1[i+1]){
//                         return false;
//                 }
//                 return isSorted(arr1,i+1);
//         }
//         public static int xpn(int x,int n){
//                 if(n==0){
//                         return 1;
//                 }
//                 int p = x*xpn(x,n-1);
//                 return p;
//         }
//         public static int oxpn(int x,int n){
//                 if(n==0){
//                         return 1;
//                 }
//                 int hps = oxpn(x,n/2);
//                 int p=1;
//                 if(n%2==0){
//                          p = hps*hps;
//                 }else{
//                         p=x*hps*hps;
//                 }
//                 return p;
//         }
//         public static void main(String args[]){
//                 int n=10;
//                 printDec(n);
//                 System.out.println();
//                 printInc(n);
//                 System.out.println();
//                 System.out.println(factorial(5));
//                 System.out.println(SumOfNos(5));
//                 System.out.println(FiboNo(5));
//                 int arr[]={3,4,2,5,32,5,32,5,32,20,3,4};
//                 int key = 32;
//                 System.out.println(FirstOcc(arr,key,0));
//                 System.out.println(LastOcc(arr,key,0));
//                 int arr1[]={1,2,3,4,5};
//                 System.out.println(isSorted(arr1,0));
//                 int x=2;
//                 // int n=10;
//                 System.out.println(xpn(x,n));
//                 System.out.println(oxpn(x,n));
//         }
// }
// q11 Tiling Problem
// import java.util.*;
// public class javabasics{
//         public static int tilingProb(int n){
//                 //base
//                 if(n==0||n==1){
//                         return 1;
//                 }
//                 //kaam
//                 //vertical choice 
//                 int vertile = tilingProb(n-1);
//                 //horizontal choice 
//                 int hotile = tilingProb(n-2);
//                 int totWays=vertile+hotile;
//                 return totWays;
//         }
//         public static void main(String args[]){
//                 System.out.println(tilingProb(4));
//         }
// }
// q12 remove duplicates in string (a-z orA-Z)
// import java.util.*;
// public class javabasics{
//         public static String removeDuplicates(String str){
//                 boolean arr[] = new boolean[26];
//                 StringBuilder sb =new StringBuilder("");
//                 for(int i=0;i<str.length();i++){
//                         arr[str.charAt(i)-'a']=true;
//                 }
//                 for(int i=0;i<arr.length;i++){
//                         if(arr[i]==true){
//                                 sb.append((char)(i+'a'));
//                         }
//                 }
//                 return sb.toString();
//         }
//         public static void main(String args[]){
//                 String str = "appnnacollege";
//                 System.out.println(removeDuplicates(str));
//         }
// }
// *******************************************************************************************
// 13/3/24 Recursion
// q12 remove duplicates from string 
//code without recursion
// import java.util.*;
// public class javabasics{
//         public static String removeDuplicates(String str){
//                 int n=str.length();
//                 StringBuilder sb = new StringBuilder("");
//                 boolean track[] = new boolean[26];
//                 for(int i=0;i<str.length();i++){
//                         if(track[(str.charAt(i)-'a')]!=true){
//                                 sb.append(str.charAt(i));
//                                 track[(str.charAt(i)-'a')]=true;
//                         }
//                 }
//                 return sb.toString();
//         }
//         public static void main(String args[]){
//                 String str = "appnnacollege";
//                 System.out.println(removeDuplicates(str));
//         }
// }
//code with recursion 
// import java.util.*;
// public class javabasics{
// public static void removeDuplicates(String str,int i,StringBuilder sb,boolean track[]){
//         //base case
//         if(i==str.length()){
//                 System.out.println(sb);
//                 return;
//         }
//         //kaam
//         char currChar = str.charAt(i);
//         if(track[currChar-'a']==true){
//                 removeDuplicates(str,i+1,sb,track);
//         }else{
//                 track[currChar-'a']=true;
//                 removeDuplicates(str,i+1,sb.append(currChar),track);
//         }
// }
//         public static void main(String args[]){
//                 String str = "appnnacollege";
//                 removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
//         }
// }
//q13 Friends pairing problem 
// import java.util.*;
// public class javabasics{
//         public static int friendsPairing(int n){
//                 //base case 
//                 if(n==1 || n==2){
//                         return n;
//                 }
//                 //choice 
//                 //single 
//                 int fnm1 = friendsPairing(n-1);
//                 //pair
//                 int fnm2 = friendsPairing(n-2);
//                 int pairWays = (n-1)*fnm2;
//                 int totWays= fnm1 + pairWays;
//                 //short sol=>
//                 // int totWays = friendsPairing(n-1)+((n-1)*friendsPairing(n-2));
//                 return totWays;
//         }
//         public static void main(String args[]){
//                 int n=3;
//                 System.out.println(friendsPairing(n));
//         }
// }
// q14 Print all binary Strings of size n without consecutive ones . 
// import java.util.*;
// public  class javabasics{
//         public static void printBinStrings(int n,int lastPlace,String str){
//                 //base case 
//                 if(n==0){
//                         System.out.println(str);
//                         return;
//                 }
//                 //kaam
//                 // if(lastPlace == 0){
//                 //         //sit 0 on chair n
//                 //         printBinStrings(n-1,0,str.append("0"));
//                 //         printBinStrings(n-1,1,str.append("1"));
//                 // }else{
//                 //         printBinStrings(n-1,0,str.append("0"));
//                 // }
//                 printBinStrings(n-1,0,str+"0");
//                 if(lastPlace == 0){
//                         printBinStrings(n-1,1,str+"1");
//                 }
//         }
//         public static void main(String args[]){
//                 printBinStrings(3,0,"");
//         }
// }
// rev 
//remove duplicates
// import java.util.*;
// public class javabasics{
//         public static void removeDuplicates(String str,int i,boolean track[],StringBuilder sb){
//                 //base case 
//                 if(i==str.length()){
//                         System.out.println(sb);
//                         return ;
//                 }
//                 //kaam 
//                 if(track[(str.charAt(i)-'a')]==true){
//                         removeDuplicates(str,i+1,track,sb);
//                 }else{
//                         track[str.charAt(i)-'a']=true;
//                         removeDuplicates(str,i+1,track,sb.append(str.charAt(i)));
//                 }
//         }
//         public static void main(String args[]){
//                 String str = "samyak";
//                 removeDuplicates(str,0,new boolean[26],new StringBuilder(""));
//         }
// }
// friends problem 
// import java.util.*;
// public class javabasics{
//         public static int friendsPair(int n){
//                 // base case
//                 if(n==1 || n==2){
//                         return n;
//                 }
//                 //kaam
//                 //choice 
//                 //single 
//                 int fnm1 = friendsPair(n-1);
//                 //double
//                 int fnm2 = friendsPair(n-2);
//                 int totPair = (n-1)*fnm2;
//                 //totways
//                 int totWays = fnm1+totPair;
//                 return totWays;
//         }
//         public static void main(String args[]){
//                 int n=3;
//                 System.out.println(friendsPair(n));
//         }
// }
//Binary strings 
// import java.util.*;
// public class javabasics{
//         public static void binaryString(int n,int lp,String str){
//                 //base case 
//                 if(n==0){
//                         System.out.println(str);
//                         return;
//                 }
//                 binaryString(n-1,0,str+"0");
//                 // binaryString(n-1,0,str+"1");
//                 if(lp ==0 ){
//                         binaryString(n-1,1,str+"1");
//                 }
//         }
//         public static void main(String args[]){
//                 int n=3;
//                 int lp = 0;
//                 String str="";
//                 binaryString(n,lp,str);
//         }
// }
//tiling problem 
// import java.util.*;
// public class javabasics{
//         public static int tilingProblem(int n){
//                 //base case 
//                 if(n==0||n==1){
//                         return 1;
//                 }
//                 // //kaam
//                 // //choice 
//                 // //horizontal 
//                 // int fnm1 = tilingProblem(n-1);
//                 // //vertical
//                 // int fnm2 = tilingProblem(n-2);
//                 return tilingProblem(n-1)+tilingProblem(n-2);
//         }
//         public static void main(String args[]){
//                 int n=10;
//                 System.out.println(tilingProblem(n));
//         }
// }
// *************************************************************************************************************************************************************************
// 13/3/24
// recursion revision 
// import java.util.*;
// public class javabasics{
//         public static void printDec(int n){
//                 if(n==0){
//                         return ;
//                 }
//                 System.out.println(n);
//                 printDec(n-1);
//         }
//         public static void printInc(int n){
//                 if(n==0){
//                         return ;
//                 }
//                 printInc(n-1);
//                 System.out.println(n);
//         }
//         public static int factorial(int f){
//                 if(f==0 || f==1){
//                         return 1;
//                 }
//                 int fonm1 = factorial(f-1);
//                 int fon = f*fonm1;
//                 return fon;
//         }
//         public static int SumofNo(int f){
//                 if(f==0){
//                         return 0;
//                 }
//                 int Sum = f+SumofNo(f-1);
//                 return Sum;
//         }
//         public static int fiboNo(int f){
//                 if(f==0){
//                         return 0;
//                 }
//                 if(f==1){
//                         return 1;
//                 }
//                 int fonm1 = fiboNo(f-1);
//                 int fonm2 = fiboNo(f-2);
//                 int fon = fonm1 + fonm2;
//                 return fon;
//         }
//         public static boolean isSorted(int arr[],int i){
//                 if(i==arr.length-1){
//                         return true;
//                 }
//                 if(arr[i]>arr[i+1]){
//                         return false;
//                 }
//                 return isSorted(arr,i+1);
//         }
//         public static int firstOcc(int arr[],int element,int i){
//                 if(i==arr.length){
//                         return -1;
//                 }
//                 if(arr[i]==element){
//                         return i;
//                 }
//                 return firstOcc(arr,element,i+1);
//         }
//         public static int lastOcc(int arr[],int element,int i){
//                 if(i==arr.length){
//                         return -1;
//                 }
//                 int isFound = lastOcc(arr,element,i+1);
//                 if(isFound==-1 && arr[i]==element){
//                         return i;
//                 }
//                 return isFound;
//         }
//         public static int aPowerb(int a,int b){
//                 if(b==0){
//                         return 1;
//                 }
//                 int apb = 2*aPowerb(a,b-1);
//                 return apb;
//         }
//         public static int aPowerbOpt(int a,int b){
//                 if(b==0){
//                         return 1;
//                 }
//                 int hps = aPowerb(a,b/2);
//                 if(b%2==0){
//                         return hps*hps;
//                 }else{
//                         return a*hps*hps;
//                 }
//         }
//         public static int tilingProblem(int t){
//                 //base case 
//                 if(t==1 || t==0 ){
//                         return 1;
//                 }
//                 //kaam 
//                 //choice 
//                 //vertical tiles 
//                 int vertile = tilingProblem(t-1);
//                 //horizontal tiles 
//                 int hortile = tilingProblem(t-2);
//                 int totway = vertile+hortile;
//                 return totway;
//         }
//         public static void removeDuplicates(String str,int i,StringBuilder s,boolean track[]){
//                 if(i==str.length()){
//                         System.out.println(s);
//                         return ;
//                 }
//                 if(track[(str.charAt(i)-'a')]==true){
//                         removeDuplicates(str, i+1, s, track);
//                 }else{
//                         track[(str.charAt(i)-'a')]=true;
//                         removeDuplicates(str, i+1, s.append(str.charAt(i)), track);
//                 }
//         }
//         public static int friendsPair(int n){
//                 //base case
//                 if(n==1||n==2){
//                         return n;
//                 }
//                 //kaam
//                 //choice 
//                 //single 
//                 int fnm1 = friendsPair(n-1);
//                 //double 
//                 int fnm2 = friendsPair(n-2);
//                 int totPair= (n-1)*fnm2;
//                 int totWays = fnm1+totPair;
//                 return totWays;
//         }
//         public static void binaryStrings(int n,String s,int lp){
//                 //base case 
//                 if(n==0){
//                         System.out.println(s);
//                         return;
//                 }
//                 binaryStrings(n-1,s+"0",0);
//                 if(lp==0){
//                         binaryStrings(n-1,s+"1",1);
//                 }
//         }
//         public static void main(String args[]){
//                 int n=10;
//                 printDec(n);
//                 printInc(n);
//                 int f=5;
//                 System.out.println(factorial(f));
//                 System.out.println(SumofNo(f));
//                 System.out.println(fiboNo(f));
//                 int arr[]={1,2,3,4,5};
//                 int i=0;
//                 System.out.println(isSorted(arr,i));
//                 int element =3;
//                 System.out.println(firstOcc(arr,element,i));
//                 System.out.println(lastOcc(arr,element,i));
//                 int a=2;
//                 int b=10;
//                 System.out.println(aPowerb(a,b));
//                 System.out.println(aPowerbOpt(a,b));
//                 int t = 4;
//                 System.out.println(tilingProblem(t));
//                 String str="hanumanjikijaiho";
//                 removeDuplicates(str,i,new StringBuilder(""),new boolean[26]);
//                 System.out.println(friendsPair(f));
//                 binaryStrings(element,new String(""),0);
//         }
// }
// **********************************************************************************************************************************************************************
// Functional interface for calculating area
// interface AreaCalculator {
//         double calculate(double side);
//     }
    
//     public class javabasics {
//         public static void main(String[] args) {
            
//             AreaCalculator squareArea = (side) -> side * side;
    
            
//             double sideLength = 5;
//             double area = squareArea.calculate(sideLength);
    
        
//             System.out.println("Area of square with side length " + sideLength + " is: " + area);
//         }
//     }
    
// import java.util.*;
// interface AreaCalculator{
//         double calculate(double side);
// }
// public class javabasics{
// public static void main(String args[]){
//         AreaCalculator squareArea = (side) -> side * side;
//         Scanner sc =new Scanner(System.in);
//         double sidelength = sc.nextDouble();
//         double area = squareArea.calculate(sidelength);
//         System.out.println(area);
// }
// }
// import java.util.*;
// interface AC{
//         double calc(double s);
// }
// public class javabasics{
//         public static void main(String args[]){
//                 AC sqa = (s)->s*s;
//                 Scanner sc = new Scanner(System.in);
//                 double s = sc.nextDouble;
//                 double a = sqa.calc(s);
//                 System.out.println(a);
//         }
// }
// Functional interface for calculating area
// interface SquareOperations {
//         double calculateArea(double side);
    
//         // Default method to calculate perimeter
//         default double calculatePerimeter(double side) {
//             return 4 * side;
//         }
    
//         // Static method to calculate diagonal
//         static double calculateDiagonal(double side) {
//             return Math.sqrt(2) * side;
//         }
//     }
    
//     public class javabasics {
//         public static void main(String[] args) {
            
//             SquareOperations squareArea = (side) -> side * side;
    
            
//             double sideLength = 5;
//             double area = squareArea.calculateArea(sideLength);
    
            
//             double perimeter = squareArea.calculatePerimeter(sideLength);
    
            
//             double diagonal = SquareOperations.calculateDiagonal(sideLength);
    
//             System.out.println("Area of square with side length " + sideLength + " is: " + area);
//             System.out.println("Perimeter of square with side length " + sideLength + " is: " + perimeter);
//             System.out.println("Diagonal length of square with side length " + sideLength + " is: " + diagonal);
//         }
//     }
    
// import java.util.*;
// interface sa{
//       double  calcarea(double side);
//        default double calperi(double side){
//         return 4*side;
//       }
//       static double caldiag(double side){
//         return Math.sqrt(2)*side;
//       }
// }
// public class javabasics{
//         public static void main(String args[]){
//                 sa area = (side) -> side*side;
//                 Scanner sc =new Scanner(System.in);
//                 double side = sc.nextDouble();
//                 double are=area.calcarea(side);
//                 double peri= area.calperi(side);
//                 System.out.println(peri);
//                 System.out.println(are);
//         }
// }
// ************************************************************************************************************************************************************
//14/3/24
//revision recursion 
// import java.util.*;
// public class javabasics{
//         public static void printDec(int n){
//                 if(n==0){
//                         return ;
//                 }
//                 System.out.print(n+" ");
//                 printDec(n-1);
//         }
//         public static void printInc(int n){
//                 if(n==0){
//                         return ;
//                 }
//                 printInc(n-1);
//                 System.out.print(n+" ");
//         }
//         public static int factorial(int n){
//                 if(n==0 || n==1){
//                         return 1;
//                 }
//                 int fnm1 = factorial(n-1);
//                 int fon = n*fnm1;
//                 return fon;
//         }
//         public static int SumOfNo(int n){
//                 if(n==0){
//                         return 0;
//                 }
//                 int sum = n+SumOfNo(n-1);
//                 return sum;
//         }
//         public static int fiboNo(int n){
//                 if(n==0||n==1){
//                         return n;
//                 }
//                 int fnm1 = fiboNo(n-1);
//                 int fnm2 = fiboNo(n-2);
//                 int fon = fnm1+fnm2;
//                 return fon;
//         }
//         public static boolean isSorted(int arr[],int i){
//                 if(i==arr.length-1){
//                         return true;
//                 }
//                 if(arr[i]>arr[i+1]){
//                         return false;
//                 }
//                 return isSorted(arr,i+1);
//         }
//         public static int firstOcc(int arr[],int i,int key){
//                 if(i==arr.length){
//                         return -1;
//                 }
//                 if(arr[i]==key){
//                         return i;
//                 }
//                 return firstOcc(arr,i+1,key);
//         }
//         public static int lastOcc(int arr[],int i,int key){
//                 if(i==arr.length){
//                         return -1;
//                 }
//                 int isFound = lastOcc(arr,i+1,key);
//                 if(isFound == -1&& arr[i]==key){
//                       return i;
//                 }
//                 return isFound;
//         }
//         public static int aPowerb(int a,int b){
//                 if(b==0){
//                         return 1;
//                 }
//                 int pow = a*aPowerb(a,b-1);
//                 return pow;
//         }
//         public static int aPowerbO(int a,int b){
//                 if(b==0){
//                         return 1;
//                 }
//                 int hps = aPowerbO(a,b/2);
//                 if(b%2==0){
//                         return hps*hps;
//                 }
//                 return a*hps*hps;
//         }
//         public static int tilingProblem(int n){
//                 if(n==1||n==2||n==3){
//                         return n;
//                 }
//                 //kaam
//                 //choice 
//                 //horizontal
//                 int hotile = tilingProblem(n-2);
//                 //vertical
//                 int vertile = tilingProblem(n-1);
//                 int totWay = hotile+vertile;
//                 return totWay;
//         }
//         public static int friendsPair(int n){
//                 //base case 
//                 if(n==1||n==2){
//                         return n;
//                 }
//                 //kaam
//                 //choice 
//                 //single
//                 int fnm1= friendsPair(n-1);
//                 //pair
//                 int fnm2 = friendsPair(n-2);
//                 int totPair = (n-1)*fnm2;
//                 int totWay = totPair*fnm1;
//                 return totWay;
//         }
//         public static void removeDuplicates(String str,boolean track[],StringBuilder sb,int i){
//                 if(i==str.length()){
//                         System.out.println(sb);
//                         return;
//                 }
//                 if(track[str.charAt(i)-'a']==true){
//                         removeDuplicates(str,track,sb,i+1);
//                 }else{
//                         track[str.charAt(i)-'a']=true;
//                         removeDuplicates(str,track,sb.append(str.charAt(i)),i+1);
//                 }
//         }
//         public static void binaryString(int n,int lp,String s){
//                 //base case 
//                 if(n==0){
//                         System.out.println(s);
//                         return;
//                 }
//                 binaryString(n-1,0,s+"0");
//                 if(lp==0){
//                         binaryString(n-1,1,s+"1");
//                 }
//         }
//         public static void main(String args[]){
//                 int n=5;
//                 printDec(n);
//                 System.out.println();
//                 printInc(n);
//                 System.out.println();
//                 System.out.println(factorial(n));
//                 System.out.println(SumOfNo(n));
//                 System.out.println(fiboNo(n));
//                 int arr[]={10,20,30,40,50};
//                 int i=0;
//                 System.out.println(isSorted(arr,i));
//                 int key = 10;
//                 System.out.println(firstOcc(arr,i,key));
//                 System.out.println(lastOcc(arr,i,key));
//                 int a=2;
//                 int b=5;
//                 System.out.println(aPowerb(a,b));
//                 System.out.println(aPowerbO(a,b));
//                 System.out.println(tilingProblem(n));
//                 System.out.println(friendsPair(n));
//                 String str = "appnnacollege";
//                 removeDuplicates(str,new boolean[26],new StringBuilder(""),i);
//                 int e=3;
//                 int lp=0;
//                 String s="";
//                 binaryString(e,lp,s);
//         }
// }
//review of their call stacks 
//maza agaya 
//HW
// q1 to find all occurrences of given element 
// import java.util.*;
// public class javabasics{
//         public static void keyIndex(int arr[],int key,int i){
//                 //base case 
//                 if(i==arr.length){
//                         return ;
//                 }
//                 if(arr[i]==key){
//                         System.out.print(i+" ");
//                 }
//                 keyIndex(arr,key,i+1);
//         }
//         public static void main(String args[]){
//                 int arr[]={3,2,4,5,6,2,7,2,2};
//                 int key =2;
//                 int i=0;
//                 keyIndex(arr,key,i);
//         }
// }
//q2 number to a string 
// import java.util.*;
// public class javabasics{
//         public static void printDigits(int n){
//                 String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
//                 if(n==0){
//                         return ;
//                 }
//                 int ld = n%10;
//                 printDigits(n/10);
//                 System.out.print(digits[ld]+" ");
//         }
//         public static void main(String args[]){
//                 int n=1947;
//                 printDigits(n);                
//         }
// }
// q3 finding length of string using recursion
// import java.util.*;
// public class javabasics{
//         public static int length(String str){
//                 if(str.length()==0){
//                         return 0;
//                 }
//                 return length(str.substring(1))+1;
//         }
//         public static void main(String args[]){
//                 String str="abcde";
//                 System.out.println(length(str));
//         }
// }
//q4 counting substring 
// import java.util.*;
// public class javabasics{
//         public static int countSubstr(String str,int i,int j,int n){
//                 if(n==1){
//                         return 1;
//                 }
//                 if(n<=0){
//                         return 0;
//                 }
//                 int res = countSubstr(str,i+1,j,n-1)+
//                         countSubstr(str,i,j-1,n-1)-
//                         countSubstr(str,i+1,j-1,n-2);
//                 if(str.charAt(i)==str.charAt(j)){
//                         res++;
//                 }
//                 return res;
//         }
//         public static void main(String args[]){
//                 String str = "abcab";
//                 int n=str.length();
//                 System.out.println(countSubstr(str,0,n-1,n));
//         }
// }
//tower of hanoi 
// ********************************************************************************************************************
// write a program to implement  lambda expressions with 1.)0 arguments  2.)1 arguments 3.)2 arguments in functional interfaces add default and private member function inside 
// the functional interface 
// import java.util.*;
// public class javabasics{
//         interface sum0{
//                 void method();
//                 default void dm(){
//                         System.out.println("default method");
//                 }
//                 private void pm(){
//                         System.out.println("private method");
//                 }
//         }
//         interface sum1{
//                 void method(double c);
//                 default void dm(){
//                         System.out.println("default method 1");
//                 }
//                 private void pm(){
//                         System.out.println("private method 1");
//                 }
//         }
//         interface sum2{
//                 double calcSum2(double a,double b);
//                 default void dm(){
//                         System.out.println("default method 2");
//                 }
//                 default void pm(){
//                         System.out.println("default method 2");
//                 }
//         }
//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);
//                 // double a = sc.nextDouble();
//                 // double b = sc.nextDouble();
//                 // double c= sc.nextDouble();
//                 sum0 s0 = ()->{System.out.println("with argument zero");};
//                 s0.method();
//                 s0.dm();
//                 sum1 s1 = (c)->{System.out.println("with one argument");};
//                 s1.method(10);
//                 s1.dm();
//                 sum2 s2 = (a,b)->a+b;
//                 double s=s2.calcSum2(10,20);
//                 System.out.println(s);
//                 s2.dm();
//         }
// }
// **************************************************************************************************************************************************************
// 15/3/24
// recusrion revision
//code to find the product of all elements of array except self 
// import java.util.*;
// public class javabasics{
//         public static int[] productExceptSelf(int[] nums) {
//                 int product = 1;
//                 int[] ans = new int[nums.length];
//                 for (int i = 0; i < nums.length; i++) {
//                     ans[i] = product;
//                     product = product * nums[i];
//                 }
//                 product = 1;
//                 for (int i = nums.length - 1; i >= 0; i--) {
//                     ans[i] = ans[i] * product;
//                     product = product * nums[i];
//                 }
//                 return ans;
//             }
//         public static void main(String args[]){
//                 int nums[]={0,4,0};
//                 System.out.println(productExceptSelf(nums));
//         }
// }
//recursion rev 
// import java.util.*;
// public class javabasics{
//         public static  void printDec(int n){
//                 if(n==0){
//                         return;
//                 }
//                 System.out.print(n+" ");
//                 printDec(n-1);
//         }
//         public static void printInc(int n){
//                 if(n==0){
//                         return;
//                 }
//                 printInc(n-1);
//                 System.out.print(n+" ");
//         }
//         public static int factorial(int n){
//                 if(n==0||n==1){
//                         return 1;
//                 }
//                 return n*factorial(n-1);
//         }
//         public static int sumOfNo(int n){
//                 if(n==0){
//                         return 0;
//                 }
//                 return n+sumOfNo(n-1);
//         }
//         public static int fiboNo(int n){
//                 if(n==0||n==1){
//                         return n;
//                 }
//                 return fiboNo(n-1)+fiboNo(n-2);
//         }
//         public static boolean isSorted(int arr[],int i){
//                 if(i==arr.length-1){
//                         return true;
//                 }
//                 if(arr[i]>arr[i+1]){
//                         return false;
//                 }
//                 return isSorted(arr,i+1);
//         }
//         public static int firstOcc(int arr[],int key,int i){
//                 if(i==arr.length-1){
//                         return -1;
//                 }
//                 if(arr[i]==key){
//                         return i;
//                 }
//                 return firstOcc(arr,key,i+1);
//         }
//         public static int lastOcc(int arr[],int key,int i){
//                 if(i==arr.length-1){
//                         return -1;
//                 }
//                 int isFound=lastOcc(arr,key,i+1);
//                 if(isFound==-1&&arr[i]==key){
//                         return i;
//                 }
//                 return isFound;
//         }
//         public static int aPowerb(int a,int b){
//                 if(b==0){
//                         return 1;
//                 }
//                 return a*aPowerb(a,b-1);
//         }
//         public static int aPowerbO(int a,int b){
//                 if(b==0){
//                         return 1;
//                 }
//                 int hps = aPowerbO(a,b/2);
//                 if(b%2==0){
//                         return hps*hps;
//                 }else{
//                         return a*hps*hps;
//                 }
//         }
//         public static int tilingProblem(int n){
//                 if(n==1||n==2||n==3){
//                         return n;
//                 }
//                 return tilingProblem(n-1)+tilingProblem(n-2);
//         }
//         public static int friendsPair(int n){
//                 if(n==0||n==1||n==2){
//                         return n;
//                 }
//                 return friendsPair(n-1)+(n-1)*friendsPair(n-2);
//         }
//         public static void removeDuplicates(String str,boolean track[],StringBuilder sb,int i){
//                 if(i==str.length()-1){
//                         System.out.println(sb.toString());
//                         return ;
//                 }
//                 if(track[str.charAt(i)-'a']==true){
//                         removeDuplicates(str,track,sb,i+1);
//                 }else{
//                         track[str.charAt(i)-'a']=true;
//                         removeDuplicates(str,track,sb.append(str.charAt(i)),i+1);
//                 }
//         }
//         public static void binaryString(int n,int lp,String str){
//                 if(n==0){
//                         System.out.println(str);
//                         return;
//                 }
//                 binaryString(n-1,0,str+"0");
//                 if(lp==0){
//                         binaryString(n-1,1,str+"1");
//                 }
//         }
//         public static void main(String args[]){
//                 int n=5;
//                 printDec(n);
//                 System.out.println();
//                 printInc(n);
//                 System.out.println();
//                 System.out.println(factorial(n));
//                 System.out.println(sumOfNo(n));
//                 System.out.println(fiboNo(n));
//                 int arr[]={10,20,30,30,40,50};
//                 int i=0;
//                 System.out.println(isSorted(arr,i));
//                 int key = 30;
//                 System.out.println(firstOcc(arr,key,i));
//                 System.out.println(lastOcc(arr,key,i));
//                 int a=4;
//                 int b=2;
//                 System.out.println(aPowerb(a,b));
//                 System.out.println(aPowerbO(a,b));
//                 System.out.println(tilingProblem(n));
//                 System.out.println(friendsPair(n));
//                 String str="aappnnaadeesshhhh";
//                 removeDuplicates(str,new boolean[26],new StringBuilder(""),i);
//                 int lp = 0;
//                 String s= "";
//                 binaryString(3,lp,s);
//         }
// }
//hw rev
// q1
// import java.util.*;
// public class javabasics{
//         public static void elementOcc(int arr[],int key,int i){
//                 if(i==arr.length){
//                         return ;
//                 }
//                 if(arr[i]==key){
//                         System.out.print(i+" ");
//                 }
//                 elementOcc(arr,key,i+1);
//         }
//         public static void main(String args[]){
//                 int arr[]={3,2,4,5,6,2,7,2,2};
//                 int key =2;
//                 int i=0;
//                 elementOcc(arr,key,i);
//         }
// }
// q2
// import java.util.*;
// public class javabasics{
//         public static void string(int n){
//                 String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
//                 if(n==0){
//                         return ;
//                 }
//                 int ld = n%10;
//                 string(n/10);
//                 System.out.print(arr[ld]+" ");
//         }
//         public static void main(String args[]){
//                 int n=2019;
//                 string(n);
//         }
// }
// q3
// import java.util.*;
// public class javabasics{
//         public static int stringlength(String s){
//                 if(s.length()==0){
//                         return 0;
//                 }
//                 return stringlength(s.substring(1))+1;
//         }
//         public static void main(String args[]){
//                 String s = "abcde";
//                 System.out.println(stringlength(s));
//         }
// }
//q4
//q5TOWER OF HANOI
// import java.util.*;
// public class javabasics{
//         public static void towerOfHanoi(int n,String src,String helper,String dest){
//                 if(n==1){
//                         System.out.println("transfer disk "+n+" from "+src+" to "+dest);
//                         return;
//                 }
//                 towerOfHanoi(n-1,src,dest,helper);
//                 System.out.println("transfer disk "+n+" from "+src+" to "+dest);
//                 towerOfHanoi(n-1,helper,src,dest);
//         }
//         public static void main(String args[]){
//                 int n=3;
//                 towerOfHanoi(n,"S","H","D");
//         }
// }
// ******************************************************************************************************************************
// import java.util.*;
// public class javabasics{
//         public static void main(String args[]){
//                 A.k=67;
//                 A obj1 = new A(2);
//                 A obj2 = new A(4);
//                 System.out.println("Default Constructor");
//                 System.out.println("Static k value is "+A.k);
//                 System.out.println(obj1.p);
//                 System.out.println(obj2.p);
//         }
// }
// class A{
//         public static int k;
//         int p;
//         public A(int p){
//                 this.p=p;
//         }
//         public A(){
//                 System.out.println("Hello");
//         }
// }
// import java.util.*;
// public class javabasics {
//         static int staticVar = 10;
//         int nonStaticVar;
    
//         static {
//             System.out.println("Inside static block");
//             staticVar = 20;
//         }
//         {
//             System.out.println("inside non-static block");
//             nonStaticVar = 30;
//         }
    
//         public StaticDemo(){
//             System.out.println("this is the default constructor");
//         }
    
//         public StaticDemo(int val){
//             System.out.println("this is parameterized constructor with value : "+val);
//             nonStaticVar = val;
//         }
//         public static void main(String[] args) {
//             System.out.println("Inside main method");
//             StaticDemo obj1 = new StaticDemo();
//             StaticDemo obj2 = new StaticDemo(50);
//             System.out.println("Static variable: " + staticVar);
//             System.out.println("Non-static variable for obj1: " + obj1.nonStaticVar);
//             System.out.println("Non-static variable for obj2: " + obj2.nonStaticVar);
//         }
    
//     }
// ***********************************************************************************************************************************
// 16/3/24
//merge sort 
// import java.util.*;
// public class javabasics{
//     public static void mergeSort(int arr[],int si,int ei){
//         //base case 
//         if(si>=ei){
//             return;
//         }
//         //kaam 
//         int mid = si+(ei-si)/2;//(si+ei)/2
//         mergeSort(arr,si,mid);//leftPart
//         mergeSort(arr,mid+1,ei);//rightPart
//         merge(arr,si,mid,ei);
//     }
//     public static void merge(int arr[],int si,int mid ,int ei){
//         //left(0,3) right(4,6)
//         int temp[] = new int[ei-si+1];
//         int i = si;//iterator for left part 
//         int j = mid+1; // iterator for right part 
//         int k = 0;//iterator for temp arr 
//         while(i<=mid && j<=ei){
//             if(arr[i]<arr[j]){
//                 temp[k]=arr[i];
//                 i++;
//             }else{
//                 temp[k]=arr[j];
//                 j++;
//             }
//             k++;
//         }
//         //left part 
//         while(i<=mid){
//             temp[k++]=arr[i++];
//         }
//         //right part 
//         while(j<=ei){
//             temp[k++]=arr[j++];
//         }
//         //copy temp to original arr
//         for(k=0,i=si;k<temp.length;k++,i++){
//             arr[i]=temp[k];
//         }
//     }
//     public static void printArr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {6,3,9,5,2,8};
//         mergeSort(arr,0,arr.length-1);
//         printArr(arr);
//     }
// }
//quick sort 
//pivot and partition approach
// 1. pivot element (take any but i m taking last element)
// 2. partition(parts) 
// 3. quick sort (left) (right)
// import java.util.*;
// public class javabasics{
//     public static void quickSort(int arr[],int si,int ei){
//         //last element
//         int pidx = partition(arr,si,ei);
//         quickSort(arr,si,pidx-1);
//         quickSort(arr,pidx+1,ei);
//     }
//     public static void partition(int arr[],int si,int ei){
//         int pivot = arr[ei];
//         int i=si-1;//jagah banana or to make place for elments smaller then pivot 
        
//     }
//     public static void main(String args[]){
//         int arr[] = {6,3,9,8,2};
//         quickSort(arr,0,arr.length-1);
//     }
// }
// abadday
// 17/3/24
// divide and conquer
// /merge sort 
// /1.) divide from mid 
// 2.)mergeSort(left)
// 3.)mergeSort(right)
// 4.)merge(temp)
// import java.util.*;
// public class javabasics{
// public static void printArr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//                 System.out.print(arr[i]+" ");
//         }
//         System.out.println();
// }
// public static void mergeSort(int arr[],int si,int ei){
//         if(si>=ei){
//                 return;
//         }
//         //kaam
//         int mid = si+(ei-si)/2;//(si+ei)/2
//         mergeSort(arr,si,mid);//left part
//         mergeSort(arr,mid+1,ei);//right part 
//         merge(arr,si,mid,ei);
// }
// public static void merge(int arr[],int si,int mid,int ei){
//         int temp[] = new int[ei-si+1];
//         int i = si;//iterator for left part 
//         int j = mid+1;//iterator for right part 
//         int k = 0;//iterator for temporary arr
//         while(i<=mid&&j<=ei){
//                 if(arr[i]<arr[j]){
//                         temp[k]=arr[i];
//                         i++;
//                 }else{
//                         temp[k]=arr[j];
//                         j++;
//                 }
//                 k++;
//         }
//         //left 
//         while(i<=mid){
//                 temp[k++]=arr[i++];
//         }
//         //right 
//         while(j<=ei){
//                 temp[k++]=arr[j++];
//         }
//         //copy temp to original arr
//         for(k=0,i=si;k<temp.length;k++,i++){
//                 arr[i]=temp[k];
//         }
// }
// public static void main(String args[]){
//         int arr[]={6,3,9,5,2,8};
//         mergeSort(arr,0,arr.length-1);
//         printArr(arr);
// }
// }
// tcO(nlogn)
// tcO(n)
//also known as depth first technique 
// mergeSortrev
// import java.util.*;
// public class javabasics{
//         public static void mergeSort(int arr[],int si,int ei){
//                 if(si>=ei){
//                         return ;
//                 }
//                 int mid = si+(ei-si)/2;
//                 mergeSort(arr,si,mid);
//                 mergeSort(arr,mid+1,ei);
//                 merge(arr,si,mid,ei);
//         }
//         public static void merge(int arr[],int si,int mid ,int ei){
//                 int temp[] = new int[ei-si+1];
//                 int i=si;
//                 int j=mid+1;
//                 int k=0;
//                 while(i<=mid&&j<=ei){
//                         if(arr[i]<arr[j]){
//                                 temp[k++]=arr[i++];
//                         }else{
//                                 temp[k++]=arr[j++];
//                         }
//                 }
//                 while(i<=mid){
//                         temp[k++]=arr[i++];
//                 }
//                 while(j<=ei){
//                         temp[k++]=arr[j++];
//                 }
//                 for(k=0,i=si;i<temp.length;k++,i++){
//                         arr[i]=temp[k];
//                 }
//         }
//         public static void printArr(int arr[]){
//                 for(int i=0;i<arr.length;i++){
//                         System.out.print(arr[i]+" ");
//                 }
//         }
//         public static void main(String args[]){
//                 int arr[]={5,2,1,4,6,3,9};
//                 mergeSort(arr,0,arr.length-1);
//                 printArr(arr);
//         }
// }
// import java.util.*;
// public class javabasics{
//         public static void mergeSort(int arr[],int si,int ei){
//                 if(si>=ei){
//                         return ;
//                 }
//                 int mid = si+(ei-si)/2;
//                 mergeSort(arr,si,mid);
//                 mergeSort(arr,mid+1,ei);
//                 merge(arr,si,mid,ei);
//         }
//         public static void merge(int arr[],int si,int mid,int ei){
//                 int temp[] = new int[ei-si+1];
//                 int i=si;
//                 int j=mid+1;
//                 int k=0;
//                 while(i<=mid&&j<=ei){
//                         if(arr[i]<arr[j]){
//                                 temp[k]=arr[i];
//                                 i++;
//                         }else{
//                                 temp[k]=arr[j];
//                                 j++;
//                         }
//                         k++;
//                 }
//                 while(i<=mid){
//                         temp[k++]=arr[i++];
//                 }
//                 while(j<=ei){
//                         temp[k++]=arr[j++];
//                 }
//                 for(k=0,i=si;k<temp.length;k++,i++){
//                         arr[i]=temp[k];
//                 }
//         }
//         public static void printArr(int arr[]){
//                 for(int i=0;i<arr.length;i++){
//                         System.out.print(arr[i]+" ");
//                 }
//         }
//         public static void main(String args[]){
//                 int arr[]={5,2,1,4,6,3,9};
//                 mergeSort(arr,0,arr.length-1);
//                 printArr(arr);
//         }
// }
// import java.util.*;
// public class javabasics{
//         public static void mergeSort(int arr[],int si,int ei){
//                 if(si>=ei){
//                         return ;
//                 }
//                 int mid = si+(ei-si)/2;
//                 mergeSort(arr,si,mid);
//                 mergeSort(arr,mid+1,ei);
//                 merge(arr,si,mid,ei);
//         }
//         public static void merge(int arr[],int si,int mid,int ei){
//                 int temp[] = new int[ei-si+1];
//                 int i=si;
//                 int j=mid+1;
//                 int k=0;
//                 while(i<=mid&&j<=ei){
//                         if(arr[i]<arr[j]){
//                                 temp[k++]=arr[i++];
//                         }else{
//                                 temp[k++]=arr[j++];
//                         }
//                 }
//                 while(i<=mid){
//                         temp[k++]=arr[i++];
//                 }
//                 while(j<=ei){
//                         temp[k++]=arr[j++];
//                 }
//                 for(i=si,k=0;k<temp.length;i++,k++){
//                         arr[i]=temp[k];
//                 }
//         }
//         public static void printArr(int arr[]){
//                 for(int i=0;i<arr.length;i++){
//                         System.out.print(arr[i]+" ");
//                 }
//         }
//         public static void main(String args[]){
//                 int arr[]={4,5,2,1,6,3,7,10,9,8};
//                 mergeSort(arr,0,arr.length-1);
//                 printArr(arr);
//         }
// }
//quick sort 
// average case tc = O(nlogn)
// worst case tc = O(n^2)
// space O(1);
// pivot and partition approach
// 1.)to choose the pivot (random,median,first,last)
// 2.)partition (dividing in parts)          smaller<pivot<larger
// 3.)to call quick sort for left part and to call quick sort for right part 
//base case single element sorted 
// import java.util.*;
// public class javabasics{
//         public static void quickSort(int arr[],int si,int ei){
//                 if(si>=ei){
//                         return;
//                 }
//                 //last element
//                 int pidx=partition(arr,si,ei);
//                 quickSort(arr,si,pidx-1);//left 
//                 quickSort(arr,pidx+1,ei);//right
//         }
//         public static int partition(int arr[],int si,int ei){
//                 int pivot = arr[ei];
//                 int i=si-1;//to make place for els smaller then pivot 
//                 for(int j=si;j<ei;j++){
//                         if(arr[j]<=pivot){
//                                 i++;
//                                 //swap
//                                 int temp=arr[j];
//                                 arr[j]=arr[i];
//                                 arr[i]=temp;
//                         }
//                 }
//                 i++;
//                 //swap
//                 int temp=pivot;
//                 arr[ei]=arr[i];//pivot =arr[i](index ke through change karna hai)
//                 arr[i]=temp;
//                 return i;
//         }
//         public static void printArr(int arr[]){
//                 for(int i=0;i<arr.length;i++){
//                         System.out.print(arr[i]+" ");
//                 }
//         }
//         public static void main(String args[]){
//                 int arr[]={4,2,1,3,5};
//                 quickSort(arr,0,arr.length-1);
//                 printArr(arr);
//         }
// }
//Important note 
//worst case occurs when pivot is always the smallest or the largest element (asked in interview 's )
//qucik sort rev
// import java.util.*;
// public class javabasics{
//         public static void quickSort(int arr[],int si,int ei){
//                 if(si>=ei){
//                         return;
//                 }
//                 int pidx = partition(arr,si,ei);
//                 quickSort(arr,si,pidx-1);
//                 quickSort(arr,pidx+1,ei);
//         }
//         public static int partition(int arr[],int si,int ei){
//                 int pivot = arr[ei];
//                 int i=si-1;
//                 for(int j=si;j<ei;j++){
//                         if(arr[j]<=pivot){
//                                 i++;
//                                 int temp=arr[j];
//                                 arr[j]=arr[i];
//                                 arr[i]=temp;
//                         }
//                 }
//                 i++;
//                 int temp = pivot;
//                 arr[ei]=arr[i];
//                 arr[i]=temp;
//                 return i;
//         }
//         public static void printArr(int arr[]){
//                 for(int i=0;i<arr.length;i++){
//                         System.out.print(arr[i]+" ");
//                 }
//         }
//         public static void main(String args[]){
//                 int arr[]={4,2,1,5,6,3};
//                 quickSort(arr,0,arr.length-1);
//                 printArr(arr);
//         }
// }
//quick sort rev 
// import java.util.*;
// public class javabasics{
//         public static void quickSort(int arr[],int si,int ei){
//                 if(si>=ei){
//                         return;
//                 }
//                 int pidx=partition(arr,si,ei);
//                 quickSort(arr,si,pidx-1);
//                 quickSort(arr,pidx+1,ei);
//         }
//         public static int partition(int arr[],int si,int ei){
//                 int pivot =arr[ei];
//                 int i = si-1;
//                 for(int j=si;j<ei;j++){
//                         if(arr[j]<pivot){
//                                 i++;
//                                 int temp=arr[i];
//                                 arr[i]=arr[j];
//                                 arr[j]=temp;
//                         }
//                 }
//                 i++;
//                 int temp=pivot;
//                 arr[ei]=arr[i];
//                 arr[i]=temp;
//                 return i;
//         }
//         public static void printArr(int arr[]){
//                 for(int i=0;i<arr.length;i++){
//                         System.out.print(arr[i]+" ");
//                 }
//         }
//         public static void main(String args[]){
//                 int arr[]={10,4,3,2,5,6,7,9,1,8};
//                 quickSort(arr,0,arr.length-1);
//                 printArr(arr);
//         }
// }
//Search in rotated sorted array 
// input: sorted,rotated with distinct numbers (in ascending order);
// we can put linear search but tc is O(n) and we will solve it in nlogn by divide and conquer
//modified binary search 
// import java.util.*;
// public class javabasics{
//         public static int search(int arr[],int tar,int si,int ei){
//                 if(si>ei){
//                         return -1;
//                 }
//                 int mid = si+(ei-si)/2;
//                 //case Found 
//                 if(arr[mid]==tar){
//                         return mid;
//                 }
//                 //mid on l1 
//                 if(arr[si]<=arr[mid]){
//                         //case a: left
//                         if(arr[si]<=tar && tar<=arr[mid]){
//                                 return search(arr,tar,si,mid-1);
//                         }else{
//                                 // case b:right
//                                 return search(arr,tar,mid+1,ei);
//                         }
//                 //mid on l2 
//                 }else{
//                         //case c: right
//                         if(arr[mid]<=tar&&tar<=arr[ei]){
//                                 return search(arr,tar,mid+1,ei);
//                         }else{
//                                 // case d:left
//                                 return search(arr,tar,si,mid-1);
//                         }
//                 }
//         }
//         public static void main(String args[]){
//                 int arr[]={4,5,6,7,0,1,2};
//                 int target=0;
//                 int taridx=search(arr,target,0,arr.length);
//                 System.out.println(taridx);
//         }
// }
// import java.util.*;
// public class javabasics{
//         public static int search(int arr[],int tar,int si,int ei){
//                 if(si>ei){
//                         return -1;
//                 }
//                 int mid = si+(ei-si)/2;
//                 if(arr[mid]==tar){
//                         return mid;
//                 }
//                 // mid on l1
//                 if(arr[si]<=arr[mid]){
//                         if(arr[si]<=tar&&tar<=arr[mid]){
//                                 return search(arr,tar,si,mid-1);
//                         }else{
//                                 return search(arr,tar,mid+1,ei);
//                         }
//                 }else{
//                         if(arr[mid]<tar&&tar<arr[ei]){
//                                 return search(arr,tar,mid+1,ei);
//                         }else{
//                                 return search(arr,tar,si,mid-1);
//                         }
//                 }
//         }
//         public static void main(String args[]){
//                 int arr[]={4,5,6,7,8,0,1,2,3};
//                 int tar=0;
//                 int idx=search(arr,tar,0,arr.length-1);
//                 System.out.println(idx);
//         }
// }
// *****************************************************************************************************************
//18/3/24
// import java.util.*;
// public class javabasics{
//         public static void mergeSort(int arr[],int si,int ei){
//                 if(si>=ei){
//                         return;
//                 }
//                 int mid = si+(ei-si)/2;
//                 mergeSort(arr,si,mid);
//                 mergeSort(arr,mid+1,ei);
//                 merge(arr,si,mid,ei);
//         }
//         public static void merge(int arr[],int si,int mid, int ei){
//                 int temp[]=new int[ei-si+1];
//                 int i=si;
//                 int j=mid+1;
//                 int k=0;
//                 while(i<=mid&&j<=ei){
//                         if(arr[i]<arr[j]){
//                                 temp[k++]=arr[i++];
//                         }else{
//                                 temp[k++]=arr[j++];
//                         }
//                 }
//                 while(i<=mid){
//                         temp[k++]=arr[i++];
//                 }
//                 while(j<=ei){
//                         temp[k++]=arr[j++];
//                 }
//                 for( i=si,k=0;k<temp.length;i++,k++){
//                         arr[i]=temp[k];
//                 }
//         }
//         public static void printArr(int arr[]){
//                 for(int i=0;i<arr.length;i++){
//                         System.out.print(arr[i]+" ");
//                 }
//         }
//         public static void main(String args[]){
//                 int arr[] = {4,3,1,5,2};
//                 mergeSort(arr,0,arr.length-1);
//                 printArr(arr);
//         }
// }
// import java.util.*;
// public class javabasics{
//         public static void quickSort(int arr[],int si,int ei){
//                 if(si>=ei){
//                         return ;
//                 }
//                 int mid = si+(ei-si)/2;
//                 int pidx = partition(arr,si,mid,ei);
//                 quickSort(arr,si,pidx-1);
//                 quickSort(arr,pidx+1,ei);
//         }
//         public static int partition(int arr[],int si,int mid,int ei){
//                 int pivot = arr[ei];
//                 int i=si-1;
//                 for(int j=si;j<ei;j++){
//                         if(arr[j]<pivot){
//                                 i++;
//                                 int temp=arr[j];
//                                 arr[j]=arr[i];
//                                 arr[i]=temp;
//                         }
//                 }
//                 i++;
//                 int temp=pivot;
//                 arr[ei]=arr[i];
//                 arr[i]=temp;
//                 return i;
//         }
//         public static void printArr(int arr[]){
//                 for(int i=0;i<arr.length;i++){
//                         System.out.print(arr[i]+" ");
//                 }
//         }
//         public static void main(String args[]){
//                 int arr[]= {3,5,2,1,4};
//                 quickSort(arr,0,arr.length-1);
//                 printArr(arr);
//         }
// }
// import java.util.*;
// public class javabasics{
//         public static int search(int arr[],int tar,int si,int ei){
//                 if(si>ei){
//                         return -1;
//                 }
//                 int mid = si+(ei-si)/2;
//                 if(arr[mid]==tar){
//                         return mid;
//                 }
//                 if(arr[si]<=arr[mid]){
//                         if(arr[si]<=tar&&tar<=arr[mid]){
//                                return search(arr,tar,si,mid-1);
//                         }else{
//                                return search(arr,tar,mid+1,ei);
//                         }
//                 }else{
//                         if(arr[mid]<=tar&&tar<=arr[ei]){
//                                return search(arr,tar,mid+1,ei);
//                         }else{
//                                return search(arr,tar,si,mid-1);
//                         }
//                 }
//         }
//         public static void main(String args[]){
//                 int arr[]={4,5,6,7,0,1,2,3};
//                 int tar = 0;
//                 int pi=search(arr,tar,0,arr.length-1);
//                 System.out.println(pi);
//         }
// }
// import java.util.*;
// public class javabasics{
//         public static void mergeSort(String arr[],int si,int ei){
//                 if(si>=ei){
//                         return;
//                 }
//                 int mid = si+(ei-si)/2;
//                 mergeSort(arr,si,mid);
//                 mergeSort(arr,mid+1,ei);
//                 merge(arr,si,mid,ei);
//         }
//         public static void merge(String arr[],int si,int mid,int ei){
//                 String temp[] = new String[ei-si+1];
//                 int i=si;
//                 int j=mid+1;
//                 int k=0;
//                 while(i<=mid&&j<=ei){
//                         if(arr[i].compareTo(arr[j])<0){
//                                 temp[k++]=arr[i++];
//                         }else{
//                                 temp[k++]=arr[j++];
//                         }
//                 }
//                 while(i<=mid){
//                         temp[k++]=arr[i++];
//                 }
//                 while(j<=mid){
//                         temp[k++]=arr[j++];
//                 }
//                 for( i=si,k=0;k<temp.length;i++,k++){
//                         arr[i]=temp[k];
//                 }
//         }
//         public static void printArr(String arr[]){
//                 for(int i=0;i<arr.length;i++){
//                         System.out.print(arr[i]+" ");
//                 }
//         }
//         public static void main(String args[]){
//                 String arr[]={"sun","earth","mars","mercury"};
//                 mergeSort(arr,0,arr.length-1);
//                 printArr(arr);
//         }
// }
// ***************************************************************************************************************************************************************
// 19/3/24 (divide and conquer rev)
// import java.util.*;
// public class javabasics{
//         public static void mergeSort(int arr[],int si,int ei){
//                 if(si>=ei){
//                         return ;
//                 }
//                 int mid = si+(ei-si)/2;
//                 mergeSort(arr,si,mid);
//                 mergeSort(arr,mid+1,ei);
//                 merge(arr,si,mid,ei);
//         }
//         public static void merge(int arr[],int si,int mid,int ei){
//                 int temp[]= new int[ei-si+1];
//                 int i=si;
//                 int j=mid+1;
//                 int k=0;
//                 while(i<=mid&&j<=ei){
//                         if(arr[i]<arr[j]){
//                                 temp[k++]=arr[i++];
//                         }else{
//                                 temp[k++]=arr[j++];
//                         }
//                 }
//                 while(i<=mid){
//                         temp[k++]=arr[i++];
//                 }
//                 while(j<=ei){
//                         temp[k++]=arr[j++];
//                 }
//                 for( i=si,k=0;k<temp.length;i++,k++){
//                         arr[i]=temp[k];
//                 }
//         }
//         public static void printArr(int arr[]){
//                 for(int i=0;i<arr.length;i++){
//                         System.out.print(arr[i]+" ");
//                 }
//         }
//         public static void main(String args[]){
//                 int arr[]={4,3,2,5,1};
//                 mergeSort(arr,0,arr.length-1);
//                 printArr(arr);
//         }
// }
//quicksort 
// import java.util.*;
// public class javabasics{
//         public static void quickSort(int arr[],int si,int ei){
//                 if(si>=ei){
//                         return;
//                 }
//                 int mid = si+(ei-si)/2;
//                 int pidx = partition(arr,si,ei);
//                 quickSort(arr,si,pidx-1);
//                 quickSort(arr,pidx+1,ei);
//         }
//         public static int partition(int arr[],int si,int ei){
//                 int pivot = arr[ei];
//                 int i=si-1;
//                 for(int j=si;j<ei;j++){
//                         if(arr[j]<pivot){
//                                 i++;
//                                 int temp = arr[i];
//                                 arr[i]=arr[j];
//                                 arr[j]=temp;
//                         }
//                 }
//                 i++;
//                 int temp = pivot;
//                 arr[ei]=arr[i];
//                 arr[i]=temp;
//                 return i;
//         }
//         public static void printArr(int arr[]){
//                 for(int i=0;i<arr.length;i++){
//                         System.out.print(arr[i]+" ");
//                 }
//         }
//         public static void main(String args[]){
//                 int arr[]={4,2,5,1,3};
//                 quickSort(arr,0,arr.length-1);
//                 printArr(arr);
//         }
// }
//search in rotated sorted array 
// import java.util.*;
// public class javabasics{
//         public static int search(int arr[],int tar,int si,int ei){
//                 if(si>ei){
//                         return -1;
//                 }
//                 int mid = si+(ei-si)/2;
//                 if(arr[mid]==tar){
//                         return mid;
//                 }
//                 if(arr[si]<=arr[mid]){
//                         if(arr[si]<=tar&&arr[mid]>=tar){
//                                 return search(arr,tar,si,mid-1);
//                         }else{
//                                 return search(arr,tar,mid+1,ei);
//                         }
//                 }else{
//                         if(arr[ei]>=tar&&arr[mid]<=tar){
//                                 return search(arr,tar,mid+1,ei);
//                         }else{
//                                 return search(arr,tar,si,mid-1);
//                         }
//                 }
//         }
//         public static void main(String args[]){
//                 int arr[]={3,4,5,6,0,1,2};
//                 int tar=0;
//                 int a = search(arr,tar,0,arr.length-1);
//                 System.out.println(a);
//         }
// }
// ************************************************************************************************************************************
// 20/3/24
//space and time complexity 
// Order complexity analysis
//amount of space or time taken up by an algorithm/code as function of input size.not the actual time taken
//linear search 
// case 1 t directly proportional to n
// case 2 t is constant
// time complexity = O(n)(linear)
//experimental analysis 
//theoritical analysis
// if we want to take out smallest and largest from the sorted part is O(1)(constant)
//we always try to find the worst case complexity 
//Big o Notation 
// upper bound 
//(worst case )
//Big omega notation
//lower bound 
//(best case )
//Big theata notation 
//avg bound 
//lower bound = upper bound then avg bound is same 
// Common complexities 
// O(1) = staright line 
// O(logn) = 
// O(n) = linear
// O(n^2)=
// O(2^n)=exponential 
//space complexity 
// memory / space -> heap(object) and stack(functions)
// input space + auxiliary space 
//Theoritical analysis 
// loops 
// for(int i=0;i<n;i++){
//         //some constant work 
//         //is done in this loop
// }
// O(n)
// nested loop 1 
// for(int i=0;i<n;i++){
//         for(int j=i+1;j<n;j++){
//                 //some constant work
//                 //is done in this loop
//         }
// }
// (worstcase )*outerloop + (worst case )*inner loop 
//total operation run = n+n-1+n-2+....... = O(n^2)
//nested loop 2 
// for(int i=0;i<n;i++){
//         for(int j=0;j<i;j++){

//         }
// }
// O(n^2)
// nested loop 3
// k<n
// for(int i=0;i<n;i+k){
//         for(int j=i+1;j<=k;j++){

//         }
// }
// O(n)
// worst case 
//bubble sort =O(n^2)
//best case =O(n^2)
// for optimized bubble sort 
// wc = O(n^2)
// bs = O(n)
//Binary search 
// tc= O(log n)
//recursive algorithm 
// two types linear and merge 
// linear = total work done = no of call * work in each cell 
// binary = recuurrenc equation 
// space complexity = max depth * memory in each cell 
// factorial 
// no of call = n ;
// work = constant ;
// tc = O(n);
// sc = O(n);
//sum of n no analysis
// tc = O(n)
// sc = O(n)
//fibo analysis 
// tc = O(2^n)
// sc= O(n)
//golden ratio
//master theoram 
//merge sort 
// tc = O(nlogn)(best and worst)
// sc = O(n)
//power function 
// tc=O(n)
// sc=O(n)
//power function optimized 
// tc =log n
// sc = log n
//how to approach coding question 
// 1. brute force 
// 2. optimize it by time 
// 3. optimize by space 
// ***********************************************************************************************************************************
// write a program to implement static nested class and check whether static and non static data memebers of outer class is accesseble to static nested class
// 2. write a program to implement innner class and check whether private members of outer class are accessible to inner class and whether static and non static 
// data members are  accessible 
// 3. write a program to implement static methods with use of non static fields .
// 4. can we write any access modifier for inner classes verify it . 
// 1.)
// import java.util.*;
//         class Outer {
//                 private static String so = "SO";
//                 private String nso= "NSO";
            
//                 static class StaticNested {
//                     void accessOuter() {
//                         System.out.println("Accessing static member of Outer class: " + so);
//                         // Non-static members of Outer class are not accessible from static nested class
//                         // System.out.println("Accessing non-static member of Outer class: " + nso);
//                     }
//                 }
//         }
            
//             public class javabasics {
//                 public static void main(String[] args) {
//                     Outer.StaticNested nested = new Outer.StaticNested();
//                     nested.accessOuter();
//                 }
//             }
// 2.)

// class Outer {
//         private String po = "Private Outer";
//         static String so= "Static Outer";
    
//         class Inner {
//             void accessOuter() {
//                 // Private members of Outer class are accessible in Inner class
//                 System.out.println("Accessing private member of Outer class: " + po);
//                 System.out.println("Accessing static member of Outer class: " + so);
//             }
//         }
//     }
    
//     public class javabasics {
//         public static void main(String[] args) {
//             Outer outer = new Outer();
//             Outer.Inner inner = outer.new Inner();
//             inner.accessOuter();
//         }
//     }
    
// 3.)
// class Example {
//         private int num = 10;
    
//         public static void staticMethod() {
//             // Static methods cannot access non-static fields directly
//             // System.out.println(num); // This would result in a compilation error
//         }
    
//         public int getNum() {
//             return num;
//         }
//     }
    
//     public class javabasics {
//         public static void main(String[] args) {
//             Example example = new Example();
//             // Accessing non-static field through an instance
//             System.out.println("Value of num: " + example.getNum());
//         }
//     }
// ****************************************************************************************************************************************************************
// 21/3/24
// backtracking 
// Backtracking on Arrays
// import java.util.*;
// public class javabasics{
//         public static void printArr(int arr[]){
//                 for(int i=0;i<arr.length;i++){
//                         System.out.print(arr[i]+" ");
//                 }
//                 System.out.println();
//         }
//         public static void changeArr(int arr[],int i,int val){
//                 //base case 
//                 if(i==arr.length){
//                         printArr(arr);
//                         return;
//                 }
//                 //kaam 
//                 arr[i]=val;
//                 changeArr(arr,i+1,val+1);
//                 arr[i]=arr[i]-2;
//         }
//         public static void main(String args[]){
//                 int arr[] = new int[5];
//                 changeArr(arr,0,1);
//                 printArr(arr);
//         }
// }
//Backtracking to find subsets of string 
// import java.util.*;
// public class javabasics{
//         public static void findSubsets(String str, String ans,int i){
//                 //base case 
//                 if(i==str.length()){
//                         if(ans.length()==0){
//                                 System.out.println("null");
//                         }else{
//                                 System.out.println(ans);
//                         }
//                         return;
//                 }
//                 //kaam 
//                 // choice yes
//                 findSubsets(str,ans+str.charAt(i),i+1);
//                 //choice no 
//                 findSubsets(str,ans,i+1);
//         }
//         public static void main(String args[]){
//                 String str = "abc";
//                 String ans="";
//                 findSubsets(str,ans,0);
//         }
// }
//permutation of string by backtracking 
// import java.util.*;
// public class javabasics{
//         public static void findPermutations(String str,String ans){
//                 if(str.length()==0){
//                         System.out.println(ans);
//                         return;
//                 }
//                 // recursion 
//                 for(int i=0;i<str.length();i++){
//                         char curr =str.charAt(i);
//                         String Newstr = str.substring(0,i)+str.substring(i+1);
//                         findPermutations(Newstr,ans+curr);
//                 }
//          }
//         public static void main(String args[]){
//                 String str = "abc";
//                 String ans = "";
//                 findPermutations(str,ans);
//         }
// }
//N-Queens by back tracking 
//nqueens in nrows 
// import java.util.*;
// public class javabasics{
//         public static boolean isSafe(char Board[][],int row,int col){
//                 //vertical up 
//                 for(int i=row-1;i>=0;i--){
//                         if(Board[i][col]=='Q'){
//                                 return false;
//                         }
//                 }
//                 //diagonal leftup
//                 for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
//                         if(Board[i][j]=='Q'){
//                                 return false;
//                         }
//                 }
//                 //diagonal rightup
//                 for(int i=row-1,j=col+1;i>=0&&j<Board.length;i--,j++){
//                         if(Board[i][j]=='Q'){
//                                 return false;
//                         }
//                 }
//                 return true;
//         }
//         public static void Nqueens(char Board[][],int row){
//                 if(row==Board.length){
//                         printBoard(Board);
//                         return;
//                 }
//                 for(int j=0;j<Board.length;j++){
//                         if(isSafe(Board,row,j)){
//                         Board[row][j]='Q';
//                         Nqueens(Board,row+1);
//                         Board[row][j]='X';
//                         }
//                 }
//         }
//         public static void printBoard(char Board[][]){
//                 System.out.println("__________________chess board_______________________");
//                 for(int i=0;i<Board.length;i++){
//                         for(int j=0;j<Board.length;j++){
//                                 System.out.print(Board[i][j]+" ");
//                         }
//                         System.out.println();
//                 }
//         }
//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);
//                 int n=sc.nextInt();
//                 char Board[][] = new char[n][n];
//                 for(int i=0;i<n;i++){
//                         for(int j=0;j<n;j++){
//                                 Board[i][j]='X';
//                         }
//                 }
//                 Nqueens(Board,0);
//         }
// }
// TC  = O(n!)
//count ways ie. total no of ways in which we can solve N queens problem
// import java.util.*;
// public class javabasics{
//         class B{

//         }
//         static class C{

//         }
//         public  void someMethod(){
//                 class D{

//                 }
//         }
//         public static void main(String args[]){

//         }
// }
// import java.util.*;
// public class javabasics{
//         public class FinalParameter {
//                 public void printValue(final int value) {
//                     // Attempting to modify the value will result in a compilation error
//                 //     value = 20;
//                     System.out.println("Value: " + value);
//                 }
//             }
            
//         public final class FinalClass {
//                 // Class implementation
//             }
            
//             // Attempting to inherit from a final class will result in a compilation error
//         //     public class SubClass extends FinalClass {
//         //         // Class implementation
//         //     }
            
//         public class Parent {
//                 public final void display() {
//                         System.out.println("This is a final method.");
//                 }
//         }
        
//         public class Child extends Parent {
//                 // Attempting to override the final method will result in a compilation error
//                 // public void display() {
//                         //             System.out.println("This method cannot be overridden.");
//                         //         }
//                 }
                
//                 public static void main(String[] args) {
//                         final int x = 10;
//                         // Attempting to change the value of x will result in a compilation error
//                         //     x = 20;
//                         System.out.println("Value of x: " + x);
//                         javabasics obj = new javabasics();
//                         javabasics.FinalParameter jf  = obj.new FinalParameter();
//                         jf.printValue(30);               
//                 }
//             }

// import java.util.*;
// public class javabasics{
//         public static void main(String args[]){
//                 int array[]={1,2,3,5};
//                 int n=5;
//                 int c=0;
//         Arrays.sort(array);
//         int arr[]= new int[n];
//         for(int i=1;i<arr.length+2;i++){
//             arr[array[i]]++;
//         }
//         for(int i=1;i<arr.length+2;i++){
//                 System.out.print(arr[i]+" ");
//             if(arr[i]==0){
//                 c=arr[i];
//         }
//         }
//         System.out.println(c+" ");

//         }
// }
        
// import java.util.*;

// public class javabasics {
//     public static void main(String args[]) {
//         int array[] = {1, 2, 3, 5};
//         int n = 5; // Assuming n is the maximum value in the array
//         int c = 0;

//         Arrays.sort(array);
//         int arr[] = new int[n + 1]; // Adding 1 to account for the maximum value

//         for (int i = 0; i < array.length; i++) {
//             arr[array[i]]++;
//         }

//         for (int i = 1; i < arr.length; i++) {
//         //     System.out.print(arr[i] + " ");
//             if (arr[i] == 0) {
//                 System.out.println(i);
//             }
//         }
//         // System.out.println(c);
//     }
// }
// 23/3/24
// import java.util.*;
// public class javabasics{
//     public static int gridWays(int i,int j,int n,int m){
//         if(i==n-1 && j==m-1){//condn for last cell
//             return 1;
//         }else if(i==n||j==n){//boundary condn
//             return 0;
//         }
//         int w1=gridWays(i+1,j,n,m);
//         int w2 = gridWays(i,j+1,n,m);
//         return w1+w2;
//     }
//     public static void main(String args[]){
//         int n=3,m=3;
//         System.out.println(gridWays(0,0,n,m));
//     }
// }
// *******************************************************************************88888
// 24/4/23
//forming the largest no from the string array 
// import java.util.Arrays;
// import java.util.Comparator;

// public class javabasics {
//     public static void main(String[] args) {
//         // Example array of strings representing numbers
//         String[] numbers = {"10", "5", "20", "30", "15"};

//         // Sort the array based on a custom comparator
//         Arrays.sort(numbers, new Comparator<String>() {
//             @Override
//             public int compare(String a, String b) {
//                 String order1 = a + b;
//                 String order2 = b + a;
//                 System.out.println(order1);
//                 System.out.println(order2);
//                 // Reverse order to sort in descending order
//                 System.out.println("The larger one is : "+order2.compareTo(order1));
//                 return order2.compareTo(order1);
//             }
//         });

//         // Concatenate the sorted numbers to form the largest number
//         StringBuilder largestNumber = new StringBuilder();
//         for (String number : numbers) {
//             largestNumber.append(number);
//         }

//         // Print the largest number
//         System.out.println("Largest number: " + largestNumber.toString());
//     }
// }
// import java.util.*;
// public class javabasics{
//     public static void Sort(String arr[]){
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 if(compare(arr[j],arr[i])<0){
//                     String temp = arr[i];
//                     arr[i]=arr[j];
//                     arr[j]=temp;
//                 }
//             }
//         }
//     }
//     public static int compare(String a,String b){
//         String ab= a+b;
//         String ba = b+a;
//         System.out.println(ba.compareTo(ab));
//         return ba.compareTo(ab);
//     }
//     public static void main(String args[]){
//         String arr[] = {"10","5","20","30","15"};
//         Sort(arr);
//         StringBuilder sb = new StringBuilder("");
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//             sb.append(arr[i]);
//         }
//         System.out.println(sb.toString());
//     }
// }
// import java.util.Arrays;

// public class javabasics {
//     public static void main(String[] args) {
//         // Example array of strings representing numbers
//         String[] numbers = {"10", "5", "20", "30", "15"};

//         // Sort the array based on custom sorting order
//         Arrays.sort(numbers, (a, b) -> (b + a).compareTo(a + b));

//         // Concatenate the sorted numbers to form the largest number
//         StringBuilder largestNumber = new StringBuilder();
//         for (String number : numbers) {
//             largestNumber.append(number);
//         }

//         // Print the largest number
//         System.out.println("Largest number: " + largestNumber.toString());
//     }
// }
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         String arr[]={"10","30","40","3","5"};
//         Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));
//         StringBuilder sb = new StringBuilder("");
//         for(int i=0;i<arr.length;i++){
//             sb.append(arr[i]);
//         }
//         System.out.println(sb);
//     }
// }
//space optimization using bit manipulation 
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int a =2;
//         int b= 10;
//         int arr[] = new int[(b-a)+1];
//         for(int i=a;i<=b;i++){
//             if(i%2==0||i%5==0){
//                 arr[i-a]=1;
//             }
//         }
//         for(int i=a;i<=b;i++){
//             if(arr[i-a]==1){
//                 System.out.print(i+" ");
//             }
//         }

//     }
// }
// public class javabasics {
//     public static void main(String[] args) {
//         int[] nums = {4, 5, 0, -2, -3, 1};
//         int k = 5;
//         System.out.println("Maximum subarray sum divisible by " + k + ": " + maxSubarraySumDivisibleByK(nums, k));
//     }

//     public static int maxSubarraySumDivisibleByK(int[] nums, int k) {
//         int maxSum = 0;
//         int currentSum = 0;

//         for (int num : nums) {
//             currentSum = (currentSum + num) % k; // Calculate the remainder of currentSum % k
//             if (currentSum < 0) {
//                 currentSum += k; // Handle negative remainders
//             }
//             maxSum = Math.max(maxSum, currentSum);
//         }

//         return maxSum;
//     }
// }
//next permutations 
// import java.util.*;
// public class javabasics{
//     public static void nextPer(int arr[]){
//         int i=arr.length-2;
//         while(i>=0 && arr[i]>=arr[i+1]){
//             i--;
//         }
//         if(i>=0){
//             int j=arr.length-1;
//             while(j>=0&& arr[j]<=arr[i]){
//                 j--;
//             }
//             swap(arr,i,j);
//         }
//         reverse(arr,i+1);
//     }
//     public static void swap(int arr[],int i,int j){
//         int temp =arr[i];
//         arr[i]=arr[j];
//         arr[j]=temp;
//     }
//     private static void reverse(int arr[],int start){
//         int i=start,j=arr.length-1;
//         while(i<j){
//             swap(arr,i,j);
//             i++;
//             j--;
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {1,2,3};
//         nextPer(arr);
//         System.out.println(Arrays.toString(arr));
//     }
// }
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){

//     }
// }
// import java.util.*;
// import java.text.*;
// import java.util.Calendar;

// class Date {
//     int year, month, day;

//     Date(int year, int month, int day) {
//         this.year = year;
//         this.month = month;
//         this.day = day;
//     }

//     void displayDate() {
//         System.out.println(month + "/" + day + "/" + year);
//     }
// }

// class DateFormat {
//     static String formatDate(Date date) {
//         return date.month + "/" + date.day + "/" + date.year;
//     }
// }

// class Calendar {
//     static Date getCurrentDate() {
//         Calendar cal = Calendar.getInstance();
//         int year = cal.get(Calendar.YEAR);
//         int month = cal.get(Calendar.MONTH) + 1;
//         int day = cal.get(Calendar.DAY_OF_MONTH);
//         return new Date(year, month, day);
//     }

//     static String getCurrentTime() {
//         Calendar cal = Calendar.getInstance();
//         int hour = cal.get(Calendar.HOUR_OF_DAY);
//         int minute = cal.get(Calendar.MINUTE);
//         int second = cal.get(Calendar.SECOND);
//         return hour + ":" + minute + ":" + second;
//     }
// }

// public class javabasics {
//     public static void main(String[] args) {
//         // Create Date object
//         Date myDate = new Date(2024, 3, 27);

//         // Display Date
//         System.out.print("Date: ");
//         myDate.displayDate();

//         // Format Date
//         String formattedDate = DateFormat.formatDate(myDate);
//         System.out.println("Formatted Date: " + formattedDate);

//         // Get current date and time using Calendar class
//         Date currentDate = Calendar.getCurrentDate();
//         String currentTime = Calendar.getCurrentTime();
//         System.out.println("Current Date: ");
//         currentDate.displayDate();
//         System.out.println("Current Time: " + currentTime);
//     }
// }
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
        
//                 long maxValue = Long.MAX_VALUE;
//                 System.out.println("Maximum value of long: " + maxValue);
//                 System.out.println(System.currentTimeMillis());
        
//     }
// }
// import java.util.*;
// class MyThread extends Thread{
//         public void run(){
//                 System.out.println("Thread Started");
//                 try{
//                         Thread.sleep(1);
//                 }catch(InterruptedException e){
//                         e.printStackTrace();
//                 }
//                 System.out.println("Thread finished");
//         }
// }
// class MyRunnable implements Runnable{
//         public void run(){
//                 System.out.println("Runnable Thread Started");
//                 try{
//                         Thread.sleep(3);
//                 }catch(InterruptedException e){
//                         e.printStackTrace();
//                 }
//                 System.out.println("Runnable Thread Finished");
//         }
// }
// public class javabasics{
//         public static void main(String args[]){
//                 MyThread thread = new MyThread();
//                 thread.start();
//                 MyRunnable runnable = new MyRunnable();
//                 Thread thread2 = new Thread(runnable);
//                 thread2.start();
//                 // try{
//                 //         thread.join();
//                 //         thread2.join();
//                 // }catch(InterruptedException e){
//                 //         e.printStackTrace();
//                 // }
//                 System.out.println("is thread alive : "+thread.isAlive());
//                 System.out.println("is thread2 alive : "+thread2.isAlive());

//         }
// }
// public class javabasics {
//         public static void main(String[] args) {
//             // Original number
//             double number = 123.456789;
    
//             // Round to two decimal places
//             double roundedNumber = Math.round(number * 100.0) / 100.0;
    
//             System.out.println(roundedNumber); // Output: 123.46
//         }
//     }
    
// import java.text.DecimalFormat;

// public class javabasics {
//     public static void main(String[] args) {
//         // Original number
//         double number = 123.4999;

//         // Create a DecimalFormat object with pattern for two decimal places
//         DecimalFormat decimalFormat = new DecimalFormat("#.##");

//         // Format the number to two decimal places
//         String formattedNumber = decimalFormat.format(number);

//         System.out.println(formattedNumber); // Output: 123.46
//     }
// }
// ****************************************************************************************************************************
// 31/3/24
// ArrayList
// (inbuilt data structure)
// linear ds 
//arrays compared with arraylist 
// arrays have fixed size but arraylist have dynamic size 
// in arrays we can store primitive data types but in arraylist primitive data types can't be stored directly
// import java.util.*;
// public class javabasics{
//         public static void main(String args[]){
//                 //vector in c++;
//                 //java collection framwork
//                 //classname objectname = new classname();
//                 ArrayList<Integer>list = new ArrayList<>();
//                 ArrayList<String>list2=new ArrayList<>();
//                 ArrayList<Boolean>list3=new ArrayList<>();
//         }
// }
//operation on arraylist 
// 1.add element tc = O(1);
//2.get element tc=O(1)
// 3. remove elment tc=O(n) 
//4. set element tc=O(n) 
//5. contains element tc=O(n)
// import java.util.*;
// public class javabasics{
//         public static void main(String args[]){
//                 ArrayList<Integer> list  = new ArrayList<>();
//                 list.add(1);
//                 list.add(2);
//                 list.add(3);
//                 list.add(4);
//                 // System.out.println(list);
//                 list.add(5);
//                 System.out.println(list);
//                 //get operation tcO(1)
//                 int element = list.get(2);
//                 System.out.println(element);
//                 //delete 
//                 list.remove(2);
//                 System.out.println(list);
//                 //set 
//                 list.set(2,10);
//                 System.out.println(list);
//                 // contains 
//                 System.out.println(list.contains(1));
//                 System.out.println(list.contains(11));
//                 //diff type of add function 
//                 list.add(2,3);//tc=O(n)
//                 System.out.println(list);
//         }
// }
//size of al 
// import java.util.*;
// public class javabasics{
//         public static void main(String args[]){
//                 ArrayList<Integer> list = new ArrayList<>();
//                 list.add(1);
//                 list.add(2);
//                 list.add(3);
//                 list.add(4);
//                 list.add(5);
//                 System.out.println(list.size());
//                 //printint array list 
//                 for(int i=0;i<list.size();i++){
//                         System.out.print(list.get(i)+" ");
//                 }
//                 System.out.println();
//         }
// }
//reverse of array list 
// import java.util.*;
// public class javabasics{
//         public static void main(String args[]){
//                 ArrayList<Integer> list = new ArrayList<>();
//                 list.add(1);
//                 list.add(2);
//                 list.add(3);
//                 list.add(4);
//                 list.add(5);
//                 //reverse print 
//                 for(int i=list.size()-1;i>=0;i--){
//                         System.out.print(list.get(i)+" ");
//                 }
//                 System.out.println();
//         }
// }
//find maximum in array list 
// import java.util.*;
// public class javabasics{
//         public static void main(String args[]){
//                 ArrayList<Integer> list = new ArrayList<>();
//                 list.add(13);
//                 list.add(15);
//                 list.add(100);
//                 list.add(10);
//                 list.add(1);
//                 int max = Integer.MIN_VALUE;
//                 for(int i=0;i<list.size();i++){
//                         // if(max<list.get(i)){
//                         //         max=list.get(i);
//                         // }
//                         max = Math.max(max,list.get(i));
//                 }
//                 System.out.println("max element = "+max);
//         }
// }
//swap two numbers 
// import java.util.*;
// public class javabasics{
//         public static void swap(ArrayList<Integer> list,int idx1,int idx2){
//                 int temp = list.get(idx1);
//                 list.set(idx1,list.get(idx2));
//                 list.set(idx2,temp);
//         }
//         public static void main(String args[]){
//                 ArrayList<Integer> list = new ArrayList<>();
//                 list.add(2);
//                 list.add(5);
//                 list.add(9);
//                 list.add(3);
//                 list.add(6);
//                 System.out.println(list);
//                 int idx1=1;
//                 int idx2=3;
//                 swap(list,idx1,idx2);
//                 System.out.println(list);
//         }
// }
// import java.util.*;
// public class javabasics{
//         public static void swap(ArrayList<Integer> list , int i1,int i2){
//                 int temp = list.get(i1);
//                 list.set(i1,list.get(i2));
//                 list.set(i2,temp);
//         }
//         public static void main(String args[]){
//                 ArrayList<Integer> list = new ArrayList<>();
//                 list.add(1);
//                 list.add(2);
//                 list.add(3);
//                 list.add(4);
//                 list.add(5);
//                 System.out.println(list);
//                 int i1 = 0;
//                 int i2 = 4;
//                 swap(list,i1,i2);
//                 System.out.println(list);
//         }
// }
//sorting an array list 
// Collections.sort()
// import java.util.*;
// public class javabasics{
//         public static void main(String args[]){
//                 ArrayList<Integer>list = new ArrayList<>();
//                 list.add(5);
//                 list.add(2);
//                 list.add(1);
//                 list.add(3);
//                 list.add(4);
//                 System.out.println(list);
//                 Collections.sort(list);//ascending
//                 System.out.println(list);
//                 Collections.sort(list,Collections.reverseOrder());//descending
//                 //comparator = fnx logic 
//                 System.out.println(list);
//         }
// }
//arraylist implementation in java
// when compiler ie.java version feels like arraylist is full it doubles it size and so on . 
//multidimensional arraylist 
// 2D ArrayList 
// import java.util.*;
// public class javabasics{
//         public static void main(String args[]){
//                 ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
//                 ArrayList<Integer> list = new ArrayList<>();
//                 list.add(1);list.add(2);
//                 mainList.add(list);
//                 ArrayList<Integer> list2 = new ArrayList<>();
//                 list2.add(3);list2.add(4);
//                 mainList.add(list2);
//                 System.out.println(mainList);
//                 for(int i=0;i<mainList.size();i++){
//                         ArrayList<Integer> currList = mainList.get(i);
//                         for(int j=0;j<currList.size();j++){
//                                System.out.print(currList.get(j)+" "); 
//                         }
//                         System.out.println();
//                 }
//         }
// }
//three list in list 
// import java.util.*;
// public class javabasics{
//         public static void main(String args[]){
//                 ArrayList <ArrayList<Integer>> mainList = new ArrayList<>();
//                 ArrayList<Integer> list = new ArrayList<>();
//                 // list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
//                 ArrayList<Integer> list2  =new ArrayList<>();
//                 // list2.add(2);list2.add(4);list2.add(6);list2.add(8);list2.add(10);
//                 ArrayList<Integer> list3 = new ArrayList<>();
//                 // list3.add(3);list3.add(6);list3.add(9);list3.add(12);list3.add(15);
//                 // mainList.add(list);mainList.add(list2);mainList.add(list3);
//                 System.out.println(mainList);
//                 for(int i=1;i<=5;i++){
//                         list.add(i*1);
//                         list2.add(i*2);
//                         list3.add(i*3);
//                 }
//                 mainList.add(list);
//                 mainList.add(list2);
//                 mainList.add(list3);
//                 System.out.println(mainList);
//                 for(int i=0;i<mainList.size();i++){
//                         ArrayList<Integer> currList = mainList.get(i);
//                         for(int j=0;j<currList.size();j++){
//                                 System.out.print(currList.get(j)+" ");
//                         }
//                         System.out.println();
//                 }
//         }
// }
//container with most water 
// import java.util.*;
// public class javabasics{
//         public static int storeWater(ArrayList<Integer>height){//two pointer approach O(n)
//                 int maxWater = 0;
//                 int lp = 0;
//                 int rp = height.size()-1;
//                 while(lp<rp){
//                         //clculate water area
//                         int ht = Math.min(height.get(lp),height.get(rp));
//                         int width = rp-lp;
//                         int currWater  = ht*width;
//                         maxWater = Math.max(maxWater,currWater);
//                         //update pointer
//                         if(height.get(lp)<height.get(rp)){
//                                 lp++;
//                         }else{
//                                 rp--;
//                         }
//                 }
//                 return maxWater;
//         }
//         // public static int storeWater(ArrayList<Integer>height){//O(n^2)//brute force approach 
//         //         int maxWater =0;
//         //         //brute force -O(n^2)
//         //         for(int i=0;i<height.size();i++){
//         //                 for(int j=i+1;j<height.size();j++){
//         //                         int ht = Math.min(height.get(i),height.get(j));
//         //                         int width=j-i;
//         //                         int currWater = ht*width;
//         //                         maxWater=Math.max(maxWater,currWater);
//         //                 }
//         //         }
//         //         return maxWater;
//         // }
//         public static void main(String args[]){
//                 ArrayList<Integer>height = new ArrayList<>();
//                 height.add(1);
//                 height.add(8);
//                 height.add(6);
//                 height.add(2);
//                 height.add(5);
//                 height.add(4);
//                 height.add(8);
//                 height.add(3);
//                 height.add(7);
//                 System.out.println(storeWater(height));

//         }
// }
//Pair sum 1 in sorted arraylist
// import java.util.*;
// public class javabasics{
//         public static boolean pairSum2(ArrayList<Integer>list,int target){//two pointer approach O(n)
//                 int lp = 0;
//                 int rp = list.size()-1;
//                 while(lp<rp){
//                         if(list.get(lp)+list.get(rp)==target){
//                                 return true;
//                         }else if(list.get(lp)+list.get(rp)<target){
//                                 lp++;
//                         }else{
//                                 rp--;
//                         }
//                 }
//                 return false;
//         }
//         public static boolean pairSum1(ArrayList<Integer>list,int target){//Brute force approach O(n^2)
//                 for(int i=0;i<list.size();i++){
//                         for(int j=i+1;j<list.size();j++){
//                                 if((list.get(i)+list.get(j))==target){
//                                         return true;
//                                 }
//                         }
//                 }
//                 return false;
//         }
//         public static void main(String args[]){
//                 ArrayList<Integer>list = new ArrayList<>();
//                 list.add(1);list.add(2);list.add(3);
//                 list.add(4);list.add(5);list.add(6);
//                 int target =5;
//                 System.out.println(pairSum1(list,target));
//                 System.out.println(pairSum2(list,target));
//         }
// }
//pair sum 2 in sorted and rotated arraylist 
// import java.util.*;
// public class javabasics{
//         public static boolean pairSum2(ArrayList<Integer>list,int target){//two pointer approach O(n)
//                 //find pivot 
//                 int pivot =0;
//                 for(int i=0;i<list.size();i++){
//                         if(list.get(i)>list.get(i+1)){
//                                 pivot = (i+1);
//                                 break;
//                         }
//                 }
//                 int lp = pivot;
//                 int rp = pivot-1;
//                 int n=list.size();
//                 while(lp!=rp){
//                         if((list.get(lp)+list.get(rp))==target){
//                                 return true;
//                         }else if((list.get(lp)+list.get(rp))<target){
//                                 lp=(lp+1)%n;
//                         }else{
//                                 rp=(n+rp-1)%n;
//                         }
//                 }
//                 return false;
//         }
//         public static boolean pairSum(ArrayList<Integer> list,int target){//Brute force O(n^2)
//                 for(int i=0;i<list.size();i++){
//                         for(int j=i+1;j<list.size();j++){
//                                 if((list.get(i)+list.get(j))==target){
//                                         return true;
//                                 }
//                         }
//                 }
//                 return false;
//         }
//         public static void main(String args[]){
//                 ArrayList<Integer> list = new ArrayList<>();
//                 list.add(11);
//                 list.add(15);
//                 list.add(6);
//                 list.add(8);
//                 list.add(9);
//                 list.add(10);
//                 int target = 16;
//                 System.out.println(pairSum2(list,target));
//                 System.out.println(pairSum2(list,target));
//         }
// }
//HW
// Question 1 :Monotonic ArrayList(EASY)An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
// AnArraylistnumsismonotoneincreasingifforalli<=j,nums.get(i)<=nums.get(j).AnArraylist nums is monotone decreasing if for all i <= j, 
// nums.get(i) >= nums.get(j).Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise.
// Sample Input 1: nums = [1,2,2,3]Sample Output 1: true
// Sample Input 2: nums = [6,5,4,4]Sample Output 2: true
// Sample Input 3: nums = [1,3,2]Sample Output 3: false
// import java.util.*;
// public class javabasics{
//         public static boolean monotonicArrayList(ArrayList<Integer>list){
//                 int c=0;
//                 int d=0;
//                 int e = list.size();
//                 for(int i=0;i<list.size()-1;i++){
//                         if(list.get(i)>=list.get(i+1)){
//                                 c++;
//                         }
//                         if(list.get(i)<=list.get(i+1)){
//                                 d++;
//                         }
//                 }
//                 if(c==e-1||d==e-1){
//                         return true;
//                 }
//                 return false;
//         }
//         public static void main(String args[]){
//                 ArrayList<Integer> list = new ArrayList<>();
//                 list.add(1);
//                 list.add(2);
//                 list.add(3);
//                 list.add(4);
//                 System.out.println("List 1 : "+list);
//                 System.out.println(monotonicArrayList(list));
//                 ArrayList<Integer>list2 = new ArrayList<>();
//                 list2.add(6);
//                 list2.add(5);
//                 list2.add(4);
//                 list2.add(4);
//                 System.out.println("List 2: "+list2);
//                 System.out.println(monotonicArrayList(list2));
//                 ArrayList<Integer>list3 =  new ArrayList<>();
//                 list3.add(1);
//                 list3.add(3);
//                 list3.add(2);
//                 System.out.println("List 3 : "+list3);
//                 System.out.println(monotonicArrayList(list3));
//         }
// }
// Question 2 :Lonely Numbers in ArrayList(MEDIUM)Youaregivenanintegerarraylistnums.Anumberxislonelywhenitappearsonlyonce,andno adjacent numbers (i.e. x + 1 and x - 1) 
// appear in the arraylist.Return all lonely numbers in nums. You may return the answer in any order.
// Sample Input 1: nums = [10,6,5,8]Sample Output 1: [10,8]
// Explanation :- 10 is a lonely number since it appears exactly once and 9 and 11 does not appear in nums.- 8 is a lonely number since it appears exactly once and
//  7 and 9 does not appear in nums.- 5 is not a lonely number since 6 appears in nums and vice versa.Hence, the lonely numbers in nums are [10, 8].
//  Note that [8, 10] may also be returned.
//  Sample Input 2: nums = [1,3,5,3]Sample Output 2: [1,5]
//  Explanation :- 1 is a lonely number since it appears exactly once and 0 and 2 does not appear in nums.- 5 is a lonely number since it appears exactly once
//  and 4 and 6 does not appear in nums.- 3 is not a lonely number since it appears twice.Hence, the lonely numbers in nums are [1, 5].Note that [5, 1] 
//  may also be returne
// import java.util.*;
// public class javabasics{
//         public static void main(String args[]){
//                 // ArrayList<Integer> list = new ArrayList<>();
//                 // list.add(10);
//                 // list.add(6);
//                 // list.add(5);
//                 // list.add(8);
//                 // System.out.println(list);
//                 // Collections.sort(list);
//                 // System.out.println(list);
//                 ArrayList<Integer> list = new ArrayList<>();
//                 list.add(1);
//                 list.add(3);
//                 list.add(5);
//                 list.add(3);
//                 System.out.println(list);
//                 Collections.sort(list);
//                 System.out.println(list);
//                 ArrayList<Integer> result = new ArrayList<>();
//                 for(int i=1;i<list.size()-1;i++){
//                         if(((list.get(i)==list.get(i+1))||((list.get(i)-list.get(i-1))==0))||(((list.get(i+1)-list.get(i))==1)||((list.get(i)-list.get(i-1))==1))){
//                                 continue;
//                         }else{
//                                 if(i==1){
//                                         result.add(list.get(i-1));
//                                 }
//                                 result.add(list.get(i));
//                                 if(i==list.size()-2){
//                                         result.add(list.get(i+1));
//                                 }
//                         }
//                 }
//                 System.out.println(result);
//         }
// }
// 1/4/24
// revision Array list 
// import java.util.*;
// public class javabasics{
        
// }
// 2/4/24
// backtracking gridways 
// import java.util.*;
// public class javabasics{
//         public static int gridWays(int i,int j,int n,int m){
//                 //base case 
//                 if(i==n-1 && j==m-1){//condition for last cell
//                         return 1;
//                 }else if(i==n||j==n){//boundary cross condition
//                         return 0;
//                 }
//                 int w1 = gridWays(i+1,j,n,m);
//                 int w2 = gridWays(i,j+1,n,m);
//                 return w1+w2;
//         }
//         public static void main(String args[]){
//                 int n=3;
//                 int m=3;
//                 System.out.print(gridWays(0,0,n,m));
//         }
// }
// import java.util.*;
// public class javabasics{
//         public static void main(String argss[]){
//                 int a=45;
//                 int b=10;
//                 int c;
//                 int arr[]={1,2,3,4,5};
//                 arr[3]=4;
//                 try{
//                         c=a/b;
//                         System.out.println(c);
//                 }catch(ArrayIndexOutOfBoundsException e1){
//                         System.out.println(e1);
//                 }catch(Exception e){
//                         System.out.println(e);
//                 }
//                 System.out.println("Hello");
//         }
// } 
// we are implementing key values by uding the sets 
//set stores only unique values 
// import java.util.*;
// class Animal{
//         public void sound(){
//                 System.out.println("Animals makes a sound ");
//         }
// }
// class Dog extends Animal{
//         public void sound(){
//                 System.out.println("Dog barks ");
//         }
// }
// class Cat extends Animal{
//         public void sound(){
//                 System.out.println("Cat meows");
//         }
// }
// public class javabasics{
//         public static void main(String args[]){
//                 List<Animal>animals=new ArrayList<>();
//                 animals.add(new Cat());
//                 animals.add(new Dog());
//                 printSounds(animals);
//                 List<Dog> dogs = new ArrayList<>();
//                 dogs.add(new Dog());
//                 dogs.add(new Dog());
//                 printSounds(dogs);
//                 List<Cat> cats = new ArrayList<>();
//                 cats.add(new Cat());
//                 cats.add(new Cat());
//                 printSounds(cats);
//         }
//         public static void printSounds(List <? extends Animal> animals){
//                 for(Animal animal: animals){
//                         animal.sound();
//                 }
//         }
// }
// // import java.util.*;
// public class javabasics{
//         public static void main(String args[]){
//                 List<Integer>list1 = Arrays.asList(4,5,6,7);
//                 System.out.println("Total sum is: "+sum(list1));
//                 List<Double>list2=Arrays.asList(4.1,5.1,6.1);
//                 System.out.print("Total sum is: "+sum(list2));
//         }
//         private static double sum(List<? extends Number> list){
//                 double sum=0.0;
//                 for(Number i:list){
//                         sum+=i.doubleValue();
//                 }
//                 return sum;
//         }
// }
// upper bound is extends 
// lower bound is super 
// import java.util.*;
// class Animal{
//         public void sound(){
//                 System.out.println("Animals makes a sound ");
//         }
// }
// class Dog extends Animal{
//         public void sound(){
//                 System.out.println("Dog barks ");
//         }
// }
// class Cat extends Animal{
//         public void sound(){
//                 System.out.println("Cat meows");
//         }
// }
// public class javabasics{
//         public static void main(String args[]){
//                 List<Animal>animals=new ArrayList<>();
//                 animals.add(new Cat());
//                 animals.add(new Dog());
//                 printSounds(animals);
//                 List<Dog> dogs = new ArrayList<>();
//                 dogs.add(new Dog());
//                 dogs.add(new Dog());
//                 printSounds(dogs);
//                 List<Cat> cats = new ArrayList<>();
//                 cats.add(new Cat());
//                 cats.add(new Cat());
//                 printSounds(cats);
//         }
//         public static void printSounds(List <? extends Animal> animals){
//                 for(Animal animal: animals){
//                         animal.sound();
//                 }
//         }
// }
// i love you -> malayalam -> enik nine ishtuman
// import java.util.*;
// import java.util.ArrayList;
// class Animal{
//         public void eat(){
//                 System.out.println("Animal is eating...");
//         }
// }
// class Dog extends Animal{
//         public void eat(){
//                 System.out.println("Dog is eating...");
//         }
//         public void bark(){
//                 System.out.println("Woof!");
//         }
// }
// public class javabasics{
//         public static void addDogs(List<? super Dog>list){
//                 list.add(new Dog());
//                 // list.add(new Animal());
//         }
//         public static void main(String args[]){
//                 List<Animal> animals = new ArrayList<>();
//                 addDogs(animals);
//                 for(Animal animal:animals){
//                         animal.eat();
//                 }
//         }
// }
//2/5/24
//Hashmaps 
// HashMap has two values key and values . 
// import java.util.*;
// public class javabasics{
//         public static void main(String args[]){
//                 HashMap<String,Integer> hashMap = new HashMap<>();
//                 hashMap.put("Alice",25);
//                 hashMap.put("Bob",30);
//                 hashMap.put("charlie",35);
//                 hashMap.put("Davi",40);
//                 System.out.println("Age of Alice: "+hashMap.get("Alice"));
//                 System.out.println("Age of charlie: "+hashMap.get("charlie"));
//                 System.out.println("HashMap elements: ");
//                 for(Map.Entry<String,Integer>entry:hashMap.entrySet()){
//                         System.out.println("Name : "+entry.getKey());
//                 }
//                 hashMap.remove("Bob");
//                 System.out.println("HashMap after removing bob: "+hashMap);
//                 System.out.println("Does the HashMap contain key 'David'? "+hashMap.containsKey("David"));
//                 System.out.println("Does the HashMap contain value 30?"+hashMap.containsValue(30) );
//                 System.out.println("size : "+hashMap.size());
//                 hashMap.clear();
//                 System.out.println("AFter clearing : "+hashMap);
                // System.out.pritnln("Kenjkn");

//         }
// }
// import java.util.*;
// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;
// public class javabasics{
//         public static void main(String args[]){
                
//                 LocalDateTime dt = LocalDateTime.now();
//                 System.out.println(dt);
//                 DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-mm-yyyy");
//                 String myDate = dt.format(df);
//                 System.out.println(myDate);
//         }
// }
// import java.util.*;
// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.io.FileNotFoundException;
// public class javabasics{
//         public static void main(String args[]){
//                 /*File myFile = new File("");
//                 try{
//                         myFile.createNewFile();
//                 }catch(IOException e){
//                         System.out.println("Unable to create this file");
//                         e.printStackTrace();
//                 }
//                 */
//                 FileWriter fileWriter = new FileWriter("Greedy.java");
//                 fileWriter.write("This is our file form ");
//                 fileWriter.close();
//                 File myFile = new File("Greedy.java");
//                 try{
//                         Scanner sc = new Scanner(myFile);
//                         while(sc.hasNextLine()){
//                                 String line = sc.nextLine();
//                                 System.out.println(line);
//                         }
//                         sc.close();
//                 }catch(IOException e){
//                         e.printStackTrace();
//                 }
//         }
// }
// import java.io.File;
// import java.io.FileReader;
// import java.io.FileWriter;
// public class javabasics{
//         public static void main(String args[]){
//                 System.out.println("sfdsfadsdf");
//                 File file = new File("abc.txt");
//                 file.createNewFile();
//                 System.out.println(file.exists());
//                 FileWriter fw = new FileWriter(file);
//                 fw.write("hiiiiiiiiiiiiil   sdfasd");
//                 fw.close();
//         }
// }
// import java.util.*;
// import java.text.*;
// import java.util.Date;
// public class javabasics{
//         public static void main(String args[]){
//                 Scanner sc= new Scanner(System.in);
//                 System.out.print("Date 1 : ");
//                 String a = sc.nextLine();
//                 System.out.print("Date 2 : ");
//                 String b= sc.nextLine();
//                 SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//                 try{
//                         Date e = sdf.parse(a);
//                         Date f= sdf.parse(b);
//                         long dm = Math.abs(f.getTime()-e.getTime());
//                         long d=dm/(1000*3600*24);
//                         System.out.println("days: "+d);
//                 }catch(ParseException e){
//                         e.printStackTrace();
//                 }
//         }
// }
// import java.text.ParseException;
// import java.text.SimpleDateFormat;
// import java.util.Date;

// public class DateFormatter {
//     public static void main(String[] args) {
//         // Input date in the format yyyy-MM-dd
//         String inputDateString = "2024-05-08"; // Example input date

//         // Define the input and output date formats
//         SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
//         SimpleDateFormat outputFormat = new SimpleDateFormat("E, MMM dd, yyyy");

//         try {
//             // Parse the input string to a Date object
//             Date date = inputFormat.parse(inputDateString);

//             // Format the Date object to the desired output format
//             String formattedDate = outputFormat.format(date);

//             // Output the formatted date
//             System.out.println("Formatted date: " + formattedDate);

//         } catch (ParseException e) {
//             e.printStackTrace();
//         }
//     }
// }
// import java.util.*;
// import java.text.*;
// import java.util.Date;
// public class javabasics{
//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Date: ");
//                 String a = sc.nextLine();
//                 SimpleDateFormat idf = new SimpleDateFormat("yyyy-MM-dd");
//                 SimpleDateFormat odf = new SimpleDateFormat("EEEE,MMM dd,yyyy");
//                 try{
//                         Date b=idf.parse(a);
//                         String c = odf.format(b);
//                         System.out.println("formated data : "+c);
//                 }catch(ParseException e){
//                         e.printStackTrace();
//                 }
//         }
// }
// import java.util.*;
// import java.text.*;
// import java.util.Date;
// public class javabasics{
//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);
//                 String a  =sc.nextLine();
//                 SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//                 SimpleDateFormat odf = new SimpleDateFormat("EEEE");
//                 try{
//                         Date d = sdf.parse(a);
//                         String c = odf.format(d);
//                         System.out.println("Day of week: "+c);
//                 }catch(ParseException e){
//                         e.printStackTrace();
//                 }
//         }
// }
// import java.util.*;
// public class javabasics{
//         public static void main(String args[]){
//                 System.out.println("vandana sharma");
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter the 1st no: ");
//                 int a =sc.nextInt();
//                 System.out.println("Enter the second no: ");
//                 int b=sc.nextInt();
//                 int r=a*b;
//                 System.out.println(r);
//         }
// }
