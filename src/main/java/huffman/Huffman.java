package huffman;

import java.util.Objects;

public class Huffman implements IHuffman {

    private NoHuffman raiz;
    private ILista<NoHuffman> lista;

    private static class NoHuffman {
        public int frequencia;
        public Character carac;
        public NoHuffman esq;
        public NoHuffman dir;

        public NoHuffman(int freq, Character carac,
                         NoHuffman esq, NoHuffman dir) {
            this.frequencia = freq;
            this.carac = carac;
            this.esq = esq;
            this.dir = dir;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || (! (o instanceof NoHuffman)))
                return false;
            NoHuffman noHuffman = (NoHuffman) o;
            return carac == noHuffman.carac;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(carac);
        }
    }

    public Huffman() {
    }

    @Override
    public void encode(String s) {
        // TODO
    }

    @Override
    public String decode() {
        // TODO
        return "";
    }
}
