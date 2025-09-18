package tasks.exercises;

public class exercises01 {

    // Exercise 1 - error: invalid method declaration; return type require
    // Add the return type String
    String err1() {
        return "¿Dónde está el error?";
    }

    // Exercise 2 - error: cannot find symbol string
    // Change string to String
    String err2() {
        return "¿String o string?";
    }

    // Exercise 3 - error: <identifier> expected
    // Add the parameter type String
    String err3(String who) {
        return String.format("%s, cuál es el error?", who);
    }

    // Exercise 4 - error: ';' expected
    // Add the missing semicolon at the end of the return statement
    String err4() {
        return "Este es un error sutil";
    }

    // Exercise 5 - error: not a statement
    // Add the missing return statement
    String err5() {
        return "Es es un poco menos sutil";
    }

    // Exercise 6 - error: ';' expected, but the error isthe lack of parentheses
    // Add the missing parentheses to the method declaration
    String err6() {
        return "¡Hola Error!";
    }

    /*
     * Exercise 7
     *  String _A_(String emoji1_B_ String emoji2_C_ String emoji3) _D_
            return _E_("[%s, %s, %s]"_F_ emoji1_G_ emoji2_H_ emoji3);
        _I_
     */
    String adivinaLaPelicula(String emoji1, String emoji2, String emoji3) {
        return String.format("[%s, %s, %s]", emoji1, emoji2, emoji3);
    }

    /*
     * Exersice 8
     * _A_ _B_ {
            _C_ String.format("こんにちは_D_", _E_)_F_
        }
     */
    String  konnichiwa(String dare) {
        return String.format("こんにちは%s", dare);
    }

    /* 
     * Exercise 9
     * Escribe una función separador() que retorne el String "<<<>>>"
     */
    String separador() {
        return "<<<>>>";
    }

    /*
     * Exercise 10
     * Escribe una función vocales() que retorne el String "aeiou"
     */
    String vocales() {
        return "aeiou";
    }

    /*
     * Exercise 11
     * Escribe una función tituloAdornado() que tome un String como parámetro y retorne 
     * el mismo String precedido por "<<< " y antecedido por " >>>"
     */
    String tituloAdornado(String word) {
        return String.format("<<< %s >>>", word);
    }

    // Exercise 12
    // Double quotes bad position
    String adornar(String frase) {
        return String.format("<=%s=>", frase);
    }

    // Exercise 13
    // Change the order of the parameters in the return 
    String concatenar(String s1, String s2) {
        return String.format("[%s+%s]", s1, s2);
    }

}
