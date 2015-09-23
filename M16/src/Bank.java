/// Bank Problem
class Account{
	double account_balance;
	double current_balance;
	Account(double x){
		if(account_balance>=0.0){
			this.account_balance=x;
		}else{
			this.account_balance=0.0;
			System.out.println("initial balance was invalid.");
		}
	}
	
	void credit(){
		
	}
	
	void debit(double x){		// x is drawl amount
		if(x>account_balance){
			System.out.println("Debit amount exceeded account balance");
		}else{
			
		}
	}
	
	double getBalance(){
		return current_balance;
		
	}
}

class SavingsAccount extends Account{
	double  interest_rate;
	double interest_earned;
	SavingsAccount(double x,double  y) {
		super(x);
		this.interest_rate=y;
	}
	
	public double calculateInterest(){
		
		interest_earned=interest_rate*account_balance;
		return  interest_earned;
	}
	
}
class CheckingAccount extends Account{
	double fee_amount;
	CheckingAccount(double x,double y) {
		super(x);
		this.fee_amount=y;
	}
	
	void credit(){
		
		}
	
	void debit(double x){		// x is drawl amount
		if(x>account_balance){
			System.out.println("Debit amount exceeded account balance");
		}else{
			
		}
	}
	
	
	
	
}
class CurrentAccount extends Account{

	CurrentAccount(double x) {
		super(x);
	}
	
}


public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
