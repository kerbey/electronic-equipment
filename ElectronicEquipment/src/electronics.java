import java.util.Scanner;
 public class electronics
{//superclass
	Scanner input= new Scanner(System.in);
	private String attributes, creator, manufacturer;private int weight, cost, batteryLife;
	public void attributes(String attributes)
	{
		this.setAttributes(attributes);
	}
	
	public String getAttributes()
	{
		return attributes;
	}
	public void setAttributes(String attributes)
	{
		this.attributes = attributes;
	}
	
	public int getWeight()
	{
		return weight;
	}

	public void setWeight(int weight)
	{
		this.weight = weight;
	}

	public String getCreator()
	{
		return creator;
	}

	public void setCreator(String creator)
	{
		this.creator = creator;
	}
	public String getManufacturer()
	{
		return manufacturer;
	}

	public void setManufacturer(String manufacturer)
	{
		this.manufacturer = manufacturer;
	}

	public int getBatteryLife()
	{
		return batteryLife;
	}

	public void setBatteryLife(int batteryLife)
	{
		this.batteryLife = batteryLife;
	}

	public int getCost()
	{
		return cost;
	}

	public void setCost(int cost)
	{
		this.cost = cost;
	}
	
}