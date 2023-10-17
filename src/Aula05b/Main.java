package Aula05b;

public class Main {
    public static void main(String[] args) throws Exception {
        ContaBanco p1 = new ContaBanco(0, 0, 0, false);
        p1.setNumConta(8888);
        p1.setDono("Manoel");
        p1.abrirConta("CC");
        p1.depositar(300);
        //p1.fecharConta();
        p1.estadoAtual();

        ContaBanco p2 = new ContaBanco(0, 0, 0, false);
        p2.setNumConta(4444);
        p2.setDono("Maura");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(2000);
        p2.estadoAtual();
    }
}
