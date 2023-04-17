package Recursividad;

import javax.swing.JOptionPane;

public class ContadorVocales {

    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog(null, "Introduce caracteres:");
        String resultado = contarVocales(str);
        JOptionPane.showMessageDialog(null, resultado);
    }

    public static String contarVocales(String str) {
        return contarVocalesHelper(str, 0, 0, 0, 0, 0, 0);
    }

    private static String contarVocalesHelper(String str, int ind, int aCount, int eCount, int iCount, int oCount, int uCount) {
        if (ind == str.length()) {
            return "a: " + aCount + "\n" +
                   "e: " + eCount + "\n" +
                   "i: " + iCount + "\n" +
                   "o: " + oCount + "\n" +
                   "u: " + uCount;
        }

        char c = Character.toLowerCase(str.charAt(ind));
        if (c == 'a') {
            return contarVocalesHelper(str, ind + 1, aCount + 1, eCount, iCount, oCount, uCount);
        } else if (c == 'e') {
            return contarVocalesHelper(str, ind + 1, aCount, eCount + 1, iCount, oCount, uCount);
        } else if (c == 'i') {
            return contarVocalesHelper(str, ind + 1, aCount, eCount, iCount + 1, oCount, uCount);
        } else if (c == 'o') {
            return contarVocalesHelper(str, ind + 1, aCount, eCount, iCount, oCount + 1, uCount);
        } else if (c == 'u') {
            return contarVocalesHelper(str, ind + 1, aCount, eCount, iCount, oCount, uCount + 1);
        } else {
            return contarVocalesHelper(str, ind + 1, aCount, eCount, iCount, oCount, uCount);
        }
    }
}
