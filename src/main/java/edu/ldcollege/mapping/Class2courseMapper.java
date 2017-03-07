package edu.ldcollege.mapping;

import edu.ldcollege.domain.Class2course;
import edu.ldcollege.domain.Class2courseExample;
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

public interface Class2courseMapper {
    @SelectProvider(type=Class2courseSqlProvider.class, method="countByExample")
    long countByExample(Class2courseExample example);

    @DeleteProvider(type=Class2courseSqlProvider.class, method="deleteByExample")
    int deleteByExample(Class2courseExample example);

    @Delete({
        "delete from class2course",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into class2course (id, classId, ",
        "courseId, createTime, ",
        "state)",
        "values (#{id,jdbcType=INTEGER}, #{classid,jdbcType=INTEGER}, ",
        "#{courseid,jdbcType=INTEGER}, #{createtime,jdbcType=TIMESTAMP}, ",
        "#{state,jdbcType=INTEGER})"
    })
    int insert(Class2course record);

    @InsertProvider(type=Class2courseSqlProvider.class, method="insertSelective")
    int insertSelective(Class2course record);

    @SelectProvider(type=Class2courseSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="classId", property="classid", jdbcType=JdbcType.INTEGER),
        @Result(column="courseId", property="courseid", jdbcType=JdbcType.INTEGER),
        @Result(column="createTime", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="state", property="state", jdbcType=JdbcType.INTEGER)
    })
    List<Class2course> selectByExample(Class2courseExample example);

    @Select({
        "select",
        "id, classId, courseId, createTime, state",
        "from class2course",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="classId", property="classid", jdbcType=JdbcType.INTEGER),
        @Result(column="courseId", property="courseid", jdbcType=JdbcType.INTEGER),
        @Result(column="createTime", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="state", property="state", jdbcType=JdbcType.INTEGER)
    })
    Class2course selectByPrimaryKey(Integer id);

    @UpdateProvider(type=Class2courseSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Class2course record, @Param("example") Class2courseExample example);

    @UpdateProvider(type=Class2courseSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Class2course record, @Param("example") Class2courseExample example);

    @UpdateProvider(type=Class2courseSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Class2course record);

    @Update({
        "update class2course",
        "set classId = #{classid,jdbcType=INTEGER},",
          "courseId = #{courseid,jdbcType=INTEGER},",
          "createTime = #{createtime,jdbcType=TIMESTAMP},",
          "state = #{state,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Class2course record);
}