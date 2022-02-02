
package conexao;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Maria Fernanda
 */
public class Conexao {
    Connection conexao;
    
    private final String driver= "com.mysql.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost:3306/db_marmitaria";
    private final String usuario = "root";
    private final String senha = "";
    
    
    public Connection getConnetion()
    {        
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,usuario,senha);
            JOptionPane.showMessageDialog(null,"Conectado com sucesso!!");
        }
        catch(ClassNotFoundException drive){
            JOptionPane.showMessageDialog(null,"Driver não encontrado" +drive);
        }
        catch(SQLException fonte){
            JOptionPane.showMessageDialog(null,"Banco de dados não encontrado" +fonte);
     
        }
        
        return conexao;
    }
}
