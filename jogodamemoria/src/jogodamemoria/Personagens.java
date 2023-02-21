/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogodamemoria;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author bibop
 */
public class Personagens {
    ImageIcon virada = new ImageIcon("C:\\Users\\bibop\\OneDrive\\Documentos\\NetBeansProjects\\jogodamemoria\\src\\jogodamemoria\\Carta.png");
     ImageIcon Nikola = new ImageIcon("C:\\Users\\bibop\\OneDrive\\Documentos\\NetBeansProjects\\jogodamemoria\\src\\jogodamemoria\\Nikola.png");
     ImageIcon darwin = new ImageIcon("C:\\Users\\bibop\\OneDrive\\Documentos\\NetBeansProjects\\jogodamemoria\\src\\jogodamemoria\\Dawin.png");
     ImageIcon rene = new ImageIcon("C:\\Users\\bibop\\OneDrive\\Documentos\\NetBeansProjects\\jogodamemoria\\src\\jogodamemoria\\René.png");
     ImageIcon nik = new ImageIcon("C:\\Users\\bibop\\OneDrive\\Documentos\\NetBeansProjects\\jogodamemoria\\src\\jogodamemoria\\NikolaImg.png");
     

    Font fonte1 = new Font("Verdana",Font.BOLD,24);
    Font fonte2 = new Font("Verdana",Font.ITALIC,12);

    
    
    public String SeparaTxt(String texto){
      return "<html><p>"+texto+"</p></html>";
  }   
    public void entrada(JPanel painel, int g){
        if(g==1){
        JLabel foto = new JLabel(nik);
        JLabel nome = new JLabel();
        JLabel historia = new JLabel();
        
        foto.setBounds(785, 90, 254, 335);
        
        nome.setFont(fonte1);
        nome.setText("Nikola-Tesla");
        nome.setHorizontalAlignment(SwingConstants.CENTER);
        nome.setBounds(810,20,200,100);
        
        historia.setFont(fonte2);
        historia.setText(SeparaTxt("Nikola Tesla foi um inventor austríaco que se dedicou à criação de tecnologias nos ramos da Engenharia Mecânica e da Eletricidade. Nasceu na aldeia Smiljan, em 1858, durante o Império Austríaco e, desde criança, era incentivado a desenvolver raciocínio lógico e a aprimorar a sua concentração e memória."));
        historia.setHorizontalAlignment(SwingConstants.LEFT);
        historia.setBounds(785, 430, 254, 160);
        
        painel.add(foto);
        painel.add(nome);
        painel.add(historia);
        }
            
        

    }
    public void vitoria(int h){
        if(h == 2){
        
        System.out.println("Olha"+g);
        }
    }
}
