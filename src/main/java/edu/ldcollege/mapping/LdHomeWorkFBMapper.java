package edu.ldcollege.mapping;

import edu.ldcollege.domain.LdHomeWorkFB;
import edu.ldcollege.domain.LdHomeWorkFBExample;
import edu.ldcollege.domain.LdHomeWorkFBVo;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface LdHomeWorkFBMapper {
    @SelectProvider(type=LdHomeWorkFBSqlProvider.class, method="countByExample")
    long countByExample(LdHomeWorkFBExample example);

    @DeleteProvider(type=LdHomeWorkFBSqlProvider.class, method="deleteByExample")
    int deleteByExample(LdHomeWorkFBExample example);

    @Delete({
        "delete from ld_home_work_fb",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into ld_home_work_fb (id, my_id, ",
        "user_id, homework_id, ",
        "level_flag, mark)",
        "values (#{id,jdbcType=INTEGER}, #{myId,jdbcType=INTEGER}, ",
        "#{userId,jdbcType=INTEGER}, #{homeworkId,jdbcType=INTEGER}, ",
        "#{levelFlag,jdbcType=VARCHAR}, #{mark,jdbcType=VARCHAR})"
    })
    int insert(LdHomeWorkFB record);

    @InsertProvider(type=LdHomeWorkFBSqlProvider.class, method="insertSelective")
    int insertSelective(LdHomeWorkFB record);

    @SelectProvider(type=LdHomeWorkFBSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="my_id", property="myId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="homework_id", property="homeworkId", jdbcType=JdbcType.INTEGER),
        @Result(column="level_flag", property="levelFlag", jdbcType=JdbcType.VARCHAR),
        @Result(column="mark", property="mark", jdbcType=JdbcType.VARCHAR)
    })
    List<LdHomeWorkFB> selectByExample(LdHomeWorkFBExample example);



    @Select({
        "select",
        "id, my_id, user_id, homework_id, level_flag, mark",
        "from ld_home_work_fb",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="my_id", property="myId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="homework_id", property="homeworkId", jdbcType=JdbcType.INTEGER),
        @Result(column="level_flag", property="levelFlag", jdbcType=JdbcType.VARCHAR),
        @Result(column="mark", property="mark", jdbcType=JdbcType.VARCHAR)
    })
    LdHomeWorkFB selectByPrimaryKey(Integer id);

    @Select({"select fb.*,hw.correct_flag,hw.start_count,hw.best_flag,hw.negative_count ",
            "from ld_home_work hw inner join ld_home_work_fb fb ",
            "on fb.homework_id = hw.id",
            "where hw.id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="my_id", property="myId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="homework_id", property="homeworkId", jdbcType=JdbcType.INTEGER),
        @Result(column="level_flag", property="levelFlag", jdbcType=JdbcType.VARCHAR),
        @Result(column="mark", property="mark", jdbcType=JdbcType.VARCHAR),
        @Result(column="correct_flag", property="correctFlag", jdbcType=JdbcType.BIT),
        @Result(column="start_count", property="startCount", jdbcType=JdbcType.INTEGER),
        @Result(column="negative_count", property="negativeCount", jdbcType=JdbcType.INTEGER),
        @Result(column="best_flag", property="bestFlag", jdbcType=JdbcType.BIT)
    })
    List<LdHomeWorkFBVo> findHomeWorkFBVos(Integer id);

    @UpdateProvider(type=LdHomeWorkFBSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") LdHomeWorkFB record, @Param("example") LdHomeWorkFBExample example);

    @UpdateProvider(type=LdHomeWorkFBSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") LdHomeWorkFB record, @Param("example") LdHomeWorkFBExample example);

    @UpdateProvider(type=LdHomeWorkFBSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LdHomeWorkFB record);

    @Update({
        "update ld_home_work_fb",
        "set my_id = #{myId,jdbcType=INTEGER},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "homework_id = #{homeworkId,jdbcType=INTEGER},",
          "level_flag = #{levelFlag,jdbcType=VARCHAR},",
          "mark = #{mark,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LdHomeWorkFB record);
}