public class CashRegister{
	private double totalRevenue = 0;
	private int totalNumberSoldTickets = 0;
	private int numberOfTaxInspectorVisits = 0;
	private double totalTaxesPaid = 0;
	
	public void increaseTotalRevenue(double price){
		totalRevenue += price;
	}
	
	public void increaseTotalNumberSoldTickets(){
		//Increase total number of sold tickets 
		++totalNumberSoldTickets;
	}
	
	public double getTotalRevenue(){
		return totalRevenue;
	}
	public int getTotalNumberSoldTickets(){
		return totalNumberSoldTickets;
	}
	
	public double getTotalTaxesPaid(){
		return totalTaxesPaid;
	}
	
	public void takeGamblingTax(double gamblingTax){
		totalRevenue -= gamblingTax;
		++numberOfTaxInspectorVisits;
		totalTaxesPaid += gamblingTax;
	}
}