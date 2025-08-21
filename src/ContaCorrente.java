public class ContaCorrente extends Conta{


    public ContaCorrente(String numeroConta, double saldo, Cliente clienteTitular) {
        super(numeroConta, saldo, clienteTitular);
    }

    @Override
    public void aplicarJuros() {
        System.out.println("Juros aplicado");
    }

}
