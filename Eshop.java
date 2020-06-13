package eshop;

import java.util.ArrayList;
import java.util.Iterator;



public class Eshop {

	private String name;
	private Owner owner;
	
	
	//��� ����� ��� �� items ��� eshop ��� ��� ��� ���� buyers
	ArrayList<Item> itemsList=new ArrayList<Item>();
	ArrayList<Buyer> buyersList=new ArrayList<Buyer>();
    //constructor
	public Eshop(String name,Owner owner) {
		this.name=name;
		this.owner=owner;
		
	}
	
	
	//addItem()
	public void addItem(Item item)   {
	        if(itemsList.contains(item)) {
	        	System.out.println("�� ����������� ��� �������");
	        }else itemsList.add(item);
		
		}
	//getItem
	public Item getItemByld(int position) {
		return itemsList.get(position);
	 }
	//removeItem
	public void removeItem(Item item) {
		itemsList.remove(item);
	 }
	

	//addBuyer	
	public void addBuyer(Buyer buyer)   {
		 if(buyersList.contains(buyer)) {
	        	System.out.println("O ������� ��� �������");
	        }else buyersList.add(buyer);
		
		
	}
	//method create new buyer
	//��������������� ���� ��������������� ��������� ���� ��������� ��� to email ��� ��� ������ ��� buyersList ���� ���� owner
			public void createNewBuyer(String name,String email,ShoppingCart scart) {
				Buyer newBuyer=new Buyer( name,email,0,"bronze",scart);
				buyersList.add(newBuyer);
			}
	//remove buyer
   public void removeBuyer(Buyer buyer) {
	   buyersList.remove(buyer);
   }
   
 
   
   //updateItemsStock
   public void updateItemStock(int i,Item item) {
	   item.setStock(i+item.getStock());
   }
   //showCategories()
   //4 counter ��� ������� �� stock ��� 4 ����������
   //��������� ��� itemsList ��� �� ��� ������ ������ �� ���� notebook ���������� �� counter
   //�� ���������� �� ���������� �� �������� ������� ��� ���� ���������
   public void showCategories() {
	   int counter1=0,counter2=0,counter3=0,counter4=0;
	   for(int i=0;i<itemsList.size();i++) {
		   if(itemsList.get(i).getCategory().equals("notebook"))counter1=counter1+itemsList.get(i).getStock();
		   else if(itemsList.get(i).getCategory().equals("paper"))counter2=counter2+itemsList.get(i).getStock();
		   else if(itemsList.get(i).getCategory().equals("pencil"))counter3=counter3+itemsList.get(i).getStock();
		   else if(itemsList.get(i).getCategory().equals("pen"))counter4=counter4+itemsList.get(i).getStock();
	   }
	   System.out.println("�� ���������� ����� :");
	   System.out.println("1)notebook"+" �� �������:"+ counter1);
	   System.out.println("2)paper"+" �� �������:"+ counter2);
	   System.out.println("3)pencil"+" �� �������:"+ counter3);
	   System.out.println("4)pen"+" �� �������:"+ counter4);
	   }
   //showproducts in category
   public void showProductsinCategory(String category) {
	   System.out.println("�� �������� ��� ���������� "+category+" �����:");
	   for(int i=0;i<itemsList.size();i++) {
		String s=itemsList.get(i).getCategory();
		 if(category.equals(s)) {
			System.out.println(i+")"+itemsList.get(i).toString() );
		 }
	 }
	 }
	//showproduct
   public void  showProduct(Item item){
	   System.out.println("�� ��������� ����������� ��� �� ������ �����: ");
	   System.out.println(item.toString());
   }
	//checkStutus
   public void checkStatus() {
	   System.out.println("�� ������� �����: ");
	   for(int i=0;i<buyersList.size();i++) {
		   Buyer b=buyersList.get(i);
		   System.out.println(i+")"+"�����:"+ b.getName()+" points: "+b.getBonus()+" category: "+b.getBuyerCategory());
	   }
   }
  
   
   //getter setter
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public Owner getOwner() {return owner;}
	public void setOwner(Owner owner) {this.owner = owner;}
	
	

	
}