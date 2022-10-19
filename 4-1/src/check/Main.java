package check;
import constants.Constants;

public class Main {
	private static String firstName = "土田";
	private static String lastName = "詩音" ;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	    printName(firstName,lastName);
		Constants con = new Constants();
		Pet p = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		p.introduce();
		RobotPet rob = new  RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		rob.introduce();
		
	}
	
	private static void printName(String firstName, String lastName){
		System.out.println("printNameメソッド→" + firstName + lastName);
	}

}
