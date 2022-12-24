public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 100000;

        // bono $20000
        int bono = 20000;
        //salary = salary + bono;
        salary += bono;
        System.out.println(salary);

        // pension: $5000 (descuento)
        int pension = 5000;
        salary = salary - pension;
        System.out.println(salary);

        // hrs extras
        // $300 c/h
        // descuento por comida $4500
        // 2 hrs extras
        int extrahours = 2;
        int overtimeValue = 300;
        int foodDiscount = 4500;
        salary = salary + (extrahours*overtimeValue) - foodDiscount;
        System.out.println(salary);

        // Actualizar variables de tipo String:
        String employeeName = "Pepe";
        employeeName = employeeName + " Argento";
        System.out.println(employeeName); // Pepe Argento

        employeeName += " De la Vega";
        System.out.println(employeeName); // Pepe Argento De la Vega

        employeeName = "Pedro " + employeeName;
        System.out.println(employeeName); // Pedro Pepe Argento De la Vega
    }
}
