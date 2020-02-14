package poo;

public class csFilaBiseccion {
    private int i;
    private double xi, xs, xr, errorCalculado, signo, fxi, fxr; 

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public double getXi() {
        return xi;
    }

    public void setXi(double xi) {
        this.xi = xi;
    }

    public double getXs() {
        return xs;
    }

    public void setXs(double xs) {
        this.xs = xs;
    }

    public double getXr() {
        return xr;
    }

    public void setXr(double xr) {
        this.xr = xr;
    }

    public double getErrorCalculado() {
        return errorCalculado;
    }

    public void setErrorCalculado(double errorCalculado) {
        this.errorCalculado = errorCalculado;
    }

    public double getSigno() {
        return signo;
    }

    public void setSigno(double signo) {
        this.signo = signo;
    }

    public double getFxi() {
        return fxi;
    }

    public void setFxi(double fxi) {
        this.fxi = fxi;
    }

    public double getFxr() {
        return fxr;
    }

    public void setFxr(double fxr) {
        this.fxr = fxr;
    }

    @Override
    public String toString() {
        return "csFilaBiseccion{" + "i=" + i + ", xi=" + xi + ", xs=" + xs + ", xr=" + xr + ", errorCalculado=" + errorCalculado + ", signo=" + signo + ", fxi=" + fxi + ", fxr=" + fxr + '}';
    }
    
    
    
}
