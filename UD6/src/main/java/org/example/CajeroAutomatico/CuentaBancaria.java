package org.example.CajeroAutomatico;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void ingresar(double importe) throws ImporteMinimo, DepositoMaximo {
        if (importe <= 0) {
            throw new ImporteMinimo();
        } else if (importe > 3000) {
            throw new DepositoMaximo();
        } else {
            this.saldo += importe;
            System.out.println("\tDinero ingresado con éxito. Saldo actual: " + consultarSaldo());
        }
    }

    public void retirar(double importe) throws SaldoInsuficiente, LimiteDiario{
        if (importe > this.saldo) {
            throw new SaldoInsuficiente();
        } else if (importe > 600) {
            throw new LimiteDiario();
        } else {
            this.saldo -= importe;
            System.out.println("\tDinero retirado con éxito. Saldo actual: " + consultarSaldo());
        }
    }

    public double consultarSaldo() {
        return this.saldo;
    }
}
