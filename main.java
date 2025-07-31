// Linked List 
// 2/29
//c++ has struct and class but java only has class 
//memory space ->depending on system if 32bit 8bytes if 64 12 bytes 
//diff btw Node & Node* 
//array to linked list (c++ or java)->
//traversal in linked list 
//length of ll
//search in ll 

// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node(int data1,Node next1){
//         this.data  = data1;
//         this.next = next1;
//     }
//     Node(int data1){
//         this.data=data1;
//         this.next=null;
//     }
// }
// public class main{
//     static boolean checkIfPresent(Node head,int data){
//         Node temp = head;
//         while(temp!=null){
//             if(temp.data==data){
//                 return true;
//             }
//             temp=temp.next;
//         }
//         return false;
//     }
//     static int lengthOfLL(Node head){
//         int cnt = 0;
//         Node temp = head;
//         while(temp!=null){
//             temp=temp.next;
//             cnt++;
//         }
//         return cnt;
//     }
//     static Node convertArr2LL(int arr[]){
//         Node head = new Node(arr[0]);
//         Node mover = head;
//         for(int i=1;i<arr.length;i++){
//             Node temp = new Node(arr[i]);
//             mover.next=temp;
//             mover = temp;
//         }
//         return head;
//     }
// public static void main(String args[]){
//         int arr[] = {2,5,6,8};
//         Node head = convertArr2LL(arr);
//         System.out.println(head.data);
//         // Node y = new Node(arr[3]);
//         // System.out.print(y.data);
//         System.out.println(lengthOfLL(head));

//         Node temp = head;
//         System.out.println();
//         while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//         }
//         System.out.println(checkIfPresent(head, 6));

//     }
// }

//3/29
// deletion and insertion in ll
//delete head of ll 
//delete tail of ll 
//delete kth element of ll 
//in ll always thing of edge cases and then try to put logic don't think of algorithms 
//delete element = k  of ll 
//insertion of element at head
//insertion of element at tail 
//insertiion of element at position
//insertion of element before value x

import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class main{
    static Node insertBeforeVal(Node head,int el,int val){
        if(head==null){
            return null;
        }
        if(head.data==val){
            return new Node(el,head);
        }
        Node temp = head;
        while(temp.next!=null){
            if(temp.next.data==val){
                Node a = new Node(el,temp.next);
                temp.next=a;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
    static Node insertAtPos(Node head,int el,int pos){
        if(head==null){
            if(pos==1){
                return new Node(el);
            }else{
                return head;
            }
        }
        if(pos==1){
            return new Node(el,head);
        }
        Node temp = head;
        int c=0;
        while(temp!=null){
            c++;
            if(c==(pos-1)){
                Node a=new Node(el,temp.next);
                temp.next=a;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
    static Node insertAtTail(Node head,int k){
        if(head==null){
            return new Node(k,null);
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node a = new Node(k);
        a.next=null;
        temp.next = a;
        return head; 
    }
    static Node insertAtHead(Node head,int k){
        Node temp = new Node(k);
        temp.next=head;
        head = temp;
        return head;
    }
    static Node removeElementEqualK(Node head,int k){
        if(head==null){
            return head;
        }
        if(head.data==k){
            return removeHead(head);
        }
        Node temp = head;
        Node prev = null;
        while(temp!=null){
            if(temp.data==k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    static Node removeElementAtK(Node head,int k){
        if(head==null){
            return head;
        }
        if(k==1){
            return removeHead(head);
        }
        Node temp = head;
        int c = 0;
        Node prev = null;
        while(temp!=null){
            c++;
            if(c==k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    static Node removeTail(Node head){
        Node temp= head;
        if(temp==null||temp.next==null){
            return null;
        }
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    static Node removeHead(Node head){
        if(head==null){
            return head;
        }
        Node temp = head;
        head = head.next;
        System.out.println("The value of removed head is : "+temp.data);
        return head;
    }
    static Node convertArr2LL(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next=temp;
            mover =temp;
        }
        return head;
    }
    static int lengthOfLL(Node head){
        Node temp = head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
    static boolean checkIfPresent(Node head,int k){
        Node temp = head;
        while(temp!=null){
            if(temp.data==k){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    static void printLL(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {2,5,6,8};
        Node head = convertArr2LL(arr);
        System.out.println(head.data);
        System.out.println(lengthOfLL(head));
        // System.out.println(checkIfPresent(head, 100));
        // printLL(head);
        // System.out.println();
        // head = removeHead(head);
        // printLL(head);
        // head = removeTail(head);
        // System.out.println();
        // System.out.println("Now the tail is being removed : ");
        // printLL(head);
        // System.out.println();
        // System.out.println("Now the element at -nd position is removed :");
        // head = removeElementAtK(head, 7);
        // printLL(head);
        // System.out.println();
        // head=removeElementEqualK(head, 10);
        // printLL(head);
        head = insertAtHead(head,1);
        printLL(head);
        head = insertAtTail(head,9);
        printLL(head);
        head = insertAtPos(head, 100, 4);
        printLL(head);
        head = insertBeforeVal(head,200,100);
        printLL(head);
    }
}

// 4/29
//Doubly Linked List 
//dll
//representation of dll in java
//array to dll 
// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node back;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//         this.back=null;
//     }
//     Node(int data,Node next,Node back){
//         this.data=data;
//         this.next=next;
//         this.back=back;
//     }
// }
// public class main{
//     public static Node convertArr2ddll(int arr[]){
//         Node head = new Node(arr[0]);
//         Node mover = head;
//         for(int i=1;i<arr.length;i++){
//             Node temp = new Node(arr[i]);
//             mover.next = temp;
//             temp.back = mover;
//             mover = temp;
//         }
//         return head;
//     }
//     public static void print(Node head){
//         while(head!=null){
//             System.out.print(head.data+" ");
//             head = head.next;
//         }
//         System.out.println();
//     }
//     public static Node deleteHead(Node head){
//         if(head==null||head.next==null){
//             return null;
//         }
//         Node prev = head;
//         head = head.next;
//         head.back = null;
//         prev.next = null;
//         return head;
//     }
//     public static Node deleteTail(Node head){
//         if(head==null||head.next==null){
//             return null;
//         }
//         Node tail = head;
//         while(tail.next!=null){
//             tail=tail.next;
//         }
//         Node newTail = tail.back;
//         newTail.next = null;

//         return head;
//     }
//     public static Node removeKthElement(Node head,int k){
//         if(head==null){
//             return null;
//         }
//         int cnt = 0;
//         Node kNode = head;
//         while(kNode!=null){
//             cnt++;
//             if(cnt==k)break;
//             kNode = kNode.next;
//         }
//         Node prev = kNode.back;
//         Node front = kNode.next;
//         if(prev==null&&front==null){
//             return null;
//         }else if(prev==null){
//             return deleteHead(head);
//         }else if(front==null){
//             return deleteTail(head);
//         }
//         prev.next=front;
//         front.back = prev;
//         kNode.next=null;
//         kNode.back=null;
//         return head;
//     }
//     public static void deleteNode(Node temp){
//         Node prev=  temp.back;
//         Node front = temp.next;
//         if(front==null){
//             prev.next=null;
//             temp.back=null;
//             return;
//         }
//         prev.next=front;
//         front.back=prev;
//         temp.next=null;
//         temp.back=null;
//     }
//     public static Node insertBeforeHead(Node head,int val){
//         Node newHead = new Node(val,head,null);
//         head.back = newHead;
//         return newHead;
//     }
//     public static Node insertBeforeTail(Node head,int val){
//         if(head.next==null){
//             return insertBeforeHead(head, val);
//         }
//         Node tail = head;
//         while(tail.next!=null){
//             tail=tail.next;
//         }
//         Node prev = tail.back;
//         Node newNode = new Node(99,tail,prev);
//         tail.back=newNode;
//         prev.next=newNode;
//         return head;
//     }
//     public static Node insertBeforeKthNode(Node head,int k,int val){
//         if(k==1){
//             return insertBeforeHead(head, val);
//         }
//         Node temp = head;
//         int cnt=0;
//         while(temp!=null){
//             cnt++;
//             if(cnt==k)break;
//             temp=temp.next;
//         }
//         Node prev = temp.back;
//         Node newNode = new Node(val,temp,prev);
//         prev.next=newNode;
//         temp.back=newNode;
//         return head;
//     }
//     public static void insertBeforeNode(Node node,int val){
//         Node prev= node.back;
//         Node newNode = new Node(val,node,prev);
//         prev.next=newNode;
//         node.back=newNode;
//         // newNode.back=prev;
//     }
//     public static void main(String args[]){
//         int arr[] = {23,14,5,7,10,12,5,6,8};
//         Node head = convertArr2ddll(arr);
//         print(head);
//         head = deleteHead(head);
//         print(head);
//         head = deleteTail(head);
//         print(head);
//         head = removeKthElement(head, 3);
//         print(head);
//         deleteNode(head.next);
//         print(head);
//         head = insertBeforeHead(head, 0);
//         print(head);
//         head = insertBeforeTail(head, 99);
//         print(head);
//         head = insertBeforeKthNode(head, 4,1000);
//         print(head);
//         insertBeforeNode(head.next.next.next,0);
//         print(head);
//     }
// }
//hw -> insert to dll , insertatend of dll ,delete last node of dll 

// 5/29
// Reverse a DLL 
// import java.util.*;
// class Node{
//         int data;
//         Node next;
//         Node prev;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//             this.prev=null;
//         }
//         Node(int data,Node next,Node prev){
//             this.data=data;
//             this.next=next;
//             this.prev=prev;
//         }
//     }
// public class main{
//     Node head;
//     public  void reverseDoublyLinkedList(){
//         if(head == null||head.next==null){
//             return; 
//         }
//         Node temp  = null;
//         Node curr = head;
//         while(curr!=null){
//             temp = curr.prev;
//             curr.prev=curr.next;
//             curr.next=temp;
//             curr=curr.prev;
//         }
//         if(temp!=null){
//             head=temp.prev;
//         }
//     }
//     public void print(){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         DoublyLinkedList list = new DoublyLinkedList();
//         list.push(1);
//         list.push(2);
//         list.push(3);
//         list.push(4);
//         list.print();
//         list.reverseDoublyLinkedList();
//         list.print();
//     }
// }

//6/29
//add two no in linked list 
// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node prev;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//         this.prev=null;
//     }
//     Node(int data,Node next,Node prev){
//         this.data=data;
//         this.next=next;
//         this.prev=prev;
//     }
// }
// public class main{
//     public static Node addTwoLl(Node head1,Node head2){
//         Node t1 = head1;
//         Node t2 = head2;
//         Node dn = new Node(-1);
//         Node curr=dn;
//         int car=0;
//         while(t1!=null||t2!=null){
//             int sum=car;
//             if(t1)sum+=t1.data;
//             if(t2)sum+=t2.data;
//             Node newNode =  new Node(sum%10);
//             car = sum/10;
//             curr.next=newNode;
//             curr=curr.next;
//             if(t1)t1=t1.next;
//             if(t2)t2=t2.next;
//         }
//         if(car){
//             Node ne = new Node(car);
//             curr.next=ne;
//         }
//         return dn.next;
//     }
//     public static void main(String args[]){

//     }
// }

// 7/29
//odd even in a linked list 
// brute approach->O(N)
// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node prev;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//         this.prev=null;
//     }
//     Node(int data,Node next,Node prev){
//         this.data=data;
//         this.next=next;
//         this.prev=prev;
//     }
// }
// class LinkedList{
//     Node head;
//     public Node add(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//         } else {
//             Node temp = head;
//             while (temp.next != null) {
//                 temp = temp.next;
//             }
//             temp.next = newNode;
//             newNode.prev = temp;
//         }
//         return head;
//     }
//     public static Node oddEvenll(Node head){
//         if(head==null||head.next==null){
//             return head;
//         }
//         int arr[] = new int[100];
//         Node t= head;
//         Node temp  = head;
//         Node temp2 = head.next;
//         int i=0;
//         while(temp!=null&&temp.next!=null){
//             arr[i++]=temp.data;
//             temp=temp.next.next;
//         }
//         if(temp!=null){
//             arr[i++]=temp.data;
//         }
//         while(temp2!=null&&temp2.next!=null){
//             arr[i++]=temp2.data;
//             temp2=temp2.next.next;
//         }
//         if(temp2!=null){
//             arr[i++]=temp2.data;
//         }
//         int k=0;
//         while(t!=null){
//             t.data=arr[k++];
//             t=t.next;
//         }
//         return head;
//     }
//     public static void print(Node head){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//         }
//         System.out.println();
//     }
// }
//     public class main{
//     public static void main(String args[]){
//         LinkedList ll = new LinkedList();
//         Node head;
//         head = ll.add(1);
//         ll.add(2);
//         ll.add(3);
//         ll.add(4);
//         ll.add(5);
//         ll.print(head);
//         head = ll.oddEvenll(head);
//         ll.print(head);
//     }
// }
// Optimized-> O(N/2)*2 Not a huge diff. but no space req as compared to brute
// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node prev;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//         this.prev=null;
//     }
//     Node(int data,Node next,Node prev){
//         this.data=data;
//         this.next=next;
//         this.prev=prev;
//     }
// }
// class LinkedList{
//     Node head;
//     public  Node add(int data){
//         Node newNode = new Node(data);
//         if(head==null){
//             head = newNode;
//             return head;
//         }
//         Node temp = head;
//         while(temp.next!=null){
//             temp=temp.next;
//         }
//         temp.next=newNode;
//         return head;
//     }
//     public Node OddEvenLL(Node head){
//         Node odd = head;
//         if(head==null||head.next==null){
//             return head;
//         }
//         Node evenHead=head.next;
//         Node even = head.next;
//         while(even!=null&&even.next!=null){
//             odd.next=even.next;
//             odd=even.next;
//             even.next=odd.next;
//             even=odd.next;
//         }
//         odd.next=evenHead;
//         return head;
//     }
//     public void print(Node head){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//         }
//         System.out.println();
//     }
// }
// public class main{
//         public static void main(String args[]){
//             LinkedList ll = new LinkedList();
//             Node head;
//             head = ll.add(1);
//             ll.add(2);
//             ll.add(3);
//             ll.add(4);
//             ll.add(5);
//             ll.print(head);
//             head = ll.OddEvenLL(head);
//             ll.print(head);
//     }
// }

// 8/29
//Sorting a ll with 0's and 1's and 2's 
//brute force ->O(2N) to optimize two pass to 1 pass 
// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//     }
//     Node(int data,Node next){
//         this.data=data;
//         this.next=next;
//     }
// }
// class LinkedList{
//     Node head;
//     public Node add(int data){
//         Node newNode = new Node(data);
//         if(head==null){
//             head=newNode;
//             return head;
//         }
//         Node temp =head;
//         while(temp.next!=null){
//             temp=temp.next;
//         }
//         temp.next=newNode;
//         return head;
//     }
//     public void print(Node head){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//         }
//         System.out.println();
//     }
//     public Node sort(Node head){
//         int cz=0;
//         int co=0;
//         int ct=0;
//         Node temp = head;
//         while(temp!=null){
//             if(temp.data==0){
//                 cz++;
//             }else if(temp.data==1){
//                 co++;
//             }else{
//                 ct++;
//             }
//             temp=temp.next;
//         }
//         temp = head;
//         while(cz>0){
//             temp.data=0;
//             temp=temp.next;
//             cz--;
//         }
//         while(co>0){
//             temp.data=1;
//             temp=temp.next;
//             co--;
//         }
//         while(ct>0){
//             temp.data=2;
//             temp=temp.next;
//             ct--;
//         }
//         return head;
//     }
// }
// public class main{
//     public static void main(String args[]){
//         LinkedList ll = new LinkedList();
//         Node head = ll.add(1);
//         ll.add(2);
//         ll.add(1);
//         ll.add(0);
//         ll.add(2);
//         ll.add(1);
//         ll.add(0);
//         ll.add(2);
//         ll.add(1);
//         ll.add(0);
//         ll.print(head);
//         head = ll.sort(head);
//         ll.print(head);
//     }
// }

// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//     }
// }
// class LinkedList{
//     Node head;
//     public Node add(int data){
//                 Node newNode = new Node(data);
//                 if(head==null){
//                     head=newNode;
//                     return head;
//                 }
//                 Node temp =head;
//                 while(temp.next!=null){
//                     temp=temp.next;
//                 }
//                 temp.next=newNode;
//                 return head;
//             }
//             public void print(Node head){
//                 Node temp = head;
//                 while(temp!=null){
//                     System.out.print(temp.data+" ");
//                     temp=temp.next;
//                 }
//                 System.out.println();
//             }
//     public Node sort012(Node head){
//         if(head==null||head.next==null){
//             return head;
//         }
//         Node h1 = new Node(-1);
//         Node h2 = new Node(-1);
//         Node h3 = new Node(-1);
//         Node zero =h1;
//         Node one = h2;
//         Node two = h3;
//         Node temp = head;
//         while(temp!=null){
//             if(temp.data==0){
//                 zero.next=temp;
//                 zero=temp;
//             }else if(temp.data==1){
//                 one.next=temp;
//                 one=temp;
//             }else{
//                 two.next=temp;
//                 two=temp;
//             }
//             temp=temp.next;
//         }
//         zero.next=(h2.next!=null)?(h2.next):(h3.next);
//         one.next=h3.next;
//         two.next=null;
//         return h1.next;
//     }
// }
// public class main{
//         public static void main(String args[]){
//             LinkedList ll = new LinkedList();
//             Node head = ll.add(1);
//             ll.add(2);
//             ll.add(1);
//             ll.add(0);
//             ll.add(2);
//             ll.add(1);
//             ll.add(0);
//             ll.add(2);
//             ll.add(1);
//             ll.add(0);
//             ll.print(head);
//             head = ll.sort012(head);
//             ll.print(head);
//         }
//     }

// 9/29
//Remove Nth node from the end 
//bruteforce 
// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//     }
// }
// class LinkedList{
//     Node head;
//     public Node add(int x){
//         Node newNode = new Node(x);
//                 if(head==null){
//                     head=newNode;
//                     return head;
//                 }
//                 Node temp =head;
//                 while(temp.next!=null){
//                     temp=temp.next;
//                 }
//                 temp.next=newNode;
//                 return head;
//     }
//     public void print(Node head){
//         Node temp  = head;
//         while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//         }
//         System.out.println();
//     }
//     public static Node removeNthNode(Node head,int n){
//         if(head==null){
//             return null;
//         }
//         Node temp = head;
//         int cnt = 0;
//         while(temp!=null){
//             cnt++;
//             temp=temp.next;
//         }
//         if(cnt==n){
//             return head=head.next;
//         }
//         int pos = cnt-n;
//         temp=head;
//         cnt=0;
//         while(temp!=null){
//             cnt++;
//             if(pos==cnt)break;
//             temp=temp.next;
//         }
//         temp.next=temp.next.next;
//         return head;
//     }
// }
// public class main{
//     public static void main(String args[]){
//         LinkedList ll = new LinkedList();
//         Node head = ll.add(1);
//         ll.add(2);
//         ll.add(3);
//         ll.add(4);
//         ll.add(5);
//         ll.print(head);
//         ll.removeNthNode(head, 2);
//         ll.print(head);
//     }
// }

// optimized->
// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//     }
// }
// class LinkedList{
//     Node head;
//     public Node add(int x){
//         Node newNode = new Node(x);
//         if(head==null){
//             head=newNode;
//             newNode.next=null;
//             return head;
//         }
//         Node temp = head;
//         while(temp.next!=null){
//             temp=temp.next;
//         }
//         temp.next=newNode;
//         newNode.next=null;
//         return head;
//     }
//     public void print(Node head){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//         }
//         System.out.println();
//     }
//     public Node RemoveNthNodeFromEnd(Node head,int n){
//         Node fast = head;
//         Node slow = head;
//         while(n>0){
//             fast=fast.next;
//             n--;
//         }
//         while(fast.next!=null){
//             fast=fast.next;
//             slow=slow.next;
//         }
//         if(fast==null){
//             return head.next;
//         }
//         slow.next=slow.next.next;
//         return head;
//     }
// }
// public class main{
//     public static void main(String args[]){
//         LinkedList ll = new LinkedList();
//         Node head = ll.add(1);
//         ll.add(2);
//         ll.add(3);
//         ll.add(4);
//         ll.add(5);
//         ll.print(head);
//         ll.RemoveNthNodeFromEnd(head, 2);
//         ll.print(head);
//     }
// }

// 10/29
//reverse a linked list iteratively and recursively 
// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//     }
// }
// class LinkedList{
//     Node head;
//     public Node add(int x){
//         Node newNode = new Node(x);
//         if(head==null){
//             head=newNode;
//             return head;
//         }
//         Node temp = head;
//         while(temp.next!=null){
//             temp=temp.next;
//         }
//         temp.next=newNode;
//         newNode.next=null;
//         return head;
//     }
//     public void print(Node head){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//         }
//         System.out.println();
//     }
//     public Node reverseLL(Node head){
//         Node curr = head;
//         Node prev = null;
//         Node fro  = null;
//         if(head==null||head.next==null){
//             return head;
//         }
//         while(curr!=null){
//             fro =curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=fro;
//         }
//         return head=prev;
//     }
//     public Node recReverseLL(Node head){
//         if(head==null||head.next==null){
//             return head;
//         }
//         Node newHead = recReverseLL(head.next);
//         Node front = head.next;
//         front.next=head;
//         head.next=null;
//         return newHead;
//     }
// }
// public class main{
//     public static void main(String args[]){
//         LinkedList ll = new LinkedList();
//         Node head = ll.add(1);
//         ll.add(2);
//         ll.add(3);
//         ll.add(4);
//         ll.add(5);
//         ll.print(head);
//         head = ll.reverseLL(head);
//         ll.print(head);
//         head = ll.recReverseLL(head);
//         ll.print(head);
//     }
// }

// 11/29
// Check if linked list is palindrome or not 
// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//     }
// }
// class LinkedList{
//     Node head;
//     public Node add(int x){
//         Node newNode = new Node(x);
//         if(head==null){
//             head=newNode;
//             return head;
//         }
//         Node temp = head;
//         while(temp.next!=null){
//             temp=temp.next;
//         }
//         temp.next=newNode;
//         return head;
//     }
//     public void print(Node head){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//         }
//         System.out.println();
//     }
//     public Node reverse(Node head){
//         if(head==null||head.next==null){
//             return head;
//         }
//         Node temp = head;
//         Node newHead = reverse(temp.next);
//         Node front = temp.next;
//         front.next = temp;
//         temp.next=null;
//         return newHead;
//     }
//     public boolean Palindrome(Node head){
//         Node slow = head;
//         Node fast = head;
//         Node temp = head;
//         if(head == null || head.next == null){
//             return true;
//         }
//         while(fast.next!=null&&fast.next.next!=null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         Node newHead = reverse(slow.next);
//         Node first = head;
//         Node second = newHead;
//         while(second!=null){
//             if(first.data!=second.data){
//                 reverse(newHead);
//                 return false;
//             }
//             first=first.next;
//             second=second.next;
//         }
//         reverse(newHead);
//         return true;
//     }
// }
// public class main{
//     public static void main(String args[]){
//         LinkedList ll = new LinkedList();
//         Node head = ll.add(1);
//         ll.add(2);
//         ll.add(3);
//         ll.add(3);
//         ll.add(2);
//         ll.add(1);
//         ll.print(head);
//         System.out.println(ll.Palindrome(head));
//     }
// }

// 12/29
// Add one to a number represent by linked list 
// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//     }
// }
// class LinkedList{
//     Node head;
//     public Node add(int x){
//         Node newNode = new Node(x);
//         if(head==null){
//             head = newNode;
//             return newNode;
//         }
//         Node temp = head;
//         while(temp.next!=null){
//             temp=temp.next;
//         }
//         temp.next = newNode;
//         return head;
//     }
//     public void print(Node head){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//         }
//         System.out.println();
//     }
//     public Node addOne(Node head){
//         int carry = helper(head);
//         if(carry==1){
//             Node newNode = new Node(1);
//             newNode.next = head;
//             head = newNode;
//             return head;
//         }
//         return head;
//     }
//     public int helper(Node head){
//         Node temp = head;
//         if(temp==null){
//             return 1;
//         }
//         int carry = helper(temp.next);
//         temp.data = temp.data+carry;
//         if(temp.data<10){
//             return 0;
//         } 
//         temp.data=0;
//         return 1;
//     }
// }
// public class main{
//     public static void main(String args[]){
//         LinkedList ll = new LinkedList();
//         Node head = ll.add(9);
//         ll.add(9);
//         ll.add(9);
//         ll.print(head);
//         head = ll.addOne(head);
//         ll.print(head);
//     }
// }

// 13/29
// Find the intersection point of two linked list 
// Note -> the output here always be null as i have created two ll with two different node so it will never have interscetion where as in qeustion it's same
// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//     }
// }
// class LinkedList{
//     Node head;
//     public Node add(int x){
//         Node newNode = new Node(x);
//         if(head==null){
//             head = newNode;
//             return newNode;
//         }
//         Node temp = head;
//         while(temp.next!=null){
//             temp = temp.next;
//         }
//         temp.next = newNode;
//         newNode.next = null;
//         return head;
//     }
//     public void print(Node head){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp =temp.next;
//         }
//         System.out.println();
//     }
//     public Node intersectionPoint(Node head1,Node head2){
//         Map<Node,Integer> map = new HashMap<>();
//         Node temp = head1;
//         while(temp!=null){
//             map.put(temp,1);
//             temp=temp.next;
//         }
//         temp = head2;
//         while(temp!=null){
//             if(map.containsKey(temp)){
//                 return temp;
//             }
//             temp = temp.next;
//         }
//         return null;
//     }
//     public Node interPoint(Node head1,Node head2){
//         Node t1=head1;
//         Node t2=head2;
//         int n1=0,n2=0;
//         while(t1!=null){
//             n1++;
//             t1=t1.next;
//         }
//         while(t2!=null){
//             n2++;
//             t2=t2.next;
//         }
//         t1=head1;
//         t2=head2;
//         Node t3;
//         Node t4;
//         if(n1>=n2){
//             t3=t1;
//             t4=t2;
//         }else{
//             t3=t2;
//             t4=t1;
//         }
//         int diff = Math.abs(n1-n2);
//         while(t3!=null){
//             if(diff>0){
//                 diff--;
//                 t3=t3.next;
//             }else{
//                 if(t3==t4){
//                     return t3;
//                 }else{
//                     t3=t3.next;
//                     t4=t4.next;
//                 }
//             }
//         }
//         return null;
//     }
//     public Node intersection(Node head1,Node head2){
//         Node t1=head1;
//         Node t2=head2;
//         while(t1!=t2){
//             t1=t1.next;
//             t2=t2.next;
//             if(t1==t2){
//                 return t1;
//             }
//             if(t1==null){
//                 t1=t4;
//             }
//             if(t2==null){
//                 t2=t3;
//             }
//         }
//         return t1;
//     }
// }
// public class main{
//     public static void main(String args[]){
//         LinkedList l1 = new LinkedList();
//         Node head1  = l1.add(3);
//         l1.add(1);
//         l1.add(4);
//         l1.add(6);
//         l1.add(2);
//         l1.print(head1);
//         LinkedList l2 = new LinkedList();
//         Node head2 = l2.add(1);
//         l2.add(2);
//         l2.add(4);
//         l2.add(5);
//         l2.add(4);
//         l2.add(6);
//         l2.add(2);
//         l2.print(head2);
//         // System.out.println(l1.intersectionPoint(head1, head2));
//         Node res = l1.interPoint(head1,head2);
//         System.out.println(res);
//         Node ans = l1.intersection(head1, head2);
//         System.out.println(ans);
//     }
// }

// 14/29
// Finding middle of Linked list 
// import java.util.*;
// class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     class LinkedList{
//         Node head;
//         public Node add(int x){
//             Node newNode = new Node(x);
//             if(head==null){
//                 head = newNode;
//                 return newNode;
//             }
//             Node temp = head;
//             while(temp.next!=null){
//                 temp = temp.next;
//             }
//             temp.next = newNode;
//             newNode.next = null;
//             return head;
//         }
//         public void print(Node head){
//                     Node temp = head;
//                     while(temp!=null){
//                         System.out.print(temp.data+" ");
//                         temp =temp.next;
//                     }
//                     System.out.println();
//                 }
//     }
// public class main{
//     public static Node middle(Node head){
//         Node temp = head;
//         int n=0;
//         while(temp!=null){
//             n++;
//             temp=temp.next;
//         }
//         int mn = (n/2)+1;
//         temp = head;
//         while(temp!=null){
//             mn--;
//             if(mn==0){
//                 return temp;
//             }
//             temp=temp.next;
//         }
//         return null;
//     }
//     public static Node twoPointer(Node head){
//         Node slow = head;
//         Node fast = head;
//         while(fast!=null&&fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         return slow;
//     }
//     public static void main(String args[]){
//         LinkedList l1 = new LinkedList();
//         Node head1  = l1.add(3);
//         l1.add(1);
//         l1.add(4);
//         l1.add(6);
//         l1.add(2);
//         l1.add(3);
//         l1.print(head1);
//         Node mid = middle(head1);
//         System.out.println(mid.data);
//         Node mid2 = twoPointer(head1);
//         System.out.println(mid2.data);
//     }
// }

// 15/29
//Detecting a loop in a LL 
// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//     }
// }
// class LinkedList{
//     Node head;
//     public Node add(int x){
//         Node newNode = new Node(x);
//         if(head==null){
//             head=newNode;
//             head.next=null;
//             return head;
//         }
//         Node temp = head;
//         while(temp.next!=null){
//             temp=temp.next;
//         }
//         temp.next = newNode;
//         return head;
//     }
//     public void print(Node head){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//         }
//         System.out.println();
//     }
// }
// public class main{
//     public static boolean detectLoopHashing(Node head){
//         Map<Node,Integer> map = new HashMap<>();
//         Node temp = head;
//         while(temp!=null){
//             if(map.containsKey(temp)){
//                 return true;
//             }
//             map.put(temp,1);
//             temp=temp.next;
//         }
//         return false;
//     }
//     public static boolean detectLoop(Node head){
//         Node slow = head;
//         Node fast = head;
//         while(fast!=null&&fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//             if(slow==fast){
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         LinkedList ll = new LinkedList();
//         Node head = ll.add(1);
//         ll.add(2);
//         ll.add(3);
//         ll.add(4);
//         ll.add(5);
//         ll.add(6);
//         ll.add(7);
//         ll.add(8);
//         Node loop = ll.add(9);
//         loop.next = head;
//         System.out.println(detectLoop(head));
//         System.out.println(detectLoopHashing(head));
//     }
// }

// 16/29 {something is wrong here in the code but it runs fine}
//find the length of loop in the linked list 
// using hashing and tortoise and hare algo 
// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//     }
// }
// class LinkedList{
//     Node head;
//     public Node add(int x){
//         Node newNode = new Node(x);
//         if(head==null){
//             head=newNode;
//             return head;
//         }
//         Node temp=head;
//         while(temp.next!=null){
//             temp=temp.next;
//         }
//         temp.next=newNode;
//         return head;
//     }
//     public void print(Node head){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//         }
//         System.out.println();
//     }
// }
// public class main{
//     public static int lengthOfLoop(Node head){
//         Map<Node,Integer> map = new HashMap<>();
//         Node temp = head;
//         int cnt=0;
//         while(temp!=null){
//             if(map.containsKey(temp)){
//                 int value = map.get(temp);
//                 return cnt-value;
//             }else{
//                 map.put(temp,cnt);
//                 cnt++;
//                 temp=temp.next;
//             }
//         }
//         return 0;
//     }
//     public static int finalLength(Node slow , Node fast){
//         int cnt = 1;
//         fast=fast.next;
//         while(slow!=fast){
//             cnt++;
//             fast=fast.next;
//         }
//         return cnt;
//     }
//     public static int lenOfLoop(Node head){
//         Node slow=head,fast=head;
//         while(fast!=null&&fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//             if(fast==slow){
//                 return finalLength(slow,fast);
//             }
//         }
//         return 0;
//     }
//     public static void main(String args[]){
//         LinkedList ll = new LinkedList();
//         Node head = ll.add(1);
//         ll.add(2);
//         ll.add(3);
//         ll.add(4);
//         Node loops = ll.add(5);
//         ll.add(6);
//         ll.add(7);
//         Node loope = ll.add(8);
//         ll.add(9);
//         // ll.print(head);
//         loope.next=loops;
//         System.out.println(lengthOfLoop(head));
//         System.out.println(lenOfLoop(head));
//     }
// }

// 18/29
//Finding starting node in a loop of LL




















































































// 19/29
//Delete all occurrences of a key in DLL 
// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node prev;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//         this.prev=null;
//     }
// }
// class LinkedList{
//     Node head;
//     public Node add(int x){
//         Node newNode = new Node(x);
//         if(head==null){
//             head=newNode;
//             return head;
//         }
//         Node temp = head;
//         Node prev = null;
//         while(temp.next!=null){
//             prev = temp;
//             temp=temp.next;
//         }
//         temp.next = newNode;
//         temp.prev = prev;
//         return head;
//     }
//     public void print(Node head){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }
// }
// public class main{
//     public static Node dll(Node head , int key){
//         if(head==null){
//             return null;
//         }
//         if((head.prev==null&&head.next==null)&&head.data==key){
//             return null;
//         }
//         Node temp = head;
//         while(temp!=null){
//             if(temp.data==key){
//                 if(temp==head){
//                     head = temp.next;
//                 }
//                 Node prevNode = temp.prev;
//                 Node nextNode = temp.next;
//                 if(prevNode!=null){
//                     prevNode.next=nextNode;
//                 }
//                 if(nextNode!=null){
//                     nextNode.prev = prevNode;
//                 }
//                 temp = nextNode;
//             }else{
//             temp=temp.next;
//             }
            
//         }
//         return head;
//         // Node temp = head;
//         // while(temp!=null){
//         //     if(temp.data==key){
//         //         if(temp==head){
//         //             head=temp.next;
//         //         }
//         //         Node nextNode = temp.next;
//         //         Node prevNode = temp.prev;
//         //         if(nextNode!=null){
//         //             nextNode.prev = prevNode;
//         //         }
//         //         if(prevNode!=null){
//         //             prevNode.next = nextNode;
//         //         }
//         //         temp.next=null;
//         //         temp.prev=null;
//         //         temp=nextNode;
//         //     }else{
//         //         temp=temp.next;
//         //     }
//         // }
//         // return head;
//     }
//     public static void main(String args[]){
//         LinkedList ll = new LinkedList();
//         Node head = ll.add(10);
//         ll.add(4);
//         ll.add(10);
//         ll.add(10);
//         ll.add(6);
//         ll.add(10);
//         ll.print(head);
//         head = dll(head,10);
//         ll.print(head);
//     }
// }

// 20/29
// find all Pairs with given sum in DLL
//pair sum 2 mein null pointer exception a rha  
// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node prev;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//         this.prev=null;
//     }
// }
// class LinkedList{
//     Node head;
//     public Node add(int x){
//         Node newNode = new Node(x);
//         if(head==null){
//             head=newNode;
//             return head;
//         }
//         Node temp = head;
//         Node prev = null;
//         while(temp.next!=null){
//             prev = temp;
//             temp=temp.next;
//         }
//         temp.next = newNode;
//         temp.prev = prev;
//         return head;
//     }
//     public void print(Node head){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }
// }
// public class main{
//     public static void pairSum(Node head,int sum){
//         Node temp = head;
//         while(temp!=null){
//             Node temp2 = temp.next;
//             while(temp2!=null){
//                 if(temp.data+temp2.data==sum){
//                     System.out.println("{ "+temp.data+" , "+temp2.data+" }");
//                 }
//                 temp2=temp2.next;
//             }
//             temp=temp.next;
//         }
//     }
//     public static void pairSumII(Node head,int sum){
//         if(head==null){
//             return ;
//         }
//         Node left = head;
//         Node temp = head;
//         while(temp.next!=null){
//             temp=temp.next;
//         }
//         Node right = temp;
//         while(left.data<right.data){
//             if((left.data+right.data)==sum){
//                 System.out.println("{ "+left.data+" , "+right.data+" }");
//                 left = left.next;
//                 right = right.prev;
//             }else if((left.data+right.data)<sum){
//                 left = left.next;
//             }else{
//                 right = right.prev;
//             }
//         }
//     }
//     public static void main(String args[]){
//         LinkedList ll = new LinkedList();
//         Node head = ll.add(1);
//         ll.add(2);
//         ll.add(3);
//         ll.add(4);
//         ll.add(5);
//         ll.print(head);
//         pairSum(head,5);
//         pairSumII(head,5);
//     }
// }

// 21/29
// Remove duplicates from sorted doubly LL
// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node prev;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//         this.prev=null;
//     }
// }
// class LinkedList{
//     Node head;
//     public Node add(int x){
//         Node newNode = new Node(x);
//         if(head==null){
//             head=newNode;
//             return head;
//         }
//         Node temp = head;
//         Node prev = null;
//         while(temp.next!=null){
//             prev = temp;
//             temp=temp.next;
//         }
//         temp.next = newNode;
//         temp.prev = prev;
//         return head;
//     }
//     public void print(Node head){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }
// }
// public class main{
//     public static Node removeDuplicates(Node head){
//         Node t1 = head;
//         while(t1!=null&&t1.next!=null){
//             Node t2 = t1.next;
//             while(t2!=null&&t2.data==t1.data){
//                 t2=t2.next;
//             }
//             t1.next=t2;
//             if(t2!=null){
//                 t2.prev=t1;
//             }
//             t1=t1.next;
//         }
//         return head;
//     }
//     public static void main(String args[]){
//                 LinkedList ll = new LinkedList();
//                 Node head = ll.add(1);
//                 ll.add(1);
//                 ll.add(2);
//                 ll.add(2);
//                 ll.add(3);
//                 ll.add(3);
//                 ll.add(4);
//                 ll.add(4);
//                 ll.add(5);
//                 ll.add(5);
//                 ll.print(head);
//                 head = removeDuplicates(head);
//                 ll.print(head);
                
//     }
// }

// 22/29
//Reverseing Nodex in K Groups



// 23/29 
// Rotate a LL
// import java.util.*;
// class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     class LinkedList{
//         Node head;
//         public Node add(int x){
//             Node newNode = new Node(x);
//             if(head==null){
//                 head=newNode;
//                 return newNode;
//             }
//             Node temp = head;
//             while(temp.next!=null){
//                 temp=temp.next;
//             }
//             temp.next=newNode;
//             return head;
//         }
//         public void print(Node head){
//             Node temp = head;
//             while(temp!=null){
//                 System.out.print(temp.data+" ");
//                 temp=temp.next;
//             }
//             System.out.println();
//         }
//     }
//     public class main{
//         public static Node rotateLL(Node head,int k){
//             Node tail = head;
//             Node temp = head;
//             int len = 1;
//             while(tail.next!=null){
//                 len++;
//                 tail=tail.next;
//             }
//             tail.next = head;
//             if(k%len==0){
//                 return head;
//             }
//             k=k%len;
//             int pos = len-k;
//             while(temp!=null){
//                 pos--;
//                 if(pos==0){
//                     head = temp.next;
//                     temp.next=null;
//                     return head;
//                 }
//                 temp=temp.next;
//             }
//             return head;
//         }
//         public static void main(String args[]){
//             LinkedList ll = new LinkedList();
//             Node head = ll.add(1);
//             ll.add(2);
//             ll.add(3);
//             ll.add(4);
//             ll.add(5);
//             ll.print(head);
//             head = rotateLL(head,2);
//             ll.print(head);
//         }
//     }
// 24/29
// Merge two Sorted LL 
// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//     }
// }
// class LinkedList{
//     Node head;
//     public Node add(int x){
//         Node newNode = new Node(x);
//         if(head==null){
//             head=newNode;
//             return newNode;
//         }
//         Node temp = head;
//         while(temp.next!=null){
//             temp=temp.next;
//         }
//         temp.next=newNode;
//         return head;
//     }
//     public void print(Node head){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//         }
//         System.out.println();
//     }
// }
// public class main{
//     public static Node mergeTwoSortedLL(Node head1,Node head2){
//         Node dNode = new Node(-1);
//         Node temp = dNode;
//         while(head1!=null&&head2!=null){
//             if(head1.data<head2.data){
//                 temp.next=head1;
//                 head1=head1.next;
//             }else{
//                 temp.next=head2;
//                 head2=head2.next;
//             }
//             temp=temp.next;
//         }
//         if(head1!=null){
//             temp.next=head1;
//         }
//         if(head2!=null){
//             temp.next=head2;
//         }
//         return dNode.next;
//     }
//     public static void main(String args[]){
//         LinkedList l1 = new LinkedList();
//         Node head1=l1.add(2);
//         l1.add(4);
//         l1.add(8);
//         l1.add(10);
//         LinkedList l2 = new LinkedList();
//         Node head2=l2.add(1);
//         l2.add(3);
//         l2.add(3);
//         l2.add(6);
//         l2.add(11);
//         l2.add(14);
//         l1.print(head1);
//         l2.print(head2);
//         Node head = mergeTwoSortedLL(head1,head2);
//         l1.print(head);
//     }
// }

// 25/29
// Flattening a LL
// import java.util.*;
// public class Solution {
//     public static Node convert(int arr[]){
//         Node newHead = new Node(arr[0]);
//         Node temp = newHead;
//         for(int i=1;i<arr.length;i++){
//             Node newNode = new Node(arr[i]);
//             temp.child  = newNode;
//             temp = newNode;
//             newNode.child = null;
//         }
//         return newHead;
//     }
//     public static Node flattenLinkedList(Node head) {
//         //Write your code here
//         Node temp = head;
//         Node t2 = null;
//         int c=0;
//         while(temp!=null){
//             t2=temp;
//             while(t2!=null){
//                 c++;
//                 t2=t2.child;
//             }
//             temp = temp.next;
//         }
//         int arr[] = new int[c];
//         temp = head;
//         int i=0;
//         while(temp!=null){
//             t2=temp;
//             while(t2!=null){
//                 arr[i++]=t2.data;
//                 t2=t2.child;
//             }
//             temp = temp.next;
//         }
//         Arrays.sort(arr);
//         Node newHead = convert(arr);
//         return newHead;
//     }
// }


//26/29
//27/29
//28/29
//29/29

// -------------------**-------------------------***-------------------------
// 20/1/25 
// -> array rev using recursion 
// -> unique path 
// -> climbing stairs 
// -> monotonic stack 
// -> good pairs 

// import java.util.*;
// public class main{
//     public static void rev(int arr[],int s,int e){
//         if(s>=e)return;
//         int temp = arr[s];
//         arr[s]=arr[e];
//         arr[e]=temp;
//         rev(arr,s+1,e-1);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         rev(arr,0,n-1);
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

// ******************************************************************************************************
// 21/1/25
// unique paths 2 ,1 
// string palindrome 
// bubble sort 
// smallest element greater then target 
// trappping rainwater 
// sort colors 
// sum of subarray ranges 
//1758,1897,1624,1351
// import java.util.*;
// public class main{
//     public static void main(String args[]){
//         int arr[]={4,3,5,3,5,2,5,58};
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr.length-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
                    
//                 }
//             }
//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }
// import java.util.Arrays;

// public class main {
//     public static void maine(int[] arr) {
//         int n = arr.length;

//         // Outer loop for passes
//         for (int i = 0; i < n - 1; i++) {
//             boolean swapped = false;

//             // Inner loop for pairwise comparisons
//             for (int j = 0; j < n - i - 1; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     // Swap arr[j] and arr[j + 1]
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;

//                     swapped = true; // Mark that a swap occurred
//                 }
//             }

//             // If no two elements were swapped in a pass, the array is sorted
//             if (!swapped) break;
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {64, 34, 25, 12, 22, 11, 90};
//         System.out.println("Original Array: " + Arrays.toString(arr));

//         maine(arr);

//         System.out.println("Sorted Array: " + Arrays.toString(arr));
//     }
// }

// class Solution {
//     // public int grid(int i,int j,int m,int n){
//     //     if(i==m-1&&j==n-1)return 1;
//     //     if(i==m||j==n)return 0;
//     //     int x=grid(i+1,j,m,n);
//     //     int y=grid(i,j+1,m,n);
//     //     return x+y;
//     // }
//     // public int uniquePaths(int m, int n) {
//     //     int i=0;
//     //     int j=0;
//     //     return grid(i,j,m,n);
//     // }

// public int uniquePaths(int n,int m){
// int nums[][] = new int[n][m];
// for(int i = n-1;i>=0;i--){
//     nums[i][m-1]=1;
// }
// for(int j=m-1;j>=0;j--){
//     nums[n-1][j]=1;
// }
// for(int row = n-2;row>=0;row--){
//     for(int col=m-2;col>=0;col--){
//         nums[row][col]=nums[row+1][col]+nums[row][col+1];
//     }
// }
// return nums[0][0];
// }
// }


// class Solution {
//     public int helper(int i,int j,int m,int n,int oG[][],int dp[][]){
//         if(i>=m||j>=n)return 0;
//         if(i==m-1&&j==n-1)return 1;
//         if(oG[i][j]==1)return 0;
//         if(dp[i][j]!=-1)return dp[i][j];
//         int down = helper(i+1,j,m,n,oG,dp);
//         int right = helper(i,j+1,m,n,oG,dp);
//         return dp[i][j]=down+right;
//     }
//     public int uniquePathsWithObstacles(int[][] oG) {
//         int m=oG.length;
//         int n=oG[0].length;
//         int i=0;
//         int j=0;
//         int dp[][] = new int[m][n];
//         for(int[] k:dp){
//             Arrays.fill(k,-1);
//         }
//         if(oG[0][0]==1||oG[m-1][n-1]==1)return 0;
//         int a= helper(0,0,m,n,oG,dp);
//         return a;
//     }
// }


// class Solution {
//     public int helper(int i, int j, int m, int n, int[][] oG, int[][] dp) {
//         // Base cases
//         if (i >= m || j >= n) return 0; // Out of bounds
//         if (oG[i][j] == 1) return 0; // Obstacle
//         if (i == m - 1 && j == n - 1) return 1; // Reached destination

//         // Memoization: If already computed, return the result
//         if (dp[i][j] != -1) return dp[i][j];

//         // Recursive calls for downward and rightward moves
//         int down = helper(i + 1, j, m, n, oG, dp);
//         int right = helper(i, j + 1, m, n, oG, dp);

//         // Store the result in the dp array and return
//         return dp[i][j] = down + right;
//     }

//     public int uniquePathsWithObstacles(int[][] oG) {
//         int m = oG.length;      // Number of rows
//         int n = oG[0].length;   // Number of columns

//         // If start or end cell is blocked, return 0
//         if (oG[0][0] == 1 || oG[m - 1][n - 1] == 1) return 0;

//         // Initialize the dp array with -1
//         int[][] dp = new int[m][n];
//         for (int[] row : dp) {
//             Arrays.fill(row, -1);
//         }

//         // Call the helper function starting from the top-left corner
//         return helper(0, 0, m, n, oG, dp);
//     }
// }

// 1351
// class Solution {
//     public int countNegatives(int[][] grid) {
//         int negativeCount = 0;
//         for(int i=0;i<grid.length;i++) {
//             int[] sortRow = grid[i];
//             int left = 0;
//             int right = sortRow.length-1;
//             while(left <= right) {
//                 int mid = left+(right-left)/2;
//                 if(sortRow[mid] <0) {
//                     right = mid - 1;
//                 }else { 
//                     left = mid+1;
//                 }
//             }
//             negativeCount+=(sortRow.length-left);
//         }
//         return negativeCount;
//     }
// }

//recursion
// import java.util.*;
// public class main{
//     public static void printnn(int n){
//         if(n==1){System.out.println("1");return;}
//         printnn(n-1);
//         System.out.println(n);
//     }
//     public static int fact(int n){
//         int f=1;
//         if(n==1)return 1;
//         return n*fact(n-1);
//     }
//     public static void main(String args[]){
//         int n=5;
//         printnn(n);
//         int res = fact(n);
//         System.out.println(res);
//     }
// }
// ***************************************************************************************
// 22/1/25
// 2d matrix , search in 2d matrix 1 , search in 2d matrix 2 , set matrix zero ,sort colors ,1608 
// import java.util.*;
// public class main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int m = sc.nextInt();
//         int n = sc.nextInt();
//         int arr[][] = new int[m][n];
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[0].length;j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[0].length;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
        
//     }
// }

//level order traversal 
// import java.util.*;
// import java.util.LinkedList;
// import java.util.Queue;
// class Node{
//     int data;
//     Node left,right;
//     public Node(int item){
//         data=item;
//         left=right=null;
//     }
// }
// class BinaryTree{
//     Node root;
//     public void lot(Node root){
//         if(root==null){
//             return;
//         }
//         Queue<Node> queue = new LinkedList<Node>();
//         queue.add(root);
//         while(!queue.isEmpty()){
//             Node cn = queue.poll();
//             System.out.print(cn.data+" ");
//             if(cn.left!=null){
//                 queue.add(cn.left);
//             }
//             if(cn.right!=null){
//                 queue.add(cn.right);
//             }
//         }
//     }
//     public void prot(Node root){
//         if(root==null){
//             return;
//         }
//         Stack<Node> st = new Stack<Node>();
//         st.push(root);
//         while(!st.isEmpty()){
//             Node cn = st.pop();
//             System.out.print(cn.data+" ");
//             if(cn.right!=null)st.push(cn.right);
//             if(cn.left!=null)st.push(cn.left);
//         }
//     }
// }
// public class main{
//     public static void main(String args[]){
//         BinaryTree tree = new BinaryTree();
//         tree.root=new Node(1);
//         tree.root.left = new Node(2);
//         tree.root.right = new Node(3);
//         tree.root.left.left = new Node(4);
//         tree.root.left.right = new Node(5);
//         tree.root.right.left = new Node(6);
//         tree.root.right.right = new Node(7);
//         System.out.println("Level Order Traversal:");
//         tree.lot(tree.root);
//         tree.prot(tree.root);
//         tree.iot(tree.root);
//     }
// }
// ******************************************************************************************************************** 
// 23/1/25
// 1011, count inversions , merge sorted array , bs , ms 
// search in rotated sorted array 
// find minimum  in rotated sorted array 
// square root of x 
// find peak element 
// first bad number 
// aggressive cows 
// coco eating bananas
// find no of days to make a boque 
// capacity to ship packages within k days 
// split array largest sum 
// find k closest elements 
// n th digit 
// kth smallest no in multiplication table 
// maximum consecutive one's III
// ugly number III
// maximum profit in option trading 
// find two non overlapping arrays each with target sum 
// random pick with weight snapshot array 
// swim in target product 
// smallest rectangle in closing black pixels
// median of two sorted array 
// check if n and it's double exist 
// find the smallest divisor in given threshold 
// minimum no of removal to make mountain array 
// minimum operations to reduce x to zero
// partition array into two arrays to minimize some distance 
// find target indices after sorting array 
// import java.util.*;
// public class main{
//     public void mergeSort(int arr[],int l,int r){
//         while(l<r){
//             int mid = l+(r-l)/2;
//             mergeSort(arr,l,mid);
//             mergeSort(arr,mid+1,r);
//             merge(arr,l,mid,r);
//         }
//     }
//     public void merge(int arr[],int l,int m,int r){
//         int n1 = m-l+1;
//         int n2 = r-m;
//     }
//     public static void main(String args[]){
//         int arr[] = {1,3,2,4,6,5};
//         int l=0;
//         int r=arr.length-1;
//         mergeSort(arr,l,r);
//     }
// }

// import java.util.*;
// class Node{
//     int data;
//     Node left,right;
//     Node(int data){
//         this.data=data;
//         this.left =null;
//         this.right =null;
//     }
// }
// class Tree{
//     Node root;
//     public void ino(Node root){
//         Stack<Node> st = new Stack<Node>();
//         Node cn = root;
//         while(cn!=null||!st.isEmpty()){
//             while(cn!=null){
//                 st.push(cn);
//                 cn=cn.left;
//             }
//             cn = st.pop();
//             System.out.print(cn.data);
//             cn=cn.right;
//         }
//     }
// }
// public class main{
//     public static void main(String args[]){
//         Tree tree = new Tree();
//         tree.root = new Node(1);
//         tree.root.left = new Node(2);
//         tree.root.right = new Node(3);
//         tree.root.left.left = new Node(4);
//         tree.root.left.right = new Node(5);
//         tree.root.left.right.left = new Node(6);
//         tree.root.left.right.right = new Node(7); 
//         tree.ino(tree.root);
//     }
// }
// all traversal in one go 
// import java.util.*;
// public class main{
//     static class Pair{
//         Node fir;
//         int sec;
//         public Pair(Node fir,int sec){
//             this.fir=fir;
//             this.sec=sec;
//         }
//     }
//     static class Node{
//         int data;
//         Node left,right;
//         Node(int data){
//             this.data=data;
//             left=right=null;
//         }
//     }
//     static void allTrav(Node root){
//         ArrayList<Integer> pre = new ArrayList<>();
//         ArrayList<Integer> in = new ArrayList<>();
//         ArrayList<Integer> post = new ArrayList<>();
//         Stack<Pair> st = new Stack<>();
//         st.push(new Pair(root,1));
//         while(!st.isEmpty()){
//             Pair p = st.peek();
//             if(p.sec==1){
//                 st.peek().sec++;
//                 pre.add(p.fir.data);
//                 if(p.fir.left!=null){
//                     st.push(new Pair(p.fir.left,1));
//                 }
//             }else if(p.sec==2){
//                 st.peek().sec++;
//                 in.add(p.fir.data);
//                 if(p.fir.right!=null){
//                     st.push(new Pair(p.fir.right,1));
//                 }
//             }else{
//                 post.add(p.fir.data);
//                 st.pop();
//             }
//         }
//         System.out.println("Pre: ");
//         for(int i:pre){
//             System.out.print(i+" ");
//         }
//         System.out.println();
//         System.out.println("In: ");
//         for(int i:in){
//             System.out.print(i+" ");
//         }
//         System.out.println();
//         System.out.println("Post: ");
//         for(int i:post){
//             System.out.print(i+" ");
//         }
//     }
//     public static void main(String args[]){
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);
//         allTrav(root);
//     }
// }

// ********************************************************************************************************************************** 
// 24/1/25
// import java.util.*;
// public class main{
//     public static void main(String args[]){

//     }
// }
// split array largest sum ,koko eating bananas //mergesorted array , count inversion , 
// *********************************************************** ?

// 25/1/25
// Maximum Depth of Binary Tree 
//either trhough recursive function or level order traversal 
//for recursive tc = O(height) and for level order tc i= O(N)
//intuition 1+max(l,r)
// tc=> o(n) sc same 
// import java.util.*;
// public class main{
// public static class Node{
//     int val;
//     Node left;
//     Node right;
//     Node(int data){
//         this.val=data;
//         left=right=null;
//     }
// }
//     public static int maxDepth(Node root){
//         if(root==null)return 0;
//         int lm = maxDepth(root.left);
//         int rm = maxDepth(root.right);
//         return (1+Math.max(lm,rm));
//     }
//     public static void main(String args[]){
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);
//         int x =maxDepth(root);
//         System.out.println(x);
//         return ;
//     }
// }

//check for balanced tree 
// import java.util.*;
// public class main{
//     // public static class Node{
//     //     Node root;
        
//     // }
//     public static void main(String args[]){
//      System.out.println("Hello");   
//     }
// }

// ***************************************************************************************
// implement stack using arrays  
// import java.util.*;
// public class main{
//     public void push(int data){

//     }
//     public static void main(String args[]){
//         Stack<Integer> st = new Stack<>();


//     }
// }
// import java.util.*;
// public class main{
//     public static void main(String args[]){
        
//     }
// }
// nse,nge 
// ******************************************************************************************************* 
// 29/1/25
// write a code to find next smaller element on left and right side 
//largest rectangle in histogram brute and stack 
//avoid flood 
//maximal rectangle 
// import java.util.*;
// public class main{
//     public static int[] nsel(int arr[]){
//         int res[] = new int[arr.length];
//         Arrays.fill(res,-1);
//         Stack<Integer> st = new Stack<>(); 
//         for(int i=0;i<arr.length;i++){
//         while (!st.empty() && arr[i] < arr[st.peek()]) {
//             res[st.peek()] = arr[i];
//             st.pop();
//         }
//         st.push(i);
//         }
//         return res;
//     }
//     public static int[] nser(int arr[]){
//         int res[] = new int[arr.length];
//         Arrays.fill(res,-1);
//         Stack<Integer> st = new Stack<>();
//         for(int i=arr.length-1;i>=0;i--){
//             while(!st.empty()&&arr[i]<arr[st.peek()]){
//                 res[st.peek()]=arr[i];
//                 st.pop();
//             }
//             st.push(i);
//         }
//         return res;
//     }
//     public static void main(String args[]){
//         int arr[] ={3724,5151,801,1768,6220};
//         int res1[]=nsel(arr);
//         int res2[]=nser(arr);
//         for(int i=0;i<res1.length;i++){
//             System.out.print(res1[i]+" ");
//         }
//         System.out.println();
//         for(int i=0;i<res2.length;i++){
//             System.out.print(res2[i]+" ");
//         }
//     }
// }

// *********************************************************************************************** 
// 30/1/25
// search in a linked list 
// middle of a linked list  876
// remove ll elements 203
// delete ll  node 237
// delete middle on ll  2095
// merge two sorted list 21 
// pascal triangle 
// set matrix zero 
// next permutatiion 
// maximum subarray / kadane's algo 
// ****************************************************************************************************
// 31/1/25
// distance value btw two array leetcode 1385
// palindrome reorder 
// counting no of divisors 
// tc<-n(log x)
// #include<bits/stdc++.h>
// using namespace std;
// #define ll long long
// int main(){
//   ll n;
//   cin>>n;
//   vector<ll> v(1000001,0);
//   for(ll i=1;i<=1000000;i++){
//     for(ll j=i;j<=1000000;j+=i)v[j]++;
//   }
//   while(n--){
//     ll k; cin>>k;
//     cout<<v[k]<<endl;
//   }
//   return 0;
  
// }
// distance value btw two array leetcode 1385
// palindrome reorder 
// #include<bits/stdc++.h>
// using namespace std;
// #define ll long long
// int main(){
//   int t;
//   cin>>t;
//   while(t--){
//     ll r,c;
//     cin>>r>>c;
//     ll int ans;
//     if(r>=c){
//       ans = (r-1)*1ll*(r-1);
//       if((r%2)==1) ans+=c;
//       else ans+=r+(r-c);
//     }else{
//       ans = (c-1)*1ll*(c-1);
//       if(c%2==0)ans+=r;
//       else ans+=c+(c-r);
//     }
//     cout<<ans<<endl;
//   }
//   return 0;
// }
// tc<-n(log x)
// #include<bits/stdc++.h>
// using namespace std;
// #define ll long long
// int main(){
//   ll n;
//   cin>>n;
//   vector<ll> v(1000001,0);
//   for(ll i=1;i<=1000000;i++){
//     for(ll j=i;j<=1000000;j+=i)v[j]++;
//   }
//   while(n--){
//     ll k; cin>>k;
//     cout<<v[k]<<endl;
//   }
//   return 0;
// }
//reverse of a linked list q 206 
//remove duplicates from sorted list q83
// palindrome linked list  q234
// middle of linked list q2095
// Intersection of two linked list  q160
// Linked List cycle 1 q141
// Linked List cycle 2 q142
// merge Sort q148
// q92 ,
// q23,
// q328
// q1019
// q143 
// q2 
// ********************************************************************************************************************************** 
// 1/2/25
// Binary Trees
// binary search q704
// merge 2 sorted array q88
// sort list q148 
// intution -> 1 create array store all linked list , sort array , then put all elements to linked list linearly 
//2 create list , through collection framework sort it 
//3 bubble sort 
//4 merge sort 
//5  radix sort 
// sort list 
// reorder list 
// merge k sorted list 
// odd even linked list 
//sort list -> 
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        return helper(head);
    }
    private ListNode helper(ListNode head){
        if(head == null || head.next == null)return head;
        ListNode mid = getMiddle(head);
        ListNode left = helper(head);
        ListNode right = helper(mid);
        return merge(left,right);
    }
    private ListNode merge(ListNode l1, ListNode l2){
        ListNode temp = new ListNode(0);
        ListNode res = temp;
        while(l1!=null || l2!=null){
            int x = l1==null?Integer.MAX_VALUE:l1.val;
            int y = l2==null?Integer.MAX_VALUE:l2.val;
            if(x<y){
                temp.next = l1;
                l1 = l1.next;
            }else{
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        return res.next;
    }
    private ListNode getMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = new ListNode(0);
        temp.next = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            temp = temp.next;
        }
        temp.next = null;
        return slow;
    }
}