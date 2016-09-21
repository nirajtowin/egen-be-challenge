package io.egen.egenmetric.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import io.egen.egenmetric.Repository.MetricRepository;
import io.egen.egenmetric.Repository.Metrics;
import io.egen.metric.dto.MetricDTO;

@Service
public class MongoDBMetricService implements MetricsService{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MongoDBMetricService.class);
	
	public MetricRepository repository;
	
	@Autowired
	MongoDBMetricService(MetricRepository repository) {
        this.repository = repository;
    }

	@Override
	public MetricDTO create(MetricDTO dto) {
		
		LOGGER.info("Inserting Metrics data: {}", dto);
		
		Metrics persisted = Metrics.getBuilder()
				.weightvar(dto.getWeightVar())
				.timeStamp(dto.getTimeStamp())
                .build();

        persisted = repository.save(persisted);
        LOGGER.info("Created a new todo entry with information: {}", persisted);

        return convertToDTO(persisted);
	}
	
	private MetricDTO convertToDTO(Metrics metric) {
		MetricDTO dto = new MetricDTO();

        dto.setId(metric.getId());
        dto.setWeightVar(metric.getWeightVar());
        dto.setTimeStamp(metric.getTimeStamp());
        return dto;
    }

}
