package ws02;
public class TikiBook {
    private String name;
    private String author;
    private String publisher;
    private double price;
    private double discount;
    private int publishYear;

    public TikiBook(String name, String author, String publisher, double price, 
                    double discount, int publishYear) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.discount = discount;
        this.publishYear = publishYear;
    }

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
    
    
}
