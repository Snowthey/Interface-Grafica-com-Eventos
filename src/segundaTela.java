import javax.swing.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class segundaTela extends JFrame implements ActionListener{
    private JButton btnOk;
    private JTextField txtNome;
    private JLabel lblNome;
    private Container ctn;

    public segundaTela(){
        setSize(300,140);
        setTitle("Eventos do capeta");
        ctn = getContentPane();
        ctn.setLayout(null);
        btnOk = new JButton("Enviar");
        lblNome = new JLabel("Nome");
        txtNome = new JTextField();
        lblNome.setBounds(10,10,100,25);
        txtNome.setBounds(70,10,200,25);
        btnOk.setBounds(90,50,80,40);
        ctn.add(lblNome);
        ctn.add(txtNome);
        ctn.add(btnOk);

        btnOk.addActionListener(this);

        setVisible(true);
    }

    public static void main(String[] args){
        segundaTela t2 = new segundaTela();
    }

    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("Enviar")){
            int num1 = Integer.parseInt(txtNome.getText());
            int num2 = num1 + 10;

            txtNome.setText(Integer.toString(num2));
        }
    }
}
