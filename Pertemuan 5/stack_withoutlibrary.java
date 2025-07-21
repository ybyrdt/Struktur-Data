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
public class stack_withoutlibrary {
    private int maxSize;
    private String[] stackArray;
    private int top;

    public stack_withoutlibrary(int size) {
        maxSize = size;
        stackArray = new String[maxSize];
        top = -1; // posisi kosong awal
    }

    public void push(String value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public String pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        } else {
            return "Stack kosong!";
        }
    }

    public String peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            return "Stack kosong!";
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void printStack() {
        System.out.print("Isi stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        stack_withoutlibrary myStack = new stack_withoutlibrary(5);

        myStack.push("Satu");
        myStack.push("Dua");
        myStack.push("Tiga");

        myStack.printStack();          // Cetak stack
        System.out.println("Peek: " + myStack.peek());
        System.out.println("Pop: " + myStack.pop());
        myStack.printStack();
    }
}
