package edu.ldcollege.mapping;

import edu.ldcollege.domain.LdClass;
import edu.ldcollege.domain.LdClassExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface LdClassMapper {
    @SelectProvider(type=LdClassSqlProvider.class, method="countByExample")
    long countByExample(LdClassExample example);

    @DeleteProvider(type=LdClassSqlProvider.class, method="deleteByExample")
    int deleteByExample(LdClassExample example);

    @Delete({
        "delete from ld_class",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into ld_class (id, className, ",
        "createTime, endTime, ",
        "remark, monitor_name, ",
        "commissary_name, curNormalStudents, ",
        "cur_arrearaged_students, droped_students)",
        "values (#{id,jdbcType=INTEGER}, #{classname,jdbcType=VARCHAR}, ",
        "#{createtime,jdbcType=TIMESTAMP}, #{endtime,jdbcType=TIMESTAMP}, ",
        "#{remark,jdbcType=VARCHAR}, #{monitorName,jdbcType=VARCHAR}, ",
        "#{commissaryName,jdbcType=VARCHAR}, #{curnormalstudents,jdbcType=INTEGER}, ",
        "#{curArrearagedStudents,jdbcType=INTEGER}, #{dropedStudents,jdbcType=INTEGER})"
    })
    int insert(LdClass record);

    @InsertProvider(type=LdClassSqlProvider.class, method="insertSelective")
    int insertSelective(LdClass record);

    @SelectProvider(type=LdClassSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="className", property="classname", jdbcType=JdbcType.VARCHAR),
        @Result(column="createTime", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="endTime", property="endtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="monitor_name", property="monitorName", jdbcType=JdbcType.VARCHAR),
        @Result(column="commissary_name", property="commissaryName", jdbcType=JdbcType.VARCHAR),
        @Result(column="curNormalStudents", property="curnormalstudents", jdbcType=JdbcType.INTEGER),
        @Result(column="cur_arrearaged_students", property="curArrearagedStudents", jdbcType=JdbcType.INTEGER),
        @Result(column="droped_students", property="dropedStudents", jdbcType=JdbcType.INTEGER)
    })
    List<LdClass> selectByExample(LdClassExample example);


    @Select({
        "select c.* ",
        "from ld_class c,user2class uc ",
        "where c.id = uc.classId and ",
        "uc.userId = #{userId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="className", property="classname", jdbcType=JdbcType.VARCHAR),
        @Result(column="createTime", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="endTime", property="endtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="monitor_name", property="monitorName", jdbcType=JdbcType.VARCHAR),
        @Result(column="commissary_name", property="commissaryName", jdbcType=JdbcType.VARCHAR),
        @Result(column="curNormalStudents", property="curnormalstudents", jdbcType=JdbcType.INTEGER),
        @Result(column="cur_arrearaged_students", property="curArrearagedStudents", jdbcType=JdbcType.INTEGER),
        @Result(column="droped_students", property="dropedStudents", jdbcType=JdbcType.INTEGER)
    })
    List<LdClass> selectByUserId(Integer userId);

    @Select({
        "select",
        "id, className, createTime, endTime, remark, monitor_name, commissary_name, curNormalStudents, ",
        "cur_arrearaged_students, droped_students",
        "from ld_class",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="className", property="classname", jdbcType=JdbcType.VARCHAR),
        @Result(column="createTime", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="endTime", property="endtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="monitor_name", property="monitorName", jdbcType=JdbcType.VARCHAR),
        @Result(column="commissary_name", property="commissaryName", jdbcType=JdbcType.VARCHAR),
        @Result(column="curNormalStudents", property="curnormalstudents", jdbcType=JdbcType.INTEGER),
        @Result(column="cur_arrearaged_students", property="curArrearagedStudents", jdbcType=JdbcType.INTEGER),
        @Result(column="droped_students", property="dropedStudents", jdbcType=JdbcType.INTEGER)
    })
    LdClass selectByPrimaryKey(Integer id);

    @UpdateProvider(type=LdClassSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") LdClass record, @Param("example") LdClassExample example);

    @UpdateProvider(type=LdClassSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") LdClass record, @Param("example") LdClassExample example);

    @UpdateProvider(type=LdClassSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LdClass record);

    @Update({
        "update ld_class",
        "set className = #{classname,jdbcType=VARCHAR},",
          "createTime = #{createtime,jdbcType=TIMESTAMP},",
          "endTime = #{endtime,jdbcType=TIMESTAMP},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "monitor_name = #{monitorName,jdbcType=VARCHAR},",
          "commissary_name = #{commissaryName,jdbcType=VARCHAR},",
          "curNormalStudents = #{curnormalstudents,jdbcType=INTEGER},",
          "cur_arrearaged_students = #{curArrearagedStudents,jdbcType=INTEGER},",
          "droped_students = #{dropedStudents,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LdClass record);
}