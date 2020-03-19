import java.util.Scanner;

public class Kermis{

	public static void main(String[] args){
	
		Scanner textInput = new Scanner(System.in);
		String textInputString;
		int inputInt;
		boolean quit = false;
		
		CashRegister cashregister = new CashRegister();
		
		//Create all rides
		BumperCars bumpercars = new BumperCars("Bumpy Bumper Cars", 2.50, 10);
		Spin spin = new Spin("Top Spin", 2.25, 10);
		HallOfMirrors  hallofmirrors = new HallOfMirrors("Hall of Mirrors", 2.75, 10);
		GhostTrain ghosttrain = new GhostTrain("Spooky Ghost Train", 3.20, 10);
		HawaiiSwing hawaiiswing = new HawaiiSwing("Hawaii Swing", 2.90, 10);
		LadderClimb ladderclimb = new LadderClimb("Ladder Climb game", 5.00, 10);
		
		
		/*
			Run the programm
		*/
		while(quit == false){
			System.out.println("*************\nOption menu   \n*************");
			System.out.println("(1) " + bumpercars.getRideName() + "\n" +
								"(2) " +  spin.getRideName() + "\n" +
								"(3) " + hallofmirrors.getRideName() + "\n" +
								"(4) " + ghosttrain.getRideName() + "\n" +
								"(5) " + hawaiiswing.getRideName() + "\n" +
								"(6) " + ladderclimb.getRideName() + "\n" +
								"(r) Show revenue\n" +
								"(t) Show ticket sales\n" + 
								"(q) Quit programm");
			textInputString = textInput.nextLine();
			if (textInputString.length() == 1 && Character.isDigit(textInputString.charAt(0)) == true){
				//Input is a single digit
				inputInt = Integer.parseInt(textInputString);
				switch(inputInt){
					case 1: 
						bumpercars.rides(cashregister);
						break;
					case 2:
						spin.rides(cashregister);
						break;
					case 3:
						hallofmirrors.rides(cashregister);
						break;
					case 4:
						ghosttrain.rides(cashregister);
						break;
					case 5:
						hawaiiswing.rides(cashregister);
						break;
					case 6: 
						ladderclimb.rides(cashregister);
						break;
					default: 
						System.out.println("Please choose an option from the option menu.");
						break;
				}
			}
			else if(textInputString.length() == 1){
				//Input is a single character
				switch(textInputString.charAt(0)){
					case 'r': //Show revenue
						System.out.println("*************\nRevenue   \n*************");
						System.out.println(bumpercars.getRideName() + ": " + bumpercars.getRevenue() + "\n" +
											spin.getRideName() + ": "  + spin.getRevenue() + "\n" +
											hallofmirrors.getRideName() + ": " + hallofmirrors.getRevenue() + "\n" +
											ghosttrain.getRideName() + ": " +  ghosttrain.getRevenue() + "\n" +
											hawaiiswing.getRideName() + ": " + hawaiiswing.getRevenue() + "\n" +
											ladderclimb.getRideName() + ": " + ladderclimb.getRevenue() + "\n" +
											"Total revenue: " + cashregister.getTotalRevenue());
						break;
					case 't': //Show ticket sales
						System.out.println("*************\nTicket sales   \n*************");
						System.out.println(bumpercars.getRideName() + ": " + bumpercars.getNumberSoldTickets() + "\n" +
											spin.getRideName() + ": "  + spin.getNumberSoldTickets() + "\n" +
											hallofmirrors.getRideName() + ": " + hallofmirrors.getNumberSoldTickets() + "\n" +
											ghosttrain.getRideName() + ": " +  ghosttrain.getNumberSoldTickets() + "\n" +
											hawaiiswing.getRideName() + ": " + hawaiiswing.getNumberSoldTickets() + "\n" +
											ladderclimb.getRideName() + ": " + ladderclimb.getNumberSoldTickets() + "\n" +
											"Total ticket sales: " + cashregister.getTotalNumberSoldTickets());
						break;
					case 'q': //Quit programm
						quit = true;
						break;
					default:
						System.out.println("Please choose an option from the option menu.");
						break;	
				}
			}
			else{
				//Input from cmd is not a single digit or single character 
				System.out.println("Please choose an option from the option menu.");
				continue;
			}
		} //Close while loop
	} //Close main
} //Close class