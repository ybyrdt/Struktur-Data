
package Pertemuan5;


public class ContohStack 
{
    static int maxSize = 5;
    static String[] stack = new String[maxSize];
    static int top = 0;

    // Push (Tambahkan data ke stack)
    static void push(String data) {
        if (top >= maxSize) {
            System.out.println("Stack penuh, tidak bisa menambah data.");
        } else {
            stack[top] = data;
            top++;
            System.out.println("Data \"" + data + "\" ditambahkan ke stack.");
        }
    }

    // Pop (Keluarkan data dari stack)
    static void pop() {
        if (top <= 0) {
            System.out.println("Stack kosong, tidak ada data yang bisa diambil.");
        } else {
            top--;
            System.out.println("Data \"" + stack[top] + "\" diambil dari stack.");
        }
    }

    // Display (Menampilkan isi stack)
    static void display() {
        System.out.println("Isi stack:");
        for (int i = top - 1; i >= 0; i--) {
            System.out.println("- " + stack[i]);
        }
        if (top == 0) {
            System.out.println("[Kosong]");
        }
    }

    public static void main(String[] args) {
        push("A");
        push("B");
        push("C");
        display(); 
        pop();   
        display();  
    }
}
