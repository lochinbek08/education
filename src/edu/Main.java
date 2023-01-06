package edu;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Educetion educetion = new Educetion();
        Set<Educetion> educetions = new HashSet<>();
        Set<Student> students = new HashSet<>();
        Set<EducetionGroup> educetionGroups = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        int step = -1;
        while (step!=0){
            System.out.println("0=>exit , 1=>addStudent, 2=>addEducetionGroup , 3=>addEducetion , 4=>addStudentInEducetionGroup , 5=>getStudent , 6=>getEducetionGroup , 7=>getEducetion , 8=>editStudent , 9=>editEducetionGroup , 10=>editEducetion , 11=>deleteStudent");
            step = scanner.nextInt();
            switch (step){
                case 1:
                    System.out.println("Ismingizni kiriting");
                    String name = scanner.next();
                    System.out.println("Familiyangizni kiriting");
                    String surname = scanner.next();
                    System.out.println("Yoshingizni kiriting");
                    byte age = scanner.nextByte();
                    students.add(new Student(name , surname , age));
                    System.out.println("Muvaffaqiyatli saqlandi");
                    break;

                case 2:
                    System.out.println("Gruhni nomini kiriting");
                    String name0 = scanner.next();
                    System.out.println("Gruhni sonini kiriting");
                    int Classnumber = scanner.nextInt();
                    educetionGroups.add(new EducetionGroup(name0 , Classnumber));
                    System.out.println("Guruh muvsffaqiyatli saqlandi");
                    break;

                case 3:
                    System.out.println("Eduning nomini kiriting");
                    String name1 = scanner.next();
                    System.out.println("Eduning manzilini kiriting");
                    String addres = scanner.next();
                    educetions.add(new Educetion(name1 , addres));
                    System.out.println("Edukeshin saqlandi");
                    break;

                case 4:
                    getStudent(students);
                    System.out.println("Studentni tanlang");
                    String chooseStudent = scanner.next();
                    getEducetionGroup1(educetionGroups);
                    System.out.println("Edukeshinni tanlang");
                    int chooseEducetion = scanner.nextInt();
                    int tr = 0;
                    for (EducetionGroup educetionGroup : educetionGroups){
                        if (chooseEducetion==tr){
                            tr++;
                            System.out.println(tr + " " +students);
                        }
                    }
                    System.out.println("Qabul qilindingiz");
                    break;

                case 5:
                    getStudent(students);
                    break;

                case 6:
                    getEducetionGroup1(educetionGroups);

                case 7:
                    getEducetion(educetions);

                case 8:
                    System.out.println("Yangi Ismni kiriting");
                    String newName = scanner.next();
                    getStudent(students);
                    System.out.println("Tanlang");
                    int chooseEdu = scanner.nextInt();
                    int tr1 = 0;
                    for (Student student : students){
                        tr1++;
                        if (chooseEdu == tr1){
                            educetion.setName(newName);
                            System.out.println("Tahrirlandi" +" "+ newName);
                        }
                    }
                case 9:
                    System.out.println("Yangi nomni kiriting");
                    String newname = scanner.next();
                    getEducetionGroup(educetionGroups);
                    System.out.println("Guruhni tanlang");
                    int chooseGroup = scanner.nextInt();
                    int tr2 = 0;
                    for (EducetionGroup educetionGroup : educetionGroups){
                        tr2++;
                        if (chooseGroup == tr2){
                            educetionGroup.setName(newname);
                            System.out.println("Tahrirlandi" +" "+ newname);
                        }
                    }
                case 10:
                    System.out.println("Yangi nomni kiriting");
                    String newEducetion = scanner.next();
                    getEducetion(educetions);
                    System.out.println("Edukeshinni tanlang");
                    int chooseEducetion1 = scanner.nextInt();
                    int tr3 = 0; 
                    for (Educetion educetion1 : educetions){
                        tr3++;
                        if (chooseEducetion1 == tr3){
                            educetion1.setName(newEducetion);
                            System.out.println("Yangi nom"+ " " + newEducetion);
                        }
                    }
                case 11:
                    getStudent(students);
                    System.out.println("Studentni tanlang");
                    int chooseStudent1 = scanner.nextInt();
                    int trs = 0;
                    for (Student student : students){
                        trs++;
                        if (chooseStudent1==trs){

                        }
                    }
            }
        }
    }
    public static void getEducetionGroup(Set<EducetionGroup>educetionGroups){
        int tr = 0;
        for (EducetionGroup educetionGroup : educetionGroups){
            tr++;
            System.out.println(tr + " " +educetionGroup);
        }
    }

    public static void getEducetionGroup1(Set<EducetionGroup>educetionGroups){
        int tr1 = 0;
        for (EducetionGroup educetionGroup : educetionGroups){
            tr1++;
            System.out.println(tr1 + " " +educetionGroup);
        }
    }
    public static void getStudent(Set<Student>students){
        int tr = 0;
        for (Student student : students){
            tr++;
            System.out.println(tr + " " + student);
        }
    }
    public static void getEducetion(Set<Educetion>educetions){
        int tr = 0;
        for (Educetion educetion : educetions){
            tr++;
            System.out.println(tr + " " +educetion);
        }
    }
}
