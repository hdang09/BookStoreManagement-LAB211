package bookstoremanagement;

import java.io.Serializable;

public class Book implements Serializable, Comparable<Book> {
    private String id;
    private String name;
    private Double price;
    private int quantity;
    private String publisherId;
    private String status;
    
    public Book() {
        this.id = "";
        this.name = "";
        this.price = 0.0;
        this.quantity = 0;
        this.publisherId = "";
        this.status = "";
    }

    public Book(String id, String name, Double price, int quantity, String publisherId, String status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.publisherId = publisherId;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", publisherId=" + publisherId + ", status=" + status + '}';
    }

    @Override
    public int compareTo(Book o) {
        return price.compareTo(o.getPrice());
    }
    
}