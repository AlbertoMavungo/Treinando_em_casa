import java.security.KeyStore.PasswordProtection;

import javax.swing.JOptionPane;;
public class Soma {
    public static void main(String[] v) {
       // DECLARAÇÃO DE VARIÁVEIS
       //float (4 bytes) ou double (8 bytes)
       double n1, n2, resp;

       //ENTRADA DE DADOS
       //Classes empacotadoras
       //int: Intenger
       //double: Double
       //float: Float
       //char: Character
       n1 = Double.parseDouble(JOptionPane.showInputDialog("digite o primeiro número"));
       n2 = Double.parseDouble(JOptionPane.showInputDialog("digite o segundo némero"));

       //PROCESSAMENTO
       resp = n1+ n2;
       //SAÍDA
       //JOptionPane.showMessageDialog(null, resp);
       //String s = n1 + " + " + n2 + " = " + resp;
      // JOptionPane.showMessageDialog(null, s);
      // Exibir de uma forma melhor isso (Resultado: 3)
      String s = String.format(
          "Resultado: %.2f.", resp);
      //EXERCÍCIOS
      //construa a string a + b = c usando String.format. Cada número deve ter 2 casas decimais  
      double b1, b2, c;
      b1 = Double.parseDouble(JOptionPane.showInputDialog("insere o valor 1"));  
      b2 = Double.parseDouble(JOptionPane.showInputDialog("insere o valor 2")); 
      c = b1+b2;
      String s = String.format("%.2f + %.2f = %.2f", b1,b2,c);
          JOptionPane.showMessageDialog(null, s);
          //OU TUDO DENTRO DO JOptionPane
          //JOptionPane.showMessageDialog(null, String.format("%.2f + %.2f = %.2f", b1,b2,c));
    }
    
}
