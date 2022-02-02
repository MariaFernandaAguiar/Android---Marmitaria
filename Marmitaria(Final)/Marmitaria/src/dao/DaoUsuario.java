
package dao;
import java.util.List;
import model.Usuario;
/**
 *
 * @author Maria Fernanda
 */
public interface DaoUsuario {
    public void salvarUsuario(Usuario usuario);
    public void alterarUsuario(Usuario usuario);
    public void excluirUsuario(int id);
    public boolean validaLogin(String u, String s);
    public List<Usuario> getUsuarios();
}
