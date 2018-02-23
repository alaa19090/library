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
public class Library {

   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        author[] arrayAuthors = new author[3];
                arrayAuthors[0]=new author("mahmoud", "darwish","palestin", "1941",30);
                arrayAuthors[1]=new author("nizar", "qabbani","syrian", "1923", 20);
                arrayAuthors[2]=new author("jobran", "khalil jobran","lebanese", "1983",35);
     
        
       /* book book1 = new book("9953-21-248-1",0.1) ;
        Publication publication1 = new Publication(book1,20,"الغريب يقع على نفسه",200,"2006",arrayAuthors[0]);
        
        book book2 = new book("97 89953 21152 7",0.1) ;
        Publication publication2 = new Publication(book2,21,"لا تعتذر عما فعلت ",175,"2004",arrayAuthors[0]);
        
        book book3 = new book("97 86000 03497 9",0.1) ;
        Publication publication3 = new Publication(book3,22,"الحب لا يقف على الضوء الاحمر",155,"1983",arrayAuthors[1]);
        
        book book4 = new book("9786000034979",0.1) ;
        Publication publication4 = new Publication(book4,24,"الاحنحة المتكسرة",155,"1912",arrayAuthors[2]);
        
        Search search1= new Search("سياسية ناقدة");
        Publication publication5 = new Publication(search1,25,"هوامش على الهوامش",50,"1991",arrayAuthors[1]);
        
        
        publication1.showBook();
        publication2.showBook();
        publication3.showBook();
        publication4.showBook();
        publication5.showSearch();*/
       book b = new book("4654564654",1.2);
       b.setDataPublication(28, "android", 550, "2012");
       b.A = arrayAuthors[1];
       b.showBook();
       

        
        
        
        
                /*book1.equals(author1);
        book1.showPublication();
        author1.showAuthor();
         */ 
    }
    
    
    
}
