package gr.hua.dit.ds.springmvcdemo1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // setup connection variables
        String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
        String user = "hbstudent";
        String pass = "changeit";
        String driver= "com.mysql.cj.jdbc.Driver";

        // get connection to db
        try {
            PrintWriter out = response.getWriter();
            out.println("Connecting to db: " + jdbcUrl);

            Class.forName(driver);
            Connection con = DriverManager.getConnection(jdbcUrl,user,pass);
            out.println("Connection Success!");
            con.close();
        }
        catch (Exception e) {
            e.printStackTrace();
            throw new ServletException(e);
        }

    }

}
