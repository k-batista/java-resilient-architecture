package br.com.rmacario.carsstorageapi.controllers;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.rmacario.carsstorageapi.pojos.Car;

@RestController("/cars")
public class CarsResource {

	@RequestMapping(method=RequestMethod.GET)
	public String findAll() {
		return "abcd";
	}
	
	@RequestMapping(method=POST, consumes=APPLICATION_JSON_VALUE, produces=APPLICATION_JSON_VALUE)
	public void save(@RequestBody Car car) {
		System.out.println(car);
	}
}
