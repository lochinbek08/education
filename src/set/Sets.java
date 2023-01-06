package set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {

        Set<String> lochin = new HashSet<>();
        lochin.add("Lochin");
        lochin.add("Ahror");
        lochin.add("Kamron");

        int l = 0;
        for (String lochins:lochin){
            l++;
            System.out.println(l+" "+lochins);
        }
Scanner scanner = new Scanner(System.in);
//        System.out.println("tanla");
//        int choose = scanner.nextInt();
//        int A = 0;
//        for (String ahrors : lochin){
//            A++;
//            if (choose==A){
//                System.out.println(ahrors);
//                break;
//            }

            System.out.println("Tanla");
            int choose1 = scanner.nextInt();
            int J = 0;
            for (String Kamrons : lochin){
                lochin.remove(lochin);
                System.out.println(lochin);

                break;
                }
            }
        }
//        System.out.println(lochin.contains("Asil"));
//        System.out.println(lochin.contains("Ahror"));
//        System.out.println(lochin);





