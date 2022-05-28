package circulo;

/**
 * Pruebas de refactorización en NetBeans con la clase Circulito
 * @author Ignacio Brea Lodeiro
 */
public class Circulito {

    /**
     * Constante LIMITERADIO que indica el valor mínimo que puede tener el radio.
     * Como el radio no puede ser negativa, se le asigna el valor 0.0.
     */
    public static final double LIMITERADIO = 0.0;

    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    /**
     * Cosntructor vacio
     */
    public Circulito() {
    }

    /**
     * Constructor con todos los parametros
     * @param valorX valor de la coordenada X
     * @param valorY valor de la coordenada Y
     * @param valorRadio valor del radio
     */
    public Circulito(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }

    /**
     * Devuelve la coordenada 'x' de la posición del centro del círculo.
     * @return la coordenada 'x'
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * Devuelve la coordenada 'y' de la posición del centro del círculo.
     * @return la coordenada 'y'
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * Devuelve el valor de la longitud del radio.
     * @return la longitud del radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Establece la coordenada 'x' de la posición del centro del círculo.
     * @param coordenadaX la coordenadaX to set
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * Establece la coordenada 'y' de la posición del centro del círculo.
     * @param coordenadaY the coordenadaY to set
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * Establece el radio del círculo.
     * @param radio el radio del círculo
     */
    public void setRadio(double radio) {
        this.radio = (radio < LIMITERADIO ? LIMITERADIO : radio);
    }

    /**
     * Devuelve el valor de la longitud del diámetro.
     * @return Longitud del diámetro
     */
    public double obtenerDiametro() {
        return radio * 2;
    }

    /**
     * Obtiene el valor de la longitud de la circunferencia
     * @return Longitud de la circunferencia
     */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    /**
     * Obtiene el valor del área del círculo.
     * @return área del círculo
     */
    public double obtenerAreaCirculo() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Centro = [" + coordenadaX + "," + coordenadaY + "]; Radio = " + radio;
    }

    /**
     * Obtiene una nueva posición del centro del círculo (y por lo tanto del
     * círculo), moviendo las coordenadas según lo indicado por parámetros.
     * @param trasladarX Desplaza la coordenada 'x' el valor indicado. Valor
     * positivo lo desplaza hacia la derecha. Valor negativo lo desplaza hacia la izquierda.
     * @param trasladarY Desplaza la coordenada 'y' el valor indicado. Valor
     * positivo lo desplaza hacia arriba. Valor negativo lo desplaza hacia abajo.
     */
    public void trasladarCentro(int trasladarX, int trasladarY) {
        setCoordenadaX(getCoordenadaX() + trasladarX);
        setCoordenadaY(getCoordenadaY() + trasladarY);
    }
}
