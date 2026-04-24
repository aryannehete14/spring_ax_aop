package spring.example.aop;
// TARGET CLASS

public class BankService {
	public void deposit() {
		System.out.println("Depositing Money.........");
	}

	public void withdraw() {
		System.out.println("Withdrawing Money........");
	}

}
