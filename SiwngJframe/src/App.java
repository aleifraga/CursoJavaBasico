import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) throws Exception {
        
        JFrame janela = new JFrame();
        
        JLabel labelUsuario = new JLabel("Usuário: ");
        labelUsuario.setBounds(50, 50, 100, 30);
        JTextField campoUsuario = new JTextField();
        campoUsuario.setBounds(150, 50, 200, 30);


        JLabel labelSenha = new  JLabel("Senha: ");
        labelSenha.setBounds(50, 100, 100, 30);
        JPasswordField campoSenha = new JPasswordField();
        campoSenha.setBounds(150, 100, 200, 30);

        

        // adicionando um botão
        JButton botaoLogar = new JButton("Login");
        botaoLogar.setBounds(150, 150, 100, 30);
        botaoLogar.addActionListener( new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUsuario.getText();
                String senha = new String(campoSenha.getPassword());
                System.out.println("Botão clicado!");
                System.out.println("Usuário: " + usuario);
                System.out.println("Senha: " + senha);
                campoUsuario.setText("");
                campoSenha.setText("");
            }
            
        });

        
        janela.add(botaoLogar);
        janela.add(labelUsuario);
        janela.add(campoUsuario);
        janela.add(labelSenha);
        janela.add(campoSenha);
        
        janela.setLayout(null);
        
        // tamanho da janela
        janela.setBounds(760, 240, 400, 600);

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
