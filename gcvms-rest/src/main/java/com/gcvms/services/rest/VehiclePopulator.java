package com.gcvms.services.rest;

import java.util.ArrayList;
import java.util.List;

public class VehiclePopulator {
	List sampleSet = new ArrayList();
	
	/**
	 * 
	 */
	public VehiclePopulator() {
		super();
		sampleSet.add(new VehicleVO("1", "small", "1000"));
		sampleSet.add(new VehicleVO("2", "medium", "1001"));
		sampleSet.add(new VehicleVO("3", "large", "1002"));
	}

	/**
	 * @return the sampleSet
	 */
	public List getSampleSet() {
		return sampleSet;
	}

	/**
	 * @param sampleSet the sampleSet to set
	 */
	public void setSampleSet(List sampleSet) {
		this.sampleSet = sampleSet;
	}
	
}
