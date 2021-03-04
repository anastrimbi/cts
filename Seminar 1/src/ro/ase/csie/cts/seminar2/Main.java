package ro.ase.csie.cts.seminar2;

public class Main {

	public static void main(String[] args) {
		CalendarUtil cu= new CalendarUtil();
		System.out.println(cu.weekDay(3));
		
		CalendarUtil cu2 = new CalendarUtil();
		System.out.println(cu.weekDay2(3));
	}

}
