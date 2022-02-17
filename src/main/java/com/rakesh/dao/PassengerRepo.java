package com.rakesh.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rakesh.request.PassengerReq;
//import com.rakesh.request.Product;

public interface PassengerRepo extends JpaRepository<PassengerReq, Long>{

}
