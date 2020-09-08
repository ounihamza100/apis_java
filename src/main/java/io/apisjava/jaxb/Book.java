package io.apisjava.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Hamza Ouni
 */
@XmlRootElement(name = "book")
// If you want you can define the order in which the fields are written
// Optional
@XmlType(propOrder = { "author", "name", "publisher", "isbn" })
public class Book {

    private String name;
    private String author;
    private String publisher;
    private String isbn;

    // If you like the variable name, e.g. "name", you can easily change this
    // name for your XML-Output:
    @XmlElement(name = "title")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("name='").append(name).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", publisher='").append(publisher).append('\'');
        sb.append(", isbn='").append(isbn).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
