package Authorization.storage;

import Authorization.model.Author;
import java.util.ArrayList;
import java.util.List;

public class AuthorsInMemoryStorage {
    private static int count=4;
    private static final List<Author> authorList=new ArrayList<>();
    private static AuthorsInMemoryStorage authorsInMemoryStorage;
static {
    authorList.add(new Author(1,"Oleg","Tereshkov","Some Text."));
    authorList.add(new Author(2,"Misha","Grishynin","Some Text."));
    authorList.add(new Author(3,"Andrey","Volski","Some Text."));


}
    private  AuthorsInMemoryStorage() {
    }


    public static AuthorsInMemoryStorage getInstance(){
        if(authorsInMemoryStorage==null){
            authorsInMemoryStorage=new AuthorsInMemoryStorage();
            return authorsInMemoryStorage;
        }
        return authorsInMemoryStorage;
    }

    public ArrayList<Author> getAllAuthors(){
        return new ArrayList<>(authorList);
    }

    public static Author getAuthorById(int id){
    for(Author author:authorList){
        if(author.getId()==id){
            return author;
        }
    }
    return null;
    }

    public static   void createAuthor(String name,String surname,String discription){
        Author a=new Author();
       int id=count++;
       a.setSurname(surname);
        a.setId(id);
        a.setName(name);
        a.setDiscription(discription);
        authorList.add(a);

    }




}
