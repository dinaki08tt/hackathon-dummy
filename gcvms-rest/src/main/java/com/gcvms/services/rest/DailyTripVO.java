package com.gcvms.services.rest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class DailyTripVO {

    @XmlElement(name = "empid")
	String empid;

    @XmlElement(name = "vehicleId")
	String vehicleId;

    @XmlElement(name = "routeId")
	String routeId;
	
	
	
	/**
	 * 
	 */
	public DailyTripVO() {
		super();
	}



	/**
	 * @return the empid
	 */
	public String getEmpid() {
		return empid;
	}



	/**
	 * @param empid the empid to set
	 */
	public void setEmpid(String empid) {
		this.empid = empid;
	}



	/**
	 * @return the vehicleId
	 */
	public String getVehicleId() {
		return vehicleId;
	}



	/**
	 * @param vehicleId the vehicleId to set
	 */
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}



	/**
	 * @return the routeId
	 */
	public String getRouteId() {
		return routeId;
	}



	/**
	 * @param routeId the routeId to set
	 */
	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DailyTripVO [empid=" + empid + ", vehicleId=" + vehicleId
				+ ", routeId=" + routeId + "]";
	}

	
}