package ejercicio2;

public class Principal {
    public static void main(String[] args) {

        Cuenta cuenta = Cuenta.crearCuenta();
        cuenta.ingresar(5.10);
        cuenta.retirar(10.20);
        cuenta.extraccionRapida();
        System.out.println("El saldo de la cuenta es: " + cuenta.consultarSaldo());
        cuenta.consultarSaldo();
    }
}
