package copyfile.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);

        FileInputStream inStream = null;
        FileOutputStream outStream = null;

        try {
            File inFile = new File("C:\\Users\\Luke.Brannigan\\newfile.txt");
            File outFile = new File("C:\\Users\\Luke.Brannigan\\outputFile.txt");

            inStream = new FileInputStream(inFile);
            outStream = new FileOutputStream(outFile);

            byte[] buffer = new byte[1024];

            int length;
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);

            }
            inStream.close();
            outStream.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

}
