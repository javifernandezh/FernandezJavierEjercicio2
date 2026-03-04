public class FernandezJavierMenu {

    private String platoPrincipal;
    private double precioPlatoPrincipal;

    private String complemento;
    private double precioComplemento;

    private String postre;
    private double precioPostre;

    private String bebida;
    private double precioBebida;

    private String sorpresa;

    public FernandezJavierMenu(String platoPrincipal, double precioPlatoPrincipal,
                               String complemento, double precioComplemento,
                               String postre, double precioPostre,
                               String bebida, double precioBebida,
                               String sorpresa) {

        this.platoPrincipal = platoPrincipal;
        this.precioPlatoPrincipal = precioPlatoPrincipal;
        this.complemento = complemento;
        this.precioComplemento = precioComplemento;
        this.postre = postre;
        this.precioPostre = precioPostre;
        this.bebida = bebida;
        this.precioBebida = precioBebida;
        this.sorpresa = sorpresa;
    }

    public String getPlatoPrincipal() { return platoPrincipal; }
    public void setPlatoPrincipal(String platoPrincipal) { this.platoPrincipal = platoPrincipal; }

    public double getPrecioPlatoPrincipal() { return precioPlatoPrincipal; }
    public void setPrecioPlatoPrincipal(double precioPlatoPrincipal) { this.precioPlatoPrincipal = precioPlatoPrincipal; }

    public String getComplemento() { return complemento; }
    public void setComplemento(String complemento) { this.complemento = complemento; }

    public double getPrecioComplemento() { return precioComplemento; }
    public void setPrecioComplemento(double precioComplemento) { this.precioComplemento = precioComplemento; }

    public String getPostre() { return postre; }
    public void setPostre(String postre) { this.postre = postre; }

    public double getPrecioPostre() { return precioPostre; }
    public void setPrecioPostre(double precioPostre) { this.precioPostre = precioPostre; }

    public String getBebida() { return bebida; }
    public void setBebida(String bebida) { this.bebida = bebida; }

    public double getPrecioBebida() { return precioBebida; }
    public void setPrecioBebida(double precioBebida) { this.precioBebida = precioBebida; }

    public String getSorpresa() { return sorpresa; }
    public void setSorpresa(String sorpresa) { this.sorpresa = sorpresa; }

    public double calcularPrecioTotal() {
        return precioPlatoPrincipal + precioComplemento + precioPostre + precioBebida;
    }

    public String obtenerResumen() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Plato principal: %s %.2f€%n", platoPrincipal, precioPlatoPrincipal));
        sb.append(String.format("Complemento: %s %.2f€%n", complemento, precioComplemento));
        sb.append(String.format("Postre: %s %.2f€%n", postre, precioPostre));
        sb.append(String.format("Bebida: %s %.2f€%n", bebida, precioBebida));
        sb.append("Sorpresa: ").append(sorpresa).append("\n");
        sb.append(String.format("-----Total: %.2f€", calcularPrecioTotal()));
        return sb.toString();
    }
}