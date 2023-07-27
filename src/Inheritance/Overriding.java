package Inheritance;

class TV
{
	public void switchON() {System.out.println("TV is Switch ON");}
	
	public void changeChannel() {System.out.println("TV channel is Changed");}
}

class SmartTV extends TV
{
	public void switchON() {System.out.println("SmartTV is Switch ON");}
	
	public void changeChannel() {System.out.println("SmartTV channel is Changed");}
	
	public void browse() {System.out.println("Smart Tv is Browsing");}
}

public class Overriding {
	
	
	public static void main(String[] args)
	{
		TV t = new TV();
		t.switchON();
		t.changeChannel();
		
		
		SmartTV st = new SmartTV();
		st.switchON();
		st.changeChannel();
		st.browse();
		
		//Only rhink it as a normal tv and can't browse in the tv
		TV 	tv = new SmartTV();
		tv.switchON();
		tv.changeChannel();
		
	}

}
