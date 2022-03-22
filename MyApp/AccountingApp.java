
public class AccountingApp {

	public static void main(String[] args) {
		
		double vauleOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;		
		double vat = vauleOfSupply*vatRate;
		double total = vauleOfSupply + vat;
		double expense = vauleOfSupply*expenseRate;
		double income = vauleOfSupply - expense;
		double dividend1 = income * 0.5;
		double dividend2 = income * 0.3;
		double dividend3 = income * 0.2;
		
		System.out.println("Value of supply : "+vauleOfSupply);
		System.out.println("Vat : "+vat);
		System.out.println("Total : "+total);
		System.out.println("Expense : "+expense);
		System.out.println("Income : "+income);
		System.out.println("Dividend 1 : "+dividend1);
		System.out.println("Dividend 2 : "+dividend2);
		System.out.println("Dividend 3 : "+dividend3);
		
	}

}
