//stack implementation
import java.util.Scanner;
class stack
{
	 static int top,size;
	 static int s[];
	 stack()
	 {
		 top=0;
		 size=0;
	 }
	 //push operation
	 void push(int x)
	 {
		 if(top==size)
		 {
			 System.out.println("stack overflow!!!");
		 }
		 else
		 {
			 top++;
			 s[top]=x;
		 }
		 
	 }
	 
	 ///pop operation
	 void pop()
	 {
		 if(top==0)
		 {
			 System.out.println("stack underflow!!!");
		 }
		 else
		 {
		 top=top-1;
		 }
	 }
	 void display()
	 {
		 System.out.println("Elements of array are :");
		 for(int i=0;i<top;i++)
		 {
			 System.out.print(s[i]+ " ");
		 }
	 }
	 public static void main(String args[])
	 {
		 Scanner ss=new Scanner(System.in);
		 stack st=new stack();
		 System.out.println("Enter size of stack:");
		 st.size=ss.nextInt();
		 st.s=new int[size];
		 while(true)
		 {
			 for(int i=0;i<50;i++)
			 {
				 System.out.print("-");
				 
			 }
			 System.out.println("");
			 for(int i=0;i<50;i++)
			 {
				 System.out.print("-");
				 
			 }
			 System.out.println("");
			 System.out.println("\t\t\tMENU ");
			 System.out.println("\t\t 1. push operation");
			 System.out.println("\t\t 2. pop operation");
			 System.out.println("\t\t 3. display stack ");
			 System.out.print("\t\t Enter your choice: ");
			 int ch=ss.nextInt();
			 switch(ch)
			 {
				 case 1:
				       System.out.println("Enter element to be inserted :");
					   int ele=ss.nextInt();
					   st.push(ele);
					   break;
				 case 2:
					   st.pop();
					   break;
				 case 3:
						st.display();
						break;
				 default:
				        System.out.println("wrong entry!!!please try again");
			 }
			 
		 }
	 }
}