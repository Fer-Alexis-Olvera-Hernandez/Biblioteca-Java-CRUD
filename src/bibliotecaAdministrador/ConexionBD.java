/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bibliotecaAdministrador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author g
 */
public class ConexionBD {
    static String bd="biblioteca";
    static String login="root";
    static String password="";
    static String url="jdbc:mysql://localhost:3306/"+bd+"?serverTimezone=UTC";
    static boolean conectado;
    static Statement instruccion=null;
    static ResultSet resultado=null;
    static String controlador="com.mysql.jdbc.Driver";
    public static Connection conn=null;

    public ConexionBD() {
        try {
            Class.forName(controlador).newInstance();
            conn=DriverManager.getConnection(url,login,password);
            instruccion=conn.createStatement();
            if (conn != null) {
                System.out.println("Conexion a la base de datos "+url+"....ok");
                conectado=true;
            }
        } catch (SQLException ex) {
            System.out.println("Hubo un problema al intentar conectarse con la base de datos:"+ex.getMessage());
            conectado=false;
        }
        catch (ClassNotFoundException e){
            System.out.println("clase no encontrada"+e.getMessage());
            conectado=false;
        }
        catch (Exception m){
            System.out.println(m.getMessage());
            conectado=false;
        }
    }
    
    public void operacionesAMB(String sentencia)throws Exception{
        instruccion.executeUpdate(sentencia);
    }
    public static ResultSet consultar(String sentenciaSQL){
            try {
                resultado=instruccion.executeQuery(sentenciaSQL);
                return resultado;
            }catch(SQLException ex){
                System.out.println("error sql en la consulta: "+ex.getMessage());
            } 
            catch (Exception e) {
                System.out.println("Error en la consulta"+e.getMessage());
            }
            return resultado;
    }
    public void cerrar(){
        try {
                conn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error "+e.getMessage());
            }
    }
    
    public static void main(String[] args) {
        new ConexionBD();
    }
    
}
