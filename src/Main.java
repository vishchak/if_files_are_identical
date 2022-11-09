import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("C:/Users/denis/Documents/Java/if_files_are_identical/files/New Microsoft Word Document.docx");
        File file2 = new File("C:/Users/denis/Documents/Java/if_files_are_identical/files/New Microsoft Word Document - Copy.docx");
        File fIle3 = new File("C:/Users/denis/Documents/Java/if_files_are_identical/files/New Microsoft PowerPoint Presentation.pptx");

        try {
            IfIdenticalService.ifFilesAreIdentical(file1, file2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            IfIdenticalService.ifFilesAreIdentical(file1, fIle3);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}