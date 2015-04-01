
public class computer extends electronics
{//subclass
	public computer()
	{
		super();
	}
	
	public String Computer()
	{
		System.out.println(" What kind of computer would you like?");
		System.out.println(" (windows, apple, or dell)");
		String computer=input.nextLine();
		if (computer.contains("windows"))
		{
			computer =windows();
			System.out.println("computer "+computer);
			setAttributes(computer);
			return getAttributes();
		}
		else if(computer.contains("apple"))
		{
			computer=apple();
			setAttributes(computer);
			return getAttributes();
		}
		else 
		{
			computer=dell();
			setAttributes(computer);
			return getAttributes();
		}
		
	}

	public String dell()
	{
		System.out.println("how much will your phone weigh? (6 pounds, 7 pounds, or 8 pounds)");
		setWeight(input.nextInt());
		if (getWeight()==6)
		{
			setCost(499);
			setBatteryLife(9);
			setManufacturer("Dell Computer Company.");
			setCreator("Michael S. Dell");
		}
		else if (getWeight()==7)
		{
			setCost(500);
			setBatteryLife(10);
			setManufacturer("Dell Computer Company.");
			setCreator("Michael S. Dell");
		}
		else
		{
			setCost(501);
			setBatteryLife(20);
			setManufacturer("Dell Computer Company.");
			setCreator("Michael S. Dell");
		}
		String Attributes=" This samsung weighs about "+getWeight()+" lbs; Costs about $"+getCost()+" a month; \n"
		+ " battery life about "+getBatteryLife()+" hours; created by "+getCreator()+"; Manufacturers: "+getManufacturer();
		return Attributes;
	}

	public String apple()
	{
		System.out.println("how much will your computer weigh? (4 pounds, 5 pounds, or 6 pounds)");
		setWeight(input.nextInt());
		if (getWeight()==4)
		{
			setCost(199);
			setBatteryLife(6);
			setManufacturer("Foxconn & Pegatron.");
			setCreator("Steve Wozniak");
		}
		else if (getWeight()==5)
		{
			setCost(200);
			setBatteryLife(7);
			setManufacturer("Foxconn & Pegatron.");
			setCreator("Steve Wozniak");
		}
		else
		{
			setCost(201);
			setBatteryLife(8);
			setManufacturer("Foxconn & Pegatron.");
			setCreator("Steve Wozniak");
		}
		String Attributes=" This smartphone weighs about "+getWeight()+" lbs; Costs about $"+getCost()+" a month; \n"
		+ " battery life about "+getBatteryLife()+" hours; created by "+getCreator()+"; Manufacturers: "+getManufacturer();
		return Attributes;
	}

	public String windows()
	{
		System.out.println("how much will your computer weigh? (4 pounds, 5 pounds, or 6 pounds)");
		setWeight(input.nextInt());
		if (getWeight()==4)
		{
			setCost(39);
			setBatteryLife(7);
			setManufacturer("Window PC.");
			setCreator("Bill Gates");
		}
		else if (getWeight()==5)
		{
			setCost(40);
			setBatteryLife(2);
			setManufacturer("Window PC.");
			setCreator("Bill Gates");
		}
		else
		{
			setCost(42);
			setBatteryLife(5);
			setManufacturer("Window PC.");
			setCreator("Bill Gates");
		}
		String Attributes=" This iPhone weighs about "+getWeight()+" lbs; Costs about $"+getCost()+" a month; \n"
		+ " battery life about "+getBatteryLife()+" hours; created by "+getCreator()+"; Manufacturers: "+getManufacturer();
		return Attributes;
	}

}
