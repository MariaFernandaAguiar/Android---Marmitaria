package controller;
import model.Alimento;
import dao.DaoAlimentoImp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import view.FrmCadAlimento;


/**
 *
 * @author Maria Fernanda
 */
public class ControllerAlimento {
    

    List<Alimento> lista = new ArrayList<Alimento>();
    DaoAlimentoImp dao = new DaoAlimentoImp();
    
    public List<Alimento> getAlimento(){
    List<Alimento> alimento = dao.getAlimento();
    return alimento;
    }
    
    
    public void inserirAlimento(Alimento alimento){
    if(alimento!= null && !alimento.getDescricao().equals("")){
        dao.SalvarAlimento(alimento);
        JOptionPane.showMessageDialog(null, "A alimento" + alimento.getDescricao()+"foi salva com sucesso!!");
    
    }
    else{
        JOptionPane.showMessageDialog(null, "Todos os campos do formulário deve ser preenchidos");
    }
    
   
}
    
    public void EditarAlimento(Alimento alimento){//FrmAlimento c
    if(alimento!= null && !alimento.getDescricao().equals("")){
        dao.AlterarAlimento(alimento);
        JOptionPane.showMessageDialog(null, "Alimento" + alimento.getDescricao()+"foi alterada com sucesso!!");
    
    }
    else{
        JOptionPane.showMessageDialog(null, "Todos os campos do formulário deve ser preenchidos");
    }
            

    }
    public List<Alimento> atualizaListaAlimento(){
    
        lista.clear();
        lista = dao.getAlimento();
        return lista;
        
    }
    public void remover(Alimento id){
        if(id != null && id.equals(id))
        {
            dao.ExcluirAlimento(id.getId());
            JOptionPane.showMessageDialog(null, "Alimento"+id.getDescricao()+ "excluido com sucesso");
        }
    }
}
