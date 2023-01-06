package fabrica;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Fabrica> fabricas = new ArrayList<>();
        List<Product> products = new ArrayList<>();
        List<Worker> workers = new ArrayList<>();
        List<Market> markets = new ArrayList<>();
        Market market = new Market();
        Worker worker = new Worker();
        Product product = new Product();
        Fabrica fabrica = new Fabrica();
        Scanner scanner = new Scanner(System.in);

        int step = -1;
        while (step != 0) {
            System.out.println("0=>exit , 1=>addFabrica , 2=>getFabrica , 3=>editFabrica , 4=>deleteFabrica ,  5=>addWorker , 6=>getWorker , 7=>editWorker , 8=>deleteWorker , 9=>addProduct , 10=>getProduct , 11=>deleteProduct , 12=>addMarket , 13=>deleteMarket , 14=>editMarket ,15=>getMarket, 16=>WorkerInFabrica , 17=>ProductInMarket ,18=>deleteFabricaInWorker , 19=>editFabricaInWorker ,20=>getFabricaInWorker ,21=>deleteFabricaInWorker , 22=>editFabricaInWorker ,23=>getFabricaInWorker ");
            step = scanner.nextInt();
            switch (step) {
                case 1:
                    System.out.println("Fabrika nomini kiriting");
                    String fabricaName = scanner.next();
                    System.out.println("Fabrika adresini kiriting");
                    String fabricaAddres = scanner.next();
                    fabricas.add(new Fabrica(fabricaName, fabricaAddres));
                    System.out.println("Save fabrica");
                    break;

                case 2:
                    getFabrica(fabricas);
                    break;

                case 3:
                    getFabrica(fabricas);
                    System.out.println("Qaysi fabrikani tahrirlaysiz");
                    int editFabrica = scanner.nextInt();
                    int o = 0;
                    for (Fabrica fabrica1 : fabricas) {
                        o++;
                        if (editFabrica == o) {
                            String oldName = fabrica.getName();
                            String oldAddres = fabrica.getAddres();
                            System.out.println("Yangi nomni kiriting");
                            String newName = scanner.next();
                            System.out.println("Yangi adresni kiriting");
                            String newAddres = scanner.next();
                            fabrica.setName(newName);
                            fabrica.setAddres(oldAddres);
                            System.out.println("Yangi nom" + " " + newName + "." + "Yangi manzil" + " " + newAddres);
                            break;
                        }
                    }
                case 4:
                    getFabrica(fabricas);
                    System.out.println("Qaysi fabrikani o'chirasiz");
                    int deleteFabrica = scanner.nextInt();
                    fabricas.remove(deleteFabrica - 1).getName();
                    System.out.println("Delete fabrica");
                    break;

                case 5:
                    System.out.println("Ismingizni kiriting");
                    String nameWorker = scanner.next();
                    System.out.println("Familiyangizni kiriting");
                    String surnameWorker = scanner.next();
                    System.out.println("Telefon raqamingizni kiriting");
                    String phoneNumberWorker = scanner.next();
                    System.out.println("Yashash manzilingizni kiriting");
                    String addresWorker = scanner.next();
                    System.out.println("Mutaxasisligingizni kiriting");
                    int msWorker = scanner.nextInt();
                    System.out.println("Yoshingizni kiriting");
                    byte ageWorker = scanner.nextByte();
                    workers.add(new Worker(nameWorker, surnameWorker, phoneNumberWorker, addresWorker, msWorker, ageWorker));
                    System.out.println("Save worker");
                    break;
                case 6:
                    getWorker1(workers);
                    break;

                case 7:
                    getWorker(workers);
                    System.out.println("Qaysi ishchini tahrirlaysiz");
                    int editWorker = scanner.nextInt();
                    int i = 0;
                    for (Worker worker1 : workers) {
                        i++;
                        if (editWorker == i) {
                            String oldName = worker.getName();
                            String oldSurname = worker.getLastname();
                            int oldPhoneNumber = worker.getPhoneNumber();
                            String oldLive = worker.getAddres();
                            String oldMs = worker.getMutaxasis();
                            byte oldAge = worker.getAge();
                            System.out.println("Ismni kiriting");
                            String newWname = scanner.next();
                            System.out.println("Familiyani kiriting");
                            String newSurnameWorker = scanner.next();
                            System.out.println("Telefon raqamni kiriting");
                            int newPhoneNumberWorker = scanner.nextInt();
                            System.out.println("Yashash manzilni kiriting");
                            String newAddresWorker = scanner.next();
                            System.out.println("Mutaxasisligni kiriting");
                            String newMsWorker = scanner.next();
                            System.out.println("Yoshni kiriting");
                            byte newAge = scanner.nextByte();
                            worker.setName(newWname);
                            worker.setLastname(newSurnameWorker);
                            worker.setPhoneNumber(newPhoneNumberWorker);
                            worker.setAddres(newAddresWorker);
                            worker.setMutaxasis(newMsWorker);
                            worker.setAge(newAge);
                            System.out.println("Edit Worker");
                            break;
                        }
                    }
                case 8:
                    getWorker1(workers);
                    System.out.println("Qaysi ishchini o'chirasiz");
                    int deleteWorker = scanner.nextInt();
                    workers.remove(deleteWorker - 1).getName();
                    System.out.println("Delete worker");
                    break;

                case 9:
                    System.out.println("Mahsulot nomini kiriting");
                    String nameProduct = scanner.next();
                    System.out.println("Mahsulot turini kiriting");
                    String typeProduct = scanner.next();
                    System.out.println("Mahsulot qayerda ishlab chiqarilgan");
                    String madeInProduct = scanner.next();
                    System.out.println("Mahsulot narxini kiriting");
                    int priceProduct = scanner.nextInt();
                    products.add(new Product(nameProduct, typeProduct, madeInProduct, priceProduct));
                    System.out.println("Save product");
                    break;

                case 10:
                    getProduct(products);
                    break;
                case 11:
                    getProduct(products);
                    System.out.println("Mahsulotni tanlang");
                    int chooseProduct = scanner.nextInt();
                    products.remove(chooseProduct - 1).getName();
                    System.out.println("Delete product");

                case 12:
                    System.out.println("Do'kon nomini kiriting");
                    String nameMarket = scanner.next();
                    System.out.println("Do'kon manzilini kiriting");
                    String addresMarket = scanner.next();
                    System.out.println("Telefon raqamni kiriting");
                    int phoneNumberMarket = scanner.nextInt();
                    markets.add(new Market(nameMarket, addresMarket, phoneNumberMarket));
                    System.out.println("Save market");
                    break;

                case 13:
                    getMarket(markets);
                    System.out.println("Do'konni tanlang");
                    int chooseMarket = scanner.nextInt();
                    markets.remove(chooseMarket - 1).getName();
                    System.out.println("Delete market");

                case 14:
                    getMarket(markets);
                    System.out.println("Do'konni tanlang");
                    int choseMarket = scanner.nextInt();
                    int k = 0;
                    for (Market market1 : markets) {
                        k++;
                        if (choseMarket == k) {
                            String oldNameMarket = market.getName();
                            System.out.println("Nomni kiriting");
                            String newNameMarket = scanner.next();
                            String oldAddresMarket = market.getAddres();
                            System.out.println("Adresni kiriting");
                            String newAddresMarket = scanner.next();
                            int oldPhoneNumberMarket = market.getNumber();
                            System.out.println("Raqamni kiriting");
                            int newPhoneNumberMarket = scanner.nextInt();
                            market.setName(newNameMarket);
                            market.setAddres(newAddresMarket);
                            market.setNumber(newPhoneNumberMarket);
                            System.out.println("Edit market");
                            break;
                        }
                    }
                case 15:
                    getMarket(markets);
                    break;

                case 16:
                    getWorker1(workers);
                    System.out.println("Tanlang");
                    int choose = scanner.nextInt();
                    getFabrica(fabricas);
                    System.out.println("Fabrikani tanlang");
                    int chooseFabrica = scanner.nextInt();
                    fabricas.get(chooseFabrica - 1).addWorekerInFabrica(workers.get(choose - 1));
                    break;

                case 17:
                    getProduct(products);
                    System.out.println("Mahsulotni tanlang");
                    int chooseProduct1 = scanner.nextInt();
                    getMarket(markets);
                    System.out.println("Do'konni tanlang");
                    int chooseMarket1 = scanner.nextInt();
                    markets.get(chooseMarket1 - 1).addProductInMarket(products.get(chooseProduct1 - 1));
                    break;

                case 18:
                    getFabrica(fabricas);
                    System.out.println("Fabrikani tanlang");
                    int tanala = scanner.nextInt();
                    int a = 0;
                    for (Fabrica fabrica1 : fabricas) {
                        a++;
                        if (tanala == a) {
                            getWorker(workers);
                            System.out.println("Ishchini tanlang");
                            int chooseWorker = scanner.nextInt();
                            int m = 0;
                            for (Worker worker1 : fabrica.getWorkers()) {
                                m++;
                                if (chooseWorker == m) {
                                    workers.remove(worker);
                                    fabrica.getWorkers().remove(worker);
                                    System.out.println("O'chirildi");
                                    break;
                                }
                            }
                        }
                    }
            }

        }

    }

    public static void getFabrica(List<Fabrica> fabricas) {
        int l = 0;
        for (Fabrica fabrica : fabricas) {
            l++;
            System.out.println(l + " " + fabrica.getName() + " " + ">>>" + " " + fabrica.getAddres());
        }
    }

    public static void getWorker(List<Worker> workers) {
        for (Worker worker : workers) {
            int n = 0;
            for (Worker worker1 : workers) {
                n++;
                System.out.println(n);
                System.out.println("Ism" + " " + worker.getName());
                System.out.println("Familiya" + " " + worker.getLastname());
                System.out.println("Mutaxasislik" + " " + worker.getMutaxasis());
                System.out.println("Yashash manzil" + " " + worker.getAddres());
                System.out.println("Yosh" + " " + worker.getAge());
                System.out.println("Telefon raqam" + " " + worker.getPhoneNumber());
                System.out.println(" ");
            }
        }
    }

    public static void getWorker1(List<Worker> workers) {
        int ch = 0;
        for (Worker worker : workers) {
            ch++;
            System.out.println(ch + " " + worker.getName());
        }
    }

    public static void getProduct(List<Product> products) {
        int b = 0;
        for (Product product : products) {
            b++;
            System.out.println(b);
            System.out.println("Name" + " " + product.getName());
            System.out.println("Price" + " " + product.getPrice());
            System.out.println("Type" + " " + product.getType());
            System.out.println("Made in" + " " + product.getMadeIn());
        }
    }

    public static void getMarket(List<Market> markets) {
        int e = 0;
        for (Market market : markets) {
            e++;
            System.out.println(e);
            System.out.println("Name" + " " + market.getName());
            System.out.println("Adres" + " " + market.getAddres());
            System.out.println("PhoneNumber" + " " + market.getNumber());
        }
    }
}
