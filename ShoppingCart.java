package eshop;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart  {
	//οι δυο buyers που εφτιαξα στη main εχουν καρτα με υπολοιπο 1000 μετα απο καθε ολοκληρωση παραγγελειας εμφανιζει το υπολοιπο της καρτας
	private double ipoloipo;
	
	//constructor
	public ShoppingCart() {
		
	}
	public ShoppingCart(double ipoloipo) {
		this.ipoloipo=ipoloipo;
	}
	//orderList
	ArrayList<ItemOrdered> orderList=new ArrayList<ItemOrdered>();
   //addItemOrdered
	public void addItemOrdered(Item item,int quantity) {
		
		if(item.getStock()<quantity){
			System.out.println("δεν υπαρχει η διαθεσιμη ποσοτητα στο stock");
		}else {
			ItemOrdered itemordered=new ItemOrdered(item,quantity);
			orderList.add(itemordered);
			int s=item.getStock()-quantity;
			item.setStock(s);
			for(int i=0;i<orderList.size();i++) {
				if(orderList.get(i).equals(itemordered)) {
					int q=orderList.get(i).getQuantity()+itemordered.getQuantity();
					orderList.get(i).setQuantity(q);
				}
			}
			
		}
	}

  //removeItemOrdered
	public void removeItemOrdered(ItemOrdered itemordered) {
		orderList.remove(itemordered);
		int s=itemordered.getItem().getStock()+itemordered.getQuantity();
		itemordered.getItem().setStock(s);
	}
//changeItemOrderedQuantity
	public void changeItemOrderedQuantity(ItemOrdered itemordered,int i) {
		if(i>itemordered.getItem().getStock()) {
			System.out.println("Δεν υπαρχει το διαθεσιμο stock");
			}
		else {
			itemordered.setQuantity(i+itemordered.getQuantity());
			int l=itemordered.getItem().getStock();
			itemordered.getItem().setStock(l-i);
		}
	}
//showCart
	public void showCart(Buyer buyer) {
		double synolo=0.0;
		System.out.println("Τα προιοντα με τις ποσοτητες και τις τιμες τους ειναι: ");
		for(int i=0;i<orderList.size();i++) {
			System.out.println( i+")"+orderList.get(i).getItem().getName()+" "+orderList.get(i).getQuantity()+" "+(orderList.get(i).getQuantity()*orderList.get(i).getItem().getPrice()));
		   
		}
		System.out.println("Το συνολο ειναι: "+calculateNet());
		System.out.println("Τα μεταφορικα ειναι: "+calcluateCourierCost(buyer));
	}
//clearCart
	public void clearCart() {
		for(int i=0;i<orderList.size();i++) {
			removeItemOrdered(orderList.get(i));
		}
	}
//checkout
	public void checkout(Buyer buyer,ShoppingCart scart) {
		showCart(buyer);
		System.out.println("Ολοκληρωση αγορας?Πατηστε 1 για ναι κ 0 για οχι");
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		if(k==1) {
			scart.setIpoloipo(scart.getIpoloipo()-scart.calcluateCourierCost(buyer)-scart.calculateNet());
			System.out.println("Το υπολοιπο της καρτας σας ειναι:"+scart.getIpoloipo());
			int bonus=(int)(calculateNet()*0.1);
			buyer.awardBonus(bonus);
			buyer.setBuyerCategory(bonus);
			orderList.clear();
			
		}
	}
//calcluateCourierCost
	public double calcluateCourierCost(Buyer buyer) {
         double totalCourierCost=3+(calculateNet()*0.2) ;
		if(buyer.getBuyerCategory().equals("gold"))
		  return 0.0;
		if(buyer.getBuyerCategory().equals("silver"))
		  return (totalCourierCost)/2;
		else 
		  return totalCourierCost;
	}
//calculateNet
	public double calculateNet() {
		double totalCost=0.0;
		for(int i=0;i<orderList.size();i++) {
		    totalCost=totalCost+(orderList.get(i).getQuantity()*orderList.get(i).getItem().getPrice());
		 }
		return totalCost;
	}
//getter k setter gia ipoloipo
	public double getIpoloipo() {return ipoloipo;}
	public void setIpoloipo(double ipoloipo) {this.ipoloipo = ipoloipo;}



	}
