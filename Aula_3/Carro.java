public class Carro {
    // Atributos privados (encapsulados)
    private String marca;
    private String modelo;
    private int ano;
    private boolean motorLigado; // Atributo privado

    // Construtor
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motorLigado = false; // Motor começa desligado
    }

    // Métodos públicos para interagir com o atributo privado
    public void ligarMotor() {
        this.motorLigado = true;
        System.out.println("O motor do " + this.modelo + " foi ligado.");
    }

    public void desligarMotor() {
        this.motorLigado = false;
        System.out.println("O motor do " + this.modelo + " foi desligado.");
    }

    public void dirigir() {
        if (this.motorLigado) {
            System.out.println("O " + this.modelo + " está andando.");
        } else {
            System.out.println("Ligue o motor do " + this.modelo + " primeiro.");
        }
    }

    // Getter para verificar o estado do motor
    public boolean isMotorLigado() {
        return this.motorLigado;
    }

    // Getters para os outros atributos (opcional)
    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getAno() {
        return this.ano;
    }
}