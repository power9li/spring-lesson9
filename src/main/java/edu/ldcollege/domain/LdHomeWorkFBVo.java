package edu.ldcollege.domain;

/**
 * Created by shenli on 2017/3/2.
 */
public class LdHomeWorkFBVo extends LdHomeWorkFB {

    private Boolean correctFlag;

    private Integer startCount;

    private Integer negativeCount;

    private Boolean bestFlag;

    public Boolean getCorrectFlag() {
        return correctFlag;
    }

    public void setCorrectFlag(Boolean correctFlag) {
        this.correctFlag = correctFlag;
    }

    public Integer getStartCount() {
        return startCount;
    }

    public void setStartCount(Integer startCount) {
        this.startCount = startCount;
    }

    public Integer getNegativeCount() {
        return negativeCount;
    }

    public void setNegativeCount(Integer negativeCount) {
        this.negativeCount = negativeCount;
    }

    public Boolean getBestFlag() {
        return bestFlag;
    }

    public void setBestFlag(Boolean bestFlag) {
        this.bestFlag = bestFlag;
    }
}
