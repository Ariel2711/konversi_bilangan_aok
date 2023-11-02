import java.util.Scanner;

public class KonversiBilangan {
    public static void main(String[] args) throws Exception {
        System.out.println("Program Konversi Bilangan\n");
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        while(true){
            pilihan = pilihMenu(scanner);

            if(pilihan == 1) {
                binerToDesimal(scanner);
                System.out.println();
            }
            else if(pilihan == 2) {
                desimalToBiner(scanner);
                System.out.println();
            }
            else if(pilihan == 3) {
                binerToHexa(scanner);
                System.out.println();
            }
            else if(pilihan == 4) {
                hexaToBiner(scanner);
                System.out.println();
            }
            else if(pilihan == 5) {
                desimalToHexa(scanner);
                System.out.println();
            }
            else if(pilihan == 6) {
                hexaToDesimal(scanner);
                System.out.println();
            }
            else if(pilihan == 7) break;
            else {
                System.out.println("Pilihan tidak valid");
                System.out.println();
            }
        }

        scanner.close();
    }

    public static int pilihMenu(Scanner scanner){
        System.out.println("Menu:");
        System.out.println("1. Biner ke Desimal");
        System.out.println("2. Desimal ke Biner");
        System.out.println("3. Biner ke Heksadesimal");
        System.out.println("4. Heksadesimal ke Biner");
        System.out.println("5. Desimal ke Heksadesimal");
        System.out.println("6. Heksadesimal ke Desimal");
        System.out.println("7. Keluar");

        System.out.print("Masukkan pilihan Anda : ");
        int pilihan = scanner.nextInt();
        System.out.println();
        
        return pilihan;
    }

    public static void binerToDesimal(Scanner scanner) {
        System.out.print("Masukkan bilangan biner : ");
        String biner = scanner.next();

        try {
            int desimal = Integer.parseInt(biner, 2);
            System.out.println("Hasil konversi ke bilangan desimal : " + desimal);
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. Pastikan Anda memasukkan bilangan biner yang benar.");
        }
    }

    public static void desimalToBiner(Scanner scanner) {
        System.out.print("Masukkan bilangan desimal : ");
        int desimal = scanner.nextInt();

        try{
            String biner = Integer.toBinaryString(desimal);
        System.out.println("Hasil konversi ke bilangan biner : " + biner);
        }catch (NumberFormatException e){
            System.out.println("Input tidak valid. Pastikan Anda memasukkan bilangan desimal yang benar.");
        }
    }

    public static void binerToHexa(Scanner scanner) {
        System.out.print("Masukkan bilangan biner : ");
        String biner = scanner.next();

        try {
            int desimal = Integer.parseInt(biner, 2);
            String hexa = Integer.toHexString(desimal);
            System.out.println("Hasil konversi ke bilangan heksadesimal : " + hexa.toUpperCase());
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. Pastikan Anda memasukkan bilangan biner yang benar.");
        }
    }

    public static void hexaToBiner(Scanner scanner) {
        System.out.print("Masukkan bilangan heksadesimal : ");
        String hexa = scanner.next();

        try {
            int desimal = Integer.parseInt(hexa, 16);
            String biner = Integer.toBinaryString(desimal);
            System.out.println("Hasil konversi ke bilangan biner : " + biner);
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. Pastikan Anda memasukkan bilangan heksadesimal yang benar.");
        }
    }

    public static void desimalToHexa(Scanner scanner) {
        System.out.print("Masukkan bilangan desimal : ");
        int desimal = scanner.nextInt();

        try{
            String hexa = Integer.toHexString(desimal);
            System.out.println("Hasil konversi ke bilangan heksadesimal : " + hexa.toUpperCase());
        }catch (NumberFormatException e){
            System.out.println("Input tidak valid. Pastikan Anda memasukkan bilangan desimal yang benar.");
        }
    }

    public static void hexaToDesimal(Scanner scanner) {
        System.out.print("Masukkan bilangan heksadesimal : ");
        String hexa = scanner.next();

        try {
            int desimal = Integer.parseInt(hexa, 16);
            System.out.println("Hasil konversi ke bilangan desimal: " + desimal);
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. Pastikan Anda memasukkan bilangan heksadesimal yang benar.");
        }
    }
}
