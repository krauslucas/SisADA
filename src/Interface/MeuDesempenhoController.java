package Interface ;

import java.io.IOException ;
import java.net.URL ;
import java.util.ResourceBundle ;
import javafx.fxml.FXML ;
import javafx.scene.chart.BarChart ;
import javafx.scene.control.Button ;
import javafx.scene.control.Label ;
import javafx.scene.layout.AnchorPane ;

public class MeuDesempenhoController extends InterfaceUsuario {

    @FXML
    private AnchorPane fundo ;
    
    @FXML
    private Label pagina ;
    
    @FXML
    private BarChart desempenho ;
    
    @FXML
    private Button voltar ;
    
    
    
    public MeuDesempenhoController () {
        super ("MeuDesempenho.fxml") ;
    }
    
    @Override
    public void initialize (URL url, ResourceBundle rb) { }
    
    @FXML 
    public void voltarDashboard () throws IOException {
        GerenciadorJanelas.getInstancia().voltar() ;
    }
}
