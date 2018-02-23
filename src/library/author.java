/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author SAMSUNG
 */
public class author {
    
    private String first_name = "unknown" ;
    private String last_name = "unknown" ;
    private String nationality = "unknown";
    private String date_of_birth = "unknown";
    private int aulthoresses = 1 ;    
    public author() {}
    
    public author(String firstName ,String lastName,String nationality,String date_of_birth,int aulthoresses ){
        this.first_name = firstName ;
        this.last_name = lastName ;
        this.nationality = nationality ;
        this.date_of_birth = date_of_birth;
        this.aulthoresses = aulthoresses;
    }
    
     public void setfirstName(String name){
      this.first_name = name;
  }
  public String getfirstName(){
      return this.first_name;
  }
    
     public void setlasttName(String name){
      this.last_name = name;
  }
  public String getlastName(){
      return this.last_name;
  }
    
     public void setNationality(String name){
      this.nationality = name;
  }
  public String getNationality(){
      return this.nationality;
  }
    
    
  public void setData_of_birth(String name){
      this.date_of_birth = name;
  }
  public String getDta_of_birth(){
      return this.date_of_birth;
  }
  
    public void setAulthoresses(int name){
      this.aulthoresses = name;
  }
  public int getAulthoresses(){
      return this.aulthoresses;
  }
  
  public void setDataAuthor(String firstName ,String lastName,String nationality,String date_of_birth,int aulthoresses ){
        this.first_name = firstName ;
        this.last_name = lastName ;
        this.nationality = nationality ;
        this.date_of_birth = date_of_birth;
        this.aulthoresses = aulthoresses;
    }
  
  public void showAuthor(){
      System.out.print(
      "About the author"+"\n "+
              "The first Name : "+this.first_name+"\n "+
              "The last Name : "+this.last_name+"\n "+
              "The Nationality : "+this.nationality+"\n "+
              "The date of birth : "+this.date_of_birth+"\n "+
              "The Aulthoresses : "+this.aulthoresses+"\n "+"***********"+"\n"+"\n"+"\n"
      
      );
  }

    
  
}
