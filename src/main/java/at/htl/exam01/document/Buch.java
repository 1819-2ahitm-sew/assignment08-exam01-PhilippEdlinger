package at.htl.exam01.document;

public class Buch extends Document {



    private String title;

    public  Buch (){

    }

    public  Buch (String autor, String title){
        super(autor);
        setTitle(title);
    }


    @Override
    public String toString() {
        return "Book: " + getTitle() + " von " + super.getAuthor();
    }


    // Getter und Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
