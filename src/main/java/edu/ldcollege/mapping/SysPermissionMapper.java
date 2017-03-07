package edu.ldcollege.mapping;

import edu.ldcollege.domain.SysPermission;
import edu.ldcollege.domain.SysPermissionExample;
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

public interface SysPermissionMapper {
    @SelectProvider(type=SysPermissionSqlProvider.class, method="countByExample")
    long countByExample(SysPermissionExample example);

    @DeleteProvider(type=SysPermissionSqlProvider.class, method="deleteByExample")
    int deleteByExample(SysPermissionExample example);

    @Delete({
        "delete from sys_permission",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into sys_permission (id, name, ",
        "type, url, percode, ",
        "parentid, parentids, ",
        "sortstring, available)",
        "values (#{id,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, ",
        "#{type,jdbcType=VARCHAR}, #{url,jdbcType=VARCHAR}, #{percode,jdbcType=VARCHAR}, ",
        "#{parentid,jdbcType=BIGINT}, #{parentids,jdbcType=VARCHAR}, ",
        "#{sortstring,jdbcType=VARCHAR}, #{available,jdbcType=CHAR})"
    })
    int insert(SysPermission record);

    @InsertProvider(type=SysPermissionSqlProvider.class, method="insertSelective")
    int insertSelective(SysPermission record);

    @SelectProvider(type=SysPermissionSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="percode", property="percode", jdbcType=JdbcType.VARCHAR),
        @Result(column="parentid", property="parentid", jdbcType=JdbcType.BIGINT),
        @Result(column="parentids", property="parentids", jdbcType=JdbcType.VARCHAR),
        @Result(column="sortstring", property="sortstring", jdbcType=JdbcType.VARCHAR),
        @Result(column="available", property="available", jdbcType=JdbcType.CHAR)
    })
    List<SysPermission> selectByExample(SysPermissionExample example);

    @Select({
        "select",
        "id, name, type, url, percode, parentid, parentids, sortstring, available",
        "from sys_permission",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="percode", property="percode", jdbcType=JdbcType.VARCHAR),
        @Result(column="parentid", property="parentid", jdbcType=JdbcType.BIGINT),
        @Result(column="parentids", property="parentids", jdbcType=JdbcType.VARCHAR),
        @Result(column="sortstring", property="sortstring", jdbcType=JdbcType.VARCHAR),
        @Result(column="available", property="available", jdbcType=JdbcType.CHAR)
    })
    SysPermission selectByPrimaryKey(Long id);

    @UpdateProvider(type=SysPermissionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SysPermission record, @Param("example") SysPermissionExample example);

    @UpdateProvider(type=SysPermissionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SysPermission record, @Param("example") SysPermissionExample example);

    @UpdateProvider(type=SysPermissionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SysPermission record);

    @Update({
        "update sys_permission",
        "set name = #{name,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=VARCHAR},",
          "url = #{url,jdbcType=VARCHAR},",
          "percode = #{percode,jdbcType=VARCHAR},",
          "parentid = #{parentid,jdbcType=BIGINT},",
          "parentids = #{parentids,jdbcType=VARCHAR},",
          "sortstring = #{sortstring,jdbcType=VARCHAR},",
          "available = #{available,jdbcType=CHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SysPermission record);
}