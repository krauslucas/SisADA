package Interface ;

import java.io.IOException ;
import java.net.URL ;
import java.util.ResourceBundle ;
import javafx.fxml.FXML ;
import javafx.scene.control.Button ;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane ;

public class DashboardController extends InterfaceUsuario {

    @FXML
    private AnchorPane fundo ;
    
    @FXML
    private Label pagina ;
    
    @FXML
    private Button minhasAvaliacoes, meuDesempenho ;
    
    
    
    public DashboardController () {
        super ("Dashboard.fxml") ;
    }
    
    @Override
    public void initialize (URL url, ResourceBundle rb) { }
    
    @FXML 
    public void irMinhasAvaliacoes () throws IOException {
        GerenciadorJanelas.getInstancia().trocarJanela(new MinhasAvaliacoesController()) ;
    }
    
    @FXML 
    public void irMeuDesempenho () throws IOException {
        GerenciadorJanelas.getInstancia().trocarJanela(new MeuDesempenhoController()) ;
    }
}
