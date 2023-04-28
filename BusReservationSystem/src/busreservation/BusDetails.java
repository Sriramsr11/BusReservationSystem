package busreservation;

public class BusDetails {
	private int busNo;
	private boolean ac;
	private int capacity; //set&get
	
	BusDetails(int no,boolean ac,int cap){
		this.busNo=no;
		this.ac=ac;
		this.capacity=cap;
	}
	public int getBusNo() {
		return busNo;
	}
	public int getCapacity() { //accessor method
		return capacity;
	}
	public void setCapacity(int cap) { //mutator
		capacity=cap;
	}
	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean val) {
		ac=val;
	}
	public void displayBusInfo(){
		System.out.println("BUS NO: "+busNo+" AC: "+ac+" TOTAL CAPACITY: "+capacity);
	}		
}

