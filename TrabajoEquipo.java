import javax.swing.*;
public class TrabajoEquipo extends JFrame{
    private JLabel label1;
    public TrabajoEquipo() {
        setLayout(null);
        label1=new JLabel("Este Será un Trabajo En Equipo :)");
        label1.setBounds(20,30,300,40);
        add(label1);
    }
    
    public static void main(String[] ar) {
        TrabajoEquipo formulario1=new TrabajoEquipo();
        formulario1.setBounds(10,10,400,300);
        formulario1.setVisible(true);
    }
}

