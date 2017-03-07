package edu.ldcollege.mapping;

import edu.ldcollege.domain.SysUserRole;
import edu.ldcollege.domain.SysUserRoleExample;
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

public interface SysUserRoleMapper {
    @SelectProvider(type=SysUserRoleSqlProvider.class, method="countByExample")
    long countByExample(SysUserRoleExample example);

    @DeleteProvider(type=SysUserRoleSqlProvider.class, method="deleteByExample")
    int deleteByExample(SysUserRoleExample example);

    @Delete({
        "delete from sys_user_role",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into sys_user_role (id, sys_user_id, ",
        "sys_role_id)",
        "values (#{id,jdbcType=VARCHAR}, #{sysUserId,jdbcType=VARCHAR}, ",
        "#{sysRoleId,jdbcType=VARCHAR})"
    })
    int insert(SysUserRole record);

    @InsertProvider(type=SysUserRoleSqlProvider.class, method="insertSelective")
    int insertSelective(SysUserRole record);

    @SelectProvider(type=SysUserRoleSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="sys_user_id", property="sysUserId", jdbcType=JdbcType.VARCHAR),
        @Result(column="sys_role_id", property="sysRoleId", jdbcType=JdbcType.VARCHAR)
    })
    List<SysUserRole> selectByExample(SysUserRoleExample example);

    @Select({
        "select",
        "id, sys_user_id, sys_role_id",
        "from sys_user_role",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="sys_user_id", property="sysUserId", jdbcType=JdbcType.VARCHAR),
        @Result(column="sys_role_id", property="sysRoleId", jdbcType=JdbcType.VARCHAR)
    })
    SysUserRole selectByPrimaryKey(String id);

    @UpdateProvider(type=SysUserRoleSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SysUserRole record, @Param("example") SysUserRoleExample example);

    @UpdateProvider(type=SysUserRoleSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SysUserRole record, @Param("example") SysUserRoleExample example);

    @UpdateProvider(type=SysUserRoleSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SysUserRole record);

    @Update({
        "update sys_user_role",
        "set sys_user_id = #{sysUserId,jdbcType=VARCHAR},",
          "sys_role_id = #{sysRoleId,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(SysUserRole record);
}