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
public class Search extends Publication {
    
    public Search(String Subject){
        this.setSubject(Subject);        
    }
    
    private String subject = "subject" ;
    
    
    
    
    public String getSubject(){
         return this.subject;    
    }
    
    public void setSubject(String subject){
        this.subject = subject;
    }
    
   
    }
    
    
   

