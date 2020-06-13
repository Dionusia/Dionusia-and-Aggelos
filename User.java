package eshop;

public class User {

  //idiotites
  private String name;
  private String email;
  //constructor
  public User() {
	  
  }
  public User(String name,String email) {
	this.name=name;
	this.email=email;
  }
  //getter k setters
  public void setName(String name) {this.name=name;}
  public String getName() {return name;}
  public void setEmail(String email) {this.email=email;}
  public String getEmail() {return email;}

}
