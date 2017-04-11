package Interface ;

import java.io.IOException;
import java.net.URL ;
import java.util.ResourceBundle ;
import javafx.fxml.FXML ;
import javafx.scene.control.Button ;
import javafx.scene.control.ChoiceBox ;
import javafx.scene.control.Label ;
import javafx.scene.control.TextField ;
import javafx.scene.layout.AnchorPane ;

public class AddNovaAvaliacaoController extends InterfaceUsuario {

    @FXML
    private AnchorPane fundo ;
    
    @FXML
    private Label pagina, nome, peso, disciplina, media ;
    
    @FXML
    private TextField tfNome, tfPeso ;
    
    @FXML
    private ChoiceBox cbDisciplina, cbMedia ;
    
    @FXML
    private Button voltar, salvar ;
    
    
    
    public AddNovaAvaliacaoController () {
        super ("AddNovaAvaliacao.fxml") ;
    }
    
    @Override
    public void initialize (URL url, ResourceBundle rb) { }
    
    @FXML 
    public void voltarMinhasAvaliacoes () throws IOException {
        GerenciadorJanelas.getInstancia().voltar() ;
    }
    
    @FXML
    public void salvarNovaAvaliacao () throws IOException {
        // a ser implementado ainda
        voltarMinhasAvaliacoes() ;
    }
}
