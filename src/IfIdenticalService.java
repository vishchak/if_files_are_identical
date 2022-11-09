import java.io.*;
import java.util.Arrays;

public class IfIdenticalService {
    public static void ifFilesAreIdentical(File f1, File f2) throws IOException {
        try (InputStream is1 = new FileInputStream(f1);
             InputStream is2 = new FileInputStream(f2)) {

            byte[] bytes1;
            byte[] bytes2;

            bytes1 = is1.readAllBytes();
            bytes2 = is2.readAllBytes();

            if (Arrays.equals(bytes1, bytes2)) {
                System.out.println("files are equal");
            } else System.out.println("files are different");
        }
    }
}
