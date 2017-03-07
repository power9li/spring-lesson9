package edu.ldcollege.mapping;

import edu.ldcollege.domain.SysPermission;
import edu.ldcollege.domain.SysPermissionExample.Criteria;
import edu.ldcollege.domain.SysPermissionExample.Criterion;
import edu.ldcollege.domain.SysPermissionExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class SysPermissionSqlProvider {

    public String countByExample(SysPermissionExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("sys_permission");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(SysPermissionExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("sys_permission");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(SysPermission record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sys_permission");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("type", "#{type,jdbcType=VARCHAR}");
        }
        
        if (record.getUrl() != null) {
            sql.VALUES("url", "#{url,jdbcType=VARCHAR}");
        }
        
        if (record.getPercode() != null) {
            sql.VALUES("percode", "#{percode,jdbcType=VARCHAR}");
        }
        
        if (record.getParentid() != null) {
            sql.VALUES("parentid", "#{parentid,jdbcType=BIGINT}");
        }
        
        if (record.getParentids() != null) {
            sql.VALUES("parentids", "#{parentids,jdbcType=VARCHAR}");
        }
        
        if (record.getSortstring() != null) {
            sql.VALUES("sortstring", "#{sortstring,jdbcType=VARCHAR}");
        }
        
        if (record.getAvailable() != null) {
            sql.VALUES("available", "#{available,jdbcType=CHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(SysPermissionExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("name");
        sql.SELECT("type");
        sql.SELECT("url");
        sql.SELECT("percode");
        sql.SELECT("parentid");
        sql.SELECT("parentids");
        sql.SELECT("sortstring");
        sql.SELECT("available");
        sql.FROM("sys_permission");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        SysPermission record = (SysPermission) parameter.get("record");
        SysPermissionExample example = (SysPermissionExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("sys_permission");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{record.type,jdbcType=VARCHAR}");
        }
        
        if (record.getUrl() != null) {
            sql.SET("url = #{record.url,jdbcType=VARCHAR}");
        }
        
        if (record.getPercode() != null) {
            sql.SET("percode = #{record.percode,jdbcType=VARCHAR}");
        }
        
        if (record.getParentid() != null) {
            sql.SET("parentid = #{record.parentid,jdbcType=BIGINT}");
        }
        
        if (record.getParentids() != null) {
            sql.SET("parentids = #{record.parentids,jdbcType=VARCHAR}");
        }
        
        if (record.getSortstring() != null) {
            sql.SET("sortstring = #{record.sortstring,jdbcType=VARCHAR}");
        }
        
        if (record.getAvailable() != null) {
            sql.SET("available = #{record.available,jdbcType=CHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("sys_permission");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        sql.SET("type = #{record.type,jdbcType=VARCHAR}");
        sql.SET("url = #{record.url,jdbcType=VARCHAR}");
        sql.SET("percode = #{record.percode,jdbcType=VARCHAR}");
        sql.SET("parentid = #{record.parentid,jdbcType=BIGINT}");
        sql.SET("parentids = #{record.parentids,jdbcType=VARCHAR}");
        sql.SET("sortstring = #{record.sortstring,jdbcType=VARCHAR}");
        sql.SET("available = #{record.available,jdbcType=CHAR}");
        
        SysPermissionExample example = (SysPermissionExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(SysPermission record) {
        SQL sql = new SQL();
        sql.UPDATE("sys_permission");
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{type,jdbcType=VARCHAR}");
        }
        
        if (record.getUrl() != null) {
            sql.SET("url = #{url,jdbcType=VARCHAR}");
        }
        
        if (record.getPercode() != null) {
            sql.SET("percode = #{percode,jdbcType=VARCHAR}");
        }
        
        if (record.getParentid() != null) {
            sql.SET("parentid = #{parentid,jdbcType=BIGINT}");
        }
        
        if (record.getParentids() != null) {
            sql.SET("parentids = #{parentids,jdbcType=VARCHAR}");
        }
        
        if (record.getSortstring() != null) {
            sql.SET("sortstring = #{sortstring,jdbcType=VARCHAR}");
        }
        
        if (record.getAvailable() != null) {
            sql.SET("available = #{available,jdbcType=CHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, SysPermissionExample example, boolean includeExamplePhrase) {
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