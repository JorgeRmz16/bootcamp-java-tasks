package tasks.exercises;

public class exercises03 {
    
    // Exercise 01
    // Error: Type mismatch: cannot convert from double to int
    double duplicar(double a) {
        var foo = a * 2;
        return foo;
    }

    /*
     * Exercise 02
     *  ___ mod(int p, int q) {
        var d = p / q;
        ___ r = d * q;
        ___ m = p-r;
        return m;
    }
     */
    int mod(int p, int q) {
        var d = p / q;
        var r = d * q;
        var m = p-r;
        return m;
    }

    /*
     * Exercise 03
     *  int diferenciaDeCuadrados(int a, int b) {
            var ___ = a * a;
            var cuadradoDeB ___ b * b;
            var diferenciaDeCuadrados = cuadradoDeA-cuadradoDeB;
            ___ diferenciaDeCuadrados;
        }
     */
    int diferenciaDeCuadrados(int a, int b) {
        var cuadradoDeA = a * a;
        var cuadradoDeB = b * b;
        var diferenciaDeCuadrados = cuadradoDeA-cuadradoDeB;
        return diferenciaDeCuadrados;
    }

    // Exercise 04
    double distenciaEntrePuntos(double xPunto1, double yPunto1, double xPunto2, double yPunto2){
        return Math.sqrt(Math.pow((xPunto2 - xPunto1), 2) + Math.pow((yPunto2 - yPunto1), 2));
    }

    //Exercise 05
    double fahrenheitACelsius(double fahrenheit){
        var celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    // Exercise 06
    double gravedadSuperficial(double masa, double radio){
        var constanteGravitacional = 6.67430e-11;
        var gravedad = (constanteGravitacional * masa) / Math.pow(radio, 2);
        return gravedad;
    }

    // Exercise 07
    double gravedadSuperficialDeLaTierra(){
        var masaTierra =  5.972e24;
        var radioTierra = 6.378e6;
        return gravedadSuperficial(masaTierra, radioTierra);
    }

    // Exercise 08
    double pesoEnMarte(double pesoTierra){
        var masaMarte = 6.421e23;
        var radioMarte = 3.3972e6;
        var gravedadMarte = gravedadSuperficial(masaMarte, radioMarte);
        var pesoPersonaMarte = (gravedadMarte / gravedadSuperficialDeLaTierra()) * pesoTierra;
        return pesoPersonaMarte;
    }

    // Exercise 09
    boolean esTriángulo(double ladoA, double ladoB, double ladoC){
        var maxValue = Math.max(ladoA, Math.max(ladoB, ladoC));
        var suma = ladoA + ladoB + ladoC;
        return maxValue < (suma - maxValue);
    }

    // Exercise 10
    double leyCosenos(double a, double b, double gama){
        var gamaRadianes = Math.toRadians(gama);
        var coseno = Math.cos(gamaRadianes);
        return Math.sqrt((a * a) + (b * b) - (2 * a * b * coseno));
    }

    // Exercise 11
    double promedio(int edadMenor, int edadMayor) {
        var sumaEdades = edadMenor + edadMayor;
        var promedio = sumaEdades / 2.0;
        return promedio;
    }

    public static void main(String[] args){
        System.out.println(new exercises03().promedio(2, 3));
    }
}
