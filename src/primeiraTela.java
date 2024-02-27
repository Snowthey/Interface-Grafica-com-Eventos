import javax.swing.*;
import java.awt.Container;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class primeiraTela extends JFrame implements ActionListener {
    private JButton btnOk;
    private JTextField txtNome;
    private JLabel lblNome;
    private Container ctn;

    public primeiraTela(){
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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        primeiraTela t1 = new primeiraTela();
    }

    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("Enviar")){
            txtNome.setText("Botão clicado");
        }
    }

}
