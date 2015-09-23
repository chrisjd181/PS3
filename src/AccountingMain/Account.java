package AccountingMain;

import java.util.Date;

public class Account {

	private int id=0;
	private double balance=0;
	private double AnnualInterestRate=0;
	private Date dateCreated= new Date();
	
	//No args constructor that creates a default account
	public Account() {
	}
	// Constructor that creates and account with a specified id and initial balance
	public Account(int id, double balance)
	{
		this.id=id;
		this.balance=balance;
	}
	
	//Accessor methods for id, balance, AnnualInterestRate, and dateCreated
	public void setID(int id)
	{
		this.id=id;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public void setAnnualInterestRate(double AnnualInterestRate)
	{
		this.AnnualInterestRate=AnnualInterestRate;
	}
	public void setdateCreated(Date dateCreated)
	{
		this.dateCreated=dateCreated;
	}
	
	//Mutators for id, balance, and dateCreated
	public double getID()
	{
		return id;
	}
	public double getBalance()
	{
		return balance;
	}
	public Date getDateCreated()
	{
		return dateCreated;
	}
	
	//Method for getting monthly interest rate
	public double getMonthlyInterestRate()
	{
		return ((AnnualInterestRate*100)/12);
	}
	
	//Method that deposits a specified amount to the account
	public void deposit(double DepositedMoney)
	{
		this.balance=DepositedMoney+balance;
	}
	
	//Method that withdraws a specified amount from the account
	public void withdraw(double WithdrawnMoney)
			throws InsufficientFundsException
			{
		if (WithdrawnMoney > balance)
		{
			this.balance= balance-WithdrawnMoney;
		}
		else
		{
			double required= WithdrawnMoney-balance;
			throw new InsufficientFundsException(required);
		}
		}
			}

