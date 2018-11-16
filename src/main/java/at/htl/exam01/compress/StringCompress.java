package at.htl.exam01.compress;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilterReader;
import java.util.Scanner;

public class StringCompress {

    private static final String FILE_NAME = "sample.txt";

    /**
     * Main-Methode, hier wird das StringCompress-Objekt erstellt
     * und die Methoden des Objekts werden aufgerufen
     *
     * @param args
     */
    public static void main(String[] args) {
        StringCompress sc = new StringCompress();
        String[] text = sc.readFromFile(FILE_NAME);
        sc.print(text);

    }


    /**
     *
     * Sämtliche Zeilen werden aus der Textdatei eingelesen
     * zB 5A
     * Nun wird in das String-Array AAAAA geschrieben
     *
     * Bsp Testdatei
     * 5A
     * 3B
     * 4C
     *
     * ergibt eine String-Array mit 3 Elementen
     * AAAAA     * BBB
     * CCCC
     *
     * @param fileName
     * @return String-Array mit dem entpacktem Text
     */
    public String[] readFromFile(String fileName) {

        String [] myText = new String[this.getNoOfLines(fileName)];

            try {
                Scanner mySc =  new Scanner(new FileReader(fileName));


                int i = 0;
                while (mySc.hasNextLine()){
                    myText[i] = mySc.nextLine();
                    i++;

                }

                return myText;

            }catch (Exception e){
                e.getMessage();
            }


        return myText;
    }


    /**
     * Der Inhalt des String-Arrays wird zeilenweise auf der Console ausgegeben
     *
     *
     * @param lines String-Array
     */
    public void print(String[] lines) {


        String character;
        int number;


            for (int i = 0; i < lines.length ; i++){

                character = lines[i].substring(0);
                //number = (int)lines[i].substring(1);

            }

    }

    /**
     * Die Anzahl der Zeilen der übergebenen Textdatei wird bestimmt
     *
     * @param fileName
     * @return Anzahl der Zeilen in der Textdatei
     */
    public int getNoOfLines(String fileName) {
        int counter = 0;
        try {

            Scanner secondScanner = new Scanner(new FileReader(fileName));
            while (secondScanner.hasNextLine()){
                secondScanner.nextLine();
                counter++;
            }


        }catch (Exception e){
            e.getMessage();
        }
        return counter;
    }
}
