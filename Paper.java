package eshop;

public class Paper extends Item {
    
	private int weight;
	private String category;
	public Paper(String category,String name, double price, String description, int stock, int id,int weight) {
		super(category,name, price, description, stock, id);
		this.weight=weight;
		
	}
    
	public void setWeight(int weight) {this.weight=weight;}
	
	
	public String getDetails() {
		String s="Baros "+weight;
		return s;
	}
}
