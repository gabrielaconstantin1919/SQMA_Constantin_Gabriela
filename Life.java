<<<<<<< HEAD

=======
>>>>>>> a86d1bf25a890c537a0178ee596739dee846e810
public class Life {
	
	private boolean balance;
	private int nrOfCoffieesPerDay;
	private int workingHoursPerDay;
	private String mainHobby;
	
	public boolean getBalance() {
		return balance;
	}
	public void isBalanced(boolean balance) {
		this.balance = balance;
	}
	public int getNrOfCoffieesPerDay() {
		return nrOfCoffieesPerDay;
	}
	public void setNrOfCoffieesPerDay(int nrOfCoffieesPerDay) {
		this.nrOfCoffieesPerDay = nrOfCoffieesPerDay;
	}
	public int getWorkingHoursPerDay() {
		return workingHoursPerDay;
	}
	public void setWorkingHoursPerDay(int workingHoursPerDay) {
		if(workingHoursPerDay > 8) {
			this.workingHoursPerDay = workingHoursPerDay;
			this.isBalanced(false);
		} else {
			this.isBalanced(true);
		}
	}
	public String getMainHobby() {
		return mainHobby;
	}
	public void setMainHobby(String mainHobby) {
		if(mainHobby.length() > 20 || mainHobby.length() < 3) {
			throw new Error("Invalid hobby name");
		}
		this.mainHobby = mainHobby;
	}

}
