package week1.day1.assignment;

public class Report {
	
	public static void main(String args[]) {
		
		Student s=new Student();
		
		s.studentName="Testleaf";
		s.rollNo=10;
		s.collegeName="Testleaf";
		s.markScored=75.5;
		s.cgpa=7.5;
		
		System.out.println("Student Name = "+ s.studentName + "\n"+ "Roll no :" +s.rollNo 
				+ "\n"+ "College Name :" + s.collegeName + "\n"+
				"Marks Scored : " + s.markScored + "\n" + "CGPA: " + s.cgpa);
		
		
	
	
	}

}
