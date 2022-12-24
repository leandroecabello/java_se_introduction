public class LogicOperations {
    public static void main(String[] args) {
        int  a = 10;
        int b = 20;

        // Operadores de asignación
        System.out.println("a == b ?" + (a == b)); // es igual
        System.out.println("a != b ?" + (a != b)); // es distinto

        if (a > b) {
            System.out.println("a es mayor que b ?" + (a > b));
        } else {
            System.out.println("b es mayor que a" + (b > a));
        }

        // Operadores Relacionales
        System.out.println("a > b ?" + (a > b)); // es mayor
        System.out.println("a < b ?" + (a < b)); // es menor
        System.out.println("a >= b ?" + (a >= b)); // mayor igual
        System.out.println("a <= b ?" + (a <= b)); // menor igual

        // IF ELSE
        if (a == b) {
            System.out.println("a es igual a b");

        }else if((a != b) && (a > b)){
            System.out.println("a es diferente a b");

        }else if(a > b){
            System.out.println("a es mayor a b");

        }else if(a < b){
            System.out.println("a es menor a b");

        }else if(a >= b){
            System.out.println("a es mayor o igual a b");

        }else if(a <= b){
            System.out.println("a es menor o igual a b");

        }

    }
}
