
public class Stack {
	
	int stack[] = new int[5];
	int top = 0;
	
	public void push(int data) {
		
		stack[top++]=data;
	}
	
	public int pop() {
		int data;
		data = stack[top-1];
		stack[top-1]=0;
		top--;
		return data;
	}
	public int peek() {
		
		return stack[top-1];
		
	}
	public int size() {
		return top;
	}
	public boolean isEmpty() {
		if(top<=0) {
			return true;
		}
		return false;
	}
	
	public void show() {
		for(int n : stack) {
			System.out.print(n+ " ");
		}
	}
}
