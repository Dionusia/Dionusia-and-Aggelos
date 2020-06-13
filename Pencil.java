package eshop;

public class Pencil extends Item{
    
	private double tipSize;
	private String type;
	private String category;
	
	public Pencil(String category,String name, double price, String description, int stock, int id,double tipSize,String type) {
		super(category,name, price, description, stock, id);
		this.tipSize=tipSize;
		this.type=type;
		
	}
    
	public void setTipSize(double tipSzie) {this.tipSize=tipSize;}
	public void setType(String type) {this.type=type;}
	
	
	public String getDetails() {
		String s="Typos "+type+"megethos mitis "+tipSize;
		return s;
		}
}
