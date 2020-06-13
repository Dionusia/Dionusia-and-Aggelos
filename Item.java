package eshop;

public abstract class Item {
//εχω βαλει μια επιπλεον ιδιοτητα την category η οποια χρησιμευσε σε μεθοδους αλλων κλασεων πχ showCategories	
private String name;
private double price;
private String description;
private int stock;
private int id;
private String category;

public Item() {
	
}
public Item(String category,String name,double price,String description,int stock,int id) {
	this.category=category;
	this.name=name;
	this.price=price;
	this.description=description;
	this.stock=stock;
	this.id=id;
}
//setters
public void setName(String name) {this.name=name;}
public String getName() {return name;}
public void setPrice(double price) {this.price=price;}
public double getPrice() {return price;}
public void setDescription(String description) {this.description=description;}
public void setStock(int stock) {this.stock=stock;}
public int getStock() {return stock;}
public void setId(int id) {this.id=id;}
public String getCategory() {return category;}
public void setCategory(String category) {this.category = category;}

public String getBasicInfo() {
	String basicInfo="onoma:"+ name +" timi:"+price+" perigrafi:"+description+" Apothema:"+stock+" kodikos:"+id;
    return basicInfo;
    }
public abstract String getDetails();
public String toString() {
	return getBasicInfo()+getDetails();
}

}