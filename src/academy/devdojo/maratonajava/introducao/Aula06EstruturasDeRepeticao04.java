package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro, descubra em quantas ele pode ser parcelado
    // Condição valorParcela >= 1000
    public static void main(String[] args) {
        int valueTotal = 30000;

        for (int parcelas = 1; parcelas < 1000; parcelas++) {
            int valueParcela = valueTotal / parcelas;
            if (valueParcela >= 1000) {
                System.out.println("Parcelas de " + parcelas + "x no valor de " + valueParcela);
            } else {
                break;
            }
        }
    }
}
