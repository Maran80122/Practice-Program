package Task;

public class BankAccount {
	private  String accountNumber;
	private Double balance;
	
	public String getAccountNumber()
	{
		return accountNumber;
	}

	public Double getBalance()
	{
		return balance;
	}
	public void setAccountNumber(String accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	public void setBalance(double balance )
	{
		if(balance>=0)
		{
			this.balance=balance;
		
		}
		else
		{
			System.out.println("negative amt");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b= new BankAccount();
		b.setAccountNumber("ACC344555444");
		b.setBalance(3555);
		
		System.out.println("Account number is:"+b.getAccountNumber());
		System.out.println("Balance is:"+b.getBalance());

	}

}
