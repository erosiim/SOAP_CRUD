package ejemploclientesoap;

import org.ejemplo.Calculadora;
import org.ejemplo.Calculadora_Service;
import org.ejemplo.Persona;


/**
 *
 * @author exkapp
 */
public class EjemploClienteSOAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora_Service srv = new Calculadora_Service();
        Calculadora calculadora = srv.getCalculadoraPort();
        Persona p = new Persona();
        p.setClave("doce");
        p.setNombre("trece");
        p.setDireccion("catorce");
        calculadora.insert(p);
        System.out.println(calculadora.suma(5, 5));
        
    }
}
