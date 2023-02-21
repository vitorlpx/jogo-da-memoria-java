package jogodamemoria;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import jogodamemoria.ControleBotoesSelecionados;
import jogodamemoria.EstadosBotoes;
import jogodamemoria.Menu;
public class TelaPrincipal extends JFrame{
    Personagens vai = new Personagens(); 
    private static final int QUANTIDADE_JOGADAS = 2;
    private int jogadas = 0;
    
    private JPanel painel;
    
    private List<ControleBotoesSelecionados> listaControle;
    
    private List<ControleBotoesSelecionados> listaSelecionados;
    
    private ActionListener acaoBotoes;
    
    private JButton Reiniciar;
    
    private ImageIcon acerto;
    
    private String name;
    
    private String hist;
    
    public int quem;
    
    int modo;
    
    
     
    
     ImageIcon fundo = new ImageIcon("C:\\Users\\bibop\\OneDrive\\Documentos\\NetBeansProjects\\jogodamemoria\\src\\jogodamemoria\\Back.jpg");
     ImageIcon virada = new ImageIcon("C:\\Users\\bibop\\OneDrive\\Documentos\\NetBeansProjects\\jogodamemoria\\src\\jogodamemoria\\Carta.png");
     ImageIcon Nikola = new ImageIcon("C:\\Users\\bibop\\OneDrive\\Documentos\\NetBeansProjects\\jogodamemoria\\src\\jogodamemoria\\Nikola.png");
     ImageIcon darwin = new ImageIcon("C:\\Users\\bibop\\OneDrive\\Documentos\\NetBeansProjects\\jogodamemoria\\src\\jogodamemoria\\Dawin.png");
     ImageIcon rene = new ImageIcon("C:\\Users\\bibop\\OneDrive\\Documentos\\NetBeansProjects\\jogodamemoria\\src\\jogodamemoria\\René.png");
     ImageIcon Eins = new ImageIcon("C:\\Users\\bibop\\OneDrive\\Documentos\\NetBeansProjects\\jogodamemoria\\src\\jogodamemoria\\Einstein.png");
     ImageIcon Turn = new ImageIcon("C:\\Users\\bibop\\OneDrive\\Documentos\\NetBeansProjects\\jogodamemoria\\src\\jogodamemoria\\Turing.png");
     ImageIcon Stev = new ImageIcon("C:\\Users\\bibop\\OneDrive\\Documentos\\NetBeansProjects\\jogodamemoria\\src\\jogodamemoria\\Steve.png");
     ImageIcon Leo = new ImageIcon("C:\\Users\\bibop\\OneDrive\\Documentos\\NetBeansProjects\\jogodamemoria\\src\\jogodamemoria\\DaVinci.png");
     ImageIcon Goodal = new ImageIcon("C:\\Users\\bibop\\OneDrive\\Documentos\\NetBeansProjects\\jogodamemoria\\src\\jogodamemoria\\Goodall.png");
     ImageIcon costa = new ImageIcon("C:\\Users\\bibop\\OneDrive\\Documentos\\NetBeansProjects\\jogodamemoria\\src\\jogodamemoria\\Costeau.png");
     ImageIcon nik = new ImageIcon("C:\\Users\\bibop\\OneDrive\\Documentos\\NetBeansProjects\\jogodamemoria\\src\\jogodamemoria\\NikolaImg.png");
     ImageIcon text = new ImageIcon("C:\\Users\\bibop\\OneDrive\\Documentos\\NetBeansProjects\\jogodamemoria\\src\\jogodamemoria\\Text.jpg");
     int n;
    String[] poss={"Facil","Medio","Dificil"};
    Font fonte1 = new Font("Verdana",Font.BOLD,24);
    Font fonte2 = new Font("Verdana",Font.ITALIC,12);
    
    public TelaPrincipal(){
        super("Jogo da Memoria");
    
        listaControle = new ArrayList<>();
        listaSelecionados = new ArrayList<>();
        
        // Evento dos botões
        acaoBotoes = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton botao = (JButton) e.getSource();
                n=1;
                for (ControleBotoesSelecionados cont : listaControle) {
                    if (cont.getReferenciaBotoes().get(botao) != null) {
                        jogadas++;
                        cont.executarAcaoBotoes((JButton) e.getSource(), EstadosBotoes.SELECIONADO);
                        
                        // Controle de inclusão
                        if (!listaSelecionados.contains(cont)) {
                            listaSelecionados.add(cont);
                        }
                        System.out.println(listaSelecionados.size());
                        if (jogadas == QUANTIDADE_JOGADAS) {
                            // Acabaram as jogadas
                            if (listaSelecionados.size() > 1) {
                                // Deixar os botões com estado inicial
                                for (ControleBotoesSelecionados cbs : listaSelecionados) {
                                    cbs.zerarSelecoes();
                                }
                            } 
                            jogadas = 0;
                            listaSelecionados.clear();
                        }
                       
                        break;
                    }
                }
                
            }
        };
          
        painel = new JPanel();
        this.add(painel);
        painel.setLayout(null);
       
        Reiniciar= new JButton("Reiniciar");
        painel.add(Reiniciar);
        Reiniciar.setBounds(530,600,100,50); 
        Reiniciar.setBackground(new java.awt.Color(0, 0, 0));
        Reiniciar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Reiniciar.setForeground(new java.awt.Color(255, 255, 255));
        Reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReiniciarActionPerformed(evt);
            }
        });
        
       Complemento();
        
        setSize(1200, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        BufferedImage img;

        try {
            img = ImageIO.read(new File("C:\\Users\\bibop\\OneDrive\\Documentos\\NetBeansProjects\\jogodamemoria\\src\\jogodamemoria\\Back.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        
        
        
	JMenu con = new JMenu("Conta"); 
        JMenu sob = new JMenu("Sobre"); 
        JMenu ins = new JMenu("Instruções");         
        JMenu ext = new JMenu("Sair");
        
        JMenuItem sair = new JMenuItem("Voltar ao Menu");
        JMenuItem sb = new JMenuItem("Sobre");
        JMenuItem ent = new JMenuItem("Entrar");
        JMenuItem cad = new JMenuItem("Cadastrar");
        
        
        
        
        ext.add(sair);
        sob.add(sb);
        con.add(ent);
        con.add(cad);
        
        sair.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            Menu a1 = new Menu();
            a1.setVisible(true);
            setVisible(false);
        
        }
});
        sb.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            Sobre a1 = new Sobre();
            a1.setVisible(true);
            
        
        }
});
                
        JMenuBar bar = new JMenuBar();
	       setJMenuBar(bar);
	       bar.add(con);
	       bar.add(sob); 
	       bar.add(ins);  
	       bar.add(ext); 
         
    
    }
    
    
    public void criarJogo(int qtPares) {
        
        // Quantidade de botões
        ControleBotoesSelecionados controle = null;
       
        modo=qtPares;
        
        List<Rectangle> posicionamentos = new ArrayList<>();
        int posX = 185;
        int posY = 60;
        
        Random rand = new Random();
        int j = 0;
        int i = 0;
        int p = 0;
        for (i = 0; i < (qtPares * 2); i++) {
            // Randomizar o posicionamento dos botões
            
            Rectangle rec = new Rectangle(posX, posY, 110, 110);
            posicionamentos.add(rec);
            
            
            if(p < 6){
            if (i % 5 == 0 && i > 0) {
                posY += 135;
                posX = 185;
            } 
            else {
                posX += 135;
            }}
            if(p >= 6 && p < 12){
            if (i % 11 == 0 && i > 6) {
                posY += 135;
                posX = 185;
                
            } else {
                posX += 135;
            }}
            if(p >= 12 && p < 18){
            if (i % 17 == 0 && i > 11) {
                posY = 200;
                posX = 185;
                
            } 
            else {
                posX += 135;
            }}
            
            p++;
        }
        
        for (i = 0; i < (qtPares * 2); i++) {
            if (i % 2 == 0) {
                // Quantidade de controladores
                j++;
                controle = new ControleBotoesSelecionados();
                if(j == 1){
                controle.setImg(Nikola);
                quem=1;
                }
                if(j == 2){
                controle.setImg(darwin);
                }
                if(j == 3){
                controle.setImg(rene);
                }
                if(j == 4){
                controle.setImg(costa);
                }
                if(j == 5){
                controle.setImg(Goodal);
                }
                if(j == 6){
                controle.setImg(Turn);
                }
                if(j == 7){
                controle.setImg(Stev);
                }
                if(j == 8){
                controle.setImg(Leo);
                }
                if(j == 9){
                controle.setImg(Eins);
                }
                
                this.listaControle.add(controle);
                
            }
            JButton botao = new JButton(virada);
            // Colocar os botões na tela
            this.painel.add(botao);
            botao.addActionListener(this.acaoBotoes);
            botao.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
            // Adicionar posição
            int pos = rand.nextInt(((posicionamentos.size() - 1) > 0) ? posicionamentos.size() - 1 : 1);
            
            botao.setBounds(posicionamentos.get(pos));
            posicionamentos.remove(pos);
            
            
            
            controle.adicionarBotao(botao);
            botao.setVisible(true);
            
            
        }
            
        
        // Adaptar o tamanho da tela
        
        
        
    }
    private void ReiniciarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
            
        Menu a1 = new Menu();
        setVisible(false);
        a1.NovoJogo(modo);
        
        
        
    }  

    public ImageIcon getAcerto() {
        return acerto;
    }

    public void setAcerto(ImageIcon acerto) {
        this.acerto = acerto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "Nikola";
    }

    public String getHist() {
        return hist;
    }

    public void setHist(String hist) {
        this.hist = "Ele existiu";
    }
    


    private void Complemento(){
        
        
    
    
    

    JLabel back = new JLabel(fundo);
    back.setBounds(0,0,1200,800);  
    painel.add(back);
    this.setVisible(true);}
}

