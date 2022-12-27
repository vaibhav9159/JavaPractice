package FindNameWithMaxMarks;

public class Students {

	private String name;
	private int rollNum;
	private int marks;
	private String country;
	
	Students(String name, int rollNum, int marks, String country)
	{
		this.name=name;
		this.rollNum=rollNum;
		this.marks=marks;
		this.country=country;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", rollNum=" + rollNum + ", marks=" + marks + ", country=" + country + "]";
	}

	public String getName() {
		return name;
	}


	public int getRollNum() {
		return rollNum;
	}

	

	public int getMarks() {
		return marks;
	}

	

	public String getCountry() {
		return country;
	}

	
	
}
