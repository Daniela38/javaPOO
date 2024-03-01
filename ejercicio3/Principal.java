package ejercicio3;

public class Principal {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(6);
        Rectangulo rectangulo = new Rectangulo(4, 8);
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println(("Perímetro del círculo: " + circulo.calcularPerimetro()));
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println(("Perímetro del círculo: " + rectangulo.calcularPerimetro()));
    }
}
