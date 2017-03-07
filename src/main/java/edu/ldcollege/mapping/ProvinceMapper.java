package edu.ldcollege.mapping;

import edu.ldcollege.domain.Province;
import edu.ldcollege.domain.ProvinceExample;
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

public interface ProvinceMapper {
    @SelectProvider(type=ProvinceSqlProvider.class, method="countByExample")
    long countByExample(ProvinceExample example);

    @DeleteProvider(type=ProvinceSqlProvider.class, method="deleteByExample")
    int deleteByExample(ProvinceExample example);

    @Delete({
        "delete from province",
        "where provinceId = #{provinceid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer provinceid);

    @Insert({
        "insert into province (provinceId, provinceName, ",
        "abbreviate)",
        "values (#{provinceid,jdbcType=INTEGER}, #{provincename,jdbcType=VARCHAR}, ",
        "#{abbreviate,jdbcType=VARCHAR})"
    })
    int insert(Province record);

    @InsertProvider(type=ProvinceSqlProvider.class, method="insertSelective")
    int insertSelective(Province record);

    @SelectProvider(type=ProvinceSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="provinceId", property="provinceid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="provinceName", property="provincename", jdbcType=JdbcType.VARCHAR),
        @Result(column="abbreviate", property="abbreviate", jdbcType=JdbcType.VARCHAR)
    })
    List<Province> selectByExample(ProvinceExample example);

    @Select({
        "select",
        "provinceId, provinceName, abbreviate",
        "from province",
        "where provinceId = #{provinceid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="provinceId", property="provinceid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="provinceName", property="provincename", jdbcType=JdbcType.VARCHAR),
        @Result(column="abbreviate", property="abbreviate", jdbcType=JdbcType.VARCHAR)
    })
    Province selectByPrimaryKey(Integer provinceid);

    @UpdateProvider(type=ProvinceSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Province record, @Param("example") ProvinceExample example);

    @UpdateProvider(type=ProvinceSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Province record, @Param("example") ProvinceExample example);

    @UpdateProvider(type=ProvinceSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Province record);

    @Update({
        "update province",
        "set provinceName = #{provincename,jdbcType=VARCHAR},",
          "abbreviate = #{abbreviate,jdbcType=VARCHAR}",
        "where provinceId = #{provinceid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Province record);
}