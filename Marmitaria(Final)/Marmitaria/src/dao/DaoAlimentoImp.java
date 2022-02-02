
package dao;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Alimento;
/**
 *
 * @author Maria Fernanda
 */
public class DaoAlimentoImp implements DaoAlimento {
    Connection con = null; 
    PreparedStatement pstm = null;
    
    @Override
    public void SalvarAlimento(Alimento alimento) {
    con = new Conexao().getConnetion();
       try{
         pstm =con.prepareStatement("INSERT INTO tb_alimento(descricao) VALUES (?)" );
         this.pstm.setString(1,alimento.getDescricao());
         
               
        this.pstm.execute();
        this.pstm.close();
        
        //JOptionPane.showMessageDialog(null, "Alimento salvo com sucesso!!!");
        
        }catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao salvar Alimento no banco "+err);
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
         // JOptionPane.showMessageDialog(null, "Alimento cadastrado com sucesso!!!");
    }

    @Override
    public void AlterarAlimento(Alimento alimento) {
      con = new Conexao().getConnetion();
      try{
        pstm =con.prepareStatement("UPDATE tb_alimento SET decricao=? WHERE id?" );
        this.pstm.setString(1,alimento.getDescricao());
        this.pstm.setInt(2,alimento.getId());
               
        this.pstm.execute();
        this.pstm.close();
        
        JOptionPane.showMessageDialog(null, "Alimento alterado com sucesso!!!");
        
        }catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao alterar Alimento no banco "+err);
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
    public void ExcluirAlimento(int id) {
        con = new Conexao().getConnetion();
        try{
        pstm =con.prepareStatement("DELETE FROM tb_alimento WHERE id=?");
        this.pstm.setInt(1, id);
               
        this.pstm.execute();
        this.pstm.close();
        
        JOptionPane.showMessageDialog(null, "Alimento exlcuido com sucesso!!!");
        
        }catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao excluir alimento no banco "+err);
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
    public List<Alimento> getAlimento() {
        ResultSet rs = null;
               
        List<Alimento> lista = new ArrayList<Alimento>();
       
        con = new Conexao().getConnetion();
        try{
        pstm =con.prepareStatement("SELECT * FROM tb_alimento");
        rs = pstm.executeQuery();
        rs.first();
        do
        {
            Alimento alimento = new Alimento();
            alimento.setId(rs.getInt("id"));
            alimento.setDescricao(rs.getString("descricao"));
            
            lista.add(alimento);
        }while(rs.next());
        
        pstm.close();
        }catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao buscar alimento no banco "+err);
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
    public int getAlimentoByDescricao(String alimento) {
         int a =0;
         ResultSet rs =null; 
        
        con = new Conexao().getConnetion();
        try{
       
        pstm = con.prepareStatement("SELECT id FROM tb_alimento where descricao =?");
        this.pstm.setString(1, alimento);
        rs = pstm.executeQuery();
        if(rs.first())
        {
            a=rs.getInt("id");
        }
        
        pstm.close();
        }catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao buscar alimento para combo no banco" + err);
        
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
        
        
    

        
        return a;
    }

    @Override
    public String getAlimentoById(int id) {
         String a="";
         ResultSet rs =null; 
        
        con = new Conexao().getConnetion();
        try{
        pstm = con.prepareStatement("SELECT descricao FROM tb_alimento where id=?");
        this.pstm.setInt(1, id);
        rs = pstm.executeQuery();
        if(rs.first())
        {
            a = rs.getString("descricao");
        }
        
        pstm.close();
        }catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao buscar alimento para combo no banco" + err);
        
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
        
        
    

        
        return a;
    
    }
    
     @Override
    public List<String> carregaComboo() {
       //return lista;
       ResultSet rs =null; // primeiro anterior proximo e último 
        List<String> lista = new ArrayList<String>();
      
         con = new Conexao().getConnetion();
        try{
       // pstm = con.prepareStatement("SELECT descricao FROM tb_alimento order by descricao ASC ");
       pstm = con.prepareStatement("SELECT descricao FROM tb_alimento order by descricao ASC ");
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
            JOptionPane.showMessageDialog(null, "Erro ao buscar alimento para combo no banco" + err);
        
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
