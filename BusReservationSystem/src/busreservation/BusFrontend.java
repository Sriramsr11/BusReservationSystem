package busreservation;
import java.util.*;

public class BusFrontend {
	public static void main(String[]args) {
		
		ArrayList<BusDetails>buses=new ArrayList<BusDetails>();
		ArrayList<Booking>book=new ArrayList<Booking>();
		
		buses.add(new BusDetails(1,true,2));
		buses.add(new BusDetails(3,false,30));
		buses.add(new BusDetails(3,true,35));		
		
		int userin=1;
		Scanner sc=new Scanner(System.in);
		
		for(BusDetails b:buses) {
			b.displayBusInfo();
		}
		
		while(userin==1) {
			System.out.println("Enter 1 to Book or 2 to Exit ");
			userin=sc.nextInt();
			if(userin==1) {
				Booking booking=new Booking();
				if(booking.isAvailable(book,buses)) {
					book.add(booking);
					System.out.println("Your booking is confirmed");
				}else {
					System.out.println("Sorry.Bus is full. Plz Try another bus or date! ");
				}
			}else {
				System.out.println("Ended...");
			}
		}sc.close();
	}
}
