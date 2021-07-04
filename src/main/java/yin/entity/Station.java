package yin.entity;

import java.io.Serializable;

/**
 * (Station)实体类
 *
 * @author makejava
 * @since 2021-07-04 21:14:18
 */
public class Station implements Serializable {
    private static final long serialVersionUID = -64751362356188059L;
    
    private Integer id;
    
    private Integer cityId;
    
    private Object name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

}