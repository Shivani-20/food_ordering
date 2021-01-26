package food_ordering;
import java.io.*;

import java.util.ArrayList;
import java.util.Iterator;
public class Order 
{
	public static void main(String args[]) throws IOException
	{
    int choice;int u=0;
    ArrayList<Integer> removal_ids=new ArrayList<>();
	ArrayList<String> items=new ArrayList<>();
	ArrayList<String> allOrders=new ArrayList<>();
	ArrayList<Double> total=new ArrayList<>();
	ArrayList<Integer> order_num=new ArrayList<>();
	Integer id=0;
    BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
    
    while(u==0)
    {
    	System.out.println("Press 1 to insert a new order");
    	System.out.println("Press 2 to list all the orders");
    	System.out.println("Press 3 to delete an order");
    	System.out.println("Press 0 to exit");
    	System.out.println("Please enter your choice");
    	choice=Integer.parseInt(reader.readLine());
    	
    switch(choice)
    {
    case 0:
    	u=1;
    	break;
    
    case 1:
    	int ch;int w=1;int si=0;Double tp=0.0;
    	while(w==1)
    	{
    	System.out.println("Please enter 1 for pizza and 2 for ice-cream:");
    	ch=Integer.parseInt(reader.readLine());
    	if(ch==1)
    	{
    		System.out.println("Please enter the pizza flavour:");
    		String a=reader.readLine();
    		System.out.println("Please enter the quantity:");
    		int b=Integer.parseInt(reader.readLine());
    		System.out.println("Please enter the toppings corns and /or olives and/or onions:");
    		String c=reader.readLine();
    		System.out.println("Please enter the size small,medium or large:");
    		String d=reader.readLine();
    		Pizza obj=new Pizza(c,d,b,a);
    		obj.setFlavour(a);
    		obj.setQuantity(b);
    		obj.setSize(d);
    		obj.setToppings(c);
    		obj.calculatePizzaPrice();
    		tp=tp+obj.getPrice();
    		items.add(si,obj.toString());	
    		++si;
    	}
    	else
    	{
    		System.out.println("Please enter the ice-cream flavour:");
    		String a=reader.readLine();
    		System.out.println("Please enter the quantity:");
    		int b=Integer.parseInt(reader.readLine());
    		System.out.println("Please enter the number of scoops you want:");
    		int c1=Integer.parseInt(reader.readLine());
    		Ice_cream obj = new Ice_cream(c1,b,a);
    		obj.setFlavour(a);
    		obj.setNumOfScoop(c1);
    		obj.setQuantity(b);
    		obj.calculateIceCreamPrice();
    		tp=tp+obj.getPrice();
    		items.add(si,obj.toString());
    		++si;
    	}
    	System.out.println("Want more, Press 1 else press 0:");
    	int chh=Integer.parseInt(reader.readLine());
    	w=chh;
    	System.out.println();
    	}
    	
        String item_list="";
    	for(String s:items)
    	{
    		item_list=item_list+s+"\n";
    	}
    	allOrders.add(item_list);
    	
    	++id;
    	order_num.add(id);
    	total.add(tp);
    	System.out.println("=======================================");
    	System.out.println("Your order id is : "+id);
    	Iterator<String> dIterator = items.iterator();
    
    	while(dIterator.hasNext())
    	{
    		System.out.println(dIterator.next());
    		System.out.println("-----------");
    	}
    	
    	items.clear();
    	
    	System.out.println("Total order price : "+tp);
    	System.out.println("=======================================");
    	System.out.println();
    	break;
    	
    case 2:
    	
    	Iterator<Double> bIterator = total.iterator();
    	Iterator<Integer> cIterator = order_num.iterator();
    	while (bIterator.hasNext() && cIterator.hasNext()) 
    	{
    		int i=cIterator.next();
    		if(removal_ids.contains(i))
    			continue;
    		System.out.println("=======================================");
    		System.out.print("##"+i);
    		System.out.println();
    		System.out.print(allOrders.get(i-1));
    		System.out.println("total price : "+bIterator.next());
    		System.out.println("=======================================");
    	    System.out.println();
    	}
    	System.out.println();
    	break;
    	
    case 3:
    	System.out.println("enter order id");
    	int j=Integer.parseInt(reader.readLine());
    	removal_ids.add(j);
    	System.out.println("Sorry we could not serve you!!");
    	System.out.println();
    	break;
    }
    }
	}
}
