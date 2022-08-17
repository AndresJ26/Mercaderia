package mercaderia;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Articulos {
    private ArrayList<Articulo> lista;
    
    public Articulos(){
       lista=new ArrayList <Articulo>(); 
    }
    
    public void addArticulo(Articulo miArticulo){
        lista.add(miArticulo);
    }
    
    public int getRegistros(){
        return lista.size();
    }
    
    public Articulo getRegistroArticulo(int posicion){
        try{
        Articulo articulo=lista.get(posicion);       
        return articulo;
        }catch (Exception ex){
        JOptionPane.showMessageDialog(null,"Posicion invalida");
        return new Articulo();
        }
    }
}
