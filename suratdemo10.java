import java.util.Scanner;

public class suratdemo10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        stacksurat10 stack = new stacksurat10(10);

        int pilih;
        do { 
            System.out.println("\nMenu");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin");
            System.out.print("Pilih menu : ");
            pilih= scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                System.out.print("ID Surat: ");
                String id = scan.nextLine();
                System.out.print("Nama Mahasiswa: ");
                String nama = scan.nextLine();
                System.out.print("Kelas: ");
                String kelas = scan.nextLine();
                System.out.print("Jenis Izin (S/I): ");
                char jenis = scan.nextLine().charAt(0);
                System.out.print("Durasi (hari): ");
                int durasi = scan.nextInt(); scan.nextLine();
                surat10 surat = new surat10(id, nama, kelas, jenis, durasi);
                stack.push(surat);
                break;
            
                case 2:
                surat10 diproses = stack.pop();
                if (diproses != null) {
                    System.out.println("Memproses surat dari: " + diproses.namamahasiswa);
                }
                break;
                case 3:
                surat10 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir dari: " + terakhir.namamahasiswa);
                    } else {
                        System.out.println("Belum ada surat yang masuk.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cari = scan.nextLine();
                    stack.carisurat(cari);
                    break;
            }
        } while (pilih >=1 && pilih <= 4);
    }
}
