package somatoria;

import javax.swing.JOptionPane;

public class Somatoria {
    public static void main(String[] args) {
        
        String PrimeiroNumero = JOptionPane.showInputDialog("Digite o primeiro número");
        String SegundoNumero = JOptionPane.showInputDialog("Digite o segundo número");
      
        int numero1 = Integer.parseInt(PrimeiroNumero);
        int numero2 = Integer.parseInt(SegundoNumero);
     
         int soma = numero1 + numero2;
     
        JOptionPane.showMessageDialog(null,"A soma dos dois numero inteiros é: " + soma);
    }   
}
