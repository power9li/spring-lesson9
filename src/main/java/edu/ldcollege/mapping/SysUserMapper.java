package edu.ldcollege.mapping;

import edu.ldcollege.domain.SysUser;
import edu.ldcollege.domain.SysUserExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface SysUserMapper {
    @SelectProvider(type=SysUserSqlProvider.class, method="countByExample")
    long countByExample(SysUserExample example);

    @DeleteProvider(type=SysUserSqlProvider.class, method="deleteByExample")
    int deleteByExample(SysUserExample example);

    @Delete({
        "delete from sys_user",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into sys_user (id, usercode, ",
        "username, password, ",
        "salt, locked, role)",
        "values (#{id,jdbcType=VARCHAR}, #{usercode,jdbcType=VARCHAR}, ",
        "#{username,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{salt,jdbcType=VARCHAR}, #{locked,jdbcType=CHAR}, #{role,jdbcType=VARCHAR})"
    })
    int insert(SysUser record);

    @InsertProvider(type=SysUserSqlProvider.class, method="insertSelective")
    int insertSelective(SysUser record);

    @SelectProvider(type=SysUserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="usercode", property="usercode", jdbcType=JdbcType.VARCHAR),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="salt", property="salt", jdbcType=JdbcType.VARCHAR),
        @Result(column="locked", property="locked", jdbcType=JdbcType.CHAR),
        @Result(column="role", property="role", jdbcType=JdbcType.VARCHAR)
    })
    List<SysUser> selectByExample(SysUserExample example);

    @Select({
        "select",
        "id, usercode, username, password, salt, locked, role",
        "from sys_user",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="usercode", property="usercode", jdbcType=JdbcType.VARCHAR),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="salt", property="salt", jdbcType=JdbcType.VARCHAR),
        @Result(column="locked", property="locked", jdbcType=JdbcType.CHAR),
        @Result(column="role", property="role", jdbcType=JdbcType.VARCHAR)
    })
    SysUser selectByPrimaryKey(String id);

    @UpdateProvider(type=SysUserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    @UpdateProvider(type=SysUserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    @UpdateProvider(type=SysUserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SysUser record);

    @Update({
        "update sys_user",
        "set usercode = #{usercode,jdbcType=VARCHAR},",
          "username = #{username,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "salt = #{salt,jdbcType=VARCHAR},",
          "locked = #{locked,jdbcType=CHAR},",
          "role = #{role,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(SysUser record);
}