package MinimizaciónEstadosAFD;


/**
 *
 * @author Angel David Ortega Prado
 *  
 * En esta clase se obtienen los datos de entrada
 */
public class DatosAFD implements Cloneable{
    String alfabeto;
    int numeroDeEstados;
    String estadoInicial;
    String estadosFinales;
    protected Nodo[] estados;
    
    //constructor de la clase DatosAFD
    public DatosAFD(DatosAFD a) {
        this(a.getAlfabeto(), a.getEstados().length, a.getEstadoInicial(), a.getEstadosFinales(), a.getEstados());
    }

    public DatosAFD(String alfabeto, int noEstados, String ei, String ef, Nodo[] estados) {
        this.alfabeto = alfabeto;
        this.numeroDeEstados = noEstados;
        this.estadoInicial = ei;
        this.estadosFinales = ef;
        //this.estados = new Node[this.numeroDeEstados];
        
    }
    
    //método ingresa Estado Inicial
    public void setEstadoInicial(String edoinicial) {
        this.estadoInicial = edoinicial;
    }

    //método obtener Alfabeto
    public String getAlfabeto() {
        return alfabeto;
    }
    
    //método obtener Número de Estados
    public int getNoEstados() {
        return numeroDeEstados;
    }

    //método obtener Estado Inicial
    public String getEstadoInicial() {
        return estadoInicial;
    }

    //método obtener Estados Finales
    public String getEstadosFinales() {
        return estadosFinales;
    }

    public Nodo[] getEstados() {
        return estados;
    }

}
