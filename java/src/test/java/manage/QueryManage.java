package manage;

public class QueryManage {

    private String query02 = "SELECT userlastname FROM java.users LIMIT 2 ;";
    private String query03Phone = "UPDATE java.users SET userphonenumber = 122333444 WHERE username LIKE '%e';";

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
