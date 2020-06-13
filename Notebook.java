package eshop;

public class Notebook extends Item{
    
	private int sections;
	private String category;
	
	public Notebook(String category,String name, double price, String description, int stock, int id,int sections) {
		super(category,name, price, description, stock, id);
		this.sections=sections;
		
	}
    
	public void setSections(int sections) {this.sections=sections;}
	
	
	public String getDetails() {
		String s="Arithmos thematwn "+sections;
		return s;
		}


}
