package yin.entity;

import java.io.Serializable;

/**
 * (Contactor)实体类
 *
 * @author makejava
 * @since 2021-07-04 21:14:18
 */
public class Contactor implements Serializable {
    private static final long serialVersionUID = -41358608382689670L;
    
    private Integer accountId;
    
    private String card;
    
    private Object name;
    
    private Integer phone;
    
    private Object type;


    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

}