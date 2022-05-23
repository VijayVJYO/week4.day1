package week4.day1;

public class Lg implements AndroidDesign,MyLg {

	public void Volume() {
		System.out.println("volume");
		
	}

	public void Remote() {
		System.out.println("remote");
		
	}

	public void Channels() {
		System.out.println("channels");
	
		
	}
	public void Off() {
		System.out.println("off");
	}

	public void Screencast() {
		System.out.println("screencast");
		// TODO Auto-generated method stub
		
	}
public static void main(String[] args) {
	Lg obj=new Lg();
	obj.Channels();
	obj.Remote();
	obj.Off();
	obj.Screencast();
	AndroidDesign design =new Lg();
	design.Channels();
}
}
