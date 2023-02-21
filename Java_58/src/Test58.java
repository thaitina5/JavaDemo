import java.util.concurrent.TimeUnit;
import java.util.Calendar;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Test58 {

	public static void main(String[] args) {
		// currentTimeMillis
	    long t1 = System.currentTimeMillis();
	    for (int i=0; i<10; i++){
	      System.out.println("TEST");
	    } 
	    long t2 = System.currentTimeMillis();
	    System.out.println("Truoc khi chay for: "+ t1 + " ms");
	    System.out.println("Sau khi chay for: "+ t2 + " ms");
	    System.out.println("Thoi gian: "+ (t2-t1)+" ms");
	    System.out.println("Thoi gian: "+ (t2-t1)/1000+" s");
	    
	    // TimeUnit
	    System.out.println("Ngay sang Giay: "+TimeUnit.DAYS.toSeconds(1)+" s");
	  
	    // Date
	    Date d = new Date(System.currentTimeMillis());
	      //month+1 vì tính từ tháng 0
	    System.out.println(d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900));
	  
	    // Calendar
	    Calendar c = Calendar.getInstance();
	    System.out.println(c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
	      //thêm thời gian để roll tới thời điểm khác
	    c.add(Calendar.HOUR, 30);
	    System.out.println(c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
	    
	    // DateFormat
	    Date e = new Date(System.currentTimeMillis());
	    DateFormat df = new SimpleDateFormat();
	    System.out.println(df.format(e));
	    df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	    System.out.println(df.format(e));
	    
	      // tham khảo thêm định dang DateFormat 
	      // openplanning.net/10245/java-date-time#a25035 
	}

}
