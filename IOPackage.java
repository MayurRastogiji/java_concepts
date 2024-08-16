/*
IOPackage mains contains four class rest all classes are the subclasses of one of the following classes
InputStream (Binary Read)
    FileInputStream
    BufferedInputStream
    DataInputStream
    ObjectInputStream
    ByteArrayInputStream
OutputStream (Binary Write)
    FileOutputStream
    BufferedOutputStream
    DataOutputStream
    ObjectOutputStream
    ByteArrayOutputStream
Reader (Text Read)
    FileReader
    BufferedReader
    PipedReader
    InputStreamReader
    CharacterArrayReader
Writer (Text Write)
    FileWriter
    BufferedWriter
    PipedWriter
    InputStreamWriter
    CharacterArrayWriter
 */

//  WAP to display content of a file

/*
import java.io.*;

class Example {

    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("a.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }
        fr.close();
    }
}
*/

// Wap to read a content of a file and write it into another file 

/*
import java.io.*;

class Example {

    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("a.txt");
        FileWriter fw = new FileWriter("b.txt");
        int a = fr.read();
        while (a != -1) {
            fw.write(a);
            System.out.println(a);
            a = fr.read();
        }
        fr.close();
        fw.close();
    }
}
*/

// WAP to append a data in file

/*
import java.io.*;
class Example {

    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("a.txt");
        FileWriter fw = new FileWriter("b.txt",true);
        int a = fr.read();
        while (a != -1) {
            fw.write(a);
            System.out.println(a);
            a = fr.read();
        }
        fr.close();
        fw.close();
    }
}
    */

// WAP to write a data that is being readed by keyboard

/*
import java.io.*;
class Example {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        System.out.println(s1);
    }
}
*/


