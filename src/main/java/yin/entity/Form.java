package yin.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Form)实体类
 *
 * @author makejava
 * @since 2021-07-04 21:14:18
 */
public class Form implements Serializable {
    private static final long serialVersionUID = 406130047088737471L;
    
    private Integer id;
    
    private Integer accountId;
    
    private Integer trainId;
    
    private Date trainStartingtime;
    
    private Integer stationIdfrom;
    
    private Integer stationIdto;
    
    private Object price;
    
    private Object ispay;
    
    private Date paytime;
    
    private Date createtime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getTrainId() {
        return trainId;
    }

    public void setTrainId(Integer trainId) {
        this.trainId = trainId;
    }

    public Date getTrainStartingtime() {
        return trainStartingtime;
    }

    public void setTrainStartingtime(Date trainStartingtime) {
        this.trainStartingtime = trainStartingtime;
    }

    public Integer getStationIdfrom() {
        return stationIdfrom;
    }

    public void setStationIdfrom(Integer stationIdfrom) {
        this.stationIdfrom = stationIdfrom;
    }

    public Integer getStationIdto() {
        return stationIdto;
    }

    public void setStationIdto(Integer stationIdto) {
        this.stationIdto = stationIdto;
    }

    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
    }

    public Object getIspay() {
        return ispay;
    }

    public void setIspay(Object ispay) {
        this.ispay = ispay;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

}