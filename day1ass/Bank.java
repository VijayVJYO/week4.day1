package week4.day1ass;

public class Bank extends Loan implements Cibil,PNB {

	@Override
	public void bankBalance() {
		// TODO Auto-generated method stub
		System.out.println("bank balance-10000");
	}

	@Override
	public void maximumLoanAmount() {
		// TODO Auto-generated method stub
		System.out.println("mix loan am-1000");
	}

	public void creditScore() {
		// TODO Auto-generated method stub
		System.out.println("cs-750");
	}

	public void minimumBalance() {
		// TODO Auto-generated method stub
		System.out.println("minbal-2000");
	}

	public void cibilScore() {
		// TODO Auto-generated method stub
		System.out.println("CS-750");
	}
	public static void main(String[] args) {
		//bank extends of Object
		Bank ban=new Bank();
		ban.bankBalance();
		ban.maximumLoanAmount();
		ban.SBIITLoan();
		//CIBIL IMPLEMENT OF OBJECT
		Cibil cib=new Bank();
		cib.cibilScore();
		//PNB IMPLEMENT OF OBJECT
		PNB pnb=new Bank();
		pnb.maximumLoanAmount();
		pnb.minimumBalance();
		pnb.creditScore();
	}

}
