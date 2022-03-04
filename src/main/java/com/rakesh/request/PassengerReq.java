package com.rakesh.request;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "passenger")
public class PassengerReq {

	@Id
	@Column(name = "ID")
	private long id;

	@Column(name = "NAME",length =4000 )
    private String name;

	@Column(name = "DATE",length = 4000)
    private String date;
	
	

	@Column(name = "TO",length = 4000)
	private String to;

	@Column(name = "PRICE",length = 4000)
	private String price;

	@Column(name = "NO",length = 4000)
	private String no;

	@Column(name = "ADDR",length = 4000)
	private String addr;
	@Column(name = "QUAL",length = 4000)
	private String qual;
	

@Column(name = "FROM1",length = 4000)
private String from;

	/**
	 * @return the pnr
	 */


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
	 * @return the start_point
	 */
	
	public String getQual() {
		return qual;
	}
	/**
	 * @param qual the qual to set
	 */
	public void setQual(String qual) {
		this.qual = qual;
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

	/**
	 * @param from the from to set
	 */
	
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
	 * @return the no
	 */
	public String getNo() {
		return no;
	}
	/**
	 * @param no the no to set
	 */
	public void setNo(String no) {
		this.no = no;
	}
	/**
	 * @return the addr
	 */
	public String getAddr() {
		return addr;
	}
	/**
	 * @param addr the addr to set
	 */
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
