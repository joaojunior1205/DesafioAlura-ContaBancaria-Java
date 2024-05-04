public class OperacoesService {
    static Double _obterSaldo(Conta conta) {
        return conta.getSaldo();
    }

    static Double _operacaoReceber(Conta conta, Double valor) {
        Double newValor = _obterSaldo(conta);
        newValor = newValor + valor;

        return newValor;
    }

    static Double _operacaoTransferir(Conta conta, Double debito) {
        Double newValor = _obterSaldo(conta);
        newValor = newValor - debito;

        return newValor;
    }
}
