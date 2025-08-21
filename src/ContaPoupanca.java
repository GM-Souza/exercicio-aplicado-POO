public class ContaPoupanca extends Conta{

    public ContaPoupanca(String numeroConta, double saldo, Cliente clienteTitular) {
        super(numeroConta, saldo, clienteTitular);
    }

    @Override
    public void aplicarJuros() {
        double total = getSaldo()  * 1.01;
        System.out.println("Juros aplicado sobre o saldo: "+total);
    }
}
