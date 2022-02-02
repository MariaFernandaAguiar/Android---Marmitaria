
package dao;
import java.util.List;
import model.Bebida;
/**
 *
 * @author Maria Fernanda
 */
public interface DaoBebida {
    public void SalvarBebida(Bebida bebida);
    
    public void AlterarBebida(Bebida bebida);
    
    public void ExcluirBebida(int id);
     
    public List<Bebida> getBebida();
    
    public List<String> carregaCombo();
    public int getBebidaByDescricao(String bebida);
    public String getBebidaById(int id);
}
