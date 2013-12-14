package com.gcvms.services.rest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class VehicleVO {

    @XmlElement(name = "id")
	String id;

    @XmlElement(name = "type")
	String vehicleType;

    @XmlElement(name = "routeId")
	String routeId;
	
	
	
	/**
	 * 
	 */
	public VehicleVO() {
		super();
	}
	/**
	 * @param id
	 * @param vehicleType
	 * @param routeId
	 */
	public VehicleVO(String id, String vehicleType, String routeId) {
		super();
		this.id = id;
		this.vehicleType = vehicleType;
		this.routeId = routeId;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the vehicleType
	 */
	public String getVehicleType() {
		return vehicleType;
	}
	/**
	 * @param vehicleType the vehicleType to set
	 */
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
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
		return "VehicleVO [id=" + id + ", vehicleType=" + vehicleType
				+ ", routeId=" + routeId + "]";
	}
	
	
}
