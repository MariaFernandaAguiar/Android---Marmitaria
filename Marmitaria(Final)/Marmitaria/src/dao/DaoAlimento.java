
package dao;
import java.util.List;
import model.Alimento;
/**
 *
 * @author Maria Fernanda
 */
public interface DaoAlimento {
    public void SalvarAlimento(Alimento alimento);
    
    public void AlterarAlimento(Alimento alimento);
    
    public void ExcluirAlimento(int id);
     
    public List<Alimento> getAlimento();
    
    public List<String> carregaComboo();
    public int getAlimentoByDescricao(String alimento);
    public String getAlimentoById(int id);
}
