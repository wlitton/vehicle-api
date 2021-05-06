package com.example.vehicle.core.service;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import com.example.vehicle.core.entity.VehicleEntity;
import com.example.vehicle.core.params.VehicleParam;
import com.example.vehicle.core.repository.VehicleRepository;

@RunWith(SpringRunner.class)
public class VehicleServiceImplTest {

//    @TestConfiguration
//    static class VehicleServiceImplTestContextConfiguration {
// 
//        @Bean
//        public VehicleService vehicleService() {
//            return new VehicleServiceImpl();
//        }
//    }
//    DummyClass dummyClass = Mockito.mock(DummyClass.class);
    @Before(value = "")
    public void setUp() {
        VehicleEntity entity = new VehicleEntity();
        VehicleEntity dummyClass = Mockito.mock(VehicleEntity.class);
        List<VehicleEntity> entities = new ArrayList<VehicleEntity>();
        List<? extends VehicleEntity> someList = new ArrayList<VehicleEntity>();
        Pageable limit = PageRequest.of(1,1);
        Mockito.doReturn(someList).when(vehicleRepository).findByMake(anyString(),any());
        //anyString(), anyString(), any()
        Mockito.when(vehicleRepository.findByMake(anyString(),any()))
          .thenReturn(entities);
        Mockito.when(vehicleRepository.findByModel(anyString(),any()))
        .thenReturn(entities);
        Mockito.when(vehicleRepository.findByColor(anyString(),any()))
        .thenReturn(entities);
        Mockito.when(vehicleRepository.findByYear(anyString(),any()))
        .thenReturn(entities);
    }

//    @Autowired
//    private VehicleService vehicleService;

    @MockBean
    private VehicleRepository vehicleRepository;
    
    @Test
    public void testFindByMake() {
    	Pageable limit = PageRequest.of(1,1);
    	List<VehicleEntity> found = vehicleRepository.findByMake("",limit);
     
    	assertEquals(found.size(), 0);
     }
    
    @Test
    public void testFindByModel() {
    	Pageable limit = PageRequest.of(1,1);
    	List<VehicleEntity> found = vehicleRepository.findByModel("",limit);
     
    	assertEquals(found.size(), 0);
     }
    
    @Test
    public void testFindByColor() {
    	Pageable limit = PageRequest.of(1,1);
    	List<VehicleEntity> found = vehicleRepository.findByColor("",limit);
     
    	assertEquals(found.size(), 0);
     }
    
    @Test
    public void testFindByYear() {
    	Pageable limit = PageRequest.of(1,1);
    	List<VehicleEntity> found = vehicleRepository.findByYear("",limit);
     
    	assertEquals(found.size(), 0);
     }

    // write test cases here
}