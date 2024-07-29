package inheritance;

class CurrentAccountDetails extends BankAccount{
	 static int freeTranscation = 3;
	 static int transcationfee = 20;
	 int transcationCount = 0;
	 
	 public void deductFee() {
		 float fee = transcationfee*(transcationCount - freeTranscation);
		 if(super.balance>fee) {
			 super.balance-=fee;
		 }else {
			 System.out.println("Insufficent balance");
		 }
	 }
	 public  void deposit(float amount) {
         transcationCount +=1;
         if(transcationCount<=freeTranscation) {
        	 super.deposit(amount);
         }else {
        	 deductFee();
        	 super.deposit(amount);
         }
	 }
	 public void withdraw(float amount) {
		 transcationCount+=1;
		 if(transcationCount<=freeTranscation) {
			 super.withdraw(amount);
		 }
		 else {
			 deductFee();
			 super.withdraw(amount);
		 }
	 }
}

