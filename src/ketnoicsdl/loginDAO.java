/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ketnoicsdl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import ketnoicsdl.DatabaseConnection;
/**
 *
 * @author Ta Quang Hoang
 */
public class loginDAO {
    public void addUser(user u){
        String sql = "insert into login(username,password) values (?, ?)";
        Connection con = new DatabaseConnection().getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, u.getUsername());
            ps.setString(2, u.getPassword());
             if (ps.executeUpdate()==0)
                    System.out.println("Error");
                else 
                    System.out.println("Success");
        }catch (SQLException ex) {
            System.out.println("Error SQL!");
        }
    }
    public void deleteUser(int id){
        String sql = "delete from login where id=?";
        Connection con = new DatabaseConnection().getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, Integer.toString(id));
             if (ps.executeUpdate()==0)
                    System.out.println("Error");
                else 
                    System.out.println("Success");
        }catch (SQLException ex) {
            System.out.println("Error SQL!");
        }
    }
    public void update(user u) {
        String sql = "update login set  username=? ,password=? where id = ?";
        Connection conn = DatabaseConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, u.getUsername());
            ps.setString(2, u.getPassword());
            ps.setString(3, Integer.toString(u.getId()));
             if (ps.executeUpdate()==0)
                    System.out.println("Error");
                else 
                    System.out.println("Success");
        }catch (SQLException ex) {
            System.out.println("Error SQL!");
        }
    }
    public List<user> getAll() {
        List<user> list = new ArrayList<user>();
        String sql = "select * from MAY";
        Connection conn = DatabaseConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
             user u = new user(Integer.parseInt(rs.getString(1)), rs.getString(2), rs.getString(3));
             list.add(u);
            }
        }catch (SQLException ex) {
            System.out.println("Error SQL!");
        }
       return list;
    }
    public user getUser(int id) {
        user u = new user();
        String sql = "select * from login where id = ?";
        Connection connect = DatabaseConnection.getConnection();
        try{
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setString(1, Integer.toString(id));
            ResultSet rs = ps.executeQuery();
            rs.next();
            u = new user(rs.getString(2), rs.getString(3));
        }catch(SQLException e){
            System.out.println("SQL Error!");
        }
        return u; //To change body of generated methods, choose Tools | Templates.
    }
}
