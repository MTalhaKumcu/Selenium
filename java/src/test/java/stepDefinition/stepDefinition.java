package stepDefinition;

import io.cucumber.java.en.Given;
import manage.QueryManage;
import org.checkerframework.checker.units.qual.C;
import utilities.ConfigReader;
import utilities.JDBCResuableMethods;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class stepDefinition {

    PreparedStatement preparedStatement;

    ResultSet resultSet;

    QueryManage queryManage = new QueryManage();

    String query;

    int rowCount;

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
            assertEquals(expectedeName.get(i), actualName.get(i));
            System.out.println(i + " :)))))");
        }


        //---------------------- update queary 01 (normal statement) ------------------


    }

    @Given("query03 update and execution")
    public void query03_update_and_execution() throws SQLException {

        query = queryManage.getQuery03Phone();
        rowCount = JDBCResuableMethods.updateQuery(query);
    }

    @Given("query03 resultset process")
    public void query03_resultset_process() {

        assertEquals(18, rowCount);
    }

    //---------------------- update queary 02 (prepared statement) ------------------

    @Given("query04 update and execution")
    public void query04_update_and_execution() throws SQLException {
        query = queryManage.getQuery04();
        preparedStatement = JDBCResuableMethods.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, 321123321);
        preparedStatement.setString(2, "%e");

        preparedStatement.executeUpdate();
    }

    @Given("query04 resultset process")
    public void query04_resultset_process() {
        assertEquals(0, rowCount);
    }
    //---------------------- insert queary 01 ------------------

    @Given("insertQuery setup and execute")
    public void insert_query_setup_and_execute() throws SQLException {
        query = queryManage.getInsertQuery01();
        preparedStatement = JDBCResuableMethods.getConnection().prepareStatement(query);

        preparedStatement.setString(1, "Talha");
        preparedStatement.setString(2, "Talha");
        preparedStatement.setString(3, "Talha@example.com");
        preparedStatement.setInt(4, 35);
        preparedStatement.setInt(5, 21111);
        preparedStatement.setInt(6, 100000000);

        rowCount = preparedStatement.executeUpdate();
    }

    @Given("intsertQuery resultset verify")
    public void intsert_query_resultset_verify() {
        assertEquals(1, rowCount);
    }


    //-------------------- delete query 01 ------------------
    @Given("delete query and execute")
    public void delete_query_and_execute() throws SQLException {
        query = queryManage.getDeleteQuery01();
        preparedStatement = JDBCResuableMethods.getConnection().prepareStatement(query);

        int deletedID = 40;
        //   String deletedID = ConfigReader.getProperty("DELETEDQUERY"); alttaki setInt`leri Stringe cevir

        preparedStatement.setInt(1, deletedID);
        rowCount = preparedStatement.executeUpdate();

        System.out.println(rowCount);
        assertEquals(1, rowCount);

        String controlQuery = queryManage.getDeleteControlQuery();
        preparedStatement = JDBCResuableMethods.getConnection().prepareStatement(controlQuery);

        preparedStatement.setInt(1, deletedID);
        resultSet = preparedStatement.executeQuery();

        assertFalse(resultSet.next());


    }

    @Given("verify deleted data")
    public void verify_deleted_data() {
        // burada olmasi gereken kodlari yukaridaki methoda tasidik
    }

//---------------------- insert and delete query 02 ------------------

    @Given("insert user into user db")
    public void insert_user_into_user_db() throws SQLException {
        query = queryManage.getInsertQuery02();
        preparedStatement = JDBCResuableMethods.getConnection().prepareStatement(query);
        // "INSERT INTO java.users(username,userlastname,email) VALUES (?,?,?);"
        /*
        *
        * USERSNAME="ATILLA"
          USERLASTNAME="ALP"
          EMAIL="ATILLA@ALP.COM"
          AGE="20"
          SALARY="999999"
          USERPHONENUMBER="555555555"
        * */
        preparedStatement.setString(1, ConfigReader.getProperty("USERSNAME"));
        preparedStatement.setString(2, ConfigReader.getProperty("USERLASTNAME"));
        preparedStatement.setString(3, ConfigReader.getProperty("EMAIL"));
    /*   preparedStatement.setString(4, ConfigReader.getProperty("AGE"));
        preparedStatement.setS(5, Integer.parseInt(ConfigReader.getProperty("SALARY")));
        preparedStatement.setInt(6, Integer.parseInt(ConfigReader.getProperty("USERPHONENUMBER")));*/

        rowCount = preparedStatement.executeUpdate();

        System.out.println(rowCount);
        assertEquals(1, rowCount);

    }

    @Given("delete usertelefon from user table")
    public void delete_usertelefon_from_user_table() throws SQLException {

        int lastRow = 48;

        query = queryManage.getDeleteQuery02();
        preparedStatement = JDBCResuableMethods.getConnection().prepareStatement(query);

        preparedStatement.setInt(1, lastRow);
        rowCount = preparedStatement.executeUpdate();

        //ROW 48
    }

    @Given("verify deleted last data")
    public void verify_deleted_last_data() {


    }
}
