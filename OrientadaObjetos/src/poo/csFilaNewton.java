
package poo;


public class csFilaNewton {
    
    private int i;
    private double xi, fxi, fdxi, raiz,errorCalculado;

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

    public double getFxi() {
        return fxi;
    }

    public void setFxi(double fxi) {
        this.fxi = fxi;
    }

    public double getFdxi() {
        return fdxi;
    }

    public void setFdxi(double fdxi) {
        this.fdxi = fdxi;
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
        return "csFilaNewton{" + "i=" + i + ", xi=" + xi + ", fxi=" + fxi + ", fdxi=" + fdxi + ", raiz=" + raiz + ", errorCalculado=" + errorCalculado + '}';
    }
}
