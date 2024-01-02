package org.galapagos.sample;

import static org.junit.Assert.*;

import org.galapagos.config.RootConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
@Log4j


public class SampleTests {
	
	//@Setter(onMethod_ = {@Autowired} )
	@Autowired
	private Restaurant restaurant;

	@Test
	public void test() {


		assertNotNull(restaurant);
		
		log.info(restaurant);
		log.info("------------------");
		log.info(restaurant.getChef());
		
	}

}
