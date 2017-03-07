package edu.ldcollege.mapping;

import edu.ldcollege.domain.Province;
import edu.ldcollege.domain.ProvinceExample.Criteria;
import edu.ldcollege.domain.ProvinceExample.Criterion;
import edu.ldcollege.domain.ProvinceExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ProvinceSqlProvider {

    public String countByExample(ProvinceExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("province");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ProvinceExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("province");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Province record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("province");
        
        if (record.getProvinceid() != null) {
            sql.VALUES("provinceId", "#{provinceid,jdbcType=INTEGER}");
        }
        
        if (record.getProvincename() != null) {
            sql.VALUES("provinceName", "#{provincename,jdbcType=VARCHAR}");
        }
        
        if (record.getAbbreviate() != null) {
            sql.VALUES("abbreviate", "#{abbreviate,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(ProvinceExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("provinceId");
        } else {
            sql.SELECT("provinceId");
        }
        sql.SELECT("provinceName");
        sql.SELECT("abbreviate");
        sql.FROM("province");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Province record = (Province) parameter.get("record");
        ProvinceExample example = (ProvinceExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("province");
        
        if (record.getProvinceid() != null) {
            sql.SET("provinceId = #{record.provinceid,jdbcType=INTEGER}");
        }
        
        if (record.getProvincename() != null) {
            sql.SET("provinceName = #{record.provincename,jdbcType=VARCHAR}");
        }
        
        if (record.getAbbreviate() != null) {
            sql.SET("abbreviate = #{record.abbreviate,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("province");
        
        sql.SET("provinceId = #{record.provinceid,jdbcType=INTEGER}");
        sql.SET("provinceName = #{record.provincename,jdbcType=VARCHAR}");
        sql.SET("abbreviate = #{record.abbreviate,jdbcType=VARCHAR}");
        
        ProvinceExample example = (ProvinceExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Province record) {
        SQL sql = new SQL();
        sql.UPDATE("province");
        
        if (record.getProvincename() != null) {
            sql.SET("provinceName = #{provincename,jdbcType=VARCHAR}");
        }
        
        if (record.getAbbreviate() != null) {
            sql.SET("abbreviate = #{abbreviate,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("provinceId = #{provinceid,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ProvinceExample example, boolean includeExamplePhrase) {
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