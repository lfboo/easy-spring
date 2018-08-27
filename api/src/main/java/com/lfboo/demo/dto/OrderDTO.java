package com.lfboo.demo.dto;

import org.omg.CORBA.PRIVATE_MEMBER;

import java.io.Serializable;

/**
 * Created by on 2018/8/27.
 *
 * @author lfb
 */
public class OrderDTO implements Serializable {


    private static final long serialVersionUID = 1L;

    private Long id;

    private Long userId;

    private Long createTime;

    private Long updateTime;

    private boolean deleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
