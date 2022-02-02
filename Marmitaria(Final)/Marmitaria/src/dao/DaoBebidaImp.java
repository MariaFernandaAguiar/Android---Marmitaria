
package dao;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Bebida;
/**
 *
 * @author Maria Fernanda
 */
public class DaoBebidaImp implements DaoBebida {
    Connection con = null; 
    PreparedStatement pstm = null;
    
    @Override
    public void SalvarBebida(Bebida bebida) {
        con = new Conexao().getConnetion();
          try{
         pstm =con.prepareStatement("INSERT INTO tb_bebida(descricao) VALUES (?)" );
         this.pstm.setString(1,bebida.getDescricao());
         
               
        this.pstm.execute();
        this.pstm.close();
        
        }catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao salvar bebida no banco "+err);
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
          JOptionPane.showMessageDialog(null, "Alimento cadastrado com sucesso!!!");
    }

    @Override
    public void AlterarBebida(Bebida bebida) {
      con = new Conexao().getConnetion();
      try{
        pstm =con.prepareStatement("UPDATE tb_bebida SET descricao=? WHERE id=?" );
        this.pstm.setString(1,bebida.getDescricao());
        this.pstm.setInt(2,bebida.getId());
               
        this.pstm.execute();
        this.pstm.close();
        
        }catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao alterar bebida no banco "+err);
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
    public void ExcluirBebida(int id) {
        con = new Conexao().getConnetion();
        try{
        pstm =con.prepareStatement("DELETE FROM tb_bebida WHERE id=?");
        this.pstm.setInt(1, id);
               
        this.pstm.execute();
        this.pstm.close();
        
        }catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao excluir bebida no banco "+err);
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
    public List<Bebida> getBebida() {
        ResultSet rs = null;
               
        List<Bebida> lista = new ArrayList<Bebida>();
       
        con = new Conexao().getConnetion();
        try{
        pstm =con.prepareStatement("SELECT * FROM tb_bebida");
        rs = pstm.executeQuery();
        rs.first();
        do
        {
            Bebida bebida = new Bebida();
            bebida.setId(rs.getInt("id"));
            bebida.setDescricao(rs.getString("descricao"));
            
            lista.add(bebida);
        }while(rs.next());
        
        pstm.close();
        }catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao buscar bebida no banco "+err);
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
    public int getBebidaByDescricao(String bebida) {
         int b =0;
         ResultSet rs =null; 
        
        con = new Conexao().getConnetion();
        try{
       
        pstm = con.prepareStatement("SELECT id FROM tb_bebida where descricao =?");
        this.pstm.setString(1, bebida);
        rs = pstm.executeQuery();
        if(rs.first())
        {
            b=rs.getInt("id");
        }
        
        pstm.close();
        }catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao buscar bebida para combo no banco" + err);
        
        }
        finally
        {
            try
            {
            con.close();
            }
            catch(SQLException fechar)
            {
                JOptionPane.showMessageDialog(null, "erro ao fechar lista Combo" + fechar);
            }
        }
        
        
    

        
        return b;
    }

    @Override
    public String getBebidaById(int id) {
         String b="";
         ResultSet rs =null; 
        
        con = new Conexao().getConnetion();
        try{
        pstm = con.prepareStatement("SELECT descricao FROM tb_bebida where id=?");
        this.pstm.setInt(1, id);
        rs = pstm.executeQuery();
        if(rs.first())
        {
            b = rs.getString("descricao");
        }
        
        pstm.close();
        }catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao buscar bebida para combo no banco" + err);
        
        }
        finally
        {
            try
            {
            con.close();
            }
            catch(SQLException fechar)
            {
                JOptionPane.showMessageDialog(null, "erro ao fechar lista Combo" + fechar);
            }
        }
        
        
        return b;
    
    }

     @Override
    public List<String> carregaCombo() {
       //return lista;
       ResultSet rs =null; // primeiro anterior proximo e último 
        List<String> lista = new ArrayList<String>();
       // conectando com o banco de dados
         con = new Conexao().getConnetion();
        try{
       // pstm = con.prepareStatement("SELECT descricao FROM tb_bebida order by descricao ASC ");
       pstm = con.prepareStatement("SELECT descricao FROM tb_bebida order by descricao ASC ");
        rs = pstm.executeQuery();
        rs.first();
        do 
        {
           String a = rs.getString("descricao");
            
            
            lista.add(a);
        }while(rs.next());
        
        pstm.close();
        }catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao buscar bebida para combo no banco" + err);
        
        }
        finally
        {
            try
            {
            con.close();
            }
            catch(SQLException fechar)
            {
                JOptionPane.showMessageDialog(null, "erro ao fechar lista Combo" + fechar);
            }
        }
        
        
        return lista;
    }
       
    
    
    
}
