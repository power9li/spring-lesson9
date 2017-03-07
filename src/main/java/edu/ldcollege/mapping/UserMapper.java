package edu.ldcollege.mapping;

import edu.ldcollege.domain.User;
import edu.ldcollege.domain.UserExample;
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

public interface UserMapper {
    @SelectProvider(type=UserSqlProvider.class, method="countByExample")
    long countByExample(UserExample example);

    @DeleteProvider(type=UserSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserExample example);

    @Delete({
        "delete from user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into user (id, qq, ",
        "password, token, ",
        "name, nameSpell, ",
        "email, sex, age, ",
        "education, workYear, ",
        "province, city, ",
        "phone, company, ",
        "selfIntroduction, weixin, ",
        "createTime, remark)",
        "values (#{id,jdbcType=INTEGER}, #{qq,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{token,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{namespell,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{sex,jdbcType=INTEGER}, #{age,jdbcType=INTEGER}, ",
        "#{education,jdbcType=VARCHAR}, #{workyear,jdbcType=INTEGER}, ",
        "#{province,jdbcType=VARCHAR}, #{city,jdbcType=VARCHAR}, ",
        "#{phone,jdbcType=VARCHAR}, #{company,jdbcType=VARCHAR}, ",
        "#{selfintroduction,jdbcType=VARCHAR}, #{weixin,jdbcType=VARCHAR}, ",
        "#{createtime,jdbcType=TIMESTAMP}, #{remark,jdbcType=VARCHAR})"
    })
    int insert(User record);

    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    int insertSelective(User record);

    @SelectProvider(type=UserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="qq", property="qq", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="token", property="token", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="nameSpell", property="namespell", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.INTEGER),
        @Result(column="age", property="age", jdbcType=JdbcType.INTEGER),
        @Result(column="education", property="education", jdbcType=JdbcType.VARCHAR),
        @Result(column="workYear", property="workyear", jdbcType=JdbcType.INTEGER),
        @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="company", property="company", jdbcType=JdbcType.VARCHAR),
        @Result(column="selfIntroduction", property="selfintroduction", jdbcType=JdbcType.VARCHAR),
        @Result(column="weixin", property="weixin", jdbcType=JdbcType.VARCHAR),
        @Result(column="createTime", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR)
    })
    List<User> selectByExample(UserExample example);

    @Select({
        "select",
        "id, qq, password, token, name, nameSpell, email, sex, age, education, workYear, ",
        "province, city, phone, company, selfIntroduction, weixin, createTime, remark",
        "from user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="qq", property="qq", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="token", property="token", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="nameSpell", property="namespell", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.INTEGER),
        @Result(column="age", property="age", jdbcType=JdbcType.INTEGER),
        @Result(column="education", property="education", jdbcType=JdbcType.VARCHAR),
        @Result(column="workYear", property="workyear", jdbcType=JdbcType.INTEGER),
        @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="company", property="company", jdbcType=JdbcType.VARCHAR),
        @Result(column="selfIntroduction", property="selfintroduction", jdbcType=JdbcType.VARCHAR),
        @Result(column="weixin", property="weixin", jdbcType=JdbcType.VARCHAR),
        @Result(column="createTime", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR)
    })
    User selectByPrimaryKey(Integer id);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    @Update({
        "update user",
        "set qq = #{qq,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "token = #{token,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "nameSpell = #{namespell,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "sex = #{sex,jdbcType=INTEGER},",
          "age = #{age,jdbcType=INTEGER},",
          "education = #{education,jdbcType=VARCHAR},",
          "workYear = #{workyear,jdbcType=INTEGER},",
          "province = #{province,jdbcType=VARCHAR},",
          "city = #{city,jdbcType=VARCHAR},",
          "phone = #{phone,jdbcType=VARCHAR},",
          "company = #{company,jdbcType=VARCHAR},",
          "selfIntroduction = #{selfintroduction,jdbcType=VARCHAR},",
          "weixin = #{weixin,jdbcType=VARCHAR},",
          "createTime = #{createtime,jdbcType=TIMESTAMP},",
          "remark = #{remark,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(User record);
}