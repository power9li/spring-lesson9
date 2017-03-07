package edu.ldcollege.mapping;

import edu.ldcollege.domain.PlayCode;
import edu.ldcollege.domain.PlayCodeExample;
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

public interface PlayCodeMapper {
    @SelectProvider(type=PlayCodeSqlProvider.class, method="countByExample")
    long countByExample(PlayCodeExample example);

    @DeleteProvider(type=PlayCodeSqlProvider.class, method="deleteByExample")
    int deleteByExample(PlayCodeExample example);

    @Delete({
        "delete from playCode",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into playCode (id, userId, ",
        "encryptionBatch, machineCode, ",
        "createTime, code, ",
        "ValidityPeriod, type, ",
        "state)",
        "values (#{id,jdbcType=INTEGER}, #{userid,jdbcType=INTEGER}, ",
        "#{encryptionbatch,jdbcType=VARCHAR}, #{machinecode,jdbcType=VARCHAR}, ",
        "#{createtime,jdbcType=TIMESTAMP}, #{code,jdbcType=VARCHAR}, ",
        "#{validityperiod,jdbcType=INTEGER}, #{type,jdbcType=INTEGER}, ",
        "#{state,jdbcType=INTEGER})"
    })
    int insert(PlayCode record);

    @InsertProvider(type=PlayCodeSqlProvider.class, method="insertSelective")
    int insertSelective(PlayCode record);

    @SelectProvider(type=PlayCodeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="userId", property="userid", jdbcType=JdbcType.INTEGER),
        @Result(column="encryptionBatch", property="encryptionbatch", jdbcType=JdbcType.VARCHAR),
        @Result(column="machineCode", property="machinecode", jdbcType=JdbcType.VARCHAR),
        @Result(column="createTime", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="ValidityPeriod", property="validityperiod", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="state", property="state", jdbcType=JdbcType.INTEGER)
    })
    List<PlayCode> selectByExample(PlayCodeExample example);

    @Select({
        "select",
        "id, userId, encryptionBatch, machineCode, createTime, code, ValidityPeriod, ",
        "type, state",
        "from playCode",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="userId", property="userid", jdbcType=JdbcType.INTEGER),
        @Result(column="encryptionBatch", property="encryptionbatch", jdbcType=JdbcType.VARCHAR),
        @Result(column="machineCode", property="machinecode", jdbcType=JdbcType.VARCHAR),
        @Result(column="createTime", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="ValidityPeriod", property="validityperiod", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="state", property="state", jdbcType=JdbcType.INTEGER)
    })
    PlayCode selectByPrimaryKey(Integer id);

    @UpdateProvider(type=PlayCodeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") PlayCode record, @Param("example") PlayCodeExample example);

    @UpdateProvider(type=PlayCodeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") PlayCode record, @Param("example") PlayCodeExample example);

    @UpdateProvider(type=PlayCodeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PlayCode record);

    @Update({
        "update playCode",
        "set userId = #{userid,jdbcType=INTEGER},",
          "encryptionBatch = #{encryptionbatch,jdbcType=VARCHAR},",
          "machineCode = #{machinecode,jdbcType=VARCHAR},",
          "createTime = #{createtime,jdbcType=TIMESTAMP},",
          "code = #{code,jdbcType=VARCHAR},",
          "ValidityPeriod = #{validityperiod,jdbcType=INTEGER},",
          "type = #{type,jdbcType=INTEGER},",
          "state = #{state,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PlayCode record);
}