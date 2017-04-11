package Interface ;

import java.io.IOException ;
import java.net.URL ;
import java.util.ResourceBundle ;
import javafx.fxml.FXML ;
import javafx.scene.control.Button ;
import javafx.scene.control.Label ;
import javafx.scene.control.TextField ;
import javafx.scene.layout.AnchorPane ;

public class InformarNotaController extends InterfaceUsuario {

    @FXML
    private AnchorPane fundo ;
    
    @FXML
    private Label pagina, nome, disciplina, media, minhaNota ;
    
    @FXML
    private TextField tfNota ;
    
    @FXML
    private Button voltar, salvar ;
    
    
    
    public InformarNotaController () {
        super ("InformarNota.fxml") ;
    }
    
    @Override
    public void initialize (URL url, ResourceBundle rb) { }
    
    @FXML 
    public void voltarMinhasAvaliacoes () throws IOException {
        GerenciadorJanelas.getInstancia().voltar() ;
    }
    
    @FXML
    public void salvarNota () throws IOException {
        // salvar os dados e em seguida voltar para a tela (Minhas Avaliacoes)
        voltarMinhasAvaliacoes() ;
    }
}
