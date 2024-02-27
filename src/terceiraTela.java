import javax.swing.*;
import java.awt.Container;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class terceiraTela extends JFrame implements ActionListener{
    private JButton btnCalcular;
    private JLabel lblNum1;
    private JTextField txtNum1;
    private JLabel lblNum2;
    private JTextField txtNum2;
    private JLabel lblPeso1;
    private JTextField txtPeso1;
    private JLabel lblPeso2;
    private JTextField txtPeso2;
    private JLabel lblResultado;
    private Container ctn;

    public terceiraTela(){
        setSize(410,270);
        setTitle("Funciona por favor");
        ctn = getContentPane();
        ctn.setLayout(null);
        btnCalcular = new JButton("Calcular");
        lblNum1 = new JLabel("Número 1");
        txtNum1 = new JTextField();
        lblNum2 = new JLabel("Número 2");
        txtNum2 = new JTextField();
        lblPeso1 = new JLabel("Peso 1");
        txtPeso1 = new JTextField();
        lblPeso2 = new JLabel("Peso 2");
        txtPeso2 = new JTextField();
        lblResultado = new JLabel("A média ponderada é: --");
        lblNum1.setBounds(10, 10,100,30);
        txtNum1.setBounds(80,10,100,30);
        lblNum2.setBounds(200,10,100,30);
        txtNum2.setBounds(280,10,100,30);
        lblPeso1.setBounds(10,70,100,30);
        txtPeso1.setBounds(80,70,100,30);
        lblPeso2.setBounds(200,70,100,30);
        txtPeso2.setBounds(280,70,100,30);
        btnCalcular.setBounds(150,130,100,30);
        lblResultado.setBounds(10,150,300,100);
        ctn.add(lblNum1);
        ctn.add(txtNum1);
        ctn.add(lblNum2);
        ctn.add(txtNum2);
        ctn.add(lblPeso1);
        ctn.add(txtPeso1);
        ctn.add(lblPeso2);
        ctn.add(txtPeso2);
        ctn.add(btnCalcular);
        ctn.add(lblResultado);

        btnCalcular.addActionListener(this);

        setVisible(true);
    }

    public static void main(String[] args){
        terceiraTela t3 = new terceiraTela();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Calcular")){
           float Num1 = Float.parseFloat(txtNum1.getText());
           float Num2 = Float.parseFloat(txtNum2.getText());
           float Peso1 = Float.parseFloat(txtPeso1.getText());
           float Peso2 = Float.parseFloat(txtPeso2.getText());

            float Resultado = ((Num1 * Peso1) +(Num2 * Peso2))/(Peso1 + Peso2);

            lblResultado.setText("A media Ponderada é: "+ Float.toString(Resultado));

        }

    }

}