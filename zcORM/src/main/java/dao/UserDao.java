package dao;

import bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@Component
public class UserDao {

    @Autowired
    private DataSource dataSource;

    public void addUser(User user) throws SQLException {
        try (
                // 1、获取连接
                Connection conn = DataSourceUtils.getConnection(dataSource);
                // 2、创建预编译语句对象
                PreparedStatement pst = conn.prepareStatement(
                        "insert into t_user(id,name,sex,age) "
                                + " values(?,?,?,?)");) {
            // 3、设置参数值
            int i = 1;
            pst.setString(i++, user.getId());
            pst.setString(i++, user.getName());
            pst.setString(i++, user.getSex());
            pst.setInt(i++, user.getAge());
            // 4、执行语句
            int changeRows = pst.executeUpdate();
        }
    }

    public List<User> queryUsers(String likeName, int minAge, int maxAge, String sex) throws SQLException {
        // 1、根据查询条件动态拼接SQL语句
        StringBuffer sql = new StringBuffer(
                "select id,name,sex,age from t_user where 1 = 1 ");
        if (minAge >= 0) {
            sql.append(" and age >= ? ");
        }
        if (maxAge >= 0) {
            sql.append(" and age <= ? ");
        }
        try (Connection conn = DataSourceUtils.getConnection(dataSource);
             PreparedStatement pst = conn.prepareStatement(sql.toString());) {
            // 2 设置查询语句参数值
            int i = 1;
            if (minAge >= 0) {
                pst.setInt(i++, minAge);
            }
            if (maxAge >= 0) {
                pst.setInt(i++, maxAge);
            }
            // 3 执行查询
            ResultSet rs = pst.executeQuery();

            // 4、提取结果集
            List<User> list = new ArrayList<>();
            User u;
            while (rs.next()) {
                u = new User();
                list.add(u);
                u.setId(rs.getString("id"));
                u.setName(rs.getString("name"));
                u.setSex(rs.getString("sex"));
                u.setAge(rs.getInt("age"));
            }
            rs.close();
            return list;
        }
    }
}