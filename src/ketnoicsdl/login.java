/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ketnoicsdl;

/**
 *
 * @author Ta Quang Hoang
 */
public class login {
    public static void main(String[] args) {
        user u = new user("minh", "123");
        user u1 = new user(3, "minhld", "123455");
        loginDAO lg = new loginDAO();
        //lg.addUser(u);
        //lg.deleteUser(2);
        //lg.update(u1);
        System.out.println(lg.getUser(1).toString());
    }
}
