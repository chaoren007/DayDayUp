package template;

import bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//@Component
public class UserDaoUseJdbcTemplate {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addUser(User user) throws SQLException {
        String sql = "insert into t_user(id,name,sex,age,address,phone,weChat,email,account,password) "
                + " values(?,?,?,?,?,?,?,?,?,?)";
//        jdbcTemplate.update(sql, user.getId(), user.getName(), user.getSex(), user.getAge(), user.getAddress(),
//                user.getPhone(), user.getWeChat(), user.getEmail(), user.getAccount(), user.getPassword());
    }

    public List<User> queryUsers(String likeName, int minAge, int maxAge, String sex) throws SQLException {
        // 1、根据查询条件动态拼接SQL语句
        StringBuffer sql = new StringBuffer(
                "select id,name,sex,age,address,phone,wechat,email,account,password from t_user where 1 = 1 ");
        List<Object> argList = new ArrayList<>();

        if (minAge >= 0) {
            sql.append(" and age >= ? ");
            argList.add(minAge);
        }

        if (maxAge >= 0) {
            sql.append(" and age <= ? ");
            argList.add(maxAge);
        }

        return jdbcTemplate.query(sql.toString(), argList.toArray(), new RowMapper() {
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User u = new User();
                u.setId(rs.getString("id"));
                u.setName(rs.getString("name"));
                u.setSex(rs.getString("sex"));
                u.setAge(rs.getInt("age"));
                u.setPhone(rs.getString("phone"));
                u.setEmail(rs.getString("email"));
                u.setWeChat(rs.getString("wechat"));
                u.setAccount(rs.getString("account"));
                u.setPassword(rs.getString("password"));

                return u;
            }
        });
    }
}
