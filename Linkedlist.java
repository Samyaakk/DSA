// 04/04/2024
// import java.util.*;
// public class LinkedList{
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//             this.next =null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static void main(String args[]){
//         LinkedList l = new LinkedList();
//         l.head=new Node(1);
//         l.head.next =new Node(2);
        
//     }
// }
// Add in Linked List 
// import java.util.*;
// public class LinkedList{
//     class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public void addFirst(int data){
//         Node newNode = new Node(data);
//         if(head==null){
//             head=tail=newNode;
//             return ;
//         }
//         newNode.next=head;
//         head=newNode;
//     }
//     public void addLast(int data){
//         Node newNode = new Node(data);
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//             tail.next=newNode;
//             tail=newNode;
//             // newNode.next=null;
//     }
//     public static void main(String args[]){
//         LinkedList l = new LinkedList();
//         l.addFirst(1);
//         l.addFirst(2);
//         l.addLast(3);
//         l.addLast(4);
//     }
// }
//printing a linkedlist 
// import java.util.*;
// public class LinkedList{
//     class Node{
//         int data;
//         Node node ;
//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public void addFirst(int head){
//         Node newNode = new Node();
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         newNode.next=head;
//         head=newNode;
        
//     }
//     public void addLast(int head){
//         Node newNode = new Node();
//         if(head==null){
//             head=tail=newNode;
//             return ;
//         }
//         tail.next=newNode;
//         tail=newNode;
//     }
//     public void printList(){
//         if(head==null){
//             System.out.println("LL is empty");
//             return;
//         }
//         Node temp=head;
//         while(temp!=null){
//         System.out.print(temp.data+" ");
//         temp=temp.next;
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         LinkedList l = new LinkedList();
//         l.printList();
//         l.addFirst(4);
//         l.printList();
//         l.addFirst(3);
//         l.printList();
//         l.addFirst(2);
//         l.printList();
//         l.addFirst(1);
//         l.printList();
//         l.addLast(2);
//         l.printList();
//         l.addLast(3);
//         l.printList();
//         l.addLast(4);
//         l.printList();
//         l.addLast(5);
//         l.printList();
//     }

// }
//5/5/24
// LinkedList
// import java.util.*;
// public class LinkedList{
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static void main(String args[]){
//         LinkedList ll = new LinkedList();
//         ll.head=new Node(1);
//         ll.head.next=new Node(2);
//     }
// }
//add first 
// import java.util.*;
// public class LinkedList{
//     class Node {
//         int data;
//         Node next ;
//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static void main(String args[]){
        
//     }
// }
// write a program to check a no is positive 
// 1. 
// public void setage (int age) throws InvalidAgeException{
//     if(age<)
// }
// class CustomException extends Exception{
// public CustomException(String message){
//     super(message);
// }
// }
// public class LinkedList{
//     public static void NumberChecker(int number) throws CustomException{
//         if(number=0){
//             throw new CustomException("Number should be greater than zero");
//         }
//     }
//     public static void main(String args[]){
//         Scanner s = new Scanner(System.in);
//         int n;
//         System.out.println("Enter a number");
//         n=s.nextInt();
//         try{
//             numberChecker(n);
//             System.out.println("ValidNumber");
//         }
//         catch(CustomException e){
//             System.out.println("Exception caught: "+e.getmessage());
//         }
//     }
    // public static void numberChecker(int n)throws CustomExceptioin{
    //     if(n<=0){
    //         throw new CustomException("No should be greater the 0");
    //     }
    // }
// }
// import java.util.*;
// public CustomException extends Exception{
//     public CustomException(String message){
//         super(message);
//     }
    
// }
// ******************************************************************************************************
// 6/4/24
// Linked List
// Singly linkedLIst  
// import java.util.*;
// public class LinkedList{
//     class Node{
//         int data;
//         Node next ;
//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public void addFirst(int data){
//         Node newNode = new Node(data);
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         newNode.next=head;
//         head=newNode;
//     }
//     public void addLast(int data){
//         Node newNode = new Node(data);
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;
//         // newNode.next=null;
//     }
//     public void printList(){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+"->");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }
//     public static void main(String args[]){
//         LinkedList ll = new LinkedList();
//         ll.printList();
//         ll.addFirst(5);
//         ll.printList();
//         ll.addLast(6);
//         ll.printList();
//         ll.addFirst(4);
//         ll.printList();
//         ll.addLast(7);
//         ll.printList();
//     }
// }
// add in the middle 
// import java.util.*;
// public class LinkedList{
//     class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public void add(int idx,int data){
//         if(idx==0){
//             addFirst(data);
//             return;
//         }
//         Node newNode = new Node(data);
//         int i=0;
//         Node temp = head;
//         while(i<idx-1){
//             temp=temp.next;
//             i++;
//         }
//         newNode.next=temp.next;
//         temp.next=newNode;
//     }
//     public void addFirst(int data){
//         Node newNode = new Node(data);
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         newNode.next=head;
//         head=newNode;
//     }
//     public void addLast(int data){
//         Node newNode = new Node(data);
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;
//         newNode.next=null;
//     }
//     public void printList(){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+" -> ");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }
//     public static void main(String args[]){
//         LinkedList ll = new LinkedList();
//         ll.addFirst(4);
//         ll.addLast(6);
//         ll.addFirst(3);
//         ll.addLast(7);
//         ll.printList();
//         ll.add(0,5);
//         ll.printList();
//     }
// }
//size of a linked list 
// import java.util.*;
// public class LinkedList{
//     class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;
//     public void addFirst(int data){
//         Node newNode = new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         newNode.next=head;
//         head=newNode;
//     }
//     public void addLast(int data){
//         Node newNode = new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;
//         newNode.next=null;
//     }
//     public void printList(){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+" -> ");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }
//     public void add(int idx,int data){
//         if(idx==0){
//             addFirst(data);
//             return;
//         }
//         Node newNode = new Node(data);
//         size++;
//         Node temp = head;
//         int c=0;
//         while(c<idx-1){
//             temp=temp.next;
//             c++;
//         }
//         newNode.next=temp.next;
//         temp.next=newNode;
//     }
//     public static void main(String args[]){
//         LinkedList ll  =new LinkedList();
//         ll.addFirst(2);
//         ll.addFirst(1);
//         ll.addLast(4);
//         ll.addLast(5);
//         ll.printList();
//         System.out.println("Size of the linkedList is : "+size);
//         ll.add(2,3);
//         ll.printList();
//         System.out.println("Size of the linkedList is : "+size);
//         System.out.println(ll.size);
//     }
// }
//Removing a LinkedList 
// import java.util.*;
// public class LinkedList{
//     class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//             this.next=next;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;
//     public void addFirst(int data){
//         Node newNode = new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         newNode.next=head;
//         head=newNode;
//     }
//     public void addLast(int data){
//         Node newNode = new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;
//     }
//     public void printList(){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+" -> ");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }
//     public void add(int idx,int data){ 
//     if(idx==0){
//         addFirst(data);
//         return;
//     }
//     Node newNode = new Node(data);
//     size++;
//     Node temp = head;
//     int c=0;
//     while(c<idx-1){
//         temp=temp.next;
//         c++;
//     }
//     newNode.next=temp.next;
//     temp.next=newNode;
//     }
//     public int removeFirst(){
//         if(size==0){
//             System.out.println("LinkedList is empty ");
//             return Integer.MIN_VALUE;
//         }else if(size==1){
//             size=0;
//             int  val = head.data;
//             head=tail=null;
//             return val;
//         }
//         size--;
//         int val = head.data;
//         head=head.next;
//         return val;
//     }
//     public int removeLast(){
//         if(size==0){
//             System.out.println("Linked List is empty");
//             return Integer.MIN_VALUE;
//         }else if(size==1){
//             size=0;
//             int val= head.data;
//             head=tail=null;
//             return val;
//         }
//         Node prev= head;
//         for(int i=0;i<size-2;i++){
//             prev= prev.next;
//         }
//         int val=prev.next.data;
//         prev.next=null;
//         tail=prev;
//         size--;
//         return val;
//     }
//     public static void main(String args[]){
//         LinkedList ll = new LinkedList();
//         ll.addFirst(7);
//         ll.addFirst(6);
//         ll.addLast(9);
//         ll.addLast(10);
//         ll.printList();
//         System.out.println("Size of ll is : "+ll.size);
//         ll.add(2,8);
//         ll.printList();
//         System.out.println("Size of ll is : "+ll.size);
//         System.out.println("removed data : "+ll.removeFirst());
//         ll.printList();
//         System.out.println("removed data : "+ll.removeLast());
//         ll.printList();
//         System.out.println("Size of ll is : "+ll.size);
//     }
// }
//search in a Linked List 
// import java.util.*;
// public class LinkedList{
//     class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;
//     public void addFirst(int data){
//         Node newNode  = new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         newNode.next=head;
//         head=newNode;
//     }
//     public void addLast(int data){
//         Node newNode = new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail = newNode;
//         newNode.next=null;
//     }
//     public void printList(){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+" -> ");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }
    // public void add(int idx,int data){
    //     Node newNode = new Node(data);
    //     if(idx==0){
    //         addFirst(data);
    //         return;
    //     }
    //     size++;
    //     int c=0;
    //     Node temp = head;
    //     while(c<idx-1){
    //         c++;
    //         temp=temp.next;
    //     }
    //     newNode.next=temp.next;
    //     temp.next=newNode;
    // }
//     public int removeFirst(){
//         if(head==null){
//             System.out.println("Linked List is empty");
//         }
//         if(size==1){
//             size=0;
//             int val = head.data;
//             head=tail=null;
//             return val;
//         }
//         int val= head.data;
//         head=head.next;
//         size--;
//         return val;
//     }
//     public int removeLast(){
//         if(head==null){
//             System.out.println("Linked List is empty");
//         }
//         if(size==1){
//             size=0;
//             int val=head.data;
//             head=tail=null;
//             return val;
//         }
//         Node temp=head;
//         for(int i=0;i<size-2;i++){
//             temp=temp.next;
//         }
//         int val=temp.next.data;
//         temp.next=null;
//         tail=temp;
//         size--;
//         return val;
//     }
//     public int searchData(int key){
//         if(size==0){
//             return -1;
//         }
//         int c=0;
//         Node temp  = head;
//         while(temp!=null){
//             if(temp.data==key){
//                 return c;
//             }else{
//                 temp=temp.next;
//             }
//             c++;
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         LinkedList ll = new LinkedList();
//         ll.addFirst(2);
//         ll.addFirst(1);
//         ll.addLast(4);
//         ll.addLast(5);
//         ll.printList();
//         ll.add(2,3);
//         ll.printList();
//         System.out.println(ll.size);
//         ll.removeFirst();
//         ll.printList();
//         ll.removeLast();
//         ll.printList();
//         System.out.println(ll.searchData(3));
//     }
// }
//Search in a Linked List using Recursion 
// import java.util.*;
// public class LinkedList{
//     class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//             this.next=next;
//         }
//     }
//         public static Node head;
//         public static Node tail;
//         public static int size;
//         public void addFirst(int data){
//             Node newNode = new Node(data);
//             size++;
//             if(head==null){
//                 head=tail=newNode;
//                 return;
//             }
//             newNode.next=head;
//             head=newNode;
//         }
//         public void addLast(int data){
//             Node newNode  =  new Node(data);
//             size++;
//             if(head==null){
//                 head=tail=newNode;
//                 return;
//             }
//             tail.next=newNode;
//             tail=newNode;
//             newNode.next=null;
//         }
//         public void add(int idx,int data){
//             Node newNode = new Node(data);
//             if(idx==0){
//                 addFirst(data);
//                 return;
//             }
//             size++;
//             Node temp = head;
//             int c=0;
//             while(c<idx-1){
//                 c++;
//                 temp=temp.next;
//             }
//             newNode.next=temp.next;
//             temp.next=newNode;
//         }
//         public void printList(){
//             Node temp = head;
//             while(temp!=null){
//                 System.out.print(temp.data+" -> ");
//                 temp=temp.next;
//             }
//             System.out.println("null");
//         }
//         public int removeFirst(){
//             if(size==0){
//                 System.out.println("Linked List is empty ");
//                 return Integer.MIN_VALUE;
//             }
//             if(size==1){
//                 int val=head.data;
//                 head=tail=null;
//                 size=0;
//                 return val;
//             }
//             int val=head.data;
//             head=head.next;
//             size--;
//             return val;
//         }
//         public int removeLast(){
//             if(size==0){
//                 System.out.println("Linked List is empty");
//                 return Integer.MIN_VALUE;
//             }
//             if(size==1){
//                 int val= head.data;
//                 head=tail=null;
//                 size=0;
//                 return val;
//             }
//             Node temp = head;
//             int i=0;
//             while(i<size-2){
//                 temp=temp.next;
//                 i++;
//             }
//             int val=temp.next.data;
//             temp.next=null;
//             tail=temp;
//             return val;
//         } 
//         public int searchKey(int key){
//             Node temp = head;
//             int c=0;
//             while(temp!=null){
//                 if(temp.data==key){
//                     return c;
//                 }
//                 temp=temp.next;
//                 c++;
//             }
//             return -1;
//         }
//         public int helper(Node head,int key){
//             if(head==null){
//                 return -1;
//             }
//             if(head.data==key){
//                 return 0;
//             }
//             int idx=helper(head.next,key);
//             if(idx==-1){
//                 return -1;
//             }
//             return idx+1;
//         }
//         public int recSearch(int key){
//             return helper(head,key);
//         }
//         public void reverse(){
//             Node prev=null;
//             Node curr=tail=head;
//             Node next;
//             while(curr!=null){
//                 next = curr.next;
//                 curr.next=prev;
//                 prev=curr;
//                 curr=next;
//             }
//             head=prev;
//         }
//         public static void main(String args[]){
//             LinkedList ll = new LinkedList();
//             ll.addFirst(2);
//             ll.addFirst(1);
//             ll.addLast(4);
//             ll.addLast(5);
//             ll.printList();
//             ll.add(2,3);
//             ll.printList();
//             ll.removeFirst();
//             ll.printList();
//             ll.removeLast();
//             ll.printList();
//             System.out.println(ll.searchKey(23));
//             System.out.println(ll.recSearch(3));
//             ll.reverse();
//             ll.printList();
//     }
// }
// Reverse of a LInked List 
// import java.util.*;
// public class LinkedList{
//     class Node {
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//             this.next=next;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public void addFirst(int data){
//         Node newNode = new Node(data);
//         if(head==null){
//             head=tail=newNode;
//             return ;
//         }
//         newNode.next=head;
//         head=newNode;
//     }
//     public void addLast(int data){
//         Node newNode = new Node(data);
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;
//         newNode.next=null;
//     }
//     public void printList(){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+" -> ");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }
//     public void add(int idx,int data){
//         Node newNode = new Node(data);
//         if(idx==0){
//             addFirst(data);
//             return;
//         }
//         Node temp = head;
//         int c=0;
//         while(c<idx-1){
//             temp=temp.next;
//             c++;
//         }
//         newNode.next=temp.next;
//         temp.next=newNode;
//     }
//     public void reverse(){
//         Node curr = head;
//         Node prev = null;
//         Node next;
//         while(curr!=null){
//             next = curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//         }
//         head=prev;
//     }
//     public static void main(String args[]){
//         LinkedList ll = new LinkedList();
//         ll.addFirst(2);
//         ll.addFirst(1);
//         ll.addLast(3);
//         ll.addLast(4);
//         ll.add(4,5);
//         ll.printList();
//         ll.reverse();
//         ll.printList();
//     }
// }
//find and remove Nth node from the linkedList 
// import java.util.*;
// public class LinkedList{
//     class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//             this.next=next;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public void addFirst(int data){
//         Node newNode = new Node(data);
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         newNode.next= head;
//         head=newNode;
//     }
//     public void printList(){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+" -> ");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }
//     public void deleteNthNode(int n){
//         int sz=0;
//         Node temp = head;
//         while(temp!=null){
//             temp=temp.next;
//             sz++;
//         }
//         if(n==sz){
//             head=head.next;
//             return ;
//         }
//         int i=1;
//         int idxToFind = sz-n;
//         Node prev=head;
//         while(i<idxToFind){
//             prev=prev.next;
//             i++;
//         }
//         prev.next=prev.next.next;
//         return ;
//     }
//     public static void main(String args[]){
//         LinkedList ll = new LinkedList();
//         ll.addFirst(5);
//         ll.addFirst(4);
//         ll.addFirst(3);
//         ll.addFirst(2);
//         ll.addFirst(1);
//         ll.printList();
//         ll.deleteNthNode(2);
//         ll.printList();
//     }
// }
// check if Linked List  is Palindrome
// import java.util.*;
// public class LinkedList {
//     class Node {
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//             this.next=next;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public void addFirst(int data){
//         Node newNode = new Node(data);
//         if(head==null){
//             head=tail=newNode;
//             return ;
//         }
//         newNode.next=head;
//         head=newNode;
//     }
//     public Node findMid(Node head){
//         Node slow = head;
//         Node fast = head;
//         while(fast!=null && fast.next!=null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }
//     public boolean checkPalindrome(){
//         if(head==null||head.next==null){
//             return true;
//         }
//         //to find mid 
//         Node midNode = findMid(head);
//         //reverse 2nd half 
//         Node prev=null;
//         Node curr=midNode;
//         Node next;
//         while(curr!=null){
//             next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//         }
//         Node right =prev;
//         Node left = head;            //right half head
//         //check right half and left half 
//         while(right!=null){
//             if(left.data!=right.data){
//                 return false;
//             }
//             left=left.next;
//             right=right.next;
//         }
//         return true;
//     }
//     public static void main(String args[]){
//         LinkedList ll  =new LinkedList();
//         ll.addFirst(1);
//         // ll.addFirst(3);
//         ll.addFirst(2);
//         ll.addFirst(1);
//         System.out.println(ll.checkPalindrome());
//     }
// }
// **************************************************************************************************************************************** 
// **************************************************************************************************************************************** 
// 7/4/24
//Revision 
//Add first 
//add last 
// print list 
// add in middle
//size 
//remove first 
//remove last 
//iterative search 
//recursive search 
//reverse ll
//remove nth node 
//palindrome ll
// import java.util.*;
// import javax.swing.plaf.synth.SynthStyle;
// public class Linkedlist{
//     class Node{
//         int data;
//         Node next;
//         public Node (int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;
//     public void addFirst(int data){
//         Node newNode = new Node(data);
//         size++;
//         if(head == null){
//             head=tail=newNode;
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }
//     public void addLast(int data){
//         Node newNode = new Node(data);
//         size++;
//         if(head == null){
//             head = tail = newNode;
//             return ;
//         }
//         tail.next = newNode;
//         tail = newNode;
//         newNode.next = null;
//     }
//     public void printList(){
//         Node temp = head; 
//         while(temp != null){
//             System.out.print(temp.data+" -> ");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }
//     public void add(int idx,int data){
//         Node newNode = new Node(data);
//         if(idx==0){
//             addFirst(data);
//             return;
//         }
//         size++;
//         Node temp = head;
//         int c=0;
//         while(c<idx-1){
//             temp=temp.next;
//             c++;
//         }
//         newNode.next=temp.next;
//         temp.next=newNode;
//     }
//     public int removeFirst(){
//         if(head==null || size ==0){
//             System.out.println("Linked List is empty ");
//             return Integer.MIN_VALUE;
//         }
//         if(size == 1){
//             int val = head.data;
//             head=tail=null;
//             size = 0;
//             return val;
//         }
//         int val = head.data;
//         head = head.next;
//         size--;
//         return val;
//     }
//     public int removeLast(){
//         if(head==null || size ==0){
//             System.out.println("Linked List is empty ");
//             return Integer.MIN_VALUE;
//         }
//         if(size==1){
//             int val = head.data;
//             size =0;
//             head=tail=null;
//             return val;
//         }
//         Node temp = head;
//         int s=0;
//         while(s<size-2){
//             s++;
//             temp =temp.next;
//         }
//         int val=temp.next.data;
//         size--;
//         temp.next=null;
//         tail = temp;
//         return val;
//     }
//     public int itrSearch(int key){
//         Node temp  = head;
//         int c=0;
//         while(temp!=null){
//             if(temp.data==key){
//                 return c;
//             }
//             temp=temp.next;
//             c++;
//         }
//         return -1;
//     }
//     public void reverse(){
//         Node prev =null;
//         Node curr = head;
//         Node next;
//         while(curr!=null){
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         tail=head;
//         head = prev;
//     }
//     public void removeIthNodeFromLast(int n){
//         Node temp = head;
//         int s = size-n;
//         if(size==n){
//             head=head.next;
//             size--;
//             return ;
//         }
//         int c=1;
//         while(c<s){
//             temp=temp.next;
//             c++;
//         }
//         temp.next=temp.next.next;
//         size--;
//         return ;
//     }
//     public Node mid(){
//         Node slow = head;
//         Node fast = head;
//         while(fast!=null && fast.next!=null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }
//     public Node pReverse(Node mid){
//         Node prev =null;
//         Node curr = mid;
//         Node next;
//         while(curr!=null){
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         return prev;
//     }
//     public boolean isPalindrome(){
//         Node temp =pReverse(mid());
//         Node tem=head;
//         while(tem!=null && temp!=null){
//             if(temp.data!=tem.data){
//                 return false;
//             }
//             tem=tem.next;
//             temp=temp.next;
//         }
//         return true;
//     }
//     public int helper(Node head,int key){
//         if(head==null){
//             return -1;
//         }
//         if(head.data==key){
//             return 0;
//         }
//         int idx = helper(head.next,key);
//         if(idx==-1){
//             return -1;
//         }
//         return idx+1;
//     }
//     public int recSearch(int key){
//         return helper(head,key);
//     }
//     public static void main(String args[]){
//         Linkedlist ll = new Linkedlist();
//         ll.addFirst(2);
//         ll.addFirst(1);
//         ll.addLast(4);
//         ll.addLast(5);
//         ll.printList();
//         System.out.println("Size of the linked list : "+ ll.size);
//         ll.add(2,3);
//         ll.printList();
//         System.out.println("Size of the Linked list : "+ll.size);
//         System.out.println(ll.removeFirst());
//         ll.printList();
//         System.out.println("Size of the Linked list : "+ll.size);
//         ll.removeLast();
//         System.out.println("now see ");
//         ll.printList();
//         System.out.println("Size of the Linked List : "+ll.size);
//         ll.addLast(2);
//         ll.printList();
//         System.out.println(ll.itrSearch(10));
//         ll.reverse();
//         ll.printList();
//         ll.removeIthNodeFromLast(3);
//         ll.printList();
//         System.out.println("Size of the Linked List : "+ll.size);
//         ll.addFirst(1);
//         ll.addLast(1);
//         System.out.println("Size of the Linked List : "+ll.size);
//         ll.printList();
//         System.out.println(ll.isPalindrome());
//         System.out.println(ll.recSearch(3));
//     }
// }
// import java.util.*;
// public class Linkedlist{
//     class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//             this.next=next;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;
//     public void addFirst(int data){
//         Node newNode = new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         newNode.next=head;
//         head=newNode;
//     }
//     public void addLast(int data){
//         Node newNode = new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;
//         newNode.next=null;
//     }
//     public void printList(){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+" -> ");
//             temp=temp.next;
//         }
//         System.out.println("Null");
//     }
//     public void add(int idx,int data){
//         Node newNode  =  new Node(data);
//         if(idx==0){
//             addFirst(data);
//             return;
//         }
//         size++;
//         Node temp = head;
//         int c=0;
//         while(c<idx-1){
//             c++;
//             temp=temp.next;
//         }
//         newNode.next=temp.next;
//         temp.next=newNode;
//     }
//     public int removeFirst(){
//         if(head==null){
//             System.out.println("Linked list is empty ");
//             return Integer.MIN_VALUE;
//         }
//         int val=head.data;
//         head=head.next;
//         size--;
//         return val;
//     }
//     public int removeLast(){
//         if(head==null){
//             System.out.println("Linked list is empty ");
//             return Integer.MIN_VALUE;
//         }
//         Node temp = head;
//         int c=1;
//         while(c<size-1){
//             temp=temp.next;
//             c++;
//         }
//         int val=temp.next.data;
//         temp.next=null;
//         tail=temp;
//         size--;
//         return val;
//     }
//     public void reverse(){
//         Node prev= null;
//         Node curr = head;
//         Node next;
//         while(curr!=null){
//             next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//         }
//         tail=head;//this statement is necessary when you need to modify the same code 
//         head=prev;
//     }
//     public int itrSearch(int key){
//         Node temp = head;
//         int c=0;
//         while(temp!=null){
//             if(temp.data==key){
//                 return c;
//             }
//             temp=temp.next;
//             c++;
//         }
//         return -1;
//     }
//     public int helper(Node head,int key){
//         if(head==null){
//             return -1;
//         }
//         if(head.data==key){
//             return 0;
//         }
//         int idx = helper(head.next,key);
//         if(idx==-1){
//             return -1;
//         }
//         return idx+1;
//     }
//     public int recSearch(int key){
//         return helper(head,key);
//     }
//     public int removeNthNode(int n){
//         int c=size-n;
//         if(n==size){
//             int val=head.data;
//             head=head.next;
//             size--;
//             return val;
//         }
//         Node temp = head;
//         size--;
//         int e=1;
//         while(e<c){
//             temp=temp.next;
//             e++;
//         }
//         int val = temp.next.data;
//         temp.next=temp.next.next;
//         return val;
//     }
//     public Node pMid(){
//         Node slow = head;
//         Node fast = head;
//         while(fast!=null&&fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         return slow;
//     }
//     public Node pReverse(Node mid){
//         Node prev =null;
//         Node curr = mid;
//         Node next;
//         while(curr!=null){
//             next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//         }
//         return prev;
//     }
//     public boolean isPalindrome(){
//         Node mid = pMid();
//         Node rHead = pReverse(mid);
//         Node temp=head;
//         while(rHead!=null){
//             if(temp.data!=rHead.data){
//                 return false;
//             }
//             temp=temp.next;
//             rHead=rHead.next;
//         }
//         return true;
//     }
//     public static void main(String args[]){
//         Linkedlist ll = new Linkedlist();
//         ll.addFirst(2);
//         ll.addFirst(1);
//         ll.addLast(4);
//         ll.addLast(5);
//         ll.printList();
//         System.out.println(ll.size);
//         ll.add(2,3);
//         ll.printList();
//         System.out.println(ll.size);
//         ll.removeFirst();
//         ll.printList();
//         System.out.println(ll.size);
//         ll.removeLast();
//         ll.printList();
//         System.out.println(ll.size);
//         ll.reverse();
//         ll.printList();
//         System.out.println(ll.itrSearch(2));
//         System.out.println(ll.recSearch(2));
//         System.out.println(ll.removeNthNode(2));
//         ll.printList();
//         System.out.println(ll.size);
//         System.out.println(ll.isPalindrome());
//         ll.addFirst(2);
//         System.out.println(ll.isPalindrome());
//     }
// }
// ******************************************************************************************************************************************************************************package DSA;
// ***********************************************************************************************************************************************
