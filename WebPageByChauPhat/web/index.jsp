<%-- 
    Document   : index
    Created on : May 11, 2024, 10:57:15 PM
    Author     : thanhphatchau
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Log in</title>
    </head>
    <body>
        <h1>Log In</h1>
        <form method="post" action="./Login">
            <table>
                <tr>
                    <td>
                        username:
                    </td>
                    <td>
                        <input type="text" name="username">
                    </td>
                </tr>
                <tr>
                    <td>
                        password:
                    </td>
                    <td>
                        <input type="password" name="password">
                    </td>
                </tr>
                <tr>
                    <th></th>
                    <th>
                        <input type="submit" value="Login" name="Login">
                    </th>
                </tr>
            </table>
        </form>
        
    </body>
</html>
