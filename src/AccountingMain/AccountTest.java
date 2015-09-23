package AccountingMain;

import static org.junit.Assert.*;


public class AccountTest {

	Account  account;
	
	public void SetUp() throws Exception
	{
		account = new Account(1122, 20000);
		account.setAnnualInterestRate(4.5);
	}
	
	public void TearDown() throws Exception
	{
		account=null;
	}
	
	//Testing Cases Below
	//Tests for Deposit Error
	public final void testDeposit()
	{
		account.deposit(3000);
		assertEquals("Depositing $3000 to your account leaves your with $23,000",23000
				,account.getBalance(),.001);
	}
	//Tests withdrawing too much money
	public final void testErrorWithdraw() 
	throws InsufficientFundsException
	{
		account.withdraw(100000);
	}
	//Tests for Withdraw Error
	public final void testWithdraw() 
	throws InsufficientFundsException
	{
		account.withdraw(2500);
		assertEquals("Withdrawing $2500 from your account leaves your with $17,500",
				(double) 17500, (double) account.getBalance(),0.001);
	}
	//Tests the Printout Function
	public final void testPrint() {
		System.out.print("Account Balance:$" + account.getBalance());
		System.out.print("Monthly Interest: "
				+ account.getMonthlyInterestRate() + "%");
		System.out.print("Your account was created on: " + account.getDateCreated());
		assertEquals("Account Balance: $20000", "Balance:$" + account.getBalance());
		assertEquals("Monthly Interest: .375%", "Monthly Interest Rate: "
				+ account.getMonthlyInterestRate() + "%");
		assertEquals("Account created on:" + account.getDateCreated(),
				"Account created on: " + account.getDateCreated());
	}
}



