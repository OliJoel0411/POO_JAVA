
/**
 *
 * @author Oliver
 */
public class TestReferencia3 {
    public static void main(String[] args) {
        Cuenta cuentaOli = new Cuenta();
        Cliente cliente = new Cliente();
        cuentaOli.titular = cliente;
        cuentaOli.titular.nombre = "oliver";
        System.out.println("cuentaOli = " + cuentaOli.titular.nombre);
        
        
        // Creando referencias desde la inicializacion 
        
        cuentaOli.titular = new Cliente();
        System.out.println("1");
        System.out.println( cuentaOli.titular = new Cliente());
        System.out.println("2");
        cuentaOli.titular = new Cliente();
        System.out.println(cuentaOli.titular = new Cliente());
        
        System.out.println("Id de memorias");
        System.out.println(cuentaOli.titular = new Cliente());
        System.out.println(cuentaOli.titular);
        System.out.println(cliente);
    }
}
