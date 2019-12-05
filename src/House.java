public class House {
	
	private int trashNumber = 0;
	private String password = "";
	
	boolean isLocked = false;
	
	public House(int trashNumber) {
		this.trashNumber = trashNumber;
	}
	
	public boolean isTidy() {
		if (trashNumber != 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public void tidyUp() {
		if (!isLocked) {
			this.trashNumber = 0;
			this.isLocked = true;
			System.out.println("The house is cleaned and locked!");
		} else {
			System.out.println("The house is locked, you can't get in!");
		}
	}
	
	public void unlock(String input) {
		if (input == this.password) {
			this.isLocked = false;
		} else {
			System.out.println("Wrong password!");
		}
	}
}
