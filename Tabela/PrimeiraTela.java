package aula2910;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PrimeiraTela extends JFrame {
	JLabel lblNome = new JLabel ("Nome:");
	JLabel lblend = new JLabel ("Endereço:");
	JLabel lbltel = new JLabel ("Telefone:");
	JLabel lblrg = new JLabel ("RG");
	JLabel lblci = new JLabel ("Cidade");
	JTextField txtNome = new JTextField();
	JTextField txtend = new JTextField();
	JTextField txttel = new JTextField();
	JTextField txtrg = new JTextField();
	JTextField txtci = new JTextField();
	
	public PrimeiraTela() {
		super("Titulo da Minha Janela");
        
		Container paine = this.getContentPane(); 
	
	    paine.add(lblNome);
	    lblNome.setBounds(20,20,100,20);
	    
	    paine.add(txtNome);
	    txtNome.setBounds(130,20,200,20);
	   
	    paine.add(lblend);
	    lblend.setBounds(20,50,100,20);
	    
	    paine.add(txtend);
	    txtend.setBounds(130,50,200,20);
	    
	    paine.add(lbltel);
	    lbltel.setBounds(20,80, 200,20);
	    
	    paine.add(txttel);
	    txttel.setBounds(130, 80, 200, 20);
	    
	    paine.add(lblrg);
	    lblrg.setBounds(20,110,100,20);
	    
	    paine.add(txtrg);
	    txtrg.setBounds(130, 110, 200,20);
	    
	    paine.add(lblci);
	    lblci.setBounds(20,140, 100, 20);
	    
	    paine.add(txtci);
	    txtci.setBounds(130, 140, 200,20);
	    
	    
	    
	    this.setLayout(null);
	    this.setSize(400,400);
	    
	    this.setVisible(true);
	    
	}
        public static void main(String args[]) {
        	PrimeiraTela Tela = new PrimeiraTela();
        }
        
}
