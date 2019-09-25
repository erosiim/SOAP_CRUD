package org.ejemplo;

import java.sql.ResultSet;

public interface IDAOGeneral<T> {
    public boolean insert(T t);
    public boolean delete(T t);
    public boolean update(T t);
    public boolean ReadById(T t);
    public ResultSet ReadAll();
    
}
