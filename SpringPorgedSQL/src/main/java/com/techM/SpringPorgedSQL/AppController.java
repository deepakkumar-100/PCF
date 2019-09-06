package com.techM.SpringPorgedSQL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public  class AppController{
	
	@Autowired
	ApplicationMetarepository applicationMetarepository;
	
	@GetMapping(path="app/{name}")
	public ResponseEntity<ApplicationMeta> applicationdata(@PathVariable String name){
		ApplicationMeta applicationMeta = applicationMetarepository.findByName(name);
		System.out.println("app is :::: "+applicationMeta);

		System.out.println("data pupulatwed" + applicationMeta.getId() +"   :  "+ applicationMeta.getName() +"  :  " + applicationMeta.getDescription());
		return ResponseEntity.ok().body(applicationMeta);
		
	}
	@GetMapping(path="app/all")
	public ResponseEntity<List<ApplicationMeta>> applicationdataAll(){
		List<ApplicationMeta> applicationMetaList =  applicationMetarepository.findAll();
		for(ApplicationMeta applicationMeta2 :applicationMetaList)
		System.out.println("data pupulatwed" + applicationMeta2.getId() +"   :  "+ applicationMeta2.getName() +"  :  " + applicationMeta2.getDescription());
		return ResponseEntity.ok().body(applicationMetaList);
		
	}
	
	@RequestMapping(path = "saveApp", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String saveApp(ApplicationMeta applicationMeta) {
		
		ApplicationMeta temp = applicationMetarepository.save(applicationMeta);
		return temp.getId();
	}

}

