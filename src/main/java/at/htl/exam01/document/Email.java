package at.htl.exam01.document;

public class Email extends Document {


    private  String subject;
    private  String to;


    public Email(String name , String subject, String to){
        super(name);
        setSubject(subject);
        setTo(to);

    }


    @Override
    public String toString() {
        return "Email: " + getSubject() + " von " + getAuthor() + " an " + getTo() ;
    }




    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String empfänger) {
        this.to = empfänger;
    }
}
