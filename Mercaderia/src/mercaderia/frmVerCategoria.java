package mercaderia;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
public class frmVerCategoria extends javax.swing.JFrame {
    private DefaultTableModel modelo;
    public static Articulos lista;
    int con = 0;
    private TableRowSorter trsFiltro;
    public frmVerCategoria(Articulos lista) {
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
    grdDatos.setModel(modelo);
    }
    public void filtro(){
        
        int columna=3;
        trsFiltro.setRowFilter(RowFilter.regexFilter(txtCategoria.getText(),columna));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCategoria = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdDatos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtCategoria.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtCategoriaCaretUpdate(evt);
            }
        });
        txtCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCategoriaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCategoriaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCategoriaKeyTyped(evt);
            }
        });

        jScrollPane1.setViewportView(grdDatos);

        jLabel1.setText("Categoría");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
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

    private void txtCategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategoriaKeyTyped
            
        txtCategoria.addKeyListener(new KeyAdapter(){
        public void keyReleased(final KeyEvent e){
        String cadena = (txtCategoria.getText());
        txtCategoria.setText(cadena);
        repaint();
        filtro();
        }
        });
        trsFiltro = new TableRowSorter(modelo);
        grdDatos.setRowSorter(trsFiltro);
        
    }//GEN-LAST:event_txtCategoriaKeyTyped

    private void txtCategoriaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategoriaKeyPressed
        
    }//GEN-LAST:event_txtCategoriaKeyPressed

    private void txtCategoriaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtCategoriaCaretUpdate
        
    }//GEN-LAST:event_txtCategoriaCaretUpdate

    private void txtCategoriaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategoriaKeyReleased
        
    }//GEN-LAST:event_txtCategoriaKeyReleased

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVerCategoria(lista).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable grdDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCategoria;
    // End of variables declaration//GEN-END:variables
}
