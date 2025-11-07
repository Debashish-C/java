import java.io.*;

public class FileHandlingDemo {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("data.txt");
            fw.write("This is a sample file.\nLearning File Handling in Java.");
            fw.close();

            System.out.println("✅ Data written to file.");

            FileReader fr = new FileReader("data.txt");
            int ch;
            System.out.println("📄 File contents:");
            while ((ch = fr.read()) != -1)
                System.out.print((char) ch);
            fr.close();

        } catch (IOException e) {
            System.out.println("❌ File operation failed: " + e.getMessage());
        }
    }
}
