package yin.entity;

import java.io.Serializable;

/**
 * (City)实体类
 *
 * @author makejava
 * @since 2021-07-04 21:27:52
 */
public class City implements Serializable {
    private static final long serialVersionUID = 611105290382263943L;
    
    private Integer id;
    
    private Object name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

}