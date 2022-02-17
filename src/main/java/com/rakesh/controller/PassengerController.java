package com.rakesh.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rakesh.dao.PassengerRepo;
import com.rakesh.dao.PnrRepo;
import com.rakesh.request.PassengerReq;
import com.rakesh.request.Pnr;
import com.rakesh.response.TicketRes;

@RestController
public class PassengerController {

	@Autowired
	PassengerRepo repo;
	@Autowired
	PnrRepo repo1;
	
	@PostMapping(value = "/book_ticket",consumes = {"application/json"})
	public ResponseEntity<String> bookTicket(@RequestBody PassengerReq pasreq){
		System.out.println(pasreq.getId());
		System.out.println(pasreq.getName());
		//repo.save(pasreq);
		Pnr pnr=new Pnr();
		String pnr1="PNR"+pasreq.getId();
		pnr.setId(pasreq.getId());
		pnr.setPnr(pnr1);
		pnr.setPasreq(pasreq);
		System.out.println(pnr.getPnr());
		repo1.save(pnr);
		System.out.println("&&&&&&&&&&&&&&&&&");
		return new ResponseEntity<String>("pnr1", HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/ticket/{pnr}",produces = {"application/json","application/xml"})
	public ResponseEntity<TicketRes> getTicket(@PathVariable String pnr){
		System.out.println(pnr);
		Pnr pnr1=repo1.getById(1l);
		
		System.out.println("=====================");
		System.out.println(pnr1);
		System.out.println("=====================");
		PassengerReq pasreq = pnr1.getPasreq();
		TicketRes ticketRes=new TicketRes();
		ticketRes.setPnr(pnr);
		ticketRes.setName(pasreq.getName());
		ticketRes.setFrom(pasreq.getFrom());
		ticketRes.setTo(pasreq.getAddr());
		ticketRes.setPrice(pasreq.getPrice());
		
		
		
		
		
		
		
		
		return new ResponseEntity<>(ticketRes, HttpStatus.OK);
	}
}
