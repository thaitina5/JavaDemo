import java.util.Objects;

public class ToString {
	private int day;
	private int month;
	private int year;
	
	public ToString(int d, int m, int y) {
		if(d>=1 && d<=31) {
			this.day = d;			
		} else {
			this.day = 1;
		}
		
		if(m>=1 && m<=12) {
			this.month = m;			
		} else {
			this.month = 1; 
		}
		
		if(y>=1) {
			this.year = y;			
		} else {
			this.year = 1;
		}
	}
	
	public int getDay() {
		return this.day;
	}
	public void setDay(int d) {
		this.day = d;
	}
	
	public int getMonth() {
		return this.month;
	}
	public void setMonth(int m) {
		this.month = m;
	}
	
	public int getYear() {
		return this.year;
	}
	public void setYear(int y) {
		this.year = y;
	}
	
	@Override
	public String toString() {
		return this.day+"/"+this.month+"/"+this.year;
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		ToString other = (ToString) obj;
		return this.day == other.day && this.month == other.month && this.year == other.year;
	}
	
	
}
