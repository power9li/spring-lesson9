package edu.ldcollege.mapping;

import edu.ldcollege.domain.LdClass;
import edu.ldcollege.domain.LdClassExample.Criteria;
import edu.ldcollege.domain.LdClassExample.Criterion;
import edu.ldcollege.domain.LdClassExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class LdClassSqlProvider {

    public String countByExample(LdClassExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("ld_class");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(LdClassExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("ld_class");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(LdClass record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("ld_class");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getClassname() != null) {
            sql.VALUES("className", "#{classname,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatetime() != null) {
            sql.VALUES("createTime", "#{createtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndtime() != null) {
            sql.VALUES("endTime", "#{endtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRemark() != null) {
            sql.VALUES("remark", "#{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getMonitorName() != null) {
            sql.VALUES("monitor_name", "#{monitorName,jdbcType=VARCHAR}");
        }
        
        if (record.getCommissaryName() != null) {
            sql.VALUES("commissary_name", "#{commissaryName,jdbcType=VARCHAR}");
        }
        
        if (record.getCurnormalstudents() != null) {
            sql.VALUES("curNormalStudents", "#{curnormalstudents,jdbcType=INTEGER}");
        }
        
        if (record.getCurArrearagedStudents() != null) {
            sql.VALUES("cur_arrearaged_students", "#{curArrearagedStudents,jdbcType=INTEGER}");
        }
        
        if (record.getDropedStudents() != null) {
            sql.VALUES("droped_students", "#{dropedStudents,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(LdClassExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("className");
        sql.SELECT("createTime");
        sql.SELECT("endTime");
        sql.SELECT("remark");
        sql.SELECT("monitor_name");
        sql.SELECT("commissary_name");
        sql.SELECT("curNormalStudents");
        sql.SELECT("cur_arrearaged_students");
        sql.SELECT("droped_students");
        sql.FROM("ld_class");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        LdClass record = (LdClass) parameter.get("record");
        LdClassExample example = (LdClassExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("ld_class");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getClassname() != null) {
            sql.SET("className = #{record.classname,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatetime() != null) {
            sql.SET("createTime = #{record.createtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndtime() != null) {
            sql.SET("endTime = #{record.endtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{record.remark,jdbcType=VARCHAR}");
        }
        
        if (record.getMonitorName() != null) {
            sql.SET("monitor_name = #{record.monitorName,jdbcType=VARCHAR}");
        }
        
        if (record.getCommissaryName() != null) {
            sql.SET("commissary_name = #{record.commissaryName,jdbcType=VARCHAR}");
        }
        
        if (record.getCurnormalstudents() != null) {
            sql.SET("curNormalStudents = #{record.curnormalstudents,jdbcType=INTEGER}");
        }
        
        if (record.getCurArrearagedStudents() != null) {
            sql.SET("cur_arrearaged_students = #{record.curArrearagedStudents,jdbcType=INTEGER}");
        }
        
        if (record.getDropedStudents() != null) {
            sql.SET("droped_students = #{record.dropedStudents,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("ld_class");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("className = #{record.classname,jdbcType=VARCHAR}");
        sql.SET("createTime = #{record.createtime,jdbcType=TIMESTAMP}");
        sql.SET("endTime = #{record.endtime,jdbcType=TIMESTAMP}");
        sql.SET("remark = #{record.remark,jdbcType=VARCHAR}");
        sql.SET("monitor_name = #{record.monitorName,jdbcType=VARCHAR}");
        sql.SET("commissary_name = #{record.commissaryName,jdbcType=VARCHAR}");
        sql.SET("curNormalStudents = #{record.curnormalstudents,jdbcType=INTEGER}");
        sql.SET("cur_arrearaged_students = #{record.curArrearagedStudents,jdbcType=INTEGER}");
        sql.SET("droped_students = #{record.dropedStudents,jdbcType=INTEGER}");
        
        LdClassExample example = (LdClassExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LdClass record) {
        SQL sql = new SQL();
        sql.UPDATE("ld_class");
        
        if (record.getClassname() != null) {
            sql.SET("className = #{classname,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatetime() != null) {
            sql.SET("createTime = #{createtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndtime() != null) {
            sql.SET("endTime = #{endtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getMonitorName() != null) {
            sql.SET("monitor_name = #{monitorName,jdbcType=VARCHAR}");
        }
        
        if (record.getCommissaryName() != null) {
            sql.SET("commissary_name = #{commissaryName,jdbcType=VARCHAR}");
        }
        
        if (record.getCurnormalstudents() != null) {
            sql.SET("curNormalStudents = #{curnormalstudents,jdbcType=INTEGER}");
        }
        
        if (record.getCurArrearagedStudents() != null) {
            sql.SET("cur_arrearaged_students = #{curArrearagedStudents,jdbcType=INTEGER}");
        }
        
        if (record.getDropedStudents() != null) {
            sql.SET("droped_students = #{dropedStudents,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, LdClassExample example, boolean includeExamplePhrase) {
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