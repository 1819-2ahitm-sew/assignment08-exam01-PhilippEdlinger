package at.htl.exam01.document;

public class Buch extends Document {


    private  String autor;
    private String titel;

    public  Buch (){

    }

    public  Buch (String autor, String  titel){
        super();
        setAutor(autor);
        setTitel(titel);
    }


    @Override
    public String toString() {
        return "Book: " + getTitel() + " von " + getAutor();
    }


    // Getter und Setter
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }
}
