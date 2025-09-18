package tasks.exercises;

public class exercises02 {

    // Exresice 1
    // bad operand types for binary operator '*' - can't multiply strings
    int multiplicación(int número1, int número2) {
        return número1 * número2;
    }

    // Exercise 2
    // Operaton in bat position
    int suma(int número1, int número2) {
        return número1 + número2;
    }

    // Exercise 3
    // Need the parameter of the second comparison
    boolean positivoMenorDe20(int número) {
        return número > 0 && número < 20;
    }

    // Exercise 4
    int truncado(int n) {
        return n / 10;
    }

    /* Exercise 5 
     * int últimoDígito(int n) {
        return n ___ 10;
    }
    */
    int últimoDígito(int n) {
        return n % 10;
    }

    /* Exercise 6 
     * boolean únicoDígito(int n) {
        return (n ___ 10) == n;
    }
    */
    boolean únicoDígito(int n) {
        return (n > 0) && (n < 10);
    }

    /* Exercise 7 
     *  String signo(int n) {
        return (n >= 0) ___ "no-negativo" ___ "negativo";
    }
    */
    String signo(int n) {
        return (n >= 0) ? "no-negativo" : "negativo";
    }

    // Exercise 8
    boolean esPar(int n){
        return n % 2 == 0;
    }

    // Exercise 9
    boolean esImpar(int n){
        return n % 2 != 0;
    }

    // Exercise 10
    int diferenciaDeCuadrados(int a, int b){
        return (a * a) - (b * b);
    }

    // Exercise 11
    float tercerAngulo(float a, float b){
        return 180 - (a + b);
    }

    // Exercise 12
    // verdadero si es un múltiplo positivo de siete menor que 1000
    boolean validarMultiploDe7(int num){
        return num % 7 == 0 && num < 1000;
    }

    // Exercise 13
    // <inicio> es mayor o igual a 0, <inicio> es menor que <mitad> y <mitad> es menor que tamaño
    boolean validar(int inicio, int mitad, int tamaño){
        return inicio >= 0 && inicio < mitad && mitad < tamaño;
    }

    /* Exercise 14
     *  Un parqueadero abre a las 8:00 am y cierra a las 6:00 pm. Su sistema de cobro es el
        siguiente: el usuario paga $10.0 por cada minuto de parqueo, pero tiene un cobro mínimo de
        $100.0 y tiene un cobro máximo de $3000.0. Haz una función cobro() que retorne un número
        double siendo el cobro a un usuario, dado un número entero que representa los minutos que
        estuvo su vehículo en el parqueadero.
     */
    float cobro(int minutos){
        return (minutos * 10 < 3000) ? java.lang.Math.max(100, minutos * 10) : 3000;
    }

    /* Exercise 15 
     * > inicio(6, 1) 0
        > inicio(6, 2) 6
        > inicio(6, 3) 12
        > inicio(10, 2) 10
    int inicio(int resultados, int página) {
        return (resultados * página)- 1;
    }
    */
    int inicio(int resultados, int página) {
        return resultados * (página - 1);
    }

}
