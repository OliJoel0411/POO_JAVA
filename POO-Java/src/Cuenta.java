/*
 * @author Oliver
 */

/*
Entidad Cuenta:
    saldo
    agencia
    numero
    titular
*/
// Declaracion de una clase
public class Cuenta {
    // Atributos
    //tipo - nombre
    private double saldo;
    private int agencia;
    private int numero;
    Cliente titular;
    // staticos
    private static int total = 0;
    // Constructor
    public Cuenta(){
        
    }
    // Constructor con parametros
    public Cuenta(int agencia){
        
        if(agencia <= 0){
            System.out.println("No se permiten numeros negativos");
        }else{
            this.agencia = agencia; 
        }
        total++;
        System.out.println("Se estan creando " + total +" cuentas");
    }
    
    // Comportamientos sin retorno
    public void depositar(double valor){
        this.saldo += valor;
    }// fin depositar
    
    // comportamientos con retorno
    public boolean retirar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            System.out.println("no se retiro el saldo");
            return false;
        }
    }// fin retirar
    
    public boolean transferir(double valor, Cuenta cuenta){
        if(this.saldo >= valor){
            this.saldo -= valor;
            cuenta.depositar(valor);
            return true;
        }
        return false;
    }// fin transferir
    
    // Metodo get
    public double obtenerSaldo(){
    
        return this.saldo;
    
    }// fin obtener saldo
    
    // Metodo set
    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
    
} // fin cuenta
