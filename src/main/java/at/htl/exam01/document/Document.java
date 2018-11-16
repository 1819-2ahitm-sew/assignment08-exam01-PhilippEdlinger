package at.htl.exam01.document;

public abstract class Document {

    String author;
    public abstract  String toString();

    public Document(){

    }

    public Document(String author){
            this.author = author;
    }

    // Getter und Setter
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
