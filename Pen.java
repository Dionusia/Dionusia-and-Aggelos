package eshop;

public class Pen extends Item{

private String color;
private double tipSize;
private String category;

public Pen(String category,String name, double price, String description, int stock, int id,String color,double tipSize) {
	super(category,name, price, description, stock, id);
	this.color=color;
	this.tipSize=tipSize;
	
	
    }
public void setColor(String color) {this.color=color;}
public void setTipSize(double tipSzie) {this.tipSize=tipSize;}


public String getDetails() {
	String s="Xrwma "+color+"megethos mitis "+tipSize;
	return s;
	}
}
