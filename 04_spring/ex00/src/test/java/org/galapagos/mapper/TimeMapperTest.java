package org.galapagos.mapper;

import static org.junit.Assert.*;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.galapagos.config.RootConfig;
import org.galapagos.persistence.DataSourceTests;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { RootConfig.class })
@Log4j
public class TimeMapperTest {

	@Autowired
	private TimeMapper timeMapper;

	@Test
	public void testGetTime() {
		log.info(timeMapper.getClass().getName());
		log.info(timeMapper.getTime());

	}

	@Test
	public void tetGetTime2() {
		log.info("getTime2");
		log.info(timeMapper.getTime2());
	}

}
