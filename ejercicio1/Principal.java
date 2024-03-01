package ejercicio1;

public class Principal {
    public static void main(String[] args) {
        
        Operacion operacion = new Operacion();
        operacion.crearOperacion();
        System.out.println(operacion.sumar()); 
        System.out.println(operacion.restar()); 
        System.out.println(operacion.multiplicar()); 
        System.out.println(operacion.dividir()); 
    }
}
