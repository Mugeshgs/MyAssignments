package org.system;

public class Desktop extends Computer{
	
	public void desktopSize() {
		System.out.println("Size is 16inch");
	}

	public static void main(String[] args) {
		Desktop desktop=new Desktop();
		desktop.desktopSize();
		desktop.computerModel();
	}
}
