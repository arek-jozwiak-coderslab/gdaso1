package pl.coderslab.jdbc;

public class BookValidator {

    public static boolean isValid(Book book){
        if(book.getAuthor().equals("")){
            return  false;
        }
        if(book.getTitle().equals("")){
            return false;
        }
        return true;
    }
}
