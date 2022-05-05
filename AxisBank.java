package week3.day1;

public class AxisBank {
public static void main(String[] args) {
	BankInfo bank=new BankInfo();
	bank.deposit();
	bank.fixed();
	bank.saving();
	AxisBank axis=new AxisBank();
	//Overriding deposit method
	axis.deposit();
}
	public void deposit()
	{
		System.out.println("The deposited amount is 10L");
	}
}

