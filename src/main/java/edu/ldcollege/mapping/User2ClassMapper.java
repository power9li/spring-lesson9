package edu.ldcollege.mapping;

import edu.ldcollege.domain.User2Class;
import edu.ldcollege.domain.User2ClassExample;
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

public interface User2ClassMapper {
    @SelectProvider(type=User2ClassSqlProvider.class, method="countByExample")
    long countByExample(User2ClassExample example);

    @DeleteProvider(type=User2ClassSqlProvider.class, method="deleteByExample")
    int deleteByExample(User2ClassExample example);

    @Delete({
        "delete from user2class",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into user2class (id, userId, ",
        "classId, createTime, ",
        "state, reasonType, ",
        "season, note)",
        "values (#{id,jdbcType=INTEGER}, #{userid,jdbcType=INTEGER}, ",
        "#{classid,jdbcType=INTEGER}, #{createtime,jdbcType=TIMESTAMP}, ",
        "#{state,jdbcType=INTEGER}, #{reasontype,jdbcType=TINYINT}, ",
        "#{season,jdbcType=INTEGER}, #{note,jdbcType=VARCHAR})"
    })
    int insert(User2Class record);

    @InsertProvider(type=User2ClassSqlProvider.class, method="insertSelective")
    int insertSelective(User2Class record);

    @SelectProvider(type=User2ClassSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="userId", property="userid", jdbcType=JdbcType.INTEGER),
        @Result(column="classId", property="classid", jdbcType=JdbcType.INTEGER),
        @Result(column="createTime", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="state", property="state", jdbcType=JdbcType.INTEGER),
        @Result(column="reasonType", property="reasontype", jdbcType=JdbcType.TINYINT),
        @Result(column="season", property="season", jdbcType=JdbcType.INTEGER),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR)
    })
    List<User2Class> selectByExample(User2ClassExample example);

    @Select({
        "select",
        "id, userId, classId, createTime, state, reasonType, season, note",
        "from user2class",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="userId", property="userid", jdbcType=JdbcType.INTEGER),
        @Result(column="classId", property="classid", jdbcType=JdbcType.INTEGER),
        @Result(column="createTime", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="state", property="state", jdbcType=JdbcType.INTEGER),
        @Result(column="reasonType", property="reasontype", jdbcType=JdbcType.TINYINT),
        @Result(column="season", property="season", jdbcType=JdbcType.INTEGER),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR)
    })
    User2Class selectByPrimaryKey(Integer id);

    @UpdateProvider(type=User2ClassSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") User2Class record, @Param("example") User2ClassExample example);

    @UpdateProvider(type=User2ClassSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") User2Class record, @Param("example") User2ClassExample example);

    @UpdateProvider(type=User2ClassSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User2Class record);

    @Update({
        "update user2class",
        "set userId = #{userid,jdbcType=INTEGER},",
          "classId = #{classid,jdbcType=INTEGER},",
          "createTime = #{createtime,jdbcType=TIMESTAMP},",
          "state = #{state,jdbcType=INTEGER},",
          "reasonType = #{reasontype,jdbcType=TINYINT},",
          "season = #{season,jdbcType=INTEGER},",
          "note = #{note,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(User2Class record);
}