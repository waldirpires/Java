package laboratorio7;

public class mainTesteProtorype {
    public static void main(String[] args) {
        Circulo circ1 = new Circulo(1,4,3);
        System.out.println(circ1);   

        var circ2 = circ1.clonar();
        System.out.println(circ2);
    }
}
