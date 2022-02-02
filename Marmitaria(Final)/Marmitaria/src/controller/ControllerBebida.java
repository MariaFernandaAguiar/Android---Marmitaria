package controller;
import model.Bebida;
import dao.DaoBebidaImp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import view.FrmCadBebida;

/**
 *
 * @author Maria Fernanda
 */
public class ControllerBebida {
    DaoBebidaImp dao = new DaoBebidaImp();
    
       List<Bebida> lista = new ArrayList<Bebida>();
       public List<Bebida> getBebida(){
       return dao.getBebida();
    }
    
    public void inserirBebida(Bebida bebida){
    if(bebida!= null && !bebida.getDescricao().equals("")){
        dao.SalvarBebida(bebida);
        JOptionPane.showMessageDialog(null, "A bebida" + bebida.getDescricao()+"foi salva com sucesso!!");
    
    }
    else{
        JOptionPane.showMessageDialog(null, "Todos os campos do formulário deve ser preenchidos");
    }
    
}
    
    
    public void EditarBebida(Bebida bebida){//FrmAlimento c
    if(bebida!= null && !bebida.getDescricao().equals("")){
        dao.AlterarBebida(bebida);
        JOptionPane.showMessageDialog(null, "Bebida" + bebida.getDescricao()+"foi alterada com sucesso!!");
    
    }
    else{
        JOptionPane.showMessageDialog(null, "Todos os campos do formulário deve ser preenchidos");
    }
}
 
    public List <Bebida> atualizaListaBebida(){
    
        lista.clear();
        lista = dao.getBebida();
        return lista;
        
    }
    public void remover(int id){
        int op = JOptionPane.showConfirmDialog(null, "Voc^tem certeza que deseja excluir essa bebida?", "EXCLUIR", JOptionPane.YES_NO_OPTION);
        if(op == 0){
            dao.ExcluirBebida(id);
            JOptionPane.showMessageDialog(null, "Bebida excluida com sucesso");
        } else{
        
            JOptionPane.showMessageDialog(null, "Você cancelou a exclusão");
        }
        
    }
         
    public void gerarRelatorio(){
    try{
        HashMap filtro = new HashMap();
        JRBeanCollectionDataSource bebida = new JRBeanCollectionDataSource(getBebida(),false);
    
        JasperPrint imprimir = JasperFillManager.fillReport("C:\\Users\\Maria Fernanda\\Documents\\Maria Fernanda\\IFMS\\L.P\\LP3\\Marmitaria\\src\\relatorios\\relBebidas.jasper", filtro,bebida);
        JasperViewer visualizar = new JasperViewer(imprimir, false);
        visualizar.setVisible(true);
        }catch(JRException erro){
        JOptionPane.showMessageDialog(null, "erro ao gerar relatorio"+erro);
        erro.printStackTrace();
    }
   
}

}
