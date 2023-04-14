
/**
 *
 * @author Oliver
 */
public class TestReferencia2 {
    public static void main(String[] args) {
        
        Cliente oliver = new Cliente();
        oliver.nombre = "oliver";
        oliver.documento = "131654";
        oliver.telefono = "13645654";
        
        Cuenta cuentaOliver = new Cuenta();
        cuentaOliver.titular = oliver;
        System.out.println("cuentaOliver = " + cuentaOliver.titular.documento);
        System.out.println("Id "+cuentaOliver.titular);
    }
}
