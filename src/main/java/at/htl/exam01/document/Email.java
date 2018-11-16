package at.htl.exam01.document;

public class Email extends Document {

    private  String name;
    private  String schreiben;
    private  String empfaenger;


    public Email(String name , String schreiben, String empfaenger){
        super();
        setName(name);
        setSchreiben(schreiben);
        setEmpfaenger(empfaenger);

    }


    @Override
    public String toString() {
        return "Email: " + getSchreiben() + " von " + getName() + " an " +getEmpfaenger() ;
    }


    // Getter und Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchreiben() {
        return schreiben;
    }

    public void setSchreiben(String schreiben) {
        this.schreiben = schreiben;
    }

    public String getEmpfaenger() {
        return empfaenger;
    }

    public void setEmpfaenger(String empfänger) {
        this.empfaenger = empfänger;
    }
}
