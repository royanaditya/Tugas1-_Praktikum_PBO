/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1_PrakPBO_123220174_RoyanAditya;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Border extends JFrame {
    
    JLabel tulisanbesar = new JLabel ("Welcome,[Mr./Mrs.] [username]");
    JLabel tulisankecil = new JLabel ("Tentukan panjang,lebar,dan tinggi untuk menghitung balok");
    JLabel labelpanjang = new JLabel ("Panjang");
    JTextField inputpanjang = new JTextField ();
    JLabel labellebar = new JLabel ("Lebar");
    JTextField inputlebar = new JTextField ();
    JLabel labeltinggi = new JLabel ("Tinggi");
    JTextField inputtinggi = new JTextField ();
    JButton buttonhitung = new JButton ("Hitung");
    JButton buttonreset = new JButton ("Reset");
    JLabel labelhasil = new JLabel ("Hasil");
    JLabel labelluaspersegi = new JLabel ("Luas Persegi");
    JLabel hasilluaspersegi = new JLabel ("[Hasil berupa angka]");
    JLabel labelkelilingpersegi = new JLabel ("Keliling Persegi");
    JLabel hasilkelilingpersegi = new JLabel ("[Hasil berupa angka]");
    JLabel labelvolumebalok = new JLabel ("Volume Balok");
    JLabel hasilvolumebalok = new JLabel ("[Hasil berupa angka]");
    JLabel labellpbalok = new JLabel ("Luas Permukaan");
    JLabel hasillpbalok = new JLabel ("[Hasil berupa angka]");
    
    Border () {
        setVisible (true);
        setSize (720,625);
        setTitle ("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout (null); 
        
        add(tulisanbesar);
        tulisanbesar.setBounds(40,20,500,30); 
        tulisanbesar.setFont (new Font ("Arial",Font.PLAIN,25));
        
        add(tulisankecil);
        tulisankecil.setBounds(40,55,500,30); 
        tulisankecil.setFont (new Font ("Arial",Font.ITALIC,16));
        
        add (labelpanjang);
        labelpanjang.setBounds (40,100,150,30);
        labelpanjang.setFont (new Font ("Arial",Font.PLAIN,16));
        
        add (inputpanjang);
        inputpanjang.setBounds (150,100,500,30);
        
        add (labellebar);
        labellebar.setBounds (40,170,150,30);
        labellebar.setFont (new Font ("Arial",Font.PLAIN,16));
        
        add (inputlebar);
        inputlebar.setBounds (150,170,500,30);
        
        add (labeltinggi);
        labeltinggi.setBounds (40,250,150,30);
        labeltinggi.setFont (new Font ("Arial",Font.PLAIN,16));
        
        add (inputtinggi);
        inputtinggi.setBounds (150,250,500,30);
        
        add (buttonhitung);
        buttonhitung.setBounds(40,300,610,30);
        
        add (buttonreset);
        buttonreset.setBounds(40,335,610,30);
        
        add (labelhasil);
        labelhasil.setBounds(328,370,500,30);
        labelhasil.setFont (new Font ("Arial",Font.BOLD,16));
        
        add (labelluaspersegi);
        labelluaspersegi.setBounds(40,425,500,30);
        labelluaspersegi.setFont (new Font ("Arial",Font.BOLD,16));
        
        add (hasilluaspersegi);
        hasilluaspersegi.setBounds(300,425,500,30);
        hasilluaspersegi.setFont (new Font ("Arial",Font.BOLD,16));
        
        add (labelkelilingpersegi);
        labelkelilingpersegi.setBounds(40,460,500,30);
        labelkelilingpersegi.setFont (new Font ("Arial",Font.BOLD,16));
        
        add (hasilkelilingpersegi);
        hasilkelilingpersegi.setBounds(300,460,500,30);
        hasilkelilingpersegi.setFont (new Font ("Arial",Font.BOLD,16));
        
        add (labelvolumebalok);
        labelvolumebalok.setBounds(40,495,500,30);
        labelvolumebalok.setFont (new Font ("Arial",Font.BOLD,16));
        
        add (hasilvolumebalok);
        hasilvolumebalok.setBounds(300,495,500,30);
        hasilvolumebalok.setFont (new Font ("Arial",Font.BOLD,16));
        
        add (labellpbalok);
        labellpbalok.setBounds(40,530,500,30);
        labellpbalok.setFont (new Font ("Arial",Font.BOLD,16));
        
        add (hasillpbalok);
        hasillpbalok.setBounds(300,530,500,30); 
        hasillpbalok.setFont (new Font ("Arial",Font.BOLD,16));
    }
}

/**
 *
 * @author adity
 */

public class HalamanUtama {
    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        Border border = new Border ();
        
       
    } 
}
