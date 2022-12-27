package FindNameWithMaxMarks;

import java.util.ArrayList;
import java.util.List;

public class StudentDetails {
	

	public static void main(String[] args) {
	
		
		Students s1 = new Students("Ram",1,85,"Bharat");
		Students s2 = new Students("Sita",2,89,"Bharat");
		Students s3 = new Students("Geeta",3,91,"Bharat");
		Students s4 = new Students("Krishna",4,100,"Bharat");
		
		//add student objects in array list
		List<Students> studentList = new ArrayList<Students>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		
		// without using to STring method in students class it will not print values 
		Students max = studentList.get(2);
		Students min = studentList.get(2);
		
		for(Students s:studentList)
		{
			if(s.getMarks()>90)
			{
			System.out.println(s.getName() + " : " + s.getMarks());
			}
		}
		// marks >90 + names via streams
		studentList.stream().filter(s->s.getMarks()>90).forEach(s->System.out.println(s.getName() + " : " + s.getMarks()));
		
		//highest mark + name via streams - 
		int hm = studentList.stream().map(s->s.getMarks()).max(Integer :: compare).get();
		studentList.stream().filter(s->s.getMarks()==hm).forEach(s->System.out.println(s));
		

	}

}
