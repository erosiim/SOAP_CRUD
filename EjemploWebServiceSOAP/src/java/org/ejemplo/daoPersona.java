package org.ejemplo;

import java.sql.ResultSet;

/**
 *
 * @author exkapp
 */
public class daoPersona implements IDAOGeneral<Persona>{
    Conection con = Conection.getInstance();
    String sql="";
    
    @Override
    public boolean insert(Persona t) {
        sql = "INSERT INTO personas (clave, nombre, direccion) values ('" + t.getClave() +"','" + t.getNombre() +"','" + t.getDireccion() +"');";
        return con.execute(sql);
    }

    @Override
    public boolean delete(Persona t) {
        sql = "DELETE FROM personas WHERE (clave = '"+t.getClave() +"');";
        return con.execute(sql);
    }

    @Override
    public boolean update(Persona t) {
        sql = "UPDATE personas set direccion = '" + t.getDireccion() +"', nombre = '" +t.getNombre() +"' WHERE (clave='" +t.getClave() +"');"  ;
        return con.execute(sql);
    }

    @Override
    public boolean ReadById(Persona t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet ReadAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
