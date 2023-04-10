package com.usm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.usm.model.SecurityMaster;
import com.usm.repository.SecurityMasterRepository;
import com.usm.service.SecurityMasterService;

@RunWith(SpringRunner.class)
@SpringBootTest
class UnifiedSecurityMastersApplicationTests {
	@Autowired
	private SecurityMasterService service;

	@MockBean
	private SecurityMasterRepository repository;

	/*
	 * @Test void givenMasterDataList_whenFindAll_thenReturnMasterDataList() {
	 * when(repository.findAll()) .thenReturn(Stream.of(new
	 * SecurityMaster("20MICRONS","20 Microns Limited","EQ","INE144J01027",
	 * "India","Metals and Mining","151040","Minerals & Mining")).collect(Collectors
	 * .toList())); assertEquals(1, service.fetchAllMasterData().size()); }
	 */

	/*
	 * @Test void givenSector_whenFindBySector_thenReturnCorrespondingMasterData() {
	 * String sector = "Metals and Mining"; when(repository.findBySector(sector))
	 * .thenReturn(Stream .of(new SecurityMaster("20MICRONS", "20 Microns Limited",
	 * "EQ", "INE144J01027", "India", "Metals and Mining", "151040",
	 * "Minerals & Mining"), new SecurityMaster("ADANIENT",
	 * "Adani Enterprises Limited", "EQ", "INE423A01024", "India",
	 * "Metals and Mining", "151040", "Metals & Mineral Trading"))
	 * .collect(Collectors.toList())); assertEquals(2,
	 * service.fetchMasterDataBySector(sector).size());
	 * 
	 * }
	 */
	/*
	 * @Test void givenMasterData_whenSave_thenReturnMasterData() throws IOException
	 * { SecurityMaster masterData=new
	 * SecurityMaster("20MICRONS","20 Microns Limited","EQ","INE144J01027",
	 * "India","Metals and Mining","151040","Minerals & Mining");
	 * when(repository.save(masterData)).thenReturn(masterData);
	 * assertThat(service.saveMasterDataInDb()) }
	 */
	/*
	 * public void givenSymbol_whenFindBySymbol_thenReturnCorrespondingMasterData(){
	 * String symbol="20MICRONS"; whe }
	 */

	/*
	 * @Test void givenIsin_whenFindByIsin_thenReturnCorrespondingMasterData() {
	 * 
	 * String isin = "INE144J01027"; Optional<SecurityMaster> s = Optional.of(new
	 * SecurityMaster("20MICRONS","20 Microns Limited","EQ","6-Oct-08",
	 * "INE144J01027","India","Metals and Mining","Minerals & Mining"));
	 * 
	 * when(repository.findByIsinNumber(isin)).thenReturn(s);
	 * 
	 * Assertions.assertThat(s,service.fetchMasterDataByIsin(isin)); }
	 */

}
