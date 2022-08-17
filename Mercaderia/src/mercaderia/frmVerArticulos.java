
package mercaderia;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
public class frmVerArticulos extends javax.swing.JFrame {
    private DefaultTableModel modelo;
    public static Articulos lista;
    int con = 0;
    public frmVerArticulos(Articulos lista) {
        initComponents();
        CargarInterfaz();
        Articulo articulo;
        for(int i=0;i<lista.getRegistros();i++){
            articulo = (Articulo)lista.getRegistroArticulo(i);
            MostrarDatos(articulo);
        }
    }
    public void MostrarDatos(Articulo articulo){
        modelo.insertRow(con,new Object[]{});
        modelo.setValueAt(articulo.getCodigo(), con, 0);
        modelo.setValueAt(articulo.getDescripcion(), con, 1);
        modelo.setValueAt(articulo.getMarca(), con, 2);
        modelo.setValueAt(articulo.getCategoria(), con, 3);
        modelo.setValueAt(articulo.getCosto(), con, 4);
        modelo.setValueAt(articulo.getUtilidad(), con, 5);
        modelo.setValueAt(articulo.getPrecioVenta(), con, 6);
        con++;
    }
    public void CargarInterfaz(){
    String data[][]={};
    String col[]={"Codigo","Descripcion","Marca","Categoria","Costo","Utilidad","PrecioVenta"};
    modelo = new DefaultTableModel(data,col);
    grdVerArticulos.setModel(modelo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdVerArticulos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        grdVerArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descripción", "Marca", "Categoría", "Costo", "Utilidad", "Precio Venta"
            }
        ));
        jScrollPane1.setViewportView(grdVerArticulos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVerArticulos(lista).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable grdVerArticulos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
