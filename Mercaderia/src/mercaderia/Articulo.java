
package mercaderia;

public class Articulo {
    private static frmArticulos articulos;
    private int codigo;
    private String descripcion;
    private String marca;
    private String categoria;
    private float costo;
    private float precioVenta;
    private String utilidad;

    public Articulo() {
        this.codigo = 0;
        this.descripcion = "";
        this.marca = "";
        this.categoria = "";
        this.costo = 0.0f;
        this.precioVenta = 0.0f;
        this.utilidad="";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(String utilidad) {
        this.utilidad = utilidad;
    }
    
    public Float getSubTotal() {
        float porcentaje=0.0f;
        float total=0.0f;
        if (getUtilidad().equals("Abarrote")){porcentaje=0.20f;total=costo*porcentaje;}
        else if (getUtilidad().equals("Limpieza")){porcentaje=0.15f;total=costo*porcentaje;}
        else if (getUtilidad().equals("Libreria")){porcentaje=0.05f;total=costo*porcentaje;}
        return total;
    }
    public Float getPrecioVenta(){
        return getCosto()-getSubTotal();
    }
}
