
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char x ='s';
		switch (x)
		{
		case 'l' :
		case 'L' :
			System.out.println(x+" is Letter");
			break;
			
		case 'd':
		case 'D':
			System.out.println(x+" is Digit");
			break;
			
		case 'w':
		case 'W':
			System.out.println(x+" is whitespace");
			break;
		
		
		case 's':
		case 'S':
			System.out.println(x+" is special symbol");
			break;
		}

	}

}
