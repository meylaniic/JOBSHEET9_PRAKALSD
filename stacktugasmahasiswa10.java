public class stacktugasmahasiswa10 {
    mahasiswa10[] stack;
    int top;
    int size;

    public stacktugasmahasiswa10(int size) {
        this.size = size;
        stack = new mahasiswa10[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }


    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(mahasiswa10 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public mahasiswa10 pop() {
        if (!isEmpty()) {
            mahasiswa10 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public mahasiswa10 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    } 

    public mahasiswa10 peekbottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            return null;
        }
    }

    public int jumlahtugas() {
        return top + 1;
    }

    public String konversidesimalkebiner(int nilai) {
        stackkonversi10 stack = new stackkonversi10();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
