package Tester;

import java.util.Comparator;
import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;

import Basic_functionality.Cricketer;
import Custom_exc.CricketerExc;

public class Tester {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			Map<String, Cricketer> crick = new HashMap<>();
			boolean exit = true;
			while (exit) {
				System.out.println("\n**********menu**************\n1.Accept minimum 5 Cricketers in the collection.\r\n" + "\r\n"
						+ "2.Modify Cricketer's rating\r\n" + "\r\n" + "3.Search Cricketer by name\r\n" + "\r\n"
						+ "4. Display all Cricketers added in collection.\r\n" + "\r\n"
						+ "5.Display All Cricketers in sorted form by rating.\r\n" + "");
				System.out.println("Enter the choice");
				try {
					switch (sc.nextInt()) {
					case 0:
						exit = false;

						break;
					case 1:
						System.out.println("Acceptin 5 cricker into the collection");
						crick = Util.Populate();
						break;
					case 2:
						System.out.println("for Modyfying the rating enter the exact name");
						Cricketer c = crick.get(sc.next().toLowerCase());
						if(c==null) {
							throw new CricketerExc("Wrong name");
						
						}
						System.out.println(c);
						System.out.println("Enter ratring upto 10 to change");
						int rating = sc.nextInt();
						if (rating >= 0 && rating <= 10) {
							c.setRating(rating);
						} else {
							throw new CricketerExc("You have Entered wrong rating It should be between 0 to 10");
						}
						System.out.println("Rating is chaged");
						System.out.println(c);

						break;
					case 3:
						System.out.println("Serarch by name");
						System.out.println("for serarching enter the exact name");
						Cricketer p = crick.get(sc.next().toLowerCase());
						if(p!=null) {
						
						System.out.println(p);
						}
						else {
						throw new CricketerExc("Name not entered correctly some spelling mistake might be");	
						}
						break;
					case 4:
						System.out.println("Displaying all crickers in collection");
						if (crick.size() == 0) {
							throw new CricketerExc("No Cricketer has entered yet please press 1 case");
						} else {
							crick.forEach((String, Cricketer) -> System.out.println(Cricketer));
						}
						break;
					case 5:
						if (crick.size() == 0) {
							throw new CricketerExc("No Cricketer has entered yet please press 1 case");
						} else {
							System.out.println("Sorting by rating");
							crick.values().stream().sorted(Comparator.comparing(Cricketer::getRating).reversed())
									.forEach(m -> System.out.println(m));
						}
						break;

					default:
						System.out.println("Ivalid Input dear Try again");
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					sc.nextLine();
				}

			}

		} finally {
			System.out.println("Main Over");
		}
	}
}
