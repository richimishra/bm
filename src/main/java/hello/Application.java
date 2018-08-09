package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;


@SpringBootApplication
    public class Application {

        public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
//            Application app= new Application();
//            app.connect();
//            app.select();
        }
        private final String url = "jdbc:postgresql://localhost/mydb";
        private final String user = "postgres";
        private final String password = "hello";

        public Connection connect()
        {
            Connection conn = null;
            try {
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("Connected to the PostgreSQL server successfully.");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

            return conn;
        }
    public void select() {
        String SQL = "SELECT * FROM people.Employee";


        try {
            Connection conn = connect();

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                Integer empid = rs.getInt(1);
                String fname = rs.getString(2);
                String lname = rs.getString(3);
                System.out.println(empid + " " + fname + "" + lname);

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    }


