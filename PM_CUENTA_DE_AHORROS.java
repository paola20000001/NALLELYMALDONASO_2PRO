
public class PM_CuentaAhorros extends PM_Cuenta {

    public PM_CuentaAhorros(double saldoInicial, double tasa) {
        super(saldoInicial, tasa);
    }
    public void aplicarInteresAnual() {
        saldo += saldo * (tasaInteres / 100);
    }
}