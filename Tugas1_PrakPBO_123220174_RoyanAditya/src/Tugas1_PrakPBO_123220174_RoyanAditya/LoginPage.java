/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas1_PrakPBO_123220174_RoyanAditya;


import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class Frame extends JFrame {
    
    JLabel tulisanbesar = new JLabel ("Selamat Datang!");
    JLabel tulisankecil = new JLabel ("Silakan Masuk Untuk Lanjutkan");
    JLabel labelusername = new JLabel ("Username");
    JTextField inputusername = new JTextField (); 
    JLabel labelpassword = new JLabel ("Password");
    JTextField inputpassword = new JTextField ();
    JLabel labeljenis = new JLabel ("Jenis Kelamin");
    JRadioButton pilihlaki = new JRadioButton ("Laki-Laki");
    JRadioButton pilihperempuan = new JRadioButton ("Perempuan");
    JButton buttonlogin = new JButton ("Login");
    
    Frame () {
        setVisible (true);
        setSize (720,550);
        setTitle ("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout (null);
        
        add(tulisanbesar);
        tulisanbesar.setBounds(40,20,300,35); 
        tulisanbesar.setFont (new Font ("Arial",Font.PLAIN,30));
        
        add (tulisankecil);
        tulisankecil.setBounds(40,55,300,35);
        tulisankecil.setFont (new Font ("Arial",Font.ITALIC,15));
        
        add (labelusername);
        labelusername.setBounds (40,90,300,35);
        labelusername.setFont(new Font ("Arial",Font.BOLD,15));
        
        add (inputusername);
        inputusername.setBounds (40,120,500,35);
        
        add (labelpassword);
        labelpassword.setBounds (40,170,300,35);
        labelpassword.setFont(new Font ("Arial",Font.BOLD,15));
        
        add (inputpassword);
        inputpassword.setBounds (40,200,500,35);
        
        add (labeljenis);
        labeljenis.setBounds (40,245,300,35);
        labeljenis.setFont(new Font ("Arial",Font.BOLD,15));
        
        add (pilihlaki);
        pilihlaki.setBounds (40,285,150,35);
        pilihlaki.setFont(new Font ("Arial",Font.BOLD,15));
        
        add (pilihperempuan);
        pilihperempuan.setBounds (250,285,150,35);
        pilihperempuan.setFont(new Font ("Arial",Font.BOLD,15));
        
        add (buttonlogin);
        buttonlogin.setBounds(40,340,500,35);
    }
}

/**
 *
 * @author adity
 */
public class LoginPage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Frame frame = new Frame (); 
    }
    
}
