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
       BooksInMemoryStorage.createBook("Три мушкетера","Приключения","Some Text.",AuthorsInMemoryStorage.getAuthorById(2),"https://www.100bestbooks.ru/pictures/books/Dartagnan_i_tri_musketera.jpg");
       BooksInMemoryStorage.createBook("Мастер и Маргарита","Роман","Some Text.",AuthorsInMemoryStorage.getAuthorById(1),"https://www.100bestbooks.ru/pictures/books/Bulgakov_Master_i_Margarita.jpg");
       BooksInMemoryStorage.createBook("Мёртвые души","Поэма","Some Text.",AuthorsInMemoryStorage.getAuthorById(3),"https://www.100bestbooks.ru/pictures/books/Dead_Souls_Gogol_1842.jpg");
       BooksInMemoryStorage.createBook("Обломов","Классика","Some Text.",AuthorsInMemoryStorage.getAuthorById(2),"https://www.100bestbooks.ru/pictures/books/Oblomov_1858.jpg");
       BooksInMemoryStorage.createBook("Отверженные","История","Some Text.",AuthorsInMemoryStorage.getAuthorById(1),"https://www.100bestbooks.ru/pictures/books/les_miserables.jpg");
       BooksInMemoryStorage.createBook("Старик и море","Повесть","Some Text.",AuthorsInMemoryStorage.getAuthorById(1),"https://www.100bestbooks.ru/pictures/books/old_man_and_sea_book.jpg");


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
