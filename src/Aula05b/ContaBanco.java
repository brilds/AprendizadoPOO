package Aula05b;


//atributos
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

     //metodos personalizados
    public void estadoAtual(){
        System.out.println("\nConta: " + this.getNumConta() + "\nTipo: " + this.getTipo() + "\nDono: " + this.getDono() + "\nSaldo: " + this.getSaldo() + "\nStatus: " + this.getStatus()
        + "\n----------------------------------------");
    }



    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if(t == "CP"){
            this.setSaldo(150);

        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada pois ainda tem dinheiro!");
        } else if(this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechada pois tem debito!");
        } else{
            this.setStatus(false);
            System.out.println("Conta fechada com Sucesso!");
        }
    }
    public void depositar(float v){
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito feito com sucesso na conta do Cliente: " + this.getDono());
        } else{
           System.out.println("Impossivel Depositar em uma conta fechada"); 
        }
    }
    public void sacar(float v){
        if (this.getStatus()) {
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta do Cliente: " + this.getDono());
            } else{
                System.out.println("Saldo insuficiente para saque!");
            }
        } else{
            System.out.println("Impossivel relizar saque para conta fechada!");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP"){
            v = 20; 
        }
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso pelo cliente: " + this.getDono());
        } else{
            System.out.println("Imposivel pagar a mensalidade de uma conta fechada!");
        }
    }


    //construtor
    public ContaBanco(int numConta, int i, float saldo, boolean status) {
        this.saldo = 0;
        this.status = false;
        
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    
    
}
