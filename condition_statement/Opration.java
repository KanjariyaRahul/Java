class Opration{
	public static void main(String[] args) {
		
		int a=10,b=20;
		char num = '+';

		switch(num)
		{
			case '+' :
				System.out.println("sum of"+(a+b));
				break;

			case '-' :
				System.out.println("sum of"+(a-b));
				break;
			case '*' :
				System.out.println("sum of"+(a*b));
				break;

			case '/' :
				System.out.println("sum of"+(a/b));
				break;

			default :

				System.out.println("invalid choice");

		}
		
	}
}