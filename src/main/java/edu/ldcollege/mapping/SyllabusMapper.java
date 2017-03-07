package edu.ldcollege.mapping;

import edu.ldcollege.domain.Syllabus;
import edu.ldcollege.domain.SyllabusExample;
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

public interface SyllabusMapper {
    @SelectProvider(type=SyllabusSqlProvider.class, method="countByExample")
    long countByExample(SyllabusExample example);

    @DeleteProvider(type=SyllabusSqlProvider.class, method="deleteByExample")
    int deleteByExample(SyllabusExample example);

    @Delete({
        "delete from syllabus",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into syllabus (id, courseId, ",
        "seq, title, type, ",
        "materialId, remark)",
        "values (#{id,jdbcType=INTEGER}, #{courseid,jdbcType=INTEGER}, ",
        "#{seq,jdbcType=INTEGER}, #{title,jdbcType=VARCHAR}, #{type,jdbcType=INTEGER}, ",
        "#{materialid,jdbcType=INTEGER}, #{remark,jdbcType=VARCHAR})"
    })
    int insert(Syllabus record);

    @InsertProvider(type=SyllabusSqlProvider.class, method="insertSelective")
    int insertSelective(Syllabus record);

    @SelectProvider(type=SyllabusSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="courseId", property="courseid", jdbcType=JdbcType.INTEGER),
        @Result(column="seq", property="seq", jdbcType=JdbcType.INTEGER),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="materialId", property="materialid", jdbcType=JdbcType.INTEGER),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR)
    })
    List<Syllabus> selectByExample(SyllabusExample example);

    @Select({
        "select",
        "id, courseId, seq, title, type, materialId, remark",
        "from syllabus",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="courseId", property="courseid", jdbcType=JdbcType.INTEGER),
        @Result(column="seq", property="seq", jdbcType=JdbcType.INTEGER),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="materialId", property="materialid", jdbcType=JdbcType.INTEGER),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR)
    })
    Syllabus selectByPrimaryKey(Integer id);

    @UpdateProvider(type=SyllabusSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Syllabus record, @Param("example") SyllabusExample example);

    @UpdateProvider(type=SyllabusSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Syllabus record, @Param("example") SyllabusExample example);

    @UpdateProvider(type=SyllabusSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Syllabus record);

    @Update({
        "update syllabus",
        "set courseId = #{courseid,jdbcType=INTEGER},",
          "seq = #{seq,jdbcType=INTEGER},",
          "title = #{title,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=INTEGER},",
          "materialId = #{materialid,jdbcType=INTEGER},",
          "remark = #{remark,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Syllabus record);
}