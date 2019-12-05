
public class MessyCore {
	static House myHouse = new House(1);

	public static void main(String[] args) {
		if (myHouse.isTidy()) {
			System.out.println("I am not messy!");
		} else {
			myHouse.tidyUp();
		}
	}
}