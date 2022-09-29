package SeatService;

public class Seat {
    public static boolean choNgoi[]= {true,true,false};
	
	public static void choTrong() {
		SeatService ss = new SeatService();
		ss.findEmptyTable(choNgoi);
	}
	public static void hetCho() {
		SeatService ss = new SeatService();
		if(ss.isFull(choNgoi)==true) {
			System.out.println("Het cho roi. Cut qua quan khac");
		}
		else {
			System.out.println("Con cho. Moi quy khach vao");
		}
	}
}
