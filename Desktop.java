package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("The desktop size is 27 inches");
	}

	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		desktop.computerModel();
		desktop.desktopSize();
	}

}
