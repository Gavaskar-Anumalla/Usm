package com.usm.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usm.model.SecurityMaster;
import com.usm.service.SecurityMasterService;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping(path = "/api/master")
@CrossOrigin("*")
public class SecurityMasterController {

	@Autowired
	private SecurityMasterService service;

	@PostConstruct
	@PostMapping(path = "/saveData")
	public void saveMasterData() {
		try {
			service.saveMasterDataInDb();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@GetMapping("/fetchData")
	public ResponseEntity<List<SecurityMaster>> getAllMasterData() {
		List<SecurityMaster> dataList = service.fetchAllMasterData();
		return new ResponseEntity<>(dataList, HttpStatus.OK);

	}

	@GetMapping("/fetchByIsin/{isinNumber}")
	public ResponseEntity<SecurityMaster> getMasterDataById(@PathVariable("isinNumber") String isinNumber) {
		SecurityMaster dataMaster = service.fetchMasterDataByIsin(isinNumber);
		return new ResponseEntity<>(dataMaster, HttpStatus.OK);
	}

	@GetMapping("/fetchBySector/{sector}")
	public ResponseEntity<List<SecurityMaster>> getMasterDataBySector(@PathVariable("sector") String sector) {
		List<SecurityMaster> dataList = service.fetchMasterDataBySector(sector);
		return new ResponseEntity<>(dataList, HttpStatus.OK);
	}

	@GetMapping("/fetchBySymbol/{symbol}")
	public ResponseEntity<SecurityMaster> getMasterDataBySymbol(@PathVariable("symbol") String symbol) {
		SecurityMaster master = service.fetchMasterDataBySymbol(symbol);
		return new ResponseEntity<>(master, HttpStatus.OK);
	}
}