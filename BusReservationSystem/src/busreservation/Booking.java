package busreservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
	String passengerName;
	int busNo;
	Date date;
	
	Booking(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name of the passenger: ");
		passengerName=sc.next();
		System.out.println("Enter Bus no: ");
		busNo=sc.nextInt();
		System.out.println("Enter Date(dd-mm-yyyy): ");
		String dateInput=sc.next();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			date=dateFormat.parse(dateInput);
		} catch (ParseException e) {
			e.printStackTrace();
		}		
	}
	
	public boolean isAvailable(ArrayList<Booking>book,ArrayList<BusDetails>buses) {
		int capacity=0;
		for(BusDetails bus:buses) {
			if(bus.getBusNo()==busNo) {
				capacity=bus.getCapacity();
			}
		}
		int booked=0;
		for(Booking b:book) {
			if(b.busNo==busNo&&b.date.equals(date)) {
				booked++;
			}
		}
		return booked<capacity?true:false;		
	}
}

