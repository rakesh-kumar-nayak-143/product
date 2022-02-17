package com.rakesh.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rakesh.request.Pnr;

public interface PnrRepo extends JpaRepository<Pnr, Long> {

}
