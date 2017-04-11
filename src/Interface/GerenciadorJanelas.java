package Interface ;

import java.util.Stack ;
import javafx.stage.Stage ;

public class GerenciadorJanelas {
    
    private static GerenciadorJanelas instancia ;
    private Stage palco ;
    private InterfaceUsuario janela ;
    final private Stack<InterfaceUsuario> pilhaVoltar ;
    
    private GerenciadorJanelas () {
        this.pilhaVoltar = new Stack<> () ;
    }
    
    public static GerenciadorJanelas getInstancia() {
        if (GerenciadorJanelas.instancia == null) {
            GerenciadorJanelas.instancia = new GerenciadorJanelas () ;
        }
        return GerenciadorJanelas.instancia ;
    }
    
    public void inicializarPalco (Stage palco, InterfaceUsuario primeiraJanela) {
        this.palco = palco ;
        this.janela = primeiraJanela ;
        this.palco.setScene(primeiraJanela.getCena()) ;
        this.palco.show() ;
    }
    
    private Stage getPalco () {
        return this.palco ;
    }
    
    public void trocarJanela (InterfaceUsuario novaJanela) {
        this.pilhaVoltar.push(this.janela) ;
        this.getPalco().setScene(novaJanela.getCena()) ;
        this.janela = novaJanela ;
        System.out.println("ABRIU " + this.pilhaVoltar.size());
    }
    
    public void voltar () {
        if (!this.pilhaVoltar.empty()) {
            InterfaceUsuario anterior = this.pilhaVoltar.pop() ;
            this.getPalco().setScene(anterior.getCena()) ;
            this.janela = anterior ;
            System.out.println("FECHOU " + this.pilhaVoltar.size());
            return ;
        }
        System.err.println ("A pilha de retorno vazia") ;
    }
    
    public void voltar (int qtdJanelas) {
        if (qtdJanelas <= this.pilhaVoltar.size()) {
            while (qtdJanelas > 1) {
                this.pilhaVoltar.pop() ;
                qtdJanelas-- ;
            }
            InterfaceUsuario anterior = this.pilhaVoltar.pop() ;
            this.getPalco().setScene(anterior.getCena()) ;
            this.janela = anterior ;
            return ;
        }
        System.err.println ("Numero de retornos maior que o tamanho da pilha") ;
    }
    
    public void mostrarPopUp (InterfaceUsuario novaJanela) {
        Stage popUp = new Stage () ;
        popUp.setScene(novaJanela.getCena()) ;
    }
}
