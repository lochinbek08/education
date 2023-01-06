package folderInfile;

import java.io.File;

public class DeleteFolder {
    public static void main(String[] args) {
        File file = new File("G:\\lochinbek6961");
        boolean delete = file.delete();
        if (delete){
            System.out.println("O'chirildi");
        }
        else{
            System.out.println("O'chirilgan");
        }
    }
}
