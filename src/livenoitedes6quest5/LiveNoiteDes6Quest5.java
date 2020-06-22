package livenoitedes6quest5;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class LiveNoiteDes6Quest5 {

    /**
     * Escrever um algoritmo que leia N, inteiro e positivo, e calcule e mostre
     * o termo de ordem N da sucessão abaixo: ordem: 1 2 3 4 5 6 7 8 termo: -1 0
     * 5 6 11 12 17 18
     */
    public static void main(String[] args) {
        int ordem, n, termo;
        termo = -1;
        String r1 = "Termo -> ", r2 = "Ordem ->";
        n = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor N"));
        for (ordem = 1; ordem <= n; ordem++) {
            r2 = r2 + "   " + ordem;
            r1 = r1 + "  " + termo;
            if (ordem % 2 != 0) {
                termo = termo + 1;

            } else {
                termo = termo + 5;

            }//fim do if

        }//fim do loop
        JOptionPane.showMessageDialog(null, r2+"\n"+r1);

    }

}
