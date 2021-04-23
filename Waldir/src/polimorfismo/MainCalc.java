package polimorfismo;

public class MainCalc {
    public static void main(String[] args) {
        var calc = new Calculadora();

        System.out.println(calc.somar(5, 7));
        System.out.println();
        System.out.println(calc.somar(5,7,12));
        System.out.println();
        System.out.println(calc.somar(15, 52, 3, 8));
        System.out.println();
        System.out.println(calc.subitrair(10, 5, 3));
        System.out.println();
        System.out.println(calc.subtrair(52, 36));
        System.out.println();
        System.out.println(calc.multiplicar(5, 5));
        System.out.println();
        System.out.println(calc.multiplicar(3, 3, 3));
        System.out.println();
        System.out.println(calc.multiplicar(2, 3, 5, 4));
    }
}
