package jogodamemoria;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Memoria extends JFrame {
    JButton bt1 = new JButton();

    public Memoria() {
        super("Jogo da Memoria");
        
        
        setSize(1200, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(200,30,50));
        
        add(bt1);
        setLayout(null);
        bt1.setText("Fala tu");       
        bt1.setBounds(30, 100, 200, 200);
        JMenu nv = new JMenu("Nivel");
	JMenu con = new JMenu("Conta"); 
        JMenu sob = new JMenu("Sobre"); 
        JMenu ins = new JMenu("Instruções");         
        JMenu ext = new JMenu("Sair");
        
        JMenuItem sair = new JMenuItem("Sair"); 
	JMenuItem nv1 = new JMenuItem("Nivel 1");	
        JMenuItem nv2 = new JMenuItem("Nivel 2");
        JMenuItem nv3 = new JMenuItem("Nivel 3");
        JMenuItem sb = new JMenuItem("Como Jogar");
        JMenuItem ent = new JMenuItem("Entrar");
        JMenuItem cad = new JMenuItem("Cadastrar");
        
        nv.add(nv1);
        nv.add(nv2);
        nv.add(nv3);
        ext.add(sair);
        ins.add(sb);
        con.add(ent);
        con.add(cad);
        
        JMenuBar bar = new JMenuBar();
	       setJMenuBar(bar);
	       bar.add(con);
	       bar.add(sob); 
	       bar.add(ins); 
	       bar.add(nv); 
	       bar.add(ext); 
               
          
    }
    

        public void inicio() {
            
            
        }
    }
    
    

