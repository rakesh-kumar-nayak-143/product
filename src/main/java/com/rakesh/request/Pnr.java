package com.rakesh.request;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Pnr {

	@Id
	private long id;
	private String pnr;
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "passenger_id")
	private PassengerReq pasreq;
	
	/**
	 * @return the id
	 */
	
	/**
	 * @return the pnr
	 */
	public String getPnr() {
		return pnr;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @param pnr the pnr to set
	 */
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	/**
	 * @return the pasreq
	 */
	public PassengerReq getPasreq() {
		return pasreq;
	}
	/**
	 * @param pasreq the pasreq to set
	 */
	public void setPasreq(PassengerReq pasreq) {
		this.pasreq = pasreq;
	}
	
	
}
