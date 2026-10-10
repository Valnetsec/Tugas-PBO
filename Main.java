import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //manual
        Bentuk test = new Bentuk("Orange");
        test.printInfo();

        BujurSangkar test2 = new BujurSangkar(8, "Broken White");
        test2.printInfo();

        Lingkaran test3 = new Lingkaran(9, "Black");
        test3.printInfo();

        int opsi = -1;
        while(opsi != 0){
            System.out.println(" ==================\n    DATA BENTUK \n ==================");
            System.out.println("1. Bujur Sangkar");
            System.out.println("2. Lingkaran");
            System.out.println("3. Silinder");
            System.out.println("0. Keluar");
            System.out.print("Pilih Bentuk: ");
            opsi = input.nextInt();
            input.nextLine();

            switch(opsi){
                case 1:{
                    System.out.print("Masukkan warna: ");
                    String Warna = input.nextLine();
                    System.out.print("Masukkan sisi: ");
                    double sisi = input.nextDouble();
                    input.nextLine();

                    BujurSangkar tesbs = new BujurSangkar(sisi, Warna);
                    tesbs.printInfo();
                    break;
                }
                case 2:{
                    System.out.print("Masukkan warna: ");
                    String Warna = input.nextLine();
                    System.out.print("Masukkan radius: ");
                    double radius = input.nextDouble();
                    input.nextLine();

                    Lingkaran tesL = new Lingkaran(radius, Warna);
                    tesL.printInfo();
                    break;
                }
                case 3:{
                    System.out.print("Masukkan warna: ");
                    String Warna = input.nextLine();
                    System.out.print("Masukkan radius: ");
                    Double radius = input.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    Double tinggi = input.nextDouble();
                    input.nextLine();

                    Silinder tesS = new Silinder(tinggi, radius, Warna);
                    tesS.printInfo();
                    break;
                }
                case 0:{
                    System.out.println(" -- PROGRAM BERAKHIR --");
                    break;
                }
                default: System.out.println("Pilihan anda tidak valid");
            }
        }
        input.close();
    }
}
