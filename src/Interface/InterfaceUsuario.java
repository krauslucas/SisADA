package Interface ;

import java.io.IOException ;
import java.util.logging.Level ;
import java.util.logging.Logger ;
import javafx.fxml.FXMLLoader ;
import javafx.fxml.Initializable ;
import javafx.scene.Scene ;
import javafx.scene.layout.Pane ;

public abstract class InterfaceUsuario implements Initializable {
    
    private Scene cena ;
    final private String caminhoFXML ;
    
    protected InterfaceUsuario (String caminhoFXML) {
        this.caminhoFXML = caminhoFXML ;
    }
    
    public Scene getCena ()  {
        if (this.cena != null) {
            return this.cena ;
        }
        
        try {
            Pane raiz = FXMLLoader.load(getClass().getResource(caminhoFXML)) ;
            this.cena = new Scene (raiz) ;
        } catch (IOException ex) {
            Logger.getLogger(InterfaceUsuario.class.getName()).log(Level.SEVERE, null, ex) ;
        }
        
        return this.cena ;
    }
}
