package Objetos;

public class ExecutarApp {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW série 3");
        carro1.setLitros(59D);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getLitros());
        System.out.println(carro1.totalValorTanque(5.99));


        Carro carro2 = new Carro("Cinza", "MercedezBenz Classe C", 66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getLitros());
        System.out.println(carro2.totalValorTanque(5.99));

    }
}
