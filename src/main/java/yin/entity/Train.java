package yin.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Train)实体类
 *
 * @author makejava
 * @since 2021-07-04 21:27:56
 */
public class Train implements Serializable {
    private static final long serialVersionUID = -17871206151558915L;
    
    private Integer id;
    
    private Date startingtime;
    
    private Date terminaltime;
    
    private Object name;
    
    private Integer passengerlimit;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getStartingtime() {
        return startingtime;
    }

    public void setStartingtime(Date startingtime) {
        this.startingtime = startingtime;
    }

    public Date getTerminaltime() {
        return terminaltime;
    }

    public void setTerminaltime(Date terminaltime) {
        this.terminaltime = terminaltime;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Integer getPassengerlimit() {
        return passengerlimit;
    }

    public void setPassengerlimit(Integer passengerlimit) {
        this.passengerlimit = passengerlimit;
    }

}