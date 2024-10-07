public class Main {
    public static void main(String[] args) {
        Rectangulo cuadrado = new Rectangulo(0, 0, 4, 4);
        Rectangulo rectangulo = new Rectangulo(1, 1, 2, 2);
// esto es un comentario
        boolean hayColision = cuadrado.hayColision(rectangulo);
        System.out.println("¿Hay colision? "+hayColision);

        cuadrado = new Rectangulo(0, 0, 4, 4);
        rectangulo = new Rectangulo(1, -2, 1, 1);

        hayColision = cuadrado.hayColision(rectangulo);
        System.out.println("¿Hay colision? "+hayColision);
    }
}