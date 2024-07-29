package inheritance;

interface AccountDetails{
	void name(String name);
	void number(long number);
	void email(String email);
	//void address()
	
	
	
}
class HolderDetails implements AccountDetails{
	
	public void name(String name) {
		System.out.println("name:"+name);
	}
	public void number(long phnum) {
		System.out.println("Phone number:"+phnum);
	}
	@Override
	public void email(String email) {
		System.out.println("email:"+email);

		// TODO Auto-generated method stub
		
	}
	 
}

public class AccountHolderDetails {

}
