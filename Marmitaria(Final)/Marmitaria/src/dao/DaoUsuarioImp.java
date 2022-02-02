
package dao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Usuario;
import java.sql.*;
import conexao.Conexao;

/**
 *
 * @author Maria Fernanda
 */
public class DaoUsuarioImp implements DaoUsuario{
    Connection con = null; 
    PreparedStatement pstm = null;
    
    
    @Override
    public void salvarUsuario(Usuario usuario) {
       con = new Conexao().getConnetion();
       try{
         pstm =con.prepareStatement("INSERT INTO tb_usuario(nome,sexo,email,senha) VALUES (?,?,?,?)" );
         this.pstm.setString(1, usuario.getNome());
         this.pstm.setString(2,usuario.getEndereco());
         this.pstm.setString(3, usuario.getCelular());
         this.pstm.setString(4, usuario.getSenha());
         this.pstm.setString(5, usuario.getStatus());
         
        this.pstm.execute();
        this.pstm.close();
        
        JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso!!!");
        
        }catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao salvar usuários no banco "+err);
        }
        finally
        {
            try
            {
            con.close();
            }
            catch(SQLException fechar)
            {
                JOptionPane.showMessageDialog(null, "Erro ao fechar o banco ao salvar "+fechar);
            }
        }
          JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!!!");
     }

    @Override
    public void alterarUsuario(Usuario usuario) {
     con = new Conexao().getConnetion();
      try{
         pstm =con.prepareStatement("UPDATE tb_usuario SET nome=?, sexo=?, email=?, senha=? WHERE id=?" );
         this.pstm.setString(1, usuario.getNome());
         this.pstm.setString(2,usuario.getEndereco());
         this.pstm.setString(3, usuario.getCelular());
         this.pstm.setString(4, usuario.getSenha());
         this.pstm.setString(5, usuario.getStatus());
         this.pstm.setInt(6, usuario.getId());
               
        this.pstm.execute();
        this.pstm.close();
        
        JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso!!!");
        
        }catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao alterar usuários no banco "+err);
        }
        finally
        {
            try
            {
            con.close();
            }
            catch(SQLException fechar)
            {
                JOptionPane.showMessageDialog(null, "Erro ao fechar o banco ao alterar "+fechar);
            }
        }   
        
    }

    @Override
    public void excluirUsuario(int id) {
    con = new Conexao().getConnetion();
      try{
         pstm =con.prepareStatement("DELETE FROM tb_usuario WHERE id=?");
         this.pstm.setInt(1, id);
               
        this.pstm.execute();
        this.pstm.close();
        
        JOptionPane.showMessageDialog(null, "Usuário exlcuido com sucesso!!!");
        
        }catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao excluir usuários no banco "+err);
        }
        finally
        {
            try
            {
            con.close();
            }
            catch(SQLException fechar)
            {
                JOptionPane.showMessageDialog(null, "Erro ao fechar o banco ao excluir "+fechar);
            }
        }   
     
    }

    @Override
    public List<Usuario> getUsuarios() {
    ResultSet rs = null;//Primeiro anterior proximo e último
               
        List<Usuario> lista = new ArrayList<Usuario>();
       
        con = new Conexao().getConnetion();//Conectando com o banco de dados
        try{
        pstm =con.prepareStatement("SELECT * FROM tb_usuario");
        rs = pstm.executeQuery();
        //rs = 1 admin Outros admin@ifms.edu.br admin; 2 Afranio Masculino afranio.oliveira@ifms.edu.br IFMS2020
        rs.first();
        do
        {
            Usuario usuario = new Usuario();
            usuario.setId(rs.getInt("id"));
            usuario.setNome(rs.getString("nome"));
            usuario.setEndereco(rs.getString("endereco"));
            usuario.setCelular(rs.getString("celular"));
            usuario.setSenha(rs.getString("senha"));
            usuario.setSenha(rs.getString("status"));
             
            lista.add(usuario);
        }while(rs.next());
        
        pstm.close();
        }catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao buscar usuários no banco "+err);
        }
        finally
        {
            try
            {
            con.close();
            }
            catch(SQLException fechar)
            {
                JOptionPane.showMessageDialog(null, "Erro ao fechar o banco no listar "+fechar);
            }
        }
        
        return lista;
    }
    
    @Override
    public boolean validaLogin(String u, String s) {
        boolean resultado = false;
        ResultSet rs = null;//Primeiro anterior proximo e último
                     
        con = new Conexao().getConnetion();//Conectando com o banco de dados
        try{
        pstm =con.prepareStatement("SELECT nome,senha FROM tb_usuario WHERE nome=? and senha=?");
          this.pstm.setString(1, u);
          this.pstm.setString(2, s);
        rs = pstm.executeQuery();
        
        if(rs.first())
        {
            resultado = true;
        }
        
        
        pstm.close();
        }catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao buscar usuários no banco "+err);
        }
        finally
        {
            try
            {
            con.close();
            }
            catch(SQLException fechar)
            {
                JOptionPane.showMessageDialog(null, "Erro ao fechar o banco no listar "+fechar);
            }
        }
        
        return resultado;
    }
    
    public void CriarUsuarioPadrao() {
       con = new Conexao().getConnetion();
      try{
         pstm =con.prepareStatement("INSERT INTO tb_usuario(nome,sexo,email,senha) VALUES (adimin,outros,adimin@ifms.edu.br,adimin)" );
      
        this.pstm.execute();
        this.pstm.close();
        
        JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso!!!");
        
        }catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao salvar usuários no banco "+err);
        }
        finally
        {
            try
            {
            con.close();
            }
            catch(SQLException fechar)
            {
                JOptionPane.showMessageDialog(null, "Erro ao fechar o banco ao salvar "+fechar);
            }
        }
          JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!!!");
     }

}