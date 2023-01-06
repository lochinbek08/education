package folderInfile;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("G:\\lochinbek6961\\loc69.txt61");
        boolean delete = file.delete();
        if (delete){
            System.out.println("O'chirildi");
        }
        else {
            System.out.println("O'chirilgan");
        }
    }
}
