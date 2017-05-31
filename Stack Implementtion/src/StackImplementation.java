import java.util.Scanner;
public class StackImplementation {
	public static Ball top; //maintain top of stack 
	
	public static void pop() { 
	if (top != null) //if list is not empty  
	{ 
		
	 top = top.GetNextLink();
	
	 }  
	}
	public static void push(Ball item) {  //adds ball to top of stack
	if(top == null)// if stack is empty
	{
		top = item;
	}
	else{
		item.SetNextLink(top);
		top = item;
	}
	}
	
	public static String peek() // shows last item pushed onto stack
	{
		if(top!=null)
		{
		return top.getColor();
		}
		
		return null;
		
	}
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int command = 1;
		
		
		while (command!=4)
		{
			System.out.println("Press 1 to push");
			System.out.println("Press 2 to pop");
			System.out.println("Press 3 to peek");
			System.out.println("Press 4 to exit");
			command = keyboard.nextInt();
			String s = keyboard.nextLine();
			switch(command)
		{
			case 1:
				System.out.println("Enter the color of the ball");
				s = keyboard.nextLine();
				Ball newBall = new Ball();
				newBall.setcolor(s);
				push(newBall);
				break;
			case 2:
				pop();
				break;
			case 3:
				System.out.println(peek());
				break;
			
				
		}
		}			
		
		
		
		
	}
}


