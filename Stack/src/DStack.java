

public class DStack {
	int capacity = 2;
	int stack[] = new int[capacity];
	int top = 0;
	
	public void push(int data) {
		
		if(size()==capacity) {
			expand();
		}
		stack[top++]=data;
	}
	
	private void expand() {
		// TODO Auto-generated method stub
		int length = size();
		capacity = capacity*2;
		int newStack[] = new int[capacity];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
		
	}

	public int pop() {
		int data;
		data = stack[top-1];
		stack[top-1]=0;
		top--;
		shrink();
		return data;
	}
	private void shrink() {
		// TODO Auto-generated method stub
		int length = top;
		if(length<(capacity/2)) {
			capacity/=2;
		}
		int newStack[] = new int[capacity];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
		
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

