package io.egen.egenmetric.Repository;

import java.util.Date;

import org.mongodb.morphia.annotations.Id;

 public class Metrics {
	
	@Id
	private int id;
	
	public int weightVar;
	public Date timeStamp;
	
	 public Metrics() {
		 
	 }
	 
	 public Metrics(Builder builder) {
	        this.weightVar = builder.weightVar;
	        this.timeStamp = builder.timeStamp;
	    }

	public static Builder getBuilder() {
	        return new Builder();
	    }

	public int getWeightVar() {
		return weightVar;
	}

	public void setWeightVar(int weightVar) {
		this.weightVar = weightVar;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public static class Builder {

		public  int weightVar;
		public  Date timeStamp;

	    public Builder() {}

	    public Builder weightvar(int weightVar) {
	        this.weightVar = weightVar;
	        return this;
	    }

	    public Builder timeStamp(Date timeStamp) {
	        this.timeStamp = timeStamp;
	        return this;
	    }

	    public Metrics build() {
	    	Metrics build = new Metrics(this);
	        return build;
	    }
	    
	}
	 
}


