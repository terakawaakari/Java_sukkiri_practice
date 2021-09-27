package chapter2;

import static chapter2.AccountType.*;

enum AccountType {
	FUTSU, TOUZA, TEIKI;
}

public class Account {
	private String accountNo;
	private AccountType accountType;
	private int zandaka;

	public int getZandaka() {
		return this.zandaka;
	}

	public Account(String No, AccountType Type) {
		this.accountNo = No;
		this.accountType = Type;
	}

	public static void main(String[] args) {
		Account a = new Account("1111", FUTSU);
		a.zandaka = 100;
		System.out.println(a.accountNo + " " + a.accountType + " " + a.zandaka);
	}
}
