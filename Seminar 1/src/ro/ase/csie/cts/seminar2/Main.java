package ro.ase.csie.cts.seminar2;

public class Main {

	public static void main(String[] args) {
		// instance of calendar util
		CalendarUtil cu= new CalendarUtil();
		
		
		// exception
		try {
			System.out.println(cu.weekDay(10));
			// else if
			System.out.println(cu.weekDay(3));
			// switch
			System.out.println(cu.weekDay2(3));
			// vector
			System.out.println(cu.weekDay3(3));
			// validation working?
			System.out.println(cu.weekDay3(10));
			// with pre-existing java class
			System.out.println("DateFormatSymbols says" + cu.weekDay4(10));
			System.out.println("DateFormatSymbols says" + cu.weekDay4(5));
		} catch (IncorrectDayException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
