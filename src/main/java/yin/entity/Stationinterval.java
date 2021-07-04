package yin.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Stationinterval)实体类
 *
 * @author makejava
 * @since 2021-07-04 21:14:18
 */
public class Stationinterval implements Serializable {
    private static final long serialVersionUID = -66895803826729902L;
    
    private Integer trainId;
    
    private Date trainStartingtime;
    
    private Integer id;
    
    private Integer stationId;
    
    private Integer listnumber;
    
    private String passengerseat;


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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public Integer getListnumber() {
        return listnumber;
    }

    public void setListnumber(Integer listnumber) {
        this.listnumber = listnumber;
    }

    public String getPassengerseat() {
        return passengerseat;
    }

    public void setPassengerseat(String passengerseat) {
        this.passengerseat = passengerseat;
    }

}