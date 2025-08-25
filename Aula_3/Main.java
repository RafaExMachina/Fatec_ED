public class Main {
    public static void main(String[] args) {
        // Criando um objeto Carro
        Carro carro = new Carro("Toyota", "Corolla", 2020);

        // Verificando o estado do motor
        System.out.println("O motor está ligado? " + carro.isMotorLigado()); // false

        // Ligando o motor
        carro.ligarMotor(); // O motor do Corolla foi ligado.
        System.out.println("O motor está ligado? " + carro.isMotorLigado()); // true

        // Dirigindo o carro
        carro.dirigir(); // O Corolla está andando.

        // Desligando o motor
        carro.desligarMotor(); // O motor do Corolla foi desligado.
        System.out.println("O motor está ligado? " + carro.isMotorLigado()); // false

        // Tentando dirigir com o motor desligado
        carro.dirigir(); // Ligue o motor do Corolla primeiro.
    }
}