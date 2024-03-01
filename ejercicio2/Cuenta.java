package ejercicio2;
import java.util.Scanner;

public class Cuenta {
    
    private int numeroCuenta;
    private long dni;
    private double saldo;

    public Cuenta() {

    }

    public Cuenta(int numeroCuenta, long dni, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldo = saldo;
    }

    public int getNnumeroCuenta() {
        return numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static Cuenta crearCuenta() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el número de cuenta");
        int numeroCuenta = input.nextInt();

        System.out.println("Ingrese el dni del cliente");
        long dni = input.nextLong();

        System.out.println("Ingrese el saldo de la cuenta");
        double saldo = input.nextDouble();

        input.close();

        return new Cuenta(numeroCuenta, dni, saldo);
    }

    public void ingresar(double ingreso) {
        saldo += ingreso;
    }

    public void retirar(double retiro) {
        if(retiro <= saldo) {
            saldo -= retiro;
        } else {
            saldo = 0;
        }
    }

    public void extraccionRapida() {
        saldo -= saldo * 0.2;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void consutarDatos() {
        System.out.println("Número de cuenta:" + numeroCuenta);
        System.out.println("Número de DNI:" + dni);
        System.out.println("Saldo actual:" + saldo);
    }
}
