package Interface ;

import javafx.application.Application ;
import javafx.stage.Stage ;

public class Inicializador extends Application {
    
    public static void main (String[] args) {
        launch (args) ;
    }

    @Override
    public void start (Stage palcoInicial) throws Exception {
        // cria a primeira janela
        DashboardController janelaInicial = new DashboardController () ;
        
        // mostra a primeira janela
        GerenciadorJanelas.getInstancia().inicializarPalco(palcoInicial, janelaInicial) ;
        
        // insere um titulo na janela
        palcoInicial.setTitle("Prototipo Telas") ;
    }
}
