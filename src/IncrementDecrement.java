public class IncrementDecrement {
    public static void main(String[] args) {
        // Operadores de asignación:

        /*
        +=: a += b es equivalente a a = a + b.
        -=: a -= b es equivalente a a = a - b.
        *=: a *= b es equivalente a a = a * b.
        /=: a /= b es equivalente a a = a / b.
        %=: a %= b es equivalente a a = a % b.
        */

        // Operadores de incremento:

       /*
       ++: i++ es equivalente a i = i + 1.
       --: i-- es equivalente a i = i - 1.
       */

        //Podemos usar estos operadores de forma prefija (++i) o
        // postfija (i++). La diferencia está en qué operación se ejecuta primero

        int lives = 5;
        lives = lives - 1;
        System.out.println(lives); //4

        lives--; //Decremento
        System.out.println(lives); //3

        lives++; //Incremento
        System.out.println(lives); //4

        //Prefija
        // Gana un regalo por ganar una vida
        // int gift = 100 + lives++; //(104) postfijo => primero obtiene el dato y luego realiza la operación
        int gift = 100 + ++lives; //(105) prefijo => obtiene el dato incrementado
        System.out.println(gift);
        System.out.println(lives); //5

        int i = 7; char c = ‘w’; System.out.println((i >= 6) && (c == ‘w’));
    }
}
