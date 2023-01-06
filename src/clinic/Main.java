package clinic;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Clinic clinic = new Clinic();
        Doctor doctor = new Doctor();
        List<Doctor> doctors = new ArrayList<>();
        List<Clinic> clinics = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int step = -1;
        while (step!=0){
            System.out.println("0=>exit,1=>addDoctor ,2=>addClinic ,3=>addDoclnClinic , 4=>getClinic , 5=getDoctor, 6=>editClinic ,7=>editDoctor , 8=>deleteDoctor");
            step = scanner.nextInt();
            switch (step) {
                case 1:
                    System.out.println("Ismingizni kiriting");
                    String name = scanner.next();
                    System.out.println("Familiyangizni kiriting");
                    String surname = scanner.next();
                    System.out.println("Yoshingizni kiriting");
                    byte age = scanner.nextByte();
                    doctors.add(new Doctor(name, surname, age));
                    System.out.println("Successfully saved Doctor");
                    break;
                case 2:
                    System.out.println("Klinika nomini kiriting");
                    String nama1 = scanner.next();
                    System.out.println("Klinika adresini kiriting");
                    String addres = scanner.next();
                    clinics.add(new Clinic(nama1, addres));
                    System.out.println("Successfully saved Clinic");
                    break;
                case 3:
                    getDoctorList(doctors);
                    System.out.println("Doktorni tanlang");
                    int chooseDoc = scanner.nextInt();
                    getClinicList(clinics);
                    System.out.println("Klinikani tanlang");
                    int chooseClinic = scanner.nextInt();
                    clinics.get(chooseClinic - 1).addDocInClinic(doctors.get(chooseDoc - 1));
                    break;
                case 4:
                    getClinicList(clinics);
                    break;
                case 5:
                    getDoctorList(doctors);
                    break;
                case 6:
                    getClinicList(clinics);
                    int chooseClinic1 = scanner.nextInt();
                    System.out.println("Klinikani tanlang");
                    int tr1 = 0;
                    for (Clinic clinic1 : clinics) {

                        tr1++
                        ;
                        if (chooseClinic1 == tr1) {
                            String oldName = clinic1.getName();
                            System.out.println("Yangi nom kiriting");
                            String newName = scanner.next();
                            clinic1.setName(newName);
                            System.out.println("tahrirlangan nom  " + oldName);
                        }
                    }
                    break;
                case 7:
                    getDoctorList(doctors);
                    System.out.println("Qaysi Doktorni tahrirlaysiz");
                    int ChooseDoctor = scanner.nextInt();
                    int raqam = 0;
                    for (Doctor doctor1 : doctors) {
                        raqam++;
                        if (ChooseDoctor == raqam) {
                            String OldName = doctor.getName();
                            System.out.println("Ismni kiriting");
                            String yangiName = scanner.next();
                            doctor.setName(yangiName);
                            System.out.println("Yangi nom" + yangiName);

                        }
                    }
                case 8:
                    getDoctorList(doctors);
                    System.out.println("Doktorni tanlang");
                    int choseDoc = scanner.nextInt();
                    doctors.remove(choseDoc - 1).getName();
                    System.out.println("Doktor o'chirildi");
                    break;


            }

        }
    }
    public static void getDoctorList(List<Doctor>doctors){
        int tr = 0;
        for(Doctor doctor:doctors){
            tr++;
            System.out.println(tr+" "+doctor.getName());
        }
    }
    public static void getClinicList(List<Clinic>clinics){
        int l = 0;
        for(Clinic clinic:clinics){
            l++;
            System.out.println(l+" "+clinic.getName());
        }
    }
}
