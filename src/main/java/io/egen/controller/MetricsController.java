package io.egen.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.egen.egenmetric.services.MetricsService;
import io.egen.metric.dto.MetricDTO;

@RestController
@RequestMapping("/api/metrics")
final class MetricsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MetricsController.class);

  public MetricsService service;

    @Autowired
    MetricsController(MetricsService service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    MetricDTO create(@RequestBody @Valid MetricDTO metricEntry) {
        LOGGER.info("Creating a new Metric entry with information: {}", metricEntry);

        MetricDTO created = service.create(metricEntry);
        LOGGER.info("Created a new Metric entry with information: {}", created);

        return created;
    }

}