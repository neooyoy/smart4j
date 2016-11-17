package org.smart4j.chapter2.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.chapter2.helper.DatabaseHelper;
import org.smart4j.chapter2.model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CustomerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    public List<Customer> getCustomerList() {
        // TODO: 2016/11/17
        Connection conn = null;
        try {
            List<Customer> customerList = new ArrayList<Customer>();
            String sql = "select * from customer";
            conn = DatabaseHelper.getConnection();
            /*PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setId(rs.getInt("id"));
                customer.setName(rs.getString("name"));
                customer.setContact(rs.getString("contact"));
                customer.setTelephone(rs.getString("telephone"));
                customer.setEmail(rs.getString("email"));
                customer.setRemark(rs.getString("remark"));
                customerList.add(customer);
            }*/
            return DatabaseHelper.queryEntityList(Customer.class, sql);
        } finally {
            DatabaseHelper.closeConnection();
        }
    }

    public Customer getCustomer(int id) {
        // TODO: 2016/11/17

        return null;
    }

    public boolean createCustomer(Map<String, Object> filedMap) {
        // TODO: 2016/11/17

        return false;
    }

    public boolean updateCustome(int id, Map<String, Object> fieldMap) {
        // TODO: 2016/11/17

        return false;
    }

    public boolean deleteCustomer(int id) {
        // TODO: 2016/11/17

        return false;
    }
}