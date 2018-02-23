/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

public class book extends Publication {

    private double version = 0.0;
    private String  ISBN = "";
    
    author A ;
    public book() {
    }
    
    
    public book(String ISBN,double version){
      
        this.setISBN(ISBN);
        this.setVersion(version);
        
    }
     public book(Publication p ,String ISBN,double version){
      
        this.setISBN(ISBN);
        this.setVersion(version);
        
    }
    
    
  
  public void setVersion(double version){
      this.version = version;
  }
  public double getVersion(){
      return this.version;
  }
  
  
  public void setISBN(String ISBN){
      this.ISBN = ISBN;  
  }
  public String getISBN(){
      return this.ISBN ;
  }
   // overriding on method for adding the discount and the word different
  
    @Override
    public void showBook() {
      System.out.println( 
              "Name Of Book: "+super.getName() + "\n" +
              "ISBN : "+this.getISBN()+"\n"+   
              "Id Of Book : " + super.getId() +"\n"+ 
              "Date Of Publication : "+super.getDate_of_publication()+"\n"+
              "price : " +super.getPrice()+"\n"+
              "Version : "+ this.getVersion()+"\n");
              A.showAuthor();
  }
    
}

   
    
   
