package com.order.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SERIES")
public class SeriesEntity {

	@Id
	@Column(name ="SERIES_ID")
	private int SeriesId;
	
	@Column(name="SEREIS_NAME")
	private String SeriesName;
	
	public int getSeriesId() {
		return SeriesId;
	}

	public void setSeriesId(int seriesId) {
		SeriesId = seriesId;
	}

	public String getSeriesName() {
		return SeriesName;
	}

	public void setSeriesName(String seriesName) {
		SeriesName = seriesName;
	}


	
	public SeriesEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SeriesEntity(int SeriesId,String SeriesName) {
		this.SeriesId=SeriesId;
		this.SeriesName=SeriesName;
	}
	
	
	
	
}
