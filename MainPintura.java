public class MainPintura {
    public static void main(String[] args) {
        Pintura pintura = new Pintura(200);

        Rectangulo rectangulo = new Rectangulo(25, 30);
        Esfera esfera = new Esfera(20);
        Cilindro cilindro = new Cilindro(10, 30);

        System.out.println(rectangulo.toString() + ": " + pintura.calcularPintura(rectangulo) + " litros.");
        System.out.println(esfera.toString() + ": " + pintura.calcularPintura(esfera) + " litros.");
        System.out.println(cilindro.toString() + ": " + pintura.calcularPintura(cilindro) + " litros.");
        
    }
}
