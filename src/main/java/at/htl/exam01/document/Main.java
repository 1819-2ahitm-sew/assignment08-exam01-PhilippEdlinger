package at.htl.exam01.document;

public  class Main {

    /**
     *
     * Führen Sie hier folgendes durch:
     *
     * 1. Erstellen Sie 2 Bücher und ein email
     *    Buch: "Rowlings", "Harry Potter und der Stein der Weisen"
     *    Email: "Susi", "Bewerbung", "CoolCompany"
     *    Buch: "Tolkien", "lordOfTheRings"
     *
     * 2. Erstellen Sie ein Document-Array und speichern Sie obige Dokumente in diesem Array.
     *
     * 3. Geben Sir die Inhalte dieser Documente wie folgt aus.
     *    Nutzen Sie dabei die Mechanismen der Vererbung.
     *    Erstellen Sie außerdem geeignete toString-Methoden
     *
     * 4. Zählen Sie die Bücher und emails im Array und geben Sie die jeweilige Anzahl aus.
     *
     * @param args
     */



    public static void main(String[] args) {
        int booksCounter = 0;
        int emailCounter = 0;
        int i = 0;

        System.out.println();

        Document[] documentsList = new Document[100];

        Document doc1 = new Buch("Rowlings" , "Harry Potter und der Stein der Weisen ");
        documentsList[0] = doc1;
        System.out.println(documentsList[0].toString());

        Document doc2 = new Email("Susi", " Berwerbung" , " CoolCompany");
        documentsList[1] = doc2;
        System.out.println(documentsList[1].toString());

        Document doc3 = new Buch("Tolkien" , "lordOfTheRings");
        documentsList[2] = doc3;
        System.out.println(documentsList[2].toString());


        do {

            if (documentsList[i] instanceof Buch){
                booksCounter++;
            }

            if (documentsList[i] instanceof Email){
                emailCounter++;
            }

                i++;
        }while ( i < documentsList.length);
        System.out.println("\nAnzahl Books: " + booksCounter);
        System.out.println("Anzahl Email: " + emailCounter);



    }


}
