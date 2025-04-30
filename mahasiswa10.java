public class mahasiswa10 {
    String nim;
    String nama;
    String kelas;
    int nilai;
    
    public mahasiswa10(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasdinilai(int nilai) {
        this.nilai = nilai;
    }
}