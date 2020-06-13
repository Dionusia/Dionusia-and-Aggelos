package eshop;

public class Owner extends User{
   
	//idiotites
	private boolean isAdmin=true;
	//constructors
	public Owner() {
		
	}
	public Owner(String name,String email,boolean isAdmin) {
		super(name,email);
		this.isAdmin=isAdmin;
	}
    //getter k setter
    public void setIsAdmin(boolean isAdmin) {this.isAdmin=isAdmin;}
    public boolean getIsAdmin() {return isAdmin;}
    
}
