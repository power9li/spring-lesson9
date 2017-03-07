package edu.ldcollege.mapping;

import edu.ldcollege.domain.LdHomeWork;
import edu.ldcollege.domain.LdHomeWorkExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface LdHomeWorkMapper {
    @SelectProvider(type=LdHomeWorkSqlProvider.class, method="countByExample")
    long countByExample(LdHomeWorkExample example);

    @DeleteProvider(type=LdHomeWorkSqlProvider.class, method="deleteByExample")
    int deleteByExample(LdHomeWorkExample example);

    @Delete({
        "delete from ld_home_work",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into ld_home_work (id, user_id, ",
        "class_id, lession_id, ",
        "homework_file_path, homework_file_name, ",
        "create_date, correct_flag, ",
        "start_count, negative_count, ",
        "best_flag)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{classId,jdbcType=INTEGER}, #{lessionId,jdbcType=INTEGER}, ",
        "#{homeworkFilePath,jdbcType=VARCHAR}, #{homeworkFileName,jdbcType=VARCHAR}, ",
        "#{createDate,jdbcType=TIMESTAMP}, #{correctFlag,jdbcType=BIT}, ",
        "#{startCount,jdbcType=INTEGER}, #{negativeCount,jdbcType=INTEGER}, ",
        "#{bestFlag,jdbcType=BIT})"
    })
    int insert(LdHomeWork record);

    @InsertProvider(type=LdHomeWorkSqlProvider.class, method="insertSelective")
    int insertSelective(LdHomeWork record);

    @SelectProvider(type=LdHomeWorkSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="class_id", property="classId", jdbcType=JdbcType.INTEGER),
        @Result(column="lession_id", property="lessionId", jdbcType=JdbcType.INTEGER),
        @Result(column="homework_file_path", property="homeworkFilePath", jdbcType=JdbcType.VARCHAR),
        @Result(column="homework_file_name", property="homeworkFileName", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="correct_flag", property="correctFlag", jdbcType=JdbcType.BIT),
        @Result(column="start_count", property="startCount", jdbcType=JdbcType.INTEGER),
        @Result(column="negative_count", property="negativeCount", jdbcType=JdbcType.INTEGER),
        @Result(column="best_flag", property="bestFlag", jdbcType=JdbcType.BIT)
    })
    List<LdHomeWork> selectByExample(LdHomeWorkExample example);

    @Select({
        "select",
        "id, user_id, class_id, lession_id, homework_file_path, homework_file_name, create_date, ",
        "correct_flag, start_count, negative_count, best_flag",
        "from ld_home_work",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="class_id", property="classId", jdbcType=JdbcType.INTEGER),
        @Result(column="lession_id", property="lessionId", jdbcType=JdbcType.INTEGER),
        @Result(column="homework_file_path", property="homeworkFilePath", jdbcType=JdbcType.VARCHAR),
        @Result(column="homework_file_name", property="homeworkFileName", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="correct_flag", property="correctFlag", jdbcType=JdbcType.BIT),
        @Result(column="start_count", property="startCount", jdbcType=JdbcType.INTEGER),
        @Result(column="negative_count", property="negativeCount", jdbcType=JdbcType.INTEGER),
        @Result(column="best_flag", property="bestFlag", jdbcType=JdbcType.BIT)
    })
    LdHomeWork selectByPrimaryKey(Integer id);

    @UpdateProvider(type=LdHomeWorkSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") LdHomeWork record, @Param("example") LdHomeWorkExample example);

    @UpdateProvider(type=LdHomeWorkSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") LdHomeWork record, @Param("example") LdHomeWorkExample example);

    @UpdateProvider(type=LdHomeWorkSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LdHomeWork record);

    @Update({
        "update ld_home_work",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "class_id = #{classId,jdbcType=INTEGER},",
          "lession_id = #{lessionId,jdbcType=INTEGER},",
          "homework_file_path = #{homeworkFilePath,jdbcType=VARCHAR},",
          "homework_file_name = #{homeworkFileName,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "correct_flag = #{correctFlag,jdbcType=BIT},",
          "start_count = #{startCount,jdbcType=INTEGER},",
          "negative_count = #{negativeCount,jdbcType=INTEGER},",
          "best_flag = #{bestFlag,jdbcType=BIT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LdHomeWork record);


    @Update({
        "update ld_home_work",
            "set",
            "start_count = start_count + #{addStartCount,jdbcType=INTEGER},",
            "negative_count = negative_count + #{addNegativeCount,jdbcType=INTEGER}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateCountsById(@Param("addStartCount") int addStartCount,
                        @Param("addNegativeCount") int addNegativeCount,
                        @Param("id") int id
    );


    @Insert({"insert into ld_home_work (id, user_id, ",
            "class_id, lession_id, ",
            "homework_file_path, homework_file_name, ",
            "create_date, correct_flag, ",
            "start_count, negative_count, ",
            "best_flag)",
            "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
            "#{classId,jdbcType=INTEGER}, #{lessionId,jdbcType=INTEGER}, ",
            "#{homeworkFilePath,jdbcType=VARCHAR}, #{homeworkFileName,jdbcType=VARCHAR}, ",
            "#{createDate,jdbcType=TIMESTAMP}, #{correctFlag,jdbcType=BIT}, ",
            "#{startCount,jdbcType=INTEGER}, #{negativeCount,jdbcType=INTEGER}, ",
            "#{bestFlag,jdbcType=BIT}) ",
            "ON DUPLICATE KEY UPDATE ",
            "create_date = #{createDate,jdbcType=TIMESTAMP},",
            "homework_file_path = #{homeworkFilePath,jdbcType=VARCHAR},",
            "homework_file_name = #{homeworkFileName,jdbcType=VARCHAR}"
    })
    int uniqueInsert(LdHomeWork record);

    @Select({
            "select",
            "id, user_id, class_id, lession_id, homework_file_path, homework_file_name, create_date, ",
            "correct_flag, start_count, negative_count, best_flag",
            "from ld_home_work ",
            "where homework_file_name IS NOT NULL ",
            "ORDER BY create_date DESC"
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
            @Result(column="class_id", property="classId", jdbcType=JdbcType.INTEGER),
            @Result(column="lession_id", property="lessionId", jdbcType=JdbcType.INTEGER),
            @Result(column="homework_file_path", property="homeworkFilePath", jdbcType=JdbcType.VARCHAR),
            @Result(column="homework_file_name", property="homeworkFileName", jdbcType=JdbcType.VARCHAR),
            @Result(column="create_date", property="createDate", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="correct_flag", property="correctFlag", jdbcType=JdbcType.BIT),
            @Result(column="start_count", property="startCount", jdbcType=JdbcType.INTEGER),
            @Result(column="negative_count", property="negativeCount", jdbcType=JdbcType.INTEGER),
            @Result(column="best_flag", property="bestFlag", jdbcType=JdbcType.BIT)
    })
    List<LdHomeWork> queryAllWorkNotNull();
}