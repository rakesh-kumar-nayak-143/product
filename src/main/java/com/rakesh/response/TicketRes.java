package com.rakesh.response;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TicketRes {

	private String name;
	private String to;
	private String from;
	private String date;
	private String price;
	private String pnr;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the to
	 */
	public String getTo() {
		return to;
	}
	/**
	 * @param to the to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}
	/**
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}
	/**
	 * @param from the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	/**
	 * @return the pnr
	 */
	public String getPnr() {
		return pnr;
	}
	/**
	 * @param pnr the pnr to set
	 */
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
}
