
public class digitalCameras extends electronics
{//subclass
	public digitalCameras()
	{
		super();
	}
	
	public String Cameras()
	{
		System.out.println(" What kind of Camera would you like?");
		System.out.println(" (Canon, Sony, or Samsung)");
		String Cameras=input.nextLine();
		if (Cameras.contains("Canon"))
		{
			Cameras =Canon();
			System.out.println("digitalCameras "+Cameras);
			setAttributes(Cameras);
			return getAttributes();
		}
		else if(Cameras.contains("Sony"))
		{
			Cameras=Sony();
			setAttributes(Cameras);
			return getAttributes();
		}
		else 
		{
			Cameras=Samsung();
			setAttributes(Cameras);
			return getAttributes();
		}
	}

	public String Canon()
	{
		System.out.println("how much will your phone weigh? (1 kilogram, 2 kilograms, or 3 kilograms)");
		setWeight(input.nextInt());
		if (getWeight()==1)
		{
			setCost(69);
			setBatteryLife(2);
			setManufacturer("Canon USA INC.");
			setCreator("Fujio Mitarai");
		}
		else if (getWeight()==2)
		{
			setCost(70);
			setBatteryLife(3);
			setManufacturer("Canon USA INC.");
			setCreator("Fujio Mitarai");
		}
		else
		{
			setCost(71);
			setBatteryLife(4);
			setManufacturer("Canon USA INC.");
			setCreator("Fujio Mitarai");
		}
		String Attributes=" This samsung weighs about "+getWeight()+" kilogram(s); Costs about $"+getCost()+" a month; \n"
		+ " battery life about "+getBatteryLife()+" hours; created by "+getCreator()+"; Manufacturers: "+getManufacturer();
		return Attributes;
	}

	public String Sony()
	{
		System.out.println("how much will your computer weigh? ( 4 kilograms, 5 kilograms, or 6 kilograms)");
		setWeight(input.nextInt());
		if (getWeight()==4)
		{
			setCost(57);
			setBatteryLife(3);
			setManufacturer("Sony Corporation.");
			setCreator("Akio Morita");
		}
		else if (getWeight()==5)
		{
			setCost(58);
			setBatteryLife(4);
			setManufacturer("Sony Corporation.");
			setCreator("Akio Morita");
		}
		else
		{
			setCost(59);
			setBatteryLife(5);
			setManufacturer("Sony Coporation.");
			setCreator("Akio Morita");
		}
		String Attributes=" This smartphone weighs about "+getWeight()+" kilogram(s); Costs about $"+getCost()+" a month; \n"
		+ " battery life about "+getBatteryLife()+" hours; created by "+getCreator()+"; Manufacturers: "+getManufacturer();
		return Attributes;
	}

	public String Samsung()
	{
		System.out.println("how much will your computer weigh? (1 kilograms, 2 kilograms, or 3 kilograms)");
		setWeight(input.nextInt());
		if (getWeight()==1)
		{
			setCost(79);
			setBatteryLife(6);
			setManufacturer("Samsung Techwin.");
			setCreator("Cheol Kyo Kim");
		}
		else if (getWeight()==2)
		{
			setCost(80);
			setBatteryLife(7);
			setManufacturer("Samsung Techwin.");
			setCreator("Cheol Kyo Kim");
		}
		else
		{
			setCost(81);
			setBatteryLife(8);
			setManufacturer("Samsung Techwin.");
			setCreator("Cheol Kyo Kim");
		}
		String Attributes=" This iPhone weighs about "+getWeight()+" kilogram(s); Costs about $"+getCost()+" a month; \n"
		+ " battery life about "+getBatteryLife()+" hours; created by "+getCreator()+"; Manufacturers: "+getManufacturer();
		return Attributes;
	}
}