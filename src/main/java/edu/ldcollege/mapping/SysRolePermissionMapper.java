package edu.ldcollege.mapping;

import edu.ldcollege.domain.SysRolePermission;
import edu.ldcollege.domain.SysRolePermissionExample;
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

public interface SysRolePermissionMapper {
    @SelectProvider(type=SysRolePermissionSqlProvider.class, method="countByExample")
    long countByExample(SysRolePermissionExample example);

    @DeleteProvider(type=SysRolePermissionSqlProvider.class, method="deleteByExample")
    int deleteByExample(SysRolePermissionExample example);

    @Delete({
        "delete from sys_role_permission",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into sys_role_permission (id, sys_role_id, ",
        "sys_permission_id)",
        "values (#{id,jdbcType=VARCHAR}, #{sysRoleId,jdbcType=VARCHAR}, ",
        "#{sysPermissionId,jdbcType=VARCHAR})"
    })
    int insert(SysRolePermission record);

    @InsertProvider(type=SysRolePermissionSqlProvider.class, method="insertSelective")
    int insertSelective(SysRolePermission record);

    @SelectProvider(type=SysRolePermissionSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="sys_role_id", property="sysRoleId", jdbcType=JdbcType.VARCHAR),
        @Result(column="sys_permission_id", property="sysPermissionId", jdbcType=JdbcType.VARCHAR)
    })
    List<SysRolePermission> selectByExample(SysRolePermissionExample example);

    @Select({
        "select",
        "id, sys_role_id, sys_permission_id",
        "from sys_role_permission",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="sys_role_id", property="sysRoleId", jdbcType=JdbcType.VARCHAR),
        @Result(column="sys_permission_id", property="sysPermissionId", jdbcType=JdbcType.VARCHAR)
    })
    SysRolePermission selectByPrimaryKey(String id);

    @UpdateProvider(type=SysRolePermissionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SysRolePermission record, @Param("example") SysRolePermissionExample example);

    @UpdateProvider(type=SysRolePermissionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SysRolePermission record, @Param("example") SysRolePermissionExample example);

    @UpdateProvider(type=SysRolePermissionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SysRolePermission record);

    @Update({
        "update sys_role_permission",
        "set sys_role_id = #{sysRoleId,jdbcType=VARCHAR},",
          "sys_permission_id = #{sysPermissionId,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(SysRolePermission record);
}