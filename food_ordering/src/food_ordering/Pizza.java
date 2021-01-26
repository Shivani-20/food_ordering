package food_ordering;

public class Pizza
{
	private String Toppings;
	private String Size;
	private int quantity;
    private String flavour;
    private double price;
    
	public Pizza(String toppings, String size, int quantity, String flavour) 
	{
		this.flavour=flavour;
		this.quantity=quantity;
		this.Toppings = toppings;
		this.Size = size;
	}
	public String getToppings() {
		return Toppings;
	}
	public String getSize() {
		return Size;
	}
	public void setToppings(String toppings) {
		Toppings = toppings;
	}
	public void setSize(String size) {
		Size = size;
	}
		
	public int getQuantity() {
		return quantity;
	}
	public String getFlavour() {
		return flavour;
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
	public double getPrice() 
	{
		return price;
	}
	@Override
	public String toString()
	{
		return "Pizza order : "+this.getFlavour()+" "+this.getQuantity()+" "+this.getToppings()+" "+this.getSize()+" "+this.getPrice();
		
	}
	public void calculatePizzaPrice() 
	{
		double total_price = 0;
		int count_no_of_toppings=0;
		double size_price=0;
		
	if(this.getToppings().contains("onions"))	
		++count_no_of_toppings;
	if(this.getToppings().contains("corns"))	
		++count_no_of_toppings;
	if(this.getToppings().contains("olives"))	
		++count_no_of_toppings;
	
	double topping_price=0.5*count_no_of_toppings;
	
	if(this.getSize().contains("small"))
		size_price=2;
	if(this.getSize().contains("medium"))
		size_price=4;
	if(this.getSize().contains("large"))
		size_price=6;
	
    if(this.getFlavour().contains("four season"))
    {
    total_price=this.getQuantity()*(2.5+topping_price+size_price);
    
    }
    if(getFlavour().contains("bbq chicken"))
    {
    total_price=this.getQuantity()*(1.5+topping_price+size_price);	
    }
    if(getFlavour().contains("margherita"))
    {
    total_price=this.getQuantity()*(2+topping_price+size_price);		
    }
    this.setPrice(total_price);	
	}
}
