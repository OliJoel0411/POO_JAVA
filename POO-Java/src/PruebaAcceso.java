
/**
 *
 * @author Oliver
 */
public class PruebaAcceso {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        //cuenta.saldo = 200.0; no compila por modificador de acceso
        cuenta.retirar(300.0);
        
        //System.out.println("saldo = " + cuenta.saldo);
        System.out.println(cuenta.obtenerSaldo());
        
        cuenta.setAgencia(12345);
         
    }
}
