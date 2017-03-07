package edu.ldcollege.mapping;

import edu.ldcollege.domain.LdHomeWork;
import edu.ldcollege.domain.LdHomeWorkExample.Criteria;
import edu.ldcollege.domain.LdHomeWorkExample.Criterion;
import edu.ldcollege.domain.LdHomeWorkExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class LdHomeWorkSqlProvider {

    public String countByExample(LdHomeWorkExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("ld_home_work");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(LdHomeWorkExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("ld_home_work");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(LdHomeWork record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("ld_home_work");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getClassId() != null) {
            sql.VALUES("class_id", "#{classId,jdbcType=INTEGER}");
        }
        
        if (record.getLessionId() != null) {
            sql.VALUES("lession_id", "#{lessionId,jdbcType=INTEGER}");
        }
        
        if (record.getHomeworkFilePath() != null) {
            sql.VALUES("homework_file_path", "#{homeworkFilePath,jdbcType=VARCHAR}");
        }
        
        if (record.getHomeworkFileName() != null) {
            sql.VALUES("homework_file_name", "#{homeworkFileName,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateDate() != null) {
            sql.VALUES("create_date", "#{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCorrectFlag() != null) {
            sql.VALUES("correct_flag", "#{correctFlag,jdbcType=BIT}");
        }
        
        if (record.getStartCount() != null) {
            sql.VALUES("start_count", "#{startCount,jdbcType=INTEGER}");
        }
        
        if (record.getNegativeCount() != null) {
            sql.VALUES("negative_count", "#{negativeCount,jdbcType=INTEGER}");
        }
        
        if (record.getBestFlag() != null) {
            sql.VALUES("best_flag", "#{bestFlag,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(LdHomeWorkExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("user_id");
        sql.SELECT("class_id");
        sql.SELECT("lession_id");
        sql.SELECT("homework_file_path");
        sql.SELECT("homework_file_name");
        sql.SELECT("create_date");
        sql.SELECT("correct_flag");
        sql.SELECT("start_count");
        sql.SELECT("negative_count");
        sql.SELECT("best_flag");
        sql.FROM("ld_home_work");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        LdHomeWork record = (LdHomeWork) parameter.get("record");
        LdHomeWorkExample example = (LdHomeWorkExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("ld_home_work");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{record.userId,jdbcType=INTEGER}");
        }
        
        if (record.getClassId() != null) {
            sql.SET("class_id = #{record.classId,jdbcType=INTEGER}");
        }
        
        if (record.getLessionId() != null) {
            sql.SET("lession_id = #{record.lessionId,jdbcType=INTEGER}");
        }
        
        if (record.getHomeworkFilePath() != null) {
            sql.SET("homework_file_path = #{record.homeworkFilePath,jdbcType=VARCHAR}");
        }
        
        if (record.getHomeworkFileName() != null) {
            sql.SET("homework_file_name = #{record.homeworkFileName,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateDate() != null) {
            sql.SET("create_date = #{record.createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCorrectFlag() != null) {
            sql.SET("correct_flag = #{record.correctFlag,jdbcType=BIT}");
        }
        
        if (record.getStartCount() != null) {
            sql.SET("start_count = #{record.startCount,jdbcType=INTEGER}");
        }
        
        if (record.getNegativeCount() != null) {
            sql.SET("negative_count = #{record.negativeCount,jdbcType=INTEGER}");
        }
        
        if (record.getBestFlag() != null) {
            sql.SET("best_flag = #{record.bestFlag,jdbcType=BIT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("ld_home_work");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("user_id = #{record.userId,jdbcType=INTEGER}");
        sql.SET("class_id = #{record.classId,jdbcType=INTEGER}");
        sql.SET("lession_id = #{record.lessionId,jdbcType=INTEGER}");
        sql.SET("homework_file_path = #{record.homeworkFilePath,jdbcType=VARCHAR}");
        sql.SET("homework_file_name = #{record.homeworkFileName,jdbcType=VARCHAR}");
        sql.SET("create_date = #{record.createDate,jdbcType=TIMESTAMP}");
        sql.SET("correct_flag = #{record.correctFlag,jdbcType=BIT}");
        sql.SET("start_count = #{record.startCount,jdbcType=INTEGER}");
        sql.SET("negative_count = #{record.negativeCount,jdbcType=INTEGER}");
        sql.SET("best_flag = #{record.bestFlag,jdbcType=BIT}");
        
        LdHomeWorkExample example = (LdHomeWorkExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LdHomeWork record) {
        SQL sql = new SQL();
        sql.UPDATE("ld_home_work");
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getClassId() != null) {
            sql.SET("class_id = #{classId,jdbcType=INTEGER}");
        }
        
        if (record.getLessionId() != null) {
            sql.SET("lession_id = #{lessionId,jdbcType=INTEGER}");
        }
        
        if (record.getHomeworkFilePath() != null) {
            sql.SET("homework_file_path = #{homeworkFilePath,jdbcType=VARCHAR}");
        }
        
        if (record.getHomeworkFileName() != null) {
            sql.SET("homework_file_name = #{homeworkFileName,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateDate() != null) {
            sql.SET("create_date = #{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCorrectFlag() != null) {
            sql.SET("correct_flag = #{correctFlag,jdbcType=BIT}");
        }
        
        if (record.getStartCount() != null) {
            sql.SET("start_count = #{startCount,jdbcType=INTEGER}");
        }
        
        if (record.getNegativeCount() != null) {
            sql.SET("negative_count = #{negativeCount,jdbcType=INTEGER}");
        }
        
        if (record.getBestFlag() != null) {
            sql.SET("best_flag = #{bestFlag,jdbcType=BIT}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, LdHomeWorkExample example, boolean includeExamplePhrase) {
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