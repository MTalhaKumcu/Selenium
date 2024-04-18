package stepDefinition;

import io.cucumber.java.en.Given;
import manage.QueryManage;
import utilities.JDBCResuableMethods;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StepDefinition {

    ResultSet resultSet;

    QueryManage queryManage = new QueryManage();

    String query;

    @Given("database connection")
    public void database_connection() {
        JDBCResuableMethods.getConnection();
    }


    @Given("query01 make query and execute")
    public void make_query_and_execute() throws SQLException {
        String query01 = "SELECT user_id FROM users WHERE salary BETWEEN 100 and 5000";
        resultSet = JDBCResuableMethods.getStatement().executeQuery(query01);
        //SELECT user_id FROM users WHERE salary > 100 and salary <5000;
    }

    @Given("resultSet01 process")
    public void resultSet_process() throws SQLException {
        resultSet.next();
        int actualResult = resultSet.getInt("user_id");
        int expectedResult = 21;
        assertEquals(expectedResult, actualResult);
    }

    @Given("db closed")
    public void db_closed() {
        JDBCResuableMethods.closeConnection();
    }

    /////// query02
    @Given("query02 make query and execute")
    public void query02_make_query_and_execute() throws SQLException {

        query = queryManage.getQuery02();
        resultSet = JDBCResuableMethods.getStatement().executeQuery(query);

    }

    @Given("resultSet02 process")
    public void result_set02_process() throws SQLException {

        //Doe
        //Doe
        List<String> expectedeName = new ArrayList<>();
        expectedeName.add("Doe");
        expectedeName.add("Doe");
        List<String> actualName = new ArrayList<>();

        while (resultSet.next()) {
            String userlastname = resultSet.getString("userlastname");
            actualName.add(userlastname);

        }

        for (int i = 0; i < actualName.size(); i++) {
            assertEquals(expectedeName.get(i),actualName.get(i));
            System.out.println(i+ " :)))))");
        }

    }

}
