package io.egen.metric.dto;

import java.util.Date;

public class MetricDTO {
	
	private int id;
	private int weightVar;
	private Date timeStamp;
	
	public MetricDTO() {

    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public int getWeightVar() {
		return weightVar;
	}

	public void setWeightVar(int weightVar) {
		this.weightVar = weightVar;
	}
	

}
