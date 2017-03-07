package edu.ldcollege.mapping;

import edu.ldcollege.domain.LdHomeWorkFB;
import edu.ldcollege.domain.LdHomeWorkFBExample.Criteria;
import edu.ldcollege.domain.LdHomeWorkFBExample.Criterion;
import edu.ldcollege.domain.LdHomeWorkFBExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class LdHomeWorkFBSqlProvider {

    public String countByExample(LdHomeWorkFBExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("ld_home_work_fb");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(LdHomeWorkFBExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("ld_home_work_fb");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(LdHomeWorkFB record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("ld_home_work_fb");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getMyId() != null) {
            sql.VALUES("my_id", "#{myId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getHomeworkId() != null) {
            sql.VALUES("homework_id", "#{homeworkId,jdbcType=INTEGER}");
        }
        
        if (record.getLevelFlag() != null) {
            sql.VALUES("level_flag", "#{levelFlag,jdbcType=VARCHAR}");
        }
        
        if (record.getMark() != null) {
            sql.VALUES("mark", "#{mark,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(LdHomeWorkFBExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("my_id");
        sql.SELECT("user_id");
        sql.SELECT("homework_id");
        sql.SELECT("level_flag");
        sql.SELECT("mark");
        sql.FROM("ld_home_work_fb");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        LdHomeWorkFB record = (LdHomeWorkFB) parameter.get("record");
        LdHomeWorkFBExample example = (LdHomeWorkFBExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("ld_home_work_fb");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getMyId() != null) {
            sql.SET("my_id = #{record.myId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{record.userId,jdbcType=INTEGER}");
        }
        
        if (record.getHomeworkId() != null) {
            sql.SET("homework_id = #{record.homeworkId,jdbcType=INTEGER}");
        }
        
        if (record.getLevelFlag() != null) {
            sql.SET("level_flag = #{record.levelFlag,jdbcType=VARCHAR}");
        }
        
        if (record.getMark() != null) {
            sql.SET("mark = #{record.mark,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("ld_home_work_fb");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("my_id = #{record.myId,jdbcType=INTEGER}");
        sql.SET("user_id = #{record.userId,jdbcType=INTEGER}");
        sql.SET("homework_id = #{record.homeworkId,jdbcType=INTEGER}");
        sql.SET("level_flag = #{record.levelFlag,jdbcType=VARCHAR}");
        sql.SET("mark = #{record.mark,jdbcType=VARCHAR}");
        
        LdHomeWorkFBExample example = (LdHomeWorkFBExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LdHomeWorkFB record) {
        SQL sql = new SQL();
        sql.UPDATE("ld_home_work_fb");
        
        if (record.getMyId() != null) {
            sql.SET("my_id = #{myId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getHomeworkId() != null) {
            sql.SET("homework_id = #{homeworkId,jdbcType=INTEGER}");
        }
        
        if (record.getLevelFlag() != null) {
            sql.SET("level_flag = #{levelFlag,jdbcType=VARCHAR}");
        }
        
        if (record.getMark() != null) {
            sql.SET("mark = #{mark,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, LdHomeWorkFBExample example, boolean includeExamplePhrase) {
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