package MinimizaciónEstadosAFD;

import javafx.scene.Node;

/**
 *
 * @author Angel David Ortega Prado
 *  
 * En esta clase se obtienen los datos de entrada
 */
public class DatosAFD {
    String alfabeto;
    int numeroDeEstados;
    String estadoInicial;
    String estadosFinales;
    protected Node[] estados;
    
    //constructor de la clase DatosAFD
    public DatosAFD(DatosAFD a) {
        this(a.getAlfabeto(), a.getEstados().length, a.getEstadoInicial(), a.getEstadosFinales(), a.getEstados());
    }

    public DatosAFD(String alfabeto, int noEstados, String ei, String ef, Node[] estados) {
        this.alfabeto = alfabeto;
        this.numeroDeEstados = noEstados;
        this.estadoInicial = ei;
        this.estadosFinales = ef;
        this.estados = new Node[this.numeroDeEstados];
        
    }
    
    public void setEstadoInicial(String edoinicial) {
        this.estadoInicial = edoinicial;
    }

    public String getAlfabeto() {
        return alfabeto;
    }

    public int getNoEstados() {
        return numeroDeEstados;
    }

    public String getEstadoInicial() {
        return estadoInicial;
    }

    public String getEstadosFinales() {
        return estadosFinales;
    }

    public Node[] getEstados() {
        return estados;
    }


}