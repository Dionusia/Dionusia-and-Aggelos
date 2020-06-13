package eshop;

public class Buyer extends User {

	
	private double bonus=0.0;
	private String buyerCategory;
    //καθε φορα πoυ δημιουργείται ένας buyer φτιάχνεται και μια κάρτα ώστε να καλώ τις κατάλληλες συναρτήσεις
	ShoppingCart sCart=new ShoppingCart();
	//constructors
	public Buyer() {
		
	}
	public Buyer(String name,String email,int bonus,String buyerCategory,ShoppingCart sCart) {
		super(name,email);
		this.bonus=bonus;
		this.buyerCategory=buyerCategory;
		this.sCart=sCart;
	}
	//methods
	public void awardBonus(double bonus) { this.bonus=bonus+(sCart.calculateNet()*0.1);}
	public double getBonus() {return bonus;}
	public void setBuyerCategory(int bonus) {if(bonus<=100) {buyerCategory="bronze";}
	                                         if(bonus>100 && bonus<=200) {buyerCategory="silver";}
	                                         else {buyerCategory="gold";}
	                                         }
	public String getBuyerCategory(){return buyerCategory;}
	public void placeOrder(Item item,int quantity) {sCart.addItemOrdered(item,quantity);}
	
	
		  
}
