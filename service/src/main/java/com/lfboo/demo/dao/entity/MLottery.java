package com.lfboo.demo.dao.entity;

import com.lfboo.demo.common.dto.Probability;

import java.util.List;

/**
 * Created by on 2018/10/7.
 *
 * @author lfb
 */
public class MLottery {

    private Long id;

    private String name;

    private List<Probability> probabilities;

    private long createTime;

    private long updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Probability> getProbabilities() {
        return probabilities;
    }

    public void setProbabilities(List<Probability> probabilities) {
        this.probabilities = probabilities;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }
}
