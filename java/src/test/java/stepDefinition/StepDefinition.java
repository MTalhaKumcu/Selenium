package stepDefinition;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.JDBCResuable;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

public class StepDefinition {

    ResultSet resultSet;


    @Given("database connection")
    public void database_connection() {
        JDBCResuable.getConnection();
    }


    @Given("make query and execute")
    public void make_query_and_execute() throws SQLException {
        String query01 = "SELECT user_id FROM users WHERE salary BETWEEN 100 and 5000;";
        resultSet = JDBCResuable.getStatement().executeQuery(query01);
        //SELECT user_id FROM users WHERE salary > 100 and salary <5000;
    }

    @Given("resultSet process")
    public void result_set_process() throws SQLException {
        resultSet.next();
        int actualResult = resultSet.getInt("user_id");
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Given("db closed")
    public void db_closed() {
        JDBCResuable.closeConnection();
    }

}
