package ConstructorConcept;

public class BrowserLaunch {

	public void launchBrowser() {//calling the functions internally
		 CheckingOS();
		 CheckCompatability();
		 CheckRAMspace();
		 brlaunched();
		System.out.println("checking the browser to be launched");
	}
	private void CheckingOS() {
		System.out.println("checking the OS version");
	}
	private void CheckCompatability() {
		System.out.println("compatability checking");
	}
	private void CheckRAMspace() {
System.out.println("checking Ram Space");
	}
private void  brlaunched() {
			System.out.println("browser launched successfully");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
