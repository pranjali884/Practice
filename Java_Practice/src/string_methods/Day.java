package string_methods;

public enum Day {
	Sunday(0),MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6);
	
	private int dayIndex;
	Day(int name){
		this.dayIndex=name;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Day.FRIDAY.getDayIndex());
		System.out.println(Day.TUESDAY);
	}
	public int getDayIndex() {
		return dayIndex;
	}
		

	}


