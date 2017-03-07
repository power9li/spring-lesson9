package edu.ldcollege.mapping;

import edu.ldcollege.domain.Material;
import edu.ldcollege.domain.MaterialExample.Criteria;
import edu.ldcollege.domain.MaterialExample.Criterion;
import edu.ldcollege.domain.MaterialExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class MaterialSqlProvider {

    public String countByExample(MaterialExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("material");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(MaterialExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("material");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Material record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("material");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getMaterialname() != null) {
            sql.VALUES("materialName", "#{materialname,jdbcType=VARCHAR}");
        }
        
        if (record.getVideoname() != null) {
            sql.VALUES("videoName", "#{videoname,jdbcType=VARCHAR}");
        }
        
        if (record.getVideourl() != null) {
            sql.VALUES("videoUrl", "#{videourl,jdbcType=VARCHAR}");
        }
        
        if (record.getTaskurl() != null) {
            sql.VALUES("taskUrl", "#{taskurl,jdbcType=VARCHAR}");
        }
        
        if (record.getExtra1() != null) {
            sql.VALUES("extra1", "#{extra1,jdbcType=VARCHAR}");
        }
        
        if (record.getExtra2() != null) {
            sql.VALUES("extra2", "#{extra2,jdbcType=VARCHAR}");
        }
        
        if (record.getExtra3() != null) {
            sql.VALUES("extra3", "#{extra3,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(MaterialExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("materialName");
        sql.SELECT("videoName");
        sql.SELECT("videoUrl");
        sql.SELECT("taskUrl");
        sql.SELECT("extra1");
        sql.SELECT("extra2");
        sql.SELECT("extra3");
        sql.FROM("material");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Material record = (Material) parameter.get("record");
        MaterialExample example = (MaterialExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("material");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getMaterialname() != null) {
            sql.SET("materialName = #{record.materialname,jdbcType=VARCHAR}");
        }
        
        if (record.getVideoname() != null) {
            sql.SET("videoName = #{record.videoname,jdbcType=VARCHAR}");
        }
        
        if (record.getVideourl() != null) {
            sql.SET("videoUrl = #{record.videourl,jdbcType=VARCHAR}");
        }
        
        if (record.getTaskurl() != null) {
            sql.SET("taskUrl = #{record.taskurl,jdbcType=VARCHAR}");
        }
        
        if (record.getExtra1() != null) {
            sql.SET("extra1 = #{record.extra1,jdbcType=VARCHAR}");
        }
        
        if (record.getExtra2() != null) {
            sql.SET("extra2 = #{record.extra2,jdbcType=VARCHAR}");
        }
        
        if (record.getExtra3() != null) {
            sql.SET("extra3 = #{record.extra3,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("material");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("materialName = #{record.materialname,jdbcType=VARCHAR}");
        sql.SET("videoName = #{record.videoname,jdbcType=VARCHAR}");
        sql.SET("videoUrl = #{record.videourl,jdbcType=VARCHAR}");
        sql.SET("taskUrl = #{record.taskurl,jdbcType=VARCHAR}");
        sql.SET("extra1 = #{record.extra1,jdbcType=VARCHAR}");
        sql.SET("extra2 = #{record.extra2,jdbcType=VARCHAR}");
        sql.SET("extra3 = #{record.extra3,jdbcType=VARCHAR}");
        
        MaterialExample example = (MaterialExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Material record) {
        SQL sql = new SQL();
        sql.UPDATE("material");
        
        if (record.getMaterialname() != null) {
            sql.SET("materialName = #{materialname,jdbcType=VARCHAR}");
        }
        
        if (record.getVideoname() != null) {
            sql.SET("videoName = #{videoname,jdbcType=VARCHAR}");
        }
        
        if (record.getVideourl() != null) {
            sql.SET("videoUrl = #{videourl,jdbcType=VARCHAR}");
        }
        
        if (record.getTaskurl() != null) {
            sql.SET("taskUrl = #{taskurl,jdbcType=VARCHAR}");
        }
        
        if (record.getExtra1() != null) {
            sql.SET("extra1 = #{extra1,jdbcType=VARCHAR}");
        }
        
        if (record.getExtra2() != null) {
            sql.SET("extra2 = #{extra2,jdbcType=VARCHAR}");
        }
        
        if (record.getExtra3() != null) {
            sql.SET("extra3 = #{extra3,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, MaterialExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}