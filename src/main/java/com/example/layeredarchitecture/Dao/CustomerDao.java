package com.example.layeredarchitecture.Dao;


import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDao {

     ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException ;

     boolean saveCustomers(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException ;

     boolean updateCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException ;

     boolean deleteCustomer (String id) throws SQLException, ClassNotFoundException ;

     String genarateId() throws SQLException, ClassNotFoundException ;

     boolean  customerExit (String id ) throws SQLException, ClassNotFoundException ;

     CustomerDTO getCustomerName(String newValue) throws SQLException, ClassNotFoundException ;

     ArrayList<String> OrdersGetAllCustomerId () throws SQLException, ClassNotFoundException ;
}
