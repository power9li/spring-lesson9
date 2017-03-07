package edu.ldcollege.mapping;

import edu.ldcollege.domain.Test;
import edu.ldcollege.domain.TestExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface TestMapper {
    @SelectProvider(type=TestSqlProvider.class, method="countByExample")
    long countByExample(TestExample example);

    @DeleteProvider(type=TestSqlProvider.class, method="deleteByExample")
    int deleteByExample(TestExample example);

    @Delete({
        "delete from test",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into test (id, username, ",
        "password, create_time)",
        "values (#{id,jdbcType=INTEGER}, #{username,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP})"
    })
    int insert(Test record);

    @InsertProvider(type=TestSqlProvider.class, method="insertSelective")
    int insertSelective(Test record);

    @SelectProvider(type=TestSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Test> selectByExample(TestExample example);

    @Select({
        "select",
        "id, username, password, create_time",
        "from test",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    Test selectByPrimaryKey(Integer id);

    @UpdateProvider(type=TestSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Test record, @Param("example") TestExample example);

    @UpdateProvider(type=TestSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Test record, @Param("example") TestExample example);

    @UpdateProvider(type=TestSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Test record);

    @Update({
        "update test",
        "set username = #{username,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Test record);
}