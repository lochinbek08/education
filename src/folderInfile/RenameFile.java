package folderInfile;

import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
        File file = new File("G:\\lochinbek6961\\loc.txt");
        boolean renameTo = file.renameTo(new File("G:\\lochinbek6961\\loc69.txt61"));
        if (renameTo){
            System.out.println("Tahrirlandi");
        }
        else {
            System.out.println("Tahrirlangan");
        }
    }
}
