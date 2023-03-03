package processoseletivo;

import javax.swing.JOptionPane;

public class pergunta5 {

    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog(null, "Digite uma frase: ");
        String fraseInvertida = new StringBuilder(frase).reverse().toString();
        System.out.println(fraseInvertida);
//ou
        JOptionPane.showMessageDialog(null, fraseInvertida);
    }

}
