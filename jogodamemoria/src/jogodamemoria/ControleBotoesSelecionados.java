package jogodamemoria;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import jogodamemoria.EstadosBotoes;

public class ControleBotoesSelecionados {
    ImageIcon virada = new ImageIcon("C:\\Users\\bibop\\OneDrive\\Documentos\\NetBeansProjects\\jogodamemoria\\src\\jogodamemoria\\Carta.png");
    Color Marron = new Color(184,134,11);
    Color Amarelo = new Color(240,230,140);
    int delay = 5000;
    int interval = 1000;
    int acerto = 0;
    private String nmBotao;
    private Map<JButton, EstadosBotoes> referenciaBotoes;
    Timer timer = new Timer();
    private ImageIcon img;
    

    public ImageIcon getImg() {
        return img;
    }

    public void setImg(ImageIcon img) {
        this.img = img;
    }
    
    public ControleBotoesSelecionados() {
        this.referenciaBotoes = new HashMap<>();
  
    }
               
   
    public void executarAcaoBotoes(JButton botao, EstadosBotoes estado) {
        alterarSelecao(botao, estado);
        
        if (this.isTodasSelecionadas()) {
            alterarEstadoTodosBotoes(EstadosBotoes.PARES_ENCONTRADOS);
            
            
        }
        
            else {
            alterarVisualizacaoBotao(botao);
            }
        
    } ;
    
    private void alterarEstadoTodosBotoes(EstadosBotoes estado) {
        for (JButton botao : this.referenciaBotoes.keySet()) {
            alterarSelecao(botao, estado);
            alterarVisualizacaoBotao(botao);
        }
    }
    
    
    
    public String getNmBotao() {
        return nmBotao;
    }
    public void setNmBotao(String nmBotao) {
        this.nmBotao = nmBotao;
    }
    public Map<JButton, EstadosBotoes> getReferenciaBotoes() {
        return referenciaBotoes;
    }
    public void setReferenciaBotoes(Map<JButton, EstadosBotoes> referenciaBotoes) {
        this.referenciaBotoes = referenciaBotoes;
    }
    public void adicionarBotao(JButton botao) {
        this.referenciaBotoes.put(botao, EstadosBotoes.NORMAL);
    }  
    public void alterarSelecao(JButton botao, EstadosBotoes selecionado) {
        this.referenciaBotoes.put(botao, selecionado);
    }
    
    private void alterarVisualizacaoBotao(JButton botao) {
        EstadosBotoes selecionado = this.referenciaBotoes.get(botao);
       
        
        switch (selecionado) {
            
            case NORMAL: // Cinza, não exibe texto
                botao.setBackground(null);
                botao.setIcon(virada);
                break;
            case SELECIONADO: // Exibir texto, mudar a cor
                botao.setBackground(Marron);
                botao.setText(this.nmBotao);
                botao.setIcon(img);
                break;
            
            case PARES_ENCONTRADOS: // Mudar a cor, exibir o texto
                botao.setBackground(Amarelo);
                botao.setIcon(img);
                break;
        }
         
    }
    
    public void zerarSelecoes() {
       alterarEstadoTodosBotoes(EstadosBotoes.NORMAL);
    }
    public Boolean isTodasSelecionadas() {
        for (EstadosBotoes b : this.referenciaBotoes.values()) {
            if (b != EstadosBotoes.SELECIONADO) {
                // Não foram todos selecionados
                return false;
            }
        }
        return true;
    }
}
