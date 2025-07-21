/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 *
 * @author ACER
 */
import java.util.Stack;

public class stack_withlibrary {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Menambahkan elemen ke stack
        stack.push("Satu");
        stack.push("Dua");
        stack.push("Tiga");

        // Menampilkan isi stack
        System.out.println("Isi stack: " + stack);

        // Mengambil elemen teratas
        System.out.println("Peek: " + stack.peek());

        // Menghapus elemen teratas
        System.out.println("Pop: " + stack.pop());

        // Isi setelah pop
        System.out.println("Isi setelah pop: " + stack);
    }
}

