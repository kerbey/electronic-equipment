import java.util.Scanner;
public class Main
{
	public static void main(String[]args)
	{//sub classes are the different types of phones and 
//super class is called electronics that contain creator, manufacturer, weight, cost, and batteryLife;
//each class gives the user the option of what type of phone to choose from
		Scanner input= new Scanner(System.in);
		System.out.println("Would you like to purchase a camera?");
		String device= input.nextLine();
		if (device.contains("yes"))
		{
			cellPhone phone = new cellPhone();
			phone.Phone();
			System.out.println(phone.getAttributes());
		}
		System.out.println();
		System.out.println("Would you like to purchase a computer?");
		 if (device.contains("yes"))
		{
			computer Computer = new computer();
			Computer.Computer();
			System.out.println(Computer.getAttributes());
		}
		 System.out.println();
		System.out.println("Would you like to purchase a digital Camera?");
		 if (device.contains("yes"))
		{
			digitalCameras camera = new digitalCameras();
			camera.Cameras();
			System.out.println(camera.getAttributes());
		}
	}
}