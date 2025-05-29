public class PM_Cuenta {
    protected double saldo;
    protected double tasaInteres;

    public PM_Cuenta(double saldoInicial, double tasa) {
        this.saldo = saldoInicial;
        this.tasaInteres = tasa;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public boolean retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}

