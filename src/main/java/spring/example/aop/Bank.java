package spring.example.aop;

import org.springframework.stereotype.Component;

public class Bank {
	public void logBefore() {
		System.out.println("[LOG] Starting Bank Operation.");
	}

	public void logAfter() {
		System.out.println("[LOG] Completed Bank Operation. ");
	}

}
