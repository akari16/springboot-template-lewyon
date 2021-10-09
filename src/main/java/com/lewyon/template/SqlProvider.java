package com.lewyon.template;

import com.lewyon.template.domain.People;
import org.apache.ibatis.jdbc.SQL;

/**
 * @param
 * @author Liuyuan
 * @return Result
 * @explain 查询对象
 * @aate 2021/10/9
 */
public class SqlProvider {
    /***
     * 使用MyBatis的SQL方法来更新sql语句
     *
     * @return
     */
    public String updatePeopleSql(People people) {

        //包含表名，要更新的字段，更新条件（id）
        //最后组装成新的SQL语句
        return new SQL() {{
            UPDATE("user");

            if (null != people.getName()) {
                SET("name=#{name}");
            }
            SET("age=#{age}");
            WHERE("id=#{id}");
        }}.toString();
    }
}
