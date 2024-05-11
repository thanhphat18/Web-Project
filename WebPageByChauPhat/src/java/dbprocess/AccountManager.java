/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbprocess;

import java.sql.*;
import java.util.*;
import com.mysql.jdbc.Driver;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thanhphatchau
 */
public class AccountManager {
    public static Boolean Authenticate(String username, String password)
    {
        String sql = "Select * from account where username='" + username +"' and password='" + password + "'";


        ResultSet resultSet = dbcon.con.ExecuteQuery(sql);

        Boolean result = false;
        try
        {
            if (resultSet.next())
            {
                if (resultSet.getString("username").equals(username) && resultSet.getString("password").equals(password))
                {
                    result = true;
                }
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(AccountManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;
    }
    
}
