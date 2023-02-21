package test;

public class ThoiKhoaBieu {
	  private Day thu;
	  private String cacMonHoc;
	  
	  public ThoiKhoaBieu(Day thu, String cacMonHoc){
	    this.thu = thu;
	    this.cacMonHoc = cacMonHoc;
	  }
	  
	  public Day getThu(){
	    return this.thu;
	  }
	  public void setThu(Day thu){
	    this.thu = thu;
	  }
	  public String getMonHoc(){
	    return this.cacMonHoc;
	  }
	  public void setMonHoc(String cacMonHoc){
	    this.cacMonHoc = cacMonHoc;
	  }
	  
	  @Override
	  public String toString(){
	    return "Thu "+thu+": "+cacMonHoc;
	  }
}
