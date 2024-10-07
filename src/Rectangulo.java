public class Rectangulo {

    public int x;
    public int y;
    public int anchura;
    public int altura;

    public Rectangulo(int x, int y, int anchura, int altura) {
        this.x = x;
        this.y = y;
        this.anchura = anchura;
        this.altura = altura;
    }

    public boolean hayColision(Rectangulo otroRectangulo){
        boolean hayColision = true;
        // Voy a analizar si mi rectangulo esta o mas a la izq, o mas a la der,
        // o mas arriba o mas abajo que el otroRectangulo
        if (this.x + this.anchura < otroRectangulo.x ||
                otroRectangulo.x + otroRectangulo.anchura < this.x ||
                this.y + this.altura < otroRectangulo.y ||
                otroRectangulo.y + otroRectangulo.altura < this.y) {
            hayColision = false;
        }
        return hayColision;
    }
}
