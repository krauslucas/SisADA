package Interface ;

import java.io.IOException ;
import java.net.URL ;
import java.util.ResourceBundle ;
import javafx.fxml.FXML ;
import javafx.scene.control.Button ;
import javafx.scene.control.Label ;
import javafx.scene.control.TableView ;
import javafx.scene.layout.AnchorPane ;

public class MinhasAvaliacoesController extends InterfaceUsuario {

    @FXML
    private AnchorPane fundo ;
    
    @FXML
    private Label pagina ;
    
    @FXML
    private Button informarNota ;
    
    @FXML
    private Button addNovaAvaliacao ;
    
    @FXML
    private Button voltar ;
    
    @FXML
    private TableView minhasAvaliacoes ;

    
    
    public MinhasAvaliacoesController () {
        super ("MyEvaluations.fxml") ;
    }
    
    @Override
    public void initialize (URL url, ResourceBundle rb) { }
    
    @FXML
    public void voltarDashboard () throws IOException {
        GerenciadorJanelas.getInstancia().voltar() ;
    }
    
    @FXML
    public void informarNota () throws IOException {
        GerenciadorJanelas.getInstancia().trocarJanela(new InformarNotaController()) ;
    }
    
    @FXML
    public void addNewEvaluation () throws IOException {
        GerenciadorJanelas.getInstancia().trocarJanela(new AddNovaAvaliacaoController()) ;
    }
}
