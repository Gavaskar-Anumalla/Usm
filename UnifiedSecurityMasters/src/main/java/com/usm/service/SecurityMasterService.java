package com.usm.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usm.exception.DataNotFoundException;
import com.usm.model.SecurityMaster;
import com.usm.repository.SecurityMasterRepository;

@Service
public class SecurityMasterService {
	
	@Autowired
	private SecurityMasterRepository repo;
	

	
	public void saveMasterDataInDb() throws IOException {
		String line ="";
		SecurityMaster master = new SecurityMaster();
		FileReader fr = new FileReader("src/main/resources/nseStocks.csv");
		BufferedReader br = new BufferedReader(fr);
		try {
			
			while ((line = br.readLine()) != null) {
				String[] data =line.split(",");
				master.setExchange(data[0]);
				master.setCountry(data[1]);
				master.setCurrency(data[2]);
				master.setIsinNumber(data[3]);
				master.setSymbol(data[4]);
				master.setNameOfCompany(data[5]);
				master.setSeries(data[6]);
				master.setSector(data[7]);
				master.setIndustry(data[8]);
				master.setGics(data[9]);
				repo.save(master);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally 
			{
				br.close();
			}
		
	}

	public List<SecurityMaster> fetchAllMasterData() {
		return repo.findAll();
	}

	public SecurityMaster fetchMasterDataByIsin(String isinNumber) {

		Optional<SecurityMaster> dataOptional = repo.findByIsinNumber(isinNumber);
		if (dataOptional.isPresent()) {
			return dataOptional.get();
		} else {
			throw new DataNotFoundException("ISIN is not valid");
		}

	}

	public List<SecurityMaster> fetchMasterDataBySector(String sector) {

		return repo.findBySector(sector);

	}

	public SecurityMaster fetchMasterDataBySymbol(String symbol) {
		Optional<SecurityMaster> dataOptional = repo.findBySymbol(symbol);
		if (dataOptional.isPresent()) {
			return dataOptional.get();
		} else {
			throw new DataNotFoundException("Please Provide valid symbol");
		}
		
	}

}
