import javax.swing.*;
import java.awt.Container;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class quartaTela extends JFrame implements ActionListener{
    private JButton btnCalcular;
    private JLabel lblPeso;
    private JTextField txtPeso;
    private JLabel lblAltura;
    private JTextField txtAltura;
    private JLabel lblResultado;
    private JLabel lblMSG;
    private JLabel lblIMC;
    private Container ctn;

    public quartaTela(){
        setSize(320,200);
        setTitle("Calculo IMC");
        ctn = getContentPane();
        ctn.setLayout(null);
        btnCalcular = new JButton("Calcular");
        lblAltura = new JLabel("Altura");
        txtAltura = new JTextField();
        lblPeso = new JLabel("Peso");
        txtPeso = new JTextField();
        lblIMC = new JLabel("Seu IMC é: ");
        lblMSG = new JLabel("Mensagem: ");
        lblResultado = new JLabel("--");
        lblAltura.setBounds(10,10,100,25);
        txtAltura.setBounds(50,10,100,25);
        lblPeso.setBounds(160, 10,100,25);
        txtPeso.setBounds(200,10,100,25);
        lblMSG.setBounds(10,70,120,25);
        lblResultado.setBounds(80,70,200,25);
        lblIMC.setBounds(10,50,120,25);
        btnCalcular.setBounds(110,110,100,30);
        ctn.add(lblAltura);
        ctn.add(txtAltura);
        ctn.add(lblPeso);
        ctn.add(txtPeso);
        ctn.add(lblResultado);
        ctn.add(lblIMC);
        ctn.add(btnCalcular);
        ctn.add(lblMSG);

        btnCalcular.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Calcular")) {
            float Peso = Float.parseFloat(txtPeso.getText());

            float Altura = Float.parseFloat(txtAltura.getText());

            float Resultado = Peso / (Altura * Altura);

            lblIMC.setText("Seu IMC é: " + String.format("%.2f", Resultado));

            if (Resultado >= 18.5 && Resultado <= 25){
                lblResultado.setText("Você está no Peso ideal");
            }
            else if(Resultado < 18.5){
                lblResultado.setText("Você está abaixo do peso ideal");
            }
            else if(Resultado > 25){
                lblResultado.setText("Você está acima do peso ideal");
            }

        }
    }

    public static void main(String[] args){
        quartaTela t4 = new quartaTela();
    }
}
