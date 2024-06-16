package com.example.layeredarchitecture.Dao;


import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public interface ItemDao {

     ArrayList<ItemDTO> getAllItems () throws SQLException, ClassNotFoundException ;


     boolean deleteItem(String code) throws SQLException, ClassNotFoundException ;


     boolean saveItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;

     boolean updateItems(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;



      ItemDTO getItemByCode (String code ) throws SQLException, ClassNotFoundException ;


      boolean exitItem(String code ) throws SQLException, ClassNotFoundException ;


     ArrayList<String> ordersGetAllCodes () throws SQLException, ClassNotFoundException ;


      ItemDTO findItemOrders(String code) throws SQLException, ClassNotFoundException ;


     String genarateId() throws SQLException, ClassNotFoundException ;


}
