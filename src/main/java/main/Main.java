package main;

import huffman.Huffman;
import huffman.IHuffman;

public class Main {

    public static void main(String[] args) {
        IHuffman huffman = new Huffman();

        huffman.encode("DAFDBDCADACBEDDECACDDABDABDBDD");

        var r = huffman.decode();

        System.out.println(r);

        if (r.equals("011110000110010111101111011101001001001101111101001111100111110011000")) {
            System.out.println("Correto!");
        }
        else {
            System.out.println("Errado!");
        }
    }
}
