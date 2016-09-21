package io.egen.egenmetric.Repository;

import org.mongodb.morphia.Datastore;
import org.springframework.beans.factory.annotation.Autowired;

import io.egen.util.MongoDB;

public class MetricRepositoryImpl implements MetricRepository{
	
	public Datastore mongoDatastore;
	
	@Autowired
	public MetricRepositoryImpl() {
		mongoDatastore = MongoDB.instance().getDatabase();
	}

	@Override
	public Metrics save(Metrics saved) {
		
		mongoDatastore.save(saved);
		return saved;
		
	}

}
