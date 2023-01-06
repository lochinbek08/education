package folderInfile;

import java.io.File;
import java.io.IOException;

public class CreatFile {
    public static void main(String[] args) throws IOException {
        File file = new File("G:\\lochinbek\\loc.txt");
        boolean newFile = file.createNewFile();
        if (newFile){
            System.out.println("Yaratildi");
        }
        else {
            System.out.println("Yaratilgan");
        }
    }
}
