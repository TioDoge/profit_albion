
import java.text.DecimalFormat;

public class ItemAlbion {
    int precio_venta;
    int ingrediente1;//compra_capa
    int ingrediente2;//compra_corazon
    int ingrediente3;//compra_complemento
    int ingrediente4;

    public ItemAlbion() {
    }

    public int getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(int precio_venta) {
        this.precio_venta = precio_venta;
    }

    public int getIngrediente1() {
        return ingrediente1;
    }

    public void setIngrediente1(int ingrediente1) {
        this.ingrediente1 = ingrediente1;
    }

    public int getIngrediente2() {
        return ingrediente2;
    }

    public void setIngrediente2(int ingrediente2) {
        this.ingrediente2 = ingrediente2;
    }

    public int getIngrediente3() {
        return ingrediente3;
    }

    public void setIngrediente3(int ingrediente3) {
        this.ingrediente3 = ingrediente3;
    }

    public int getIngrediente4() {
        return ingrediente4;
    }

    public void setIngrediente4(int ingrediente4) {
        this.ingrediente4 = ingrediente4;
    }
    
    public String calcularProfit(){
        String profit=null;
        int coste_produccion=ingrediente1+ingrediente2+ingrediente3+ingrediente4;
        int ganancia= (int) Math.round(precio_venta*0.96);
        profit=String.valueOf(ganancia-coste_produccion);
        return profit;
    }
}
