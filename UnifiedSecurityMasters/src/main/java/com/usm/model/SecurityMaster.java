package com.usm.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MasterData")
public class SecurityMaster {
	
	private String exchange;
	private String country;
	private String currency;
	@Id
	private String isinNumber;
	private String symbol;
	private String nameOfCompany;
	private String series;
	private String sector;
	private String industry;
	private String gics;
	public SecurityMaster(String exchange, String country, String currency, String isinNumber, String symbol,
			String nameOfCompany, String series, String sector, String industry, String gics) {
		super();
		this.exchange = exchange;
		this.country = country;
		this.currency = currency;
		this.isinNumber = isinNumber;
		this.symbol = symbol;
		this.nameOfCompany = nameOfCompany;
		this.series = series;
		this.sector = sector;
		this.industry = industry;
		this.gics = gics;
	}
	public SecurityMaster() {
		super();
	}
	public String getExchange() {
		return exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getIsinNumber() {
		return isinNumber;
	}
	public void setIsinNumber(String isinNumber) {
		this.isinNumber = isinNumber;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getNameOfCompany() {
		return nameOfCompany;
	}
	public void setNameOfCompany(String nameOfCompany) {
		this.nameOfCompany = nameOfCompany;
	}
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getGics() {
		return gics;
	}
	public void setGics(String gics) {
		this.gics = gics;
	}
	@Override
	public String toString() {
		return "SecurityMaster [exchange=" + exchange + ", country=" + country + ", currency=" + currency
				+ ", isinNumber=" + isinNumber + ", symbol=" + symbol + ", nameOfCompany=" + nameOfCompany + ", series="
				+ series + ", sector=" + sector + ", industry=" + industry + ", gics=" + gics + "]";
	}

}
