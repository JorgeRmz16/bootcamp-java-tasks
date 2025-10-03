package tasks.exercises;

public class exercises04 {
    
    // Exercise 01
    // The method charAt(int) in the type String is not applicable for the arguments (String, int)
    // The method isLowerCase(char) in the type Character is not applicable for the arguments (Object)
     boolean empiezaConMinúscula(String s) {
        var primerCaracter = s.charAt(0);
        return Character.isLowerCase(primerCaracter);
    }

    // Exercise 02
    String pluralizar(int conteo, String s) {
        return (conteo < 2) ? s : String.format("%d %ss", conteo, s);
    }

    // Exercise 03
    // Invalid character constant
     boolean esVocal(char letra) {
        var letraMinúscula = Character.toLowerCase(letra);
        return "aeiou".contains(Character.toString(letraMinúscula));
    }

    // Exercise 04
    String titleCase(String texto) {
        var primeraLetra = texto.substring(0, 1);
        var restoDelTexto = texto.substring(1);
        return String.format("%S%s", primeraLetra, restoDelTexto.toLowerCase());
    }
    
    // Exercise 05
    boolean terminaEnS(String texto) {
        var últimoCaracter = texto.charAt(texto.length() - 1);
        return (últimoCaracter == 's') || (últimoCaracter == 'S');
    }

    // Excercise 06
    boolean esPalindrome(String texto) {
        var primerCaracter = texto.toLowerCase().charAt(0);
        var últimoCaracter = texto.toLowerCase().charAt(texto.length() - 1);
        return primerCaracter == últimoCaracter;
    }

    // Exercise 07
    boolean esExterno(String texto) {
        return texto.charAt(0) != '/';
    }

    // Exercise 08
    String extension(String texto) {
        var indicePunto = texto.lastIndexOf('.');
        return (indicePunto == -1) ? "" : texto.substring(indicePunto + 1);
    }

    // Exercise 09
    String domain(String url) {
        var inicioDominio = url.indexOf("//") + 2;
        var finDominio = url.indexOf("/", inicioDominio);
        return (finDominio == -1) ? url.substring(inicioDominio) : url.substring(inicioDominio, finDominio);
    }

    // Exercise 10
    String domingoDePascua(int año) {
        var a = año % 19;
        var b = año / 100;
        var c = año % 100;
        var d = b / 4;
        var e = b % 4;
        var g = ((8 * b) + 13) / 25;
        var h = ((19 * a) + b- d- g + 15) % 30;
        var i = c / 4;
        var k = c % 4;
        var l = (32 + (2 * e) + (2 * i)- h- k) % 7;
        var m = (a + (11 * h) + (19 * l)) / 433;
        // n es el número del mes, 3 = marzo, 4 = abril
        var n = (h + l- (7 * m) + 90) / 25;
        // p es el día del mes
        var p = (h + l- (7 * m) + (33 * n) + 19) % 32;

        var mes = String.format("%02d", n);
        var dia = String.format("%02d", p);
        return String.format("%s/%s/%s", año, mes, dia);
    }

    // Exercise 11
    String  hexString(int red, int green, int blue) {
        return String.format("%02X%02X%02X", red, green, blue);
    }

    // Exercise 12
    boolean correoElectronicoValido(String correo) {
        var posicionArroba = correo.indexOf("@");

        var soloUnaArroba = posicionArroba == correo.lastIndexOf("@") && correo.contains("@");

        var caracterAntesDeArroba = correo.indexOf("@") > 0;

        var posicionUltimoPunto = correo.lastIndexOf(".");
        var parteDespuesArroba = correo.substring(posicionArroba + 1);
        var soloUnPuntoDespuesArroba = parteDespuesArroba.indexOf(".") == parteDespuesArroba.lastIndexOf(".") && parteDespuesArroba.contains(".");
        
        var caracterEntreArrobaYPunto = posicionUltimoPunto > posicionArroba + 1;
        
        var caracterDespuesDelPunto = posicionUltimoPunto < correo.length() - 1;
        
        return soloUnaArroba && caracterAntesDeArroba && soloUnPuntoDespuesArroba && 
               caracterEntreArrobaYPunto && caracterDespuesDelPunto;
    }

    // Exercise 13
    String elipsificar(String titulo, int longitudEsperada) {
        var corte = (titulo.length() <= longitudEsperada) ? 
                    titulo.length() : 
                    titulo.indexOf(" ", longitudEsperada);
        var formato = (corte < titulo.length()) ? 
                        titulo.substring(0, corte) + "…" : 
                        titulo.substring(0, corte);
        return formato;
    }
}
