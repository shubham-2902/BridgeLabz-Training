package com.jsondata.dbtojson;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.sql.*;
import java.util.*;

public class DBtoJSONReport {

    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/companydb";
            String user = "root";
            String pass = "root";

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT id, name, salary FROM employees");

            List<Map<String, Object>> list = new ArrayList<>();

            while (rs.next()) {
                Map<String, Object> emp = new HashMap<>();
                emp.put("id", rs.getInt("id"));
                emp.put("name", rs.getString("name"));
                emp.put("salary", rs.getDouble("salary"));
                list.add(emp);
            }

            new ObjectMapper().writeValue(new File("db_report.json"), list);

            System.out.println("Database JSON report generated successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
