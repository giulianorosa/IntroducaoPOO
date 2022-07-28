package Objetos;

public class Carro {

    String cor;
    String modelo;
    double litros;

    Carro() {

    }

    Carro(String cor, String modelo, double litros) {
        this.cor = cor;
        this.modelo = modelo;
        this.litros = litros;
    }

    void setCor(String cor){
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    void setLitros(Double litros) {
        this.litros = litros;
    }

    double getLitros() {
        return litros;
    }

    double totalValorTanque(double valorCombustivel) {
        return litros * valorCombustivel;
    }

}
