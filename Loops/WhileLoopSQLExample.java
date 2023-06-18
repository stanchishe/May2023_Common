package Loops;

import java.sql.Connection;
import java.sql.DriverManager;

public class WhileLoopSQLExample {
    public static void main(String[] args) throws InterruptedException {
        int triesCount = 0;
        Connection connection = null;

        while (connection == null && triesCount < 5) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/sample", "root", "pass");
            } catch (Exception e) {
                ++triesCount;
                System.out.println("Connection refused, retying in 2 seconds...");
                Thread.sleep(2000);
            }
        }
        if (connection != null) {
            System.out.println("Connection was established!");
        } else {
            System.out.println("Connection could not be established");
        }
    }
}
