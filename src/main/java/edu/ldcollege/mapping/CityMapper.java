package edu.ldcollege.mapping;

import edu.ldcollege.domain.City;
import edu.ldcollege.domain.CityExample;
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

public interface CityMapper {
    @SelectProvider(type=CitySqlProvider.class, method="countByExample")
    long countByExample(CityExample example);

    @DeleteProvider(type=CitySqlProvider.class, method="deleteByExample")
    int deleteByExample(CityExample example);

    @Delete({
        "delete from city",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into city (id, cityName, ",
        "provinceId, abbreviate)",
        "values (#{id,jdbcType=INTEGER}, #{cityname,jdbcType=VARCHAR}, ",
        "#{provinceid,jdbcType=INTEGER}, #{abbreviate,jdbcType=VARCHAR})"
    })
    int insert(City record);

    @InsertProvider(type=CitySqlProvider.class, method="insertSelective")
    int insertSelective(City record);

    @SelectProvider(type=CitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="cityName", property="cityname", jdbcType=JdbcType.VARCHAR),
        @Result(column="provinceId", property="provinceid", jdbcType=JdbcType.INTEGER),
        @Result(column="abbreviate", property="abbreviate", jdbcType=JdbcType.VARCHAR)
    })
    List<City> selectByExample(CityExample example);

    @Select({
        "select",
        "id, cityName, provinceId, abbreviate",
        "from city",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="cityName", property="cityname", jdbcType=JdbcType.VARCHAR),
        @Result(column="provinceId", property="provinceid", jdbcType=JdbcType.INTEGER),
        @Result(column="abbreviate", property="abbreviate", jdbcType=JdbcType.VARCHAR)
    })
    City selectByPrimaryKey(Integer id);

    @UpdateProvider(type=CitySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") City record, @Param("example") CityExample example);

    @UpdateProvider(type=CitySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") City record, @Param("example") CityExample example);

    @UpdateProvider(type=CitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(City record);

    @Update({
        "update city",
        "set cityName = #{cityname,jdbcType=VARCHAR},",
          "provinceId = #{provinceid,jdbcType=INTEGER},",
          "abbreviate = #{abbreviate,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(City record);
}