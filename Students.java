package methodoverloading;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("ID is :"+id);
		
	}
public void getStudentInfo(int id, String name) {
	
	System.out.println("ID is: "+  "Name is:"+name);
		
	}
public void getStudentInfo(String email, int ph) {
	
	System.out.println("Email is:"+ "Phone number is:");
	
}

public static void main(String[] args) {
	Students stu=new Students();
	
	stu.getStudentInfo(13);
	stu.getStudentInfo(13, "Mugesh");
	stu.getStudentInfo("mugesh@gmail.com", 12345);
}
}
