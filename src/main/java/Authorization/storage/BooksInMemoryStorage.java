package Authorization.storage;

import Authorization.model.Author;
import Authorization.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BooksInMemoryStorage {
    private static int count;
    private static final List<Book> bookList=new ArrayList<>();
private static BooksInMemoryStorage booksInMemory;
   static {
       BooksInMemoryStorage.createBook("Voina i mir","dsdcsc","sdsgbfgbdcsdc",AuthorsInMemoryStorage.getAuthorById(2),"https://www.clipartmax.com/png/full/35-359277_book-read-library-reading-education-school-libro-png.png");
       BooksInMemoryStorage.createBook("gbgfb","dsdcsc","sdsdgbfgbfgcsdc",AuthorsInMemoryStorage.getAuthorById(1),"https://www.clipartmax.com/png/full/35-359277_book-read-library-reading-education-school-libro-png.png");
       BooksInMemoryStorage.createBook("Vgfbfr","dsdcsc","sdsdcgbfgbsdc",AuthorsInMemoryStorage.getAuthorById(3),"https://www.clipartmax.com/png/full/35-359277_book-read-library-reading-education-school-libro-png.png");
       BooksInMemoryStorage.createBook("Voigbfgbir","dsdcsc","sdsdfgbfgbcsdc",AuthorsInMemoryStorage.getAuthorById(2),"https://www.clipartmax.com/png/full/35-359277_book-read-library-reading-education-school-libro-png.png");
       BooksInMemoryStorage.createBook("Vofgbmir","dsdcsc","sdsdcsdc",AuthorsInMemoryStorage.getAuthorById(1),"https://www.clipartmax.com/png/full/35-359277_book-read-library-reading-education-school-libro-png.png");
       BooksInMemoryStorage.createBook("Vg mir","dsdcgbgfbsc","sdsdcgbfgbsdc",AuthorsInMemoryStorage.getAuthorById(1),"https://www.clipartmax.com/png/full/35-359277_book-read-library-reading-education-school-libro-png.png");


    }
    private BooksInMemoryStorage() {
    }


    public static BooksInMemoryStorage getInstance(){
        if(booksInMemory==null){
            booksInMemory=new BooksInMemoryStorage();
            return booksInMemory;
        }
        return booksInMemory;
    }
public static void addBook(Book book){
       bookList.add(book);
}
    public ArrayList<Book> getAllBook(){
        return new ArrayList<>(bookList);
    }

    public static void createBook(String name, String genre, String discription, Author author,String img){
       int id=count++;
       Book book=new Book();
       book.setId(id);
       book.setName(name);
       book.setGenre(genre);
       book.setDiscription(discription);
       book.setAuthor(author);
       book.setImg(img);
       Objects.requireNonNull(AuthorsInMemoryStorage.getAuthorById(author.getId())).addToAuthorList(book);
       BooksInMemoryStorage.addBook(book);

    }

    public static Book getById(int id){
        for (Book book: bookList) {
            if (book.getId() == id) return book;
        }
        return null;
    }
}
