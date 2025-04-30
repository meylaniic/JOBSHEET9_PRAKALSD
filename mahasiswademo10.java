import java.util.Scanner;
public class mahasiswademo10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        stacktugasmahasiswa10 stack = new stacktugasmahasiswa10(5);

        int pilih;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Melihat Jumlah Tugas");
            System.out.print("pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = scan.nextLine();
                    mahasiswa10 mhs = new mahasiswa10(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    mahasiswa10 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasdinilai(nilai);
                        System.out.printf("Nilai tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversidesimalkebiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;
                case 3:
                    mahasiswa10 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    mahasiswa10 terbawah = stack.peekbottom();
                    if (terbawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + terbawah.nama);
                    } else {
                        System.out.println("Belum ada tugas yang dikumpulkan");
                    }
                    break;
                case 6:
                    int jumlah = stack.jumlahtugas();
                    System.out.print("Jumlah tugas yang sudah dikumpulkan: " + jumlah);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            } 

        } while (pilih >= 1 && pilih <= 6);
    }
}