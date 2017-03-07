package edu.ldcollege.mapping;

import edu.ldcollege.domain.Material;
import edu.ldcollege.domain.MaterialExample;
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

public interface MaterialMapper {
    @SelectProvider(type=MaterialSqlProvider.class, method="countByExample")
    long countByExample(MaterialExample example);

    @DeleteProvider(type=MaterialSqlProvider.class, method="deleteByExample")
    int deleteByExample(MaterialExample example);

    @Delete({
        "delete from material",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into material (id, materialName, ",
        "videoName, videoUrl, ",
        "taskUrl, extra1, ",
        "extra2, extra3)",
        "values (#{id,jdbcType=INTEGER}, #{materialname,jdbcType=VARCHAR}, ",
        "#{videoname,jdbcType=VARCHAR}, #{videourl,jdbcType=VARCHAR}, ",
        "#{taskurl,jdbcType=VARCHAR}, #{extra1,jdbcType=VARCHAR}, ",
        "#{extra2,jdbcType=VARCHAR}, #{extra3,jdbcType=VARCHAR})"
    })
    int insert(Material record);

    @InsertProvider(type=MaterialSqlProvider.class, method="insertSelective")
    int insertSelective(Material record);

    @SelectProvider(type=MaterialSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="materialName", property="materialname", jdbcType=JdbcType.VARCHAR),
        @Result(column="videoName", property="videoname", jdbcType=JdbcType.VARCHAR),
        @Result(column="videoUrl", property="videourl", jdbcType=JdbcType.VARCHAR),
        @Result(column="taskUrl", property="taskurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="extra1", property="extra1", jdbcType=JdbcType.VARCHAR),
        @Result(column="extra2", property="extra2", jdbcType=JdbcType.VARCHAR),
        @Result(column="extra3", property="extra3", jdbcType=JdbcType.VARCHAR)
    })
    List<Material> selectByExample(MaterialExample example);

    @Select({
        "select",
        "id, materialName, videoName, videoUrl, taskUrl, extra1, extra2, extra3",
        "from material",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="materialName", property="materialname", jdbcType=JdbcType.VARCHAR),
        @Result(column="videoName", property="videoname", jdbcType=JdbcType.VARCHAR),
        @Result(column="videoUrl", property="videourl", jdbcType=JdbcType.VARCHAR),
        @Result(column="taskUrl", property="taskurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="extra1", property="extra1", jdbcType=JdbcType.VARCHAR),
        @Result(column="extra2", property="extra2", jdbcType=JdbcType.VARCHAR),
        @Result(column="extra3", property="extra3", jdbcType=JdbcType.VARCHAR)
    })
    Material selectByPrimaryKey(Integer id);

    @UpdateProvider(type=MaterialSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Material record, @Param("example") MaterialExample example);

    @UpdateProvider(type=MaterialSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Material record, @Param("example") MaterialExample example);

    @UpdateProvider(type=MaterialSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Material record);

    @Update({
        "update material",
        "set materialName = #{materialname,jdbcType=VARCHAR},",
          "videoName = #{videoname,jdbcType=VARCHAR},",
          "videoUrl = #{videourl,jdbcType=VARCHAR},",
          "taskUrl = #{taskurl,jdbcType=VARCHAR},",
          "extra1 = #{extra1,jdbcType=VARCHAR},",
          "extra2 = #{extra2,jdbcType=VARCHAR},",
          "extra3 = #{extra3,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Material record);
}