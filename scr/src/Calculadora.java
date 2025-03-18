public class Calculadora {
    private String marca;
    private String modelo;
    private int ano;

    private double valor1;
    private double valor2;

    public Calculadora(String marca, String modelo, int ano) {
        this.marca = marca.toUpperCase();
        this.modelo = modelo.toUpperCase();
        this.ano = ano;
    }

    public String getMarca() {
        if (marca == "") {
            System.out.print("Nenhuma marca.");
        }
        return marca;
    }

    public void setMarca(String marca) {
        if (marca.isEmpty()) {
            System.out.println("nenhuma marca.");
        } else {
            this.marca = marca.toUpperCase();
        }
    }

    public String getModelo() {
        if (modelo.isEmpty()) {
            System.out.print("Nenhum modelo.");
        }
        return  modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == "") {
            System.out.println("nenhum modelo.");
        } else {
            this.modelo = modelo.toUpperCase();
        }
    }

    public int getAno() {
        if (ano == 0) {
            System.out.print("Nenhum ano.");
        }
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double soma() {
        return valor1 + valor2;
    }

    public double subtracao() {
        return valor1 - valor2;
    }

    public double multiplicacao() {
        return valor1 * valor2;
    }

    public double divisao() {
        if (valor2 == 0) {
            System.out.println("Não possível fazer essa operação.");
            return Double.NaN;
        }
        return valor1 / valor2;
    }

    public void mostrarResposta(String escolha) {
        double resposta = 0;

        switch (escolha) {
            case "Soma":
                resposta = soma();
                break;
            case "Subtração":
                resposta = subtracao();
                break;
            case "Multiplicação":
                resposta = multiplicacao();
                break;
            case "Divisão":
                resposta = divisao();
                break;
            default:
                System.out.println("ESCOLHA UMA DAS OPÇÕES.");
        }
        System.out.println("Resultado da " + escolha + " com o número " + valor1 + " e número " + valor2 + " : " + resposta);
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }
    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }
}