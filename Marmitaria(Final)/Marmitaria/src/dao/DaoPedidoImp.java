
package dao;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Pedido;
/**
 *
 * @author Maria Fernanda
 */
public class DaoPedidoImp implements DaoPedido{
    Connection con = null; 
    PreparedStatement pstm = null;
    
    @Override
    public void SalvarPedido(Pedido pedido) {
        con = new Conexao().getConnetion();
       try{
         pstm =con.prepareStatement("INSERT INTO tb_pedido(prato,bebida,data,preco) VALUES (?,?,?,?)" );
         this.pstm.setString(1, pedido.getPrato());
         this.pstm.setString(2, pedido.getBebida());
         this.pstm.setString(3, pedido.getData());
         this.pstm.setString(4, pedido.getValor());
         
        this.pstm.execute();
        this.pstm.close();
        
        JOptionPane.showMessageDialog(null, "Pedido salvo com sucesso!!!");
        
        }catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao salvar pedido no banco "+err);
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
          JOptionPane.showMessageDialog(null, "Pedido cadastrado com sucesso!!!");
    }

    @Override
    public void AlterarPedido(Pedido pedido) {
        con = new Conexao().getConnetion();
      try{
         pstm =con.prepareStatement("UPDATE tb_pedido SET pratoe=?, bebida=?, data=?, valor=? WHERE id=?" );
         this.pstm.setString(1, pedido.getPrato());
         this.pstm.setString(2,pedido.getBebida());
         this.pstm.setString(3, pedido.getData());
         this.pstm.setString(4, pedido.getValor());
         this.pstm.setInt(5, pedido.getId());
               
        this.pstm.execute();
        this.pstm.close();
        
        JOptionPane.showMessageDialog(null, "Pedido alterado com sucesso!!!");
        
        }catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao alterar pedido no banco "+err);
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
    public void ExcluirPedido(int id) {
        con = new Conexao().getConnetion();
      try{
         pstm =con.prepareStatement("DELETE FROM tb_pedido WHERE id=?");
         this.pstm.setInt(1, id);
               
        this.pstm.execute();
        this.pstm.close();
        
        JOptionPane.showMessageDialog(null, "Pedido exlcuido com sucesso!!!");
        
        }catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao excluir pedido no banco "+err);
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
    public List<Pedido> getPedido() {
         ResultSet rs = null;
               
        List<Pedido> lista = new ArrayList<Pedido>();
       
        con = new Conexao().getConnetion();
        try{
        pstm =con.prepareStatement("SELECT * FROM tb_pedido");
        rs = pstm.executeQuery();
        rs.first();
        do
        {
            Pedido pedido = new Pedido();
            pedido.setId(rs.getInt("id"));
            pedido.setPrato(rs.getString("prato"));
            pedido.setBebida(rs.getString("bebida"));
            pedido.setData(rs.getString("data"));
            pedido.setValor(rs.getString("valor"));
            
            lista.add(pedido);
        }while(rs.next());
        
        pstm.close();
        }catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao buscar pedido no banco "+err);
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
    
}
