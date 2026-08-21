package com.BillingApp1.dao;

import java.util.List;
import java.util.Date;

import com.BillingApp1.dao.GenericDAO;
import com.BillingApp1.domain.Portfolio;




import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

public interface PortfolioDAO extends GenericDAO<Portfolio, Integer> {
  
	List<Portfolio> findAll();
	


}

