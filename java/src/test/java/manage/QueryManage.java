package manage;

public class QueryManage {

    private String query02 = "SELECT userlastname FROM java.users LIMIT 2 ;";
    private String query03Phone = "UPDATE java.users SET userphonenumber = 122333444 WHERE username LIKE '%e';";

    private String insertQuery01 = "INSERT INTO java.users(username,userlastname,email,age,salary,userphonenumber) VALUES (?,?,?,?,?,?);";

    private String deleteQuery01 = "DELETE FROM java.users WHERE user_id = ?;";
    private String deleteControlQuery ="SELECT * FROM java.users WHERE user_id = ?;";

    public String getDeleteControlQuery() {
        return deleteControlQuery;
    }

    public String getDeleteQuery01() {
        return deleteQuery01;
    }

    public String getInsertQuery01() {
        return insertQuery01;
    }

    public void setInsertQuery01(String insertQuery01) {
        this.insertQuery01 = insertQuery01;
    }

    public String getQuery04() {
        return query04;
    }

    private String query04 = "UPDATE java.users SET userphonenumber = ? WHERE username LIKE ?;";


    public String getQuery03Phone() {
        return query03Phone;
    }

    public String getQuery02() {
        return query02;

    }


}
