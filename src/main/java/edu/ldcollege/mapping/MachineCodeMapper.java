package edu.ldcollege.mapping;

import edu.ldcollege.domain.MachineCode;
import edu.ldcollege.domain.MachineCodeExample;
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

public interface MachineCodeMapper {
    @SelectProvider(type=MachineCodeSqlProvider.class, method="countByExample")
    long countByExample(MachineCodeExample example);

    @DeleteProvider(type=MachineCodeSqlProvider.class, method="deleteByExample")
    int deleteByExample(MachineCodeExample example);

    @Delete({
        "delete from machineCode",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into machineCode (id, userId, ",
        "name, nameSpell, ",
        "code, qq, type, ",
        "createtime)",
        "values (#{id,jdbcType=INTEGER}, #{userid,jdbcType=INTEGER}, ",
        "#{name,jdbcType=VARCHAR}, #{namespell,jdbcType=VARCHAR}, ",
        "#{code,jdbcType=VARCHAR}, #{qq,jdbcType=VARCHAR}, #{type,jdbcType=INTEGER}, ",
        "#{createtime,jdbcType=TIMESTAMP})"
    })
    int insert(MachineCode record);

    @InsertProvider(type=MachineCodeSqlProvider.class, method="insertSelective")
    int insertSelective(MachineCode record);

    @SelectProvider(type=MachineCodeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="userId", property="userid", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="nameSpell", property="namespell", jdbcType=JdbcType.VARCHAR),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="qq", property="qq", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="createtime", property="createtime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<MachineCode> selectByExample(MachineCodeExample example);

    @Select({
        "select",
        "id, userId, name, nameSpell, code, qq, type, createtime",
        "from machineCode",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="userId", property="userid", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="nameSpell", property="namespell", jdbcType=JdbcType.VARCHAR),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="qq", property="qq", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="createtime", property="createtime", jdbcType=JdbcType.TIMESTAMP)
    })
    MachineCode selectByPrimaryKey(Integer id);

    @UpdateProvider(type=MachineCodeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MachineCode record, @Param("example") MachineCodeExample example);

    @UpdateProvider(type=MachineCodeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MachineCode record, @Param("example") MachineCodeExample example);

    @UpdateProvider(type=MachineCodeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MachineCode record);

    @Update({
        "update machineCode",
        "set userId = #{userid,jdbcType=INTEGER},",
          "name = #{name,jdbcType=VARCHAR},",
          "nameSpell = #{namespell,jdbcType=VARCHAR},",
          "code = #{code,jdbcType=VARCHAR},",
          "qq = #{qq,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=INTEGER},",
          "createtime = #{createtime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MachineCode record);
}