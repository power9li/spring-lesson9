package edu.ldcollege.mapping;

import edu.ldcollege.domain.Course;
import edu.ldcollege.domain.CourseExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface CourseMapper {
    @SelectProvider(type=CourseSqlProvider.class, method="countByExample")
    long countByExample(CourseExample example);

    @DeleteProvider(type=CourseSqlProvider.class, method="deleteByExample")
    int deleteByExample(CourseExample example);

    @Delete({
        "delete from course",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into course (id, courseTitle, ",
        "days, createTime)",
        "values (#{id,jdbcType=INTEGER}, #{coursetitle,jdbcType=VARCHAR}, ",
        "#{days,jdbcType=INTEGER}, #{createtime,jdbcType=TIMESTAMP})"
    })
    int insert(Course record);

    @InsertProvider(type=CourseSqlProvider.class, method="insertSelective")
    int insertSelective(Course record);

    @SelectProvider(type=CourseSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="courseTitle", property="coursetitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="days", property="days", jdbcType=JdbcType.INTEGER),
        @Result(column="createTime", property="createtime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Course> selectByExample(CourseExample example);

    @Select({
        "select",
        "id, courseTitle, days, createTime",
        "from course",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="courseTitle", property="coursetitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="days", property="days", jdbcType=JdbcType.INTEGER),
        @Result(column="createTime", property="createtime", jdbcType=JdbcType.TIMESTAMP)
    })
    Course selectByPrimaryKey(Integer id);

    @UpdateProvider(type=CourseSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Course record, @Param("example") CourseExample example);

    @UpdateProvider(type=CourseSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Course record, @Param("example") CourseExample example);

    @UpdateProvider(type=CourseSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Course record);

    @Update({
        "update course",
        "set courseTitle = #{coursetitle,jdbcType=VARCHAR},",
          "days = #{days,jdbcType=INTEGER},",
          "createTime = #{createtime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Course record);


    @Select({
        "select * from course c,class2course cc  where c.id = cc.courseId and cc.classId = #{classId,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="courseTitle", property="coursetitle", jdbcType=JdbcType.VARCHAR),
            @Result(column="days", property="days", jdbcType=JdbcType.INTEGER),
            @Result(column="createTime", property="createtime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Course> selectByClassId(Integer classId);
}