package folderInfile;

import java.io.File;

public class CreatFolder {
    public static void main(String[] args) {
        File file = new File("G:\\lochinbek");
        boolean mkdir = file.mkdir();
        if (mkdir){
            System.out.println("Yaratildi");
        }
        else {
            System.out.println("Yaratilgan");
        }
    }
}
