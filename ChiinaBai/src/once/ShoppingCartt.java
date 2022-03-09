package once;

import java.util.ArrayList;

class Product
{
	private int id;
	private String name;
	private int quantity;
	private float price;
	public Product(int id, String name, int quantity, float price)
	{
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
class ShoppingCart
{
	ArrayList<Product> productList=new ArrayList<Product>();
	public int totalItem()
	{
		int sum=0;
		for(Product i:productList)
		{
			sum+=i.getQuantity();
		}
		return sum;
	}
	public float netPrice()
	{
		float sum=0;
		for(Product i:productList)
		{
			sum+=i.getQuantity()*i.getPrice();
		}
		return sum;
	}


}
public class ShoppingCartt {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ShoppingCart sc=new ShoppingCart();
		sc.totalItem();
		sc.netPrice();

	}

}
