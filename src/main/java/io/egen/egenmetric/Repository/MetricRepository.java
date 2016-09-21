package io.egen.egenmetric.Repository;

import org.bson.types.ObjectId;

public interface MetricRepository {
	
	Metrics save(Metrics saved);

}
