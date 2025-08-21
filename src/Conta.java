public abstract class Conta implements OperacoesBancarias {
    private String numeroConta;
    private double saldo;
    private Cliente ClienteTitular;

    public Conta(String numeroConta, double saldo, Cliente clienteTitular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        ClienteTitular = clienteTitular;
    }

    @Override
    public void depositar(double valor){

    }

    @Override
    public void sacar(double valor){

    }


    public abstract void aplicarJuros();

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Cliente getClienteTitular() {
        return ClienteTitular;
    }

    public void setClienteTitular(Cliente clienteTitular) {
        ClienteTitular = clienteTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
