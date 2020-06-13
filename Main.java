package eshop;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
	Owner Psiris=new Owner("Aggelos","aggelospsiris3@gmail.com",true);
    Eshop myEshop=new Eshop("PsEshop", Psiris);
    //prwtos agorasths
	ShoppingCart dionScart=new ShoppingCart(1000.1);
    Buyer buyer1=new Buyer("buyer1","dionusiapsiri13@gmail.com",0,"bronze",dionScart);
    //deuteros agorasths
    ShoppingCart gianScart=new ShoppingCart(1000.2);
    Buyer buyer2=new Buyer("buyer2","giannispsiri13@gmail.com",0,"bronze",gianScart);
	//Ta proionta tou katastimatos
	Notebook notebook1=new Notebook("notebook","plaisio",1.0,"skliro exwfilo",50,1,1);
	Notebook notebook2=new Notebook("notebook","public",2.0,"malako exwfilo",50,2,2);
	Notebook notebook3=new Notebook("notebook","Scag",3.5,"anakiklosimo",50,3,3);
	Paper paper1=new Paper("paper","plasio",0.1,"A4",50,4,1);
	Paper paper2=new Paper("paper","public",0.2,"A5",50,5,1);
	Paper paper3=new Paper("paper","Scag",0.3,"A3",50,6,1);
	Pen pen1=new Pen("pen","plaisio",2.0,"Stilo p sbinei",50,7,"mple",0.1);
	Pen pen2=new Pen("pen","public",3.0,"kanoniko",50,8,"kokkino",0.2);
	Pen pen3=new Pen("pen","Scag",4.0,"pollwn xrwmatwn",50,9,"mple-kokkino",0.1);
	Pencil pencil1=new Pencil("pencil","plasio",0.5,"kanoniko",50,10,0.1,"HB");
	Pencil pencil2=new Pencil("pencil","public",1.0,"kanoniko",50,11,0.2,"2B");
	Pencil pencil3=new Pencil("pencil","Scag",1.5,"mixaniko",50,12,0.2,"BB");
	//topothetisi prointwn sto itemsList
	myEshop.addItem(notebook1);
	myEshop.addItem(notebook2);
	myEshop.addItem(notebook3);
	myEshop.addItem(paper1);
	myEshop.addItem(paper2);
	myEshop.addItem(paper3);
	myEshop.addItem(pen1);
	myEshop.addItem(pen2);
	myEshop.addItem(pen3);
	myEshop.addItem(pencil1);
	myEshop.addItem(pencil2);
	myEshop.addItem(pencil3);
	//buyersList
	myEshop.addBuyer(buyer1);
	myEshop.addBuyer(buyer2);
	
	//paragellia buyer1
	buyer1.placeOrder(notebook1,5);
	buyer1.placeOrder(notebook2,5);
	buyer1.placeOrder(notebook3,6);
	buyer1.placeOrder(paper1,3);
	buyer1.placeOrder(pencil2,10);
	
	//paragellia buyer2
	buyer2.placeOrder(notebook1,12);
	buyer2.placeOrder(notebook2,6);
	buyer2.placeOrder(notebook3,3);
	buyer2.placeOrder(paper1,1);
	buyer2.placeOrder(pencil2,5);
	
	
	//��������������� ���������
	
	boolean ft=true;//�� ���� case E����� ��� �� ��������� �� ft=false
	label1://�� ���� case ���������� ��� ������� ����� ������  ������� ��� label1
	while(ft) {
	
	System.out.println("���� ���,�������� ��������� �� email ���:");
	Scanner keyboard=new Scanner(System.in);
	String s=keyboard.next();
	boolean kx=true;
	label2:
	while(kx) {
	 //������� ��� ��� BuyersList ��� �� ���� buyer �� ���� ������� ���� ����� if
		for(int i=0;i<myEshop.buyersList.size();i++) {
		    if(s.equals(myEshop.buyersList.get(i).getEmail())) {
			  System.out.println("���� ��� "+myEshop.buyersList.get(i).getName()+" ��  email ��� �����: "+myEshop.buyersList.get(i).getEmail()+",�� ������ ��� �����:"+myEshop.buyersList.get(i).getBonus()+",� ��������� � �����:"+myEshop.buyersList.get(i).getBuyerCategory()); 
			  System.out.println("_______________����� �����____________");
			  System.out.println("��� �������� ��� ��������� ������� 1");
			  System.out.println("��� ������� �������� ������ ������� 2");
			  System.out.println("��� ���������� ������ ������� 3");
			  System.out.println("��� �� ���� ��� ����������� ������ ������� 4");
			  System.out.println("��� ���������� ��� ������� ����� ������  ������� 5");
			  System.out.println("��� ����� ��� �� ��������� ������� 6");
			  int epilogi=keyboard.nextInt();
			  switch(epilogi)
			     {
			    //Browse Store
			         case 1: 
			        	 myEshop.showCategories();
			        	 System.out.println("�������� ��� ��� ��� �������� ����������");
			        	 int k=keyboard.nextInt();
			        	 if(k==1) {
			        		 myEshop.showProductsinCategory("notebook");
			        		 System.out.println("�� ���� ��� �� �������� �������� �� ������ �� ����������� ��� ������(0,1,2)?");
			        	     int p=keyboard.nextInt();
			        	     System.out.println("�� ���� ��������?");
			        	     int r=keyboard.nextInt();
			        	     if(p==0) myEshop.buyersList.get(i).placeOrder(notebook1, r);
			        	     if(p==1)myEshop.buyersList.get(i).placeOrder(notebook2, r);
			        	     if(p==2)myEshop.buyersList.get(i).placeOrder(notebook3, r);
			        	 }
			        	 if(k==2){
			        		 myEshop.showProductsinCategory("paper");
			        		 System.out.println("�� ���� ��� �� �������� �������� �� ������ �� ����������� ��� ������(0,1,2)?");
			        	     int p=keyboard.nextInt();
			        	     System.out.println("�� ���� ��������?");
			        	     int r=keyboard.nextInt();
			        	     if(p==3) myEshop.buyersList.get(i).placeOrder(paper1, r);
			        	     if(p==4)myEshop.buyersList.get(i).placeOrder(paper2, r);
			        	     if(p==5)myEshop.buyersList.get(i).placeOrder(paper3, r);
			        	 }
			        	 if(k==3){
			        		 myEshop.showProductsinCategory("pencil");
			        		 System.out.println("�� ���� ��� �� �������� �������� �� ������ �� ���������� ��� ������(9,10,11)?");
			        	     int p=keyboard.nextInt();
			        	     System.out.println("�� ���� ��������?");
			        	     int r=keyboard.nextInt();
			        	     if(p==9) myEshop.buyersList.get(i).placeOrder(pencil1, r);
			        	     if(p==10)myEshop.buyersList.get(i).placeOrder(pencil2, r);
			        	     if(p==11)myEshop.buyersList.get(i).placeOrder(pencil3, r);
			        	 }
			        	 if(k==4){
			        		 myEshop.showProductsinCategory("pen");
			        		 System.out.println("�� ���� ��� �� �������� �������� �� ������ �� �� ���������� ��� ������(6,7,8)?");
			        	     int p=keyboard.nextInt();
			        	     System.out.println("�� ���� ��������?");
			        	     int r=keyboard.nextInt();
			        	     if(p==6) myEshop.buyersList.get(i).placeOrder(pen1, r);
			        	     if(p==7)myEshop.buyersList.get(i).placeOrder(pen2, r);
			        	     if(p==8)myEshop.buyersList.get(i).placeOrder(pen3, r);
			        	 }
			        	 continue label2;//���� ���  �����
			         case 2:
			        	 if(myEshop.buyersList.get(i).sCart.orderList.isEmpty()==true) {
			        		 System.out.println("� ����� ��� ����� �����");
			        	 }else {
			        		 myEshop.buyersList.get(i).sCart.showCart(myEshop.buyersList.get(i));
			        		 System.out.println("�� ������ �� ���������� ��� ����������� ������� 1");
			        		 System.out.println("�� ������ �� �������������  ��� ����������� ������� 2");
			        		 System.out.println("�� ������ �� ��������� �� ������ ������� 3");
			        		 System.out.println("Checkout ������� 4");
			        		 int p=keyboard.nextInt();
			        		 if(p==1) {
			        			 System.out.println("���� ��� �� ����������� �� ������ �� ����������(������� 1,2,3...)");
			        			 int b=keyboard.nextInt();
			        			 myEshop.buyersList.get(i).sCart.removeItemOrdered(myEshop.buyersList.get(i).sCart.orderList.get(i));
			        		 }
			        		 else if(p==2) {
			        			 System.out.println("���� ��� �� ����������� �� ������ �� ������������� ���������� ��� ��� ��������(������� 1,2,3...)");
			        			 int a=keyboard.nextInt();
			        			 System.out.println("���� �� ����� ���� � ��������");
			        			 int b=keyboard.nextInt();
			        			 myEshop.buyersList.get(i).sCart.changeItemOrderedQuantity(myEshop.buyersList.get(i).sCart.orderList.get(i), b);
			        		 }
			        		 else if(p==3) {
			        			 System.out.println("����� �������� ��� ������ �� �������� ��� �� ������?(yes or no)");
			        			 String h=keyboard.next();
			        			 if(h.equals("yes")) {
			        				 myEshop.buyersList.get(i).sCart.clearCart();
			        			 }
			        			 
			        		 }
			        		 else if(p==4) {
			        			 myEshop.buyersList.get(i).sCart.checkout(myEshop.buyersList.get(i), myEshop.buyersList.get(i).sCart);
			        		 }
			        	 }
			        	 continue label2;//���� ��� �������� ����� ��� buyer
			         case 3:
			        	 myEshop.buyersList.get(i).sCart.checkout(myEshop.buyersList.get(i), myEshop.buyersList.get(i).sCart);
			        	 continue label2;//���� ��� �������� ����� ��� buyer
			         case 4:	 
			             continue label2;//���� ��� �������� ����� ��� buyer
			         case 5:
			        	 continue label1;//����������
			         case 6:
			        	 ft=false;//����� ������������
			        	 
			     }
		  }
	  }
//��� �� ����� ��� ������ ����� �� aggelospsiris3@gmail.com ����� ��� owner	
	  if(s.equals(Psiris.getEmail())) {
		 
		
		  System.out.println("���� ��� "+Psiris.getName()+" ��  email ��� �����: "+Psiris.getEmail()+" ��� ����� �wner");
		  System.out.println("______________������ �����___________");
		  System.out.println("��� �������� ��� ��������� ������� 1");
		  System.out.println("��� �� ����� ���� �������,���� ������� ���� ��� ��� ��������� ���� ������� 2");
		  System.out.println("��� �� ���� ��� ����������� ������ ������� 3");
		  System.out.println("��� ���������� ��� ������� ����� ������  ������� 4");
		  System.out.println("��� ����� ��� �� ��������� ������� 5");
		  int epilogi=keyboard.nextInt();
		     switch(epilogi)
		     {
		    
		         case 1: //browse store
		        	 myEshop.showCategories();
		        	 System.out.println("�������� ��� ��� ��� �������� ����������");
		        	 int k=keyboard.nextInt();
		        	//�� ��������� ���� 4 ���������� ��������� ��� 4 if ��� ��� ���� ������������ ���� ���������� ������ if
		        	 if(k==1) {
		        		 myEshop.showProductsinCategory("notebook");
		        		 System.out.println("�� ���� ��� �� �������� �������� �� ������ �� ����������� �� stock(0,1,2)?");
		        	     int l=keyboard.nextInt();
		        	     System.out.println("���� ���� �� ������ �� �������� ��  stock?");
		        	     int m=keyboard.nextInt();
		        	         if(l==0) {
		        	    	   myEshop.updateItemStock(m, notebook1);
		        	           System.out.println("�� ��� stock �����: "+notebook1.getStock());
		        	         }
		        	         if(l==1) {
		        	    	    myEshop.updateItemStock(m, notebook2);
                                System.out.println("�� ��� stock �����: "+notebook2.getStock());
		        	         }
		        	         if(l==2) {
		                        myEshop.updateItemStock(m, notebook3);
		                        System.out.println("�� ��� stock �����: "+notebook3.getStock());
		        	         }
		        	 }
		        	 if(k==2){
		        		 myEshop.showProductsinCategory("paper");
		        		 System.out.println("�� ���� ��� �� �������� �������� �� ������ �� ����������� �� stock(3,4,5)?");
		        	     int l=keyboard.nextInt();
		        	     System.out.println("���� ���� �� ������ �� �������� ��  stock?");
		        	     int m=keyboard.nextInt();
		        	         if(l==3) {
		        	    	   myEshop.updateItemStock(m, paper1);
		        	           System.out.println("�� ��� stock �����: "+paper1.getStock());
		        	         }
		        	         if(l==4) {
		        	    	    myEshop.updateItemStock(m, paper2);
                                System.out.println("�� ��� stock �����: "+paper2.getStock());
		        	         }
		        	         if(l==5) {
		                        myEshop.updateItemStock(m, paper3);
		                        System.out.println("�� ��� stock �����: "+paper3.getStock());
		        	         }
		        	 }
		        	 if(k==3){
		        		 myEshop.showProductsinCategory("pencil");
		        		 System.out.println("�� ���� ��� �� �������� �������� �� ������ �� ����������� �� stock(9,10,11)?");
		        	     int l=keyboard.nextInt();
		        	     System.out.println("���� ���� �� ������ �� �������� ��  stock?");
		        	     int m=keyboard.nextInt();
		        	         if(l==9) {
		        	    	   myEshop.updateItemStock(m, pencil1);
		        	           System.out.println("�� ��� stock �����: "+pencil1.getStock());
		        	         }
		        	         if(l==10) {
		        	    	    myEshop.updateItemStock(m, pencil2);
                                System.out.println("�� ��� stock �����: "+pencil2.getStock());
		        	         }
		        	         if(l==11) {
		                        myEshop.updateItemStock(m, pencil3);
		                        System.out.println("�� ��� stock �����: "+pencil3.getStock());
		        	         }
		        	 }
		        	 if(k==4){
		        		 myEshop.showProductsinCategory("pen");
		        		 System.out.println("�� ���� ��� �� �������� �������� �� ������ �� ����������� �� stock(6,7,8)?");
		        	     int l=keyboard.nextInt();
		        	     System.out.println("���� ���� �� ������ �� �������� ��  stock?");
		        	     int m=keyboard.nextInt();
		        	         if(l==6) {
		        	    	   myEshop.updateItemStock(m, pen1);
		        	           System.out.println("�� ��� stock �����: "+pen1.getStock());
		        	         }
		        	         if(l==7) {
		        	    	    myEshop.updateItemStock(m, pen2);
                                System.out.println("�� ��� stock �����: "+pen2.getStock());
		        	         }
		        	         if(l==8) {
		                        myEshop.updateItemStock(m, pen3);
		                        System.out.println("�� ��� stock �����: "+pen3.getStock());
		        	         }
		        	 }
		        	 continue label2;//kentriko menu owner
		        	 
		         case 2:
		        	 myEshop.checkStatus();
		        	 System.out.println("������� ��� ������ ��� �� ���� �� ����������� ��� �������� ��� ");
		        	 int n=keyboard.nextInt();	 
		        	 if(n==0) {
		        		 
		        		 dionScart.showCart(buyer1);
		        		 System.out.println("�� ������ �� ���������� ����� �� ������?(������� ��� � ���)");
		        		 String o=keyboard.next();
		        		 if(o.equals("yes")) {
		        			 myEshop.removeBuyer(buyer1);
		        			 myEshop.updateItemStock(10, notebook1);
		        			 myEshop.updateItemStock(10, notebook2);
		        			 myEshop.updateItemStock(10, notebook3);
		        			 myEshop.updateItemStock(10, paper1);
		        			 myEshop.updateItemStock(10, pencil2);
		        		 }else break;
		        	 }else if(n==1) {
		        		 gianScart.showCart(buyer2);
		        		 System.out.println("�� ������ �� ���������� ����� �� ������?(������� yes � no)");
		        		 String o=keyboard.next();
		        		 if(o.equals("yes")) {
		        			 myEshop.removeBuyer(buyer2);
		        			 myEshop.updateItemStock(12, notebook1);
		        			 myEshop.updateItemStock(6, notebook2);
		        			 myEshop.updateItemStock(3, notebook3);
		        			 myEshop.updateItemStock(1, paper1);
		        			 myEshop.updateItemStock(5, pencil2);
		        		 }else break;
		        	 }System.out.println("��������� �������");
		        	 continue label2;//menu owner
		         case 3:
		        	 continue label2;//piso sto menu owner
		         case 4:
		        	 continue label1;//���������� ��� ������� ����� ������
		         case 5:
		        	 ft=false;
		        
		     }
		 }
	  else {
		  System.out.println("�� ������ �� ������������� ����������(yes/no)?");
		  String answer=keyboard.next();
		  if(answer.equals("yes")) {
			  System.out.println("���������� �� email ���");
			  String email=keyboard.next();
			  System.out.println("������ �� onoma ���");
			  String onoma=keyboard.next();
			  ShoppingCart pistotiki=new ShoppingCart(1000);
			  myEshop.createNewBuyer(onoma, email, pistotiki);//o neos buyer me ta stoixeia p bazei o xristis
			  continue label2;//pigene sto kentriko menu gia buyer
		  }else continue label1;//���� ��� ��������� ��� email ��� 
	  }
	}
	  }
}
}
