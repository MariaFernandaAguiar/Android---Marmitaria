package controller;
import dao.DaoUsuarioImp;
import model.Usuario;
import java.util.List;
/**
 *
 * @author Maria Fernanda
 */
public class ControllerUsuario {
    DaoUsuarioImp dao = new DaoUsuarioImp();
    List<Usuario> lista = null;
    
    public void CriarUsuarioPadrao(){
        lista = dao.getUsuarios();
        if(lista.isEmpty())
        {
            Usuario usu = new Usuario(0,"marmitaria", "Nova Andradina" ,"123","123","É cliente");
            dao.salvarUsuario(usu);
        }
    
    }
    
    
    public List<Usuario> getUsuario(){
        List<Usuario> lista = dao.getUsuarios();
        return lista;

    }
}
