import javax.swing.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class primeiraTela2 extends JFrame{
    private JButton btnOk;
    private JTextField txtNome;
    private JLabel lblNome;
    private Container ctn;

    public primeiraTela2(){
        setSize(300,140);
        setTitle("Eventos em Java Swing");
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

        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                trataBotãoOk();
            }
        });

        setVisible(true);
}
    public void trataBotãoOk(){
        txtNome.setText("Botão clicado");
    }
    public static void main(String[] args){
        primeiraTela2 t2 = new primeiraTela2();
    }
}
