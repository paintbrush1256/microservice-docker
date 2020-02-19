package com.metroservice.route.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(schema="ROUTE", name="ROUTE")
public class Route {
    @Id
    @Column(name="ROUTE_ID")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
	
    @Column(name="ROUTE_NUMBER")
    private String routeNumber;
	
    @Column(name="START_STATION_ID")
    private long startingStationId;
    
	@Column(name="END_STATION_ID")
    private long endStationId;
	
	@Column(name="LAST_MODIFIED_DATETIME")
    private Date lastModifiedDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber;
    }

    public long getStartingStationId() {
        return startingStationId;
    }

    public void setStartingStationId(long startingStationId) {
        this.startingStationId = startingStationId;
    }

    public long getEndStationId() {
        return endStationId;
    }

    public void setEndStationId(long endStationId) {
        this.endStationId = endStationId;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }
    
    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}
