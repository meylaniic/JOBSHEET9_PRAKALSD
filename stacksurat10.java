public class stacksurat10 {
    surat10[] stack;
    int top;
    int size;

    public stacksurat10(int size) {
        this.size = size;
        stack = new surat10[size];
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

    public void push(surat10 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh, tidak bisa menambahkan surat.");
        }
    }

    public surat10 pop() {
        if (!isEmpty()) {
            surat10 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! tidak ada surat untuk diproses.");
            return null;
        }
    }

    public surat10 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses");
            return null;
        }
    }

    public void carisurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namamahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan untuk " + nama);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak didtemukan surat atas nama " +nama);
        }
    }

    
}
