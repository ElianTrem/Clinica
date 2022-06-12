package Prototipo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexionBD {

    public Connection conn;//Declara la conexion en la consola de postgres
    public Statement stm;//establece la sentencia a usar
    public conexionBD() {
        connect();
    }
    public void connect() {
        String database_connection_string = "jdbc:postgresql://localhost:5432/Clinica";//Base de datis a la que nos queremos cnectar   
        String database_user_name = "postgres";//Nombre del usario que se conectara
        String database_user_password = "TP20007";//C
        try {
            conn = DriverManager.getConnection(database_connection_string, database_user_name, database_user_password);
            System.out.println("Conexion en la base de datos *Exito*.");//Debug para saner si se conecto a la base de datos
        } catch (SQLException e) {
            Logger.getLogger(conexionBD.class.getName()).log(Level.SEVERE, null, e);
            System.out.println(e.getMessage());//Error que no se conecto
        }
    }
    public ResultSet consultar(String sql) {//Devuelve una consulta deblarada
        ResultSet resultado = null;
        try {
            stm = conn.createStatement();
            resultado = stm.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(conexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    public int accionesEdit(String sql) {//Edita la sentencias a usar
        int res = 0;
        try {
            stm = conn.createStatement();
            res = stm.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(conexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    public static void main(String[] args) {
        conexionBD conn = new conexionBD();
        conn.connect();
    }
}
