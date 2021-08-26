
import java.text.DecimalFormat;

public class Capa {
    int precio_venta;
    int compra_capa;
    int compra_corazon;
    int compra_complemento;

    public Capa() {
    }

    public Capa(int precio_venta, int compra_capa, int compra_corazon, int compra_complemento) {
        this.precio_venta = precio_venta;
        this.compra_capa = compra_capa;
        this.compra_corazon = compra_corazon;
        this.compra_complemento = compra_complemento;
    }

    public int getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(int precio_venta) {
        this.precio_venta = precio_venta;
    }

    public int getCompra_capa() {
        return compra_capa;
    }

    public void setCompra_capa(int compra_capa) {
        this.compra_capa = compra_capa;
    }

    public int getCompra_corazon() {
        return compra_corazon;
    }

    public void setCompra_corazon(int compra_corazon) {
        this.compra_corazon = compra_corazon;
    }

    public int getCompra_complemento() {
        return compra_complemento;
    }

    public void setCompra_complemento(int compra_complemento) {
        this.compra_complemento = compra_complemento;
    }
    
    public String calcularProfit(){
        String profit=null;
        if(compra_capa>0&&compra_corazon>0&&compra_complemento>0){
            int coste_produccion=compra_capa+compra_corazon+compra_complemento;
            int ganancia= (int) Math.round(precio_venta*0.96);
            profit=String.valueOf(ganancia-coste_produccion);
        }
        return profit;
    }
}
