package interfaceandabstractclass;

public class Automation extends MultipleLangauge implements Language,TestTool{
	
	public void ruby() {
		System.out.println("Extending Abstract Method: Ruby");
		
	}
	public void Selenium() {
		System.out.println("Implementing Interface Method: Selenium");
		
	}
	public void Java() {
		System.out.println("Implementing Interface Method: Java");
		
	}
	public static void main(String[] args) {
		
		Automation auto=new Automation();
		auto.ruby();
		auto.Selenium();
		auto.Java();
	}
	

	

}
