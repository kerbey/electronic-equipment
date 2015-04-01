//subclass
public class cellPhone extends electronics
{
	public cellPhone()
	{
		super();
	}
	public String Phone()
	{
		System.out.println(" What kind of phone would you like?");
		System.out.println(" (iPhone, samsung, or smartphone)");
		String phone=input.nextLine();
		if (phone.contains("iPhone")||phone.contains("iphone"))
		{
			phone =iPhone();
			System.out.println("phone "+phone);
			setAttributes(phone);
			return getAttributes();
		}
		else if(phone.contains("samsung"))
		{
			phone=samsung();
			setAttributes(phone);
			return getAttributes();
		}
		else 
		{
			phone=smartphone();
			setAttributes(phone);
			return getAttributes();
		}
		
	}

	public String samsung()
	{
		System.out.println("how much will your phone weigh? (145 grams, 146 grams, or 147 grams)");
		setWeight(input.nextInt());
		if (getWeight()==145)
		{
			setCost(70);
			setBatteryLife(5);
			setManufacturer("Samsung electronics");
			setCreator("Lee Byung-chul");
		}
		else if (getWeight()==146)
		{
			setCost(60);
			setBatteryLife(6);
			setManufacturer("Samsung electronics.");
			setCreator("Lee Byung-chul");
		}
		else
		{
			setCost(90);
			setBatteryLife(7);
			setManufacturer("Samsung electronics.");
			setCreator("Lee Byung-chul");
		}
		String Attributes=" This samsung weighs about "+getWeight()+" lbs; Costs about $"+getCost()+" a month; \n"
		+ " battery life about "+getBatteryLife()+" hours; created by "+getCreator()+"; Manufacturers: "+getManufacturer();
		return Attributes;
	}

	public String smartphone()
	{
		System.out.println("how much will your phone weigh? (129 grams, 130 grams, or 131 grams)");
		setWeight(input.nextInt());
		if (getWeight()==129)
		{
			setCost(70);
			setBatteryLife(2);
			setManufacturer("Gartner & IDC.");
			setCreator("IBM and BellSouth");
		}
		else if (getWeight()==130)
		{
			setCost(60);
			setBatteryLife(3);
			setManufacturer("Gartner & IDC.");
			setCreator("IBM and BellSouth");
		}
		else
		{
			setCost(90);
			setBatteryLife(4);
			setManufacturer("Gartner & IDC.");
			setCreator("IBM and BellSouth");
		}
		String Attributes=" This smartphone weighs about "+getWeight()+" lbs; Costs about $"+getCost()+" a month; \n"
		+ " battery life about "+getBatteryLife()+" hours; created by "+getCreator()+"; Manufacturers: "+getManufacturer();
		return Attributes;
	}

	public String iPhone()
	{
		System.out.println("how much will your phone weigh? (7grams, 8 grams, or 9 grams)");
		setWeight(input.nextInt());
		if (getWeight()==7)
		{
			setCost(50);
			setBatteryLife(4);
			setManufacturer("Foxconn & Pegatron.");
			setCreator("Steve Jobs");
		}
		else if (getWeight()==8)
		{
			setCost(60);
			setBatteryLife(5);
			setManufacturer("Foxconn & Pegatron.");
			setCreator("Steve Jobs");
		}
		else
		{
			setCost(70);
			setBatteryLife(6);
			setManufacturer("Foxconn & Pegatron.");
			setCreator("Steve Jobs");
		}
		String Attributes=" This iPhone weighs about "+getWeight()+" grams; Costs about $"+getCost()+" a month; \n"
		+ " battery life about "+getBatteryLife()+" hours; created by "+getCreator()+"; Manufacturers: "+getManufacturer();
		return Attributes;
	}
}