package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
@Entity
@Table(name="CRONTAB_SERVICE_EXECUTION")
public class CrontabServiceExecution implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id")
	@SequenceGenerator(name="id", sequenceName = "crontab_service_execution_id_seq", allocationSize=1)
	@Column(name="id")
	private Long id;
	
	@Column(name="service")
	private String service;

	@Column(name="execution_time")
	private Date executionTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public Date getExecutionTime() {
		return executionTime;
	}

	public void setExecutionTime(Date executionTime) {
		this.executionTime = executionTime;
	}
	

}