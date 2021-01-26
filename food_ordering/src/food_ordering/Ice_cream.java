package food_ordering;

public class Ice_cream
{
	private int numOfScoop;
    private int quantity;
    private String flavour;
    private double price;
    
	public Ice_cream(int numOfScoop,int quantity, String flavour) 
	{
        this.flavour=flavour;
		this.numOfScoop = numOfScoop;
		this.quantity=quantity;
	}
	
	public int getNumOfScoop() {
		return numOfScoop;
	}
	public int getQuantity() {
		return quantity;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setNumOfScoop(int numOfScoop) {
		this.numOfScoop = numOfScoop;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	
	

	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}

	@Override
	public String toString()
	{
		return "Ice-cream order : "+this.getFlavour()+" "+this.getQuantity()+" "+this.getNumOfScoop()+" "+this.getPrice();
		
	}
	
	public void calculateIceCreamPrice() 
	{
		double scoop_price=0.5*this.numOfScoop;
		double total_price = 0;
	    if(this.getFlavour().contains("strawberry"))
	    {
	    total_price=this.getQuantity()*(1.5+scoop_price);	
	    }
	    if(this.getFlavour().contains("vanilla"))
	    {
	    total_price=this.getQuantity()*(0.75+scoop_price);	
	    }
	    if(this.getFlavour().contains("pistachio"))
	    {
	    total_price=this.getQuantity()*(2+scoop_price);		
	    }
		this.setPrice(total_price);
	}


}
