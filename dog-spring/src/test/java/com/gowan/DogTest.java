package com.gowan;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= DogConfig.class )
public class DogTest {
		
	@Resource private Dog dog;
	@Resource private Dog dog2;
	@Resource private DogService dogService;
	
	@Test
	public void dogCanBark() {
		System.out.println(" name: " + dog.getName());
		assertEquals("nagel", dog.getName());
	}	
	@Test
	public void dog2CanBark() {
		System.out.println("name: " + dog2.getName());
		assertEquals("nagel", dog2.getName());
	}
}
