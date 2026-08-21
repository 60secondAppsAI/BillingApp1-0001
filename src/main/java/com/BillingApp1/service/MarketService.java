package com.BillingApp1.service;

import java.util.List;
import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.BillingApp1.domain.Market;
import com.BillingApp1.dto.MarketDTO;
import com.BillingApp1.dto.MarketSearchDTO;
import com.BillingApp1.dto.MarketPageDTO;
import com.BillingApp1.dto.MarketConvertCriteriaDTO;
import com.BillingApp1.service.GenericService;
import com.BillingApp1.dto.common.RequestDTO;
import com.BillingApp1.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface MarketService extends GenericService<Market, Integer> {

	List<Market> findAll();

	ResultDTO addMarket(MarketDTO marketDTO, RequestDTO requestDTO);

	ResultDTO updateMarket(MarketDTO marketDTO, RequestDTO requestDTO);

    Page<Market> getAllMarkets(Pageable pageable);

    Page<Market> getAllMarkets(Specification<Market> spec, Pageable pageable);

	ResponseEntity<MarketPageDTO> getMarkets(MarketSearchDTO marketSearchDTO);
	
	List<MarketDTO> convertMarketsToMarketDTOs(List<Market> markets, MarketConvertCriteriaDTO convertCriteria);

	MarketDTO getMarketDTOById(Integer marketId);



	
}
