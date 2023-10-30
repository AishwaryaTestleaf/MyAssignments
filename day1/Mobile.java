package week1.day1;

public class Mobile {
	
public void makeCall() {
	String mobileModel = "Lenovo";
	Float mobileWeight = 1.5f;
	System.out.println(mobileModel);
	System.out.println(mobileWeight);
}

public void sendMsg() {
	boolean isFullCharged = true;
	int mobileCost = 1000;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mobile mobobj = new Mobile();
mobobj.makeCall();
mobobj.sendMsg();
System.out.println("This is my Mobile");
	}

}
