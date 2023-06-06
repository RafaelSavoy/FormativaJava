package ArrayObjetos;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Agenda contatos[] = new Agenda[10];

        for (int i = 0; i < contatos.length; i++) {
            contatos[i] = new Agenda();
            contatos[i].setNome(JOptionPane.showInputDialog("Informe o nome do cliente"));
            contatos[i].setEndereco(JOptionPane.showInputDialog("Informe o endereco do cliente"));
            contatos[i].setIdade(Integer.parseInt(JOptionPane.showInputDialog("Insira a idade do cliente")));
        }
    }
}
