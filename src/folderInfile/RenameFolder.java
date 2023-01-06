package folderInfile;

import java.io.File;

public class RenameFolder {
    public static void main(String[] args) {
        File file = new File("G:\\lochinbek");
        boolean renameTo = file.renameTo(new File("G:\\lochinbek6961"));
        if (renameTo){
            System.out.println("Tahrirlandi");
        }
        else {
            System.out.println("Tahrirlangan");
        }
    }
}
