package poo;

public class csFilaSecante {
    private int i;
    private double xim, xi, fxim, fxi, raiz, errorCalculado;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public double getXim() {
        return xim;
    }

    public void setXim(double xim) {
        this.xim = xim;
    }

    public double getXi() {
        return xi;
    }

    public void setXi(double xi) {
        this.xi = xi;
    }

    public double getFxim() {
        return fxim;
    }

    public void setFxim(double fxim) {
        this.fxim = fxim;
    }

    public double getFxi() {
        return fxi;
    }

    public void setFxi(double fxi) {
        this.fxi = fxi;
    }

    public double getRaiz() {
        return raiz;
    }

    public void setRaiz(double raiz) {
        this.raiz = raiz;
    }

    public double getErrorCalculado() {
        return errorCalculado;
    }

    public void setErrorCalculado(double errorCalculado) {
        this.errorCalculado = errorCalculado;
    }

    @Override
    public String toString() {
        return "csFilaSecante{" + "i=" + i + ", xim=" + xim + ", xi=" + xi + ", fxim=" + fxim + ", fxi=" + fxi + ", raiz=" + raiz + ", errorCalculado=" + errorCalculado + '}';
    }
        
}
