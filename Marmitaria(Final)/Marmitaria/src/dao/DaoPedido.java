
package dao;
import java.util.List;
import model.Pedido;
/**
 *
 * @author Maria Fernanda
 */
public interface DaoPedido {
    public void SalvarPedido(Pedido pedido);
    
    public void AlterarPedido(Pedido pedido);
    
    public void ExcluirPedido(int id);
     
    public List<Pedido> getPedido();
}
