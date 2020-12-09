
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack num = new Stack();
		if(num.isEmpty()) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		num.push(8);
		num.push(15);
		num.push(25);
		num.push(45);
		num.show();
		System.out.println();
		System.out.println("pop element "+num.pop());
		num.show();
		System.out.println();
		num.push(45);
		if(num.isEmpty()) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		System.out.println("Stack size "+num.size());
		System.out.println("peek element "+num.peek());

	}

}
