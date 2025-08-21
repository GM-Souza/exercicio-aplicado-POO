public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Guilherme","203.019.491-39");

        Conta cc = new ContaCorrente("10399-1",3000, cliente);

        Conta cp = new ContaPoupanca("54615-9",24000, cliente);

        cc.aplicarJuros();
        cp.aplicarJuros();

    }
}