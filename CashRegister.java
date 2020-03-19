public class CashRegister{
	private double totalRevenue = 0;
	private int totalNumberSoldTickets = 0;
	
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
}