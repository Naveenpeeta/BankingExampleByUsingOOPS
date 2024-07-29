package inheritance;


class BankAccount extends HolderDetails{
	float balance;
	
	BankAccount(){
		balance = 0;
	}
	public void deposit(float amount) {
		balance +=amount;
	}
	public void withdraw(float amount) {
		if(balance>amount) {
			balance-=amount;
		}else {
			System.out.println("Insufficent balance");
		}
	}
	public float getBalance() {
		return balance;
	}
}

class Sample{
	public static void main(String[] args) {
		HolderDetails bankName = new HolderDetails();
		CurrentAccountDetails bankaccount  = new CurrentAccountDetails();
		bankName.name("Naveen");
		bankName.number(9581120277l);
		bankName.email("nanipeetha398@gmail.com");
		//System.out.println(bankName.name("Naveen"));
		System.out.println(bankaccount.getBalance());
		bankaccount.deposit(500);
		bankaccount.deposit(500);
		bankaccount.deposit(500);
		bankaccount.deposit(500);
		bankaccount.withdraw(500);
		bankaccount.withdraw(500);
		//bankaccount.withdraw(500);
		System.out.println(bankaccount.getBalance());
	}
}





