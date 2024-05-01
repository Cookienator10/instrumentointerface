package Deportes;

public class Triatleta implements Ciclista, Corredor, Nadador {
    @Override
    public void MontarBicicleta() {
        System.out.println("HaceBici");
    }

    @Override
    public void Correr() {
        System.out.println("Corre");
    }

    @Override
    public void nadar() {
        System.out.println("Nada");

    }

    public static void main(String[] args) {
        Triatleta t = new Triatleta();
        System.out.println("el atleta soporta y realiza estos 3 deportes");
        t.MontarBicicleta();
        t.Correr();
        t.nadar();
    }
}
