import java.util.Scanner;
public class linkedlistUSE {
	
	public static void print(node<Integer> head){

	      node<Integer> temp = head;
	      while(head!= null){
	        System.out.print(temp.data + " ");
	        temp=temp.next;
	      }
	      System.out.println();

	      //System.out.println("Print"+head);
	      //System.out.println(head.data);
	      //System.out.println(head.next);
	      //System.out.println(head.next.data);
	      //System.out.println(head.next.next.data);
	  }
	
	public static node<Integer> takeInput(){
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        node<Integer> head = null, tail = null;
        while(data != -1){
          node<Integer> currentnode= new node<Integer>(data);
          if(head==null){
            head=currentnode;
            tail=currentnode;
          }else{
            //Node<Integer> tail = head;
          //  while(tail.next!==null){
          //      tail= tail.next;
          //  }
        //    tail.next= currentNode;
        //  }
        //  data=s.nextInt();
        tail.next = currentnode;
        tail=currentnode;    //tail=tail.next;
    }
    data= s.nextInt();
        }
        return head;
	}

	public static void main(String[] args) {
		node<Integer> head = takeInput();
		linkedlistUSE.print(head);
//		System.out.println(head.data);
//	      print(head);
		// TODO Auto-generated method stub
//		node n1 = new node(10);
//	      node<Integer> n1= new node<>(10);
//	      //System.out.println(n1);
//	      System.out.println(n1.data);
//	      System.out.println(n1.next);
	}

}
