package DateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.text.DateFormatter;

public class DateTimeOne {

	public static void main(String[] args) {

		
		System.out.println(System.currentTimeMillis());
		
		Date d = new Date();
		
		System.out.println(d);
		System.out.println(d.getTime());
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime() + " month = " + c.get(Calendar.MONTH));
		
		GregorianCalendar g = new GregorianCalendar();
		System.out.println(g.isLeapYear(1991));
		
		LocalDateTime l =  LocalDateTime.now();
		System.out.println(l);
		
		DateTimeFormatter dt =  DateTimeFormatter.ofPattern("dd-MM-yyyy  a");
		System.out.println(dt.format(l));
		
		

	}

}
