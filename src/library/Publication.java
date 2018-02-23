
package library;


    public class Publication{
        
        
        
        
    private String name = "publication Name";
    private int id = 0 ;
    private double price = 0.0 ;
    private String date_of_publication = "unknown";
    author A = this.A;
    book B = this.B;
    Search S= this.S;
    public Publication (){
        
    }
    
    
    
    

  public Publication(book s ,int id,String name ,double price ,String date_of_publication,author o){
        this.B = s; 
        this.setId(id);
        this.setName(name);
        this.setPrice(price);//set
        this.setDate_of_publication(date_of_publication);
        this.A = o;
        
    }
  public Publication(Search s ,int id,String name ,double price ,String date_of_publication,author o){
        this.S = s; 
        this.setId(id);
        this.setName(name);
        this.setPrice(price);//set
        this.setDate_of_publication(date_of_publication);
        this.A = o;
        
    }
    
     public void setDataPublication(int id,String name ,double price ,String date_of_publication){
        this.setId(id);
        this.setName(name);
        this.setPrice(price);//set
        this.setDate_of_publication(date_of_publication);
        
    }

    
  public void setName(String name){
      this.name = name;
  }
  public String getName(){
      return this.name;
  }
  
  public void setId(int id){
      this.id = id;  
  }
  public int getId(){
      return this.id ;
  }
  
  public final void setPrice(double price){
      this.price = price;
  }
  public double getPrice(){
      return this.price;
  }
  
  
  public void setDate_of_publication(String date_of_publication){
      this.date_of_publication = date_of_publication;
  }
  public String getDate_of_publication(){
      return this.date_of_publication;
  }
 
   public void showBook() {
      System.out.println( 
              "Name Of Book: "+this.getName() + "\n" +
              "ISBN : "+B.getISBN()+"\n"+   
              "Id Of Book : " + this.getId() +"\n"+ 
              "Date Of Publication : "+this.getDate_of_publication()+"\n"+
              "price : " +this.getPrice()+"\n"+
              "Version : "+ B.getVersion()+"\n");
              A.showAuthor();
  }
   
    public void showSearch() {
      System.out.println( 
              "Name Of Search : "+this.getName() + "\n" +
              "Subject : "+S.getSubject()+"\n"+   
              "Id Of search : " + this.getId() +"\n"+ 
              "Date Of Publication : "+this.getDate_of_publication()+"\n"+
              "price 40% for search: " +this.getDiscount()+"\n");
              A.showAuthor();
    }
    
    //method for discount 40%
    public double getDiscount(){
     return  ((40.0/100.0) * this.getPrice())- this.getPrice();
    }
    
    
  public boolean odd_number(){
      return this.id % 2 == 1;
   }
   public void odd_number1(){
       if(this.odd_number() == true )
           this.showBook();
   }  

    

   
}
