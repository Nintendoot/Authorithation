package Authorization.model;

import Authorization.storage.AuthorsInMemoryStorage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Author {
    private int id;
    private String name;
    private String surname;
    private String discription;
    private List<Book> arrays=new ArrayList<>();

    public Author() {
    }

    public Author(int id,String name, String surname, String discription) {
        this.id=id;
        this.name = name;
        this.surname = surname;
        this.discription = discription;
    }


public  void addBook(Book book){
        arrays.add(book);
}
    public List<Book> getArrays() {
        return arrays;
    }

    public void setArrays(List<Book> arrays) {
        this.arrays = arrays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void addToAuthorList(Book book){
        this.arrays.add(book);
    }

    @Override
    public String toString() {
        return name+" "+surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(surname, author.surname) && Objects.equals(discription, author.discription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, discription);
    }
}
