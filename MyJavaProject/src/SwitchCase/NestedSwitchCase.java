package SwitchCase;

public class NestedSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char branch='C';
		int collegeYear=2;
		switch(collegeYear)
			{
			case 1:
			System.out.println("English,Chemistry,Mathmatics,Python");
			break;
			case 2:
				switch(branch)
				{
				case 'C':
					System.out.println("OS,OOPS,DBMS,BS");
					break;
				case 'E':
					System.out.println("DSP,ES,CS,BEME");
					break;
				case 'I':
					System.out.println("AS,JAVA,OS,DDBMS");
					break;
				default:
					System.out.println("Invalid input");
					
				}
			default:
				System.out.println(" college year Invalid ");
			}

	}

}
