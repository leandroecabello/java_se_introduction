public class Functions {
    /**
     * *
     * Java Docs
     *
     * Los Java Docs son una herramienta usada por
     * muchas otras herramientas y aplicaciones porque nos ayuda a documentar
     * todo nuestro código usando comentarios. Además, nos permite visualizar la documentación en formato HTML.
     *
     */
    public static void main(String[] args) {
        double y = 3;
        //Area de un circulo
        //pi * r2
        circleArea(y);

        //Area de una esfera
        //4*PI*r2
        sphereArea(y);

        //Volumen de una esfera
        //(4/3)*pi * r3
        sphereVolumen(y);

        System.out.println("PESOS A DOLARES: " + converToDolar(200, "ARG"));
    }

    // static aplica para metodos que comparten el metodo main
    public static double circleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static double sphereArea(double r) {
        return 4 * Math.PI * Math.pow(r,2);
    }

    public static double sphereVolumen(double r) {
        return (4/3) * Math.PI * Math.pow(r,3);
    }

    /**
     * Descripción: Función que permite convertir a dolar según el tipo de moneda especificado
     *
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: Acepta "ARG", "COL" o "BOL"
     *
     * @return quantity Devuelve la cantidad de dinero ingresado en dolares
     * */
    public static double converToDolar(double quantity, String currency) {
        //ARG
        switch (currency){
            case "ARG":
                quantity = quantity * 0.0074;
                break;
            case "COL" :
                quantity = quantity * 0.00024;
                break;
            case "BOL" :
                quantity = quantity * 0.14;
                break;
            default:
                quantity = 0.0;
                break;
        }
        return quantity;
    }
}
