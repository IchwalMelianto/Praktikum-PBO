package Tugas2;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaSwing{
    public static void main(String[] args) {
        GUI g = new GUI();
    }
}

class GUI extends JFrame implements ActionListener{
    JFrame f;
    
    JLabel lnama = new JLabel("Nama Lengkap");
    final JTextField fnama = new JTextField(30);
    
    JLabel lnim = new JLabel("NIM");
    final JTextField fnim = new JTextField(10);
    
    JLabel lkelamin = new JLabel("Jenis Kelamin");
    JRadioButton rblaki = new JRadioButton("Laki-Laki");
    JRadioButton rbperempuan = new JRadioButton("Perempuan");
    
    JLabel ltempatlahir = new JLabel("Kota Kelahiran");
    final JTextField ftempatlahir = new JTextField(20);
    
    JLabel lkotaasal = new JLabel("Kota Asal");
    final JTextField fkotaasal = new JTextField(20);
    
    JLabel lagama = new JLabel("Agama");
    String[] namaAgama = {"Islam","Kristen","Katolik","Hindu","Buddha"};
    JComboBox cmagama = new JComboBox(namaAgama);
    
    JLabel lhobi = new JLabel("Hobi");
    JCheckBox cbmusik = new JCheckBox("Musik");
    JCheckBox cbfotografi = new JCheckBox("Fotografi");
    JCheckBox cbfutsal = new JCheckBox("Futsal");
    JCheckBox cbbasket = new JCheckBox("Basket");
    JCheckBox cbbelajar = new JCheckBox("Belajar");
    
    JButton bsave = new JButton("Simpan");
    JButton breset = new JButton("Reset");
    JButton bkeluar = new JButton("Keluar");
            
    public GUI(){
        setTitle("Biodata Sederhana");
        setSize(380,400);
        
        ButtonGroup group = new ButtonGroup();
        group.add(rblaki);
        group.add(rbperempuan);
        
        setLayout(null);
        add(lnama);
        add(fnama);
        add(lnim);
        add(fnim);
        add(lkelamin);
        add(rblaki);
        add(rbperempuan);
        add(ltempatlahir);
        add(ftempatlahir);
        add(lkotaasal);
        add(fkotaasal);
        add(lagama);
        add(cmagama);
        add(lhobi);
        add(cbmusik);
        add(cbfotografi);
        add(cbfutsal);
        add(cbbasket);
        add(cbbelajar);
        add(bsave);
        add(breset);
        add(bkeluar);
        
        lnama.setBounds(20,10,120,20);
        fnama.setBounds(130,10,200,20);
        lnim.setBounds(20,35,120,20);
        fnim.setBounds(130,35,200,20);
        lkelamin.setBounds(20,60,120,20);
        rblaki.setBounds(130,60,100,20);
        rbperempuan.setBounds(230,60,100,20);
        ltempatlahir.setBounds(20,85,120,20);
        ftempatlahir.setBounds(130,85,200,20);
        lkotaasal.setBounds(20,110,120,20);
        fkotaasal.setBounds(130,110,200,20);
        lagama.setBounds(20,135,200,20);
        cmagama.setBounds(130,135,200,20);
        lhobi.setBounds(20,160,120,20);
        cbmusik.setBounds(130,160,100,20);
        cbfotografi.setBounds(230,160,100,20);
        cbfutsal.setBounds(130,180,100,20);
        cbbasket.setBounds(230,180,100,20);
        cbbelajar.setBounds(130,200,100,20);
        bsave.setBounds(130,250,120,20);
        breset.setBounds(130,280,120,20);
        bkeluar.setBounds(130,310,120,20);
        
        bsave.addActionListener(this);
        breset.addActionListener(this);
        bkeluar.addActionListener(this);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public void cekData(){
        
        System.out.println("\nRekaman Data Anda : ");
        System.out.print("Nama Lengkap\t: "+fnama.getText()+"\n");
        System.out.print("NIM\t\t: "+fnim.getText()+"\n");
        System.out.print("Kelamin\t\t: ");
        if(rblaki.isSelected()){
            System.out.println("Laki-Laki");
        }
        if (rbperempuan.isSelected()) {
            System.out.println("Perempuan");
        }
        System.out.print("Kota Kelahiran\t: "+ftempatlahir.getText()+"\n");
        System.out.print("Kota Asal\t: "+fkotaasal.getText()+"\n");
        System.out.print("Agama\t\t: "+cmagama.getItemAt(cmagama.getSelectedIndex())+"\n");
        System.out.print("Hobi\t\t: ");
        if(cbmusik.isSelected()){
            System.out.print("Musik ");
        }
        if(cbfotografi.isSelected()) {
            System.out.print("Fotografi ");
        }
        if(cbfutsal.isSelected()){
            System.out.print("Futsal ");
        }
        if(cbbasket.isSelected()) {
            System.out.print("Basket ");
        }
        if(cbbelajar.isSelected()) {
            System.out.print("Belajar ");
        }
        System.out.println("\n---------------------------------------------------------");
    
        
    }   

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == bsave){
            cekData();
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Halo, "+fnama.getText()+"\n" 
                    + "Data Anda Berhasil Disimpan\n\n");
        }
        if (event.getSource() == breset){
            fnama.setText("");
            fnim.setText("");
            ftempatlahir.setText("");
            fkotaasal.setText("");
        }
        if (event.getSource() == bkeluar) {
            int a=JOptionPane.showConfirmDialog(f,"Ingin Keluar?");  
            if(a==JOptionPane.YES_OPTION){  
                dispose();  
            }
            if(a==JOptionPane.NO_OPTION){  
                fnama.setText("");
                fnim.setText("");
                ftempatlahir.setText("");
                fkotaasal.setText("");  
            }
        }
    }
}
