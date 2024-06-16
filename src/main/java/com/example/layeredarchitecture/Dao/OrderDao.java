package com.example.layeredarchitecture.Dao;

import com.example.layeredarchitecture.db.DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public interface OrderDao {
     String getCurrentOrderId() throws SQLException, ClassNotFoundException ;

}
