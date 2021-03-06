
public class BankThreadTest implements Runnable{
	public static void main(String args[]){
		BankThreadTest btt=new BankThreadTest();
		Thread td=new Thread(btt,"deposit1");
		Thread td1=new Thread(btt,"deposit2");
		td.start();
		td1.start();	
	}
	
	BankAccount ba=new BankAccount();
		@Override
		public void run() {	
			try {
				ba.deposit(200);
				System.out.println(ba.getAccountBalance());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// TODO Auto-generated method stub
		}
}
class BankAccount {

    int accountNumber; 	
    double accountBalance;


    public double getAccountBalance() {
		return accountBalance;
	}

	// to withdraw funds from the account
    public boolean transfer (double amount)  
    {
        double newAccountBalance;

        if( amount > accountBalance)
	{
             //there are not enough funds in the account
             return false; 
	}
		
	else
	{
            newAccountBalance = accountBalance - amount;
            accountBalance = newAccountBalance;
            return true;
        }

    }

    public synchronized boolean  deposit(double amount) throws InterruptedException 
    {
	double newAccountBalance;

	if( amount < 0.0)
	{
          return false; // can not deposit a negative amount
	}
		
	else
	{
		Thread.sleep(1000);
          newAccountBalance = accountBalance + amount;
          accountBalance = newAccountBalance;
	  return true;
         }

    }
    }