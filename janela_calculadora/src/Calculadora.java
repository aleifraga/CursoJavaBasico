import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        JFrame calculadora = new JFrame();

        JTextField campoA = new JTextField();
        campoA.setBounds(50, 50, 80, 30);

        JTextField campoB= new JTextField();
        campoB.setBounds(150, 50, 80, 30);

        JLabel labelSoma = new JLabel("+");
        labelSoma.setBounds(135, 50, 80, 30);

        JLabel labelResultado = new JLabel("0");
        labelResultado.setBounds(350, 50, 80, 30);

        JButton botaoIgual = new JButton("=");
        botaoIgual.setBounds(250, 50, 80, 30);
        botaoIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float valorA = Float.parseFloat(campoA.getText());
                float valorB = Float.parseFloat(campoB.getText());
                float resultado = valorA + valorB;
                labelResultado.setText(String.valueOf(resultado));
            }
        });    
        
        
        calculadora.add(campoB);
        calculadora.add(campoA);
        calculadora.add(labelSoma);
        calculadora.add(labelResultado);
        calculadora.add(botaoIgual);


        calculadora.setLayout(null);
        calculadora.setBounds(760, 240, 450, 200);
        calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculadora.setVisible(true);
    
    }
}
