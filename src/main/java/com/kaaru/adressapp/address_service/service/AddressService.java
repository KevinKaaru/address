package com.kaaru.adressapp.address_service.service;

import com.kaaru.adressapp.address_service.entity.Address;
import com.kaaru.adressapp.address_service.repo.AddressRepo;
import com.kaaru.adressapp.address_service.response.AddressResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
   private AddressRepo addressRepo;
    @Autowired
   private ModelMapper modelMapper;

    public AddressResponse findAddressByEmployeeId(int employeeId){
       Address address= addressRepo.findAddressByEmployeeId(employeeId);
      AddressResponse addressResponse= modelMapper.map(address,AddressResponse.class);
      return  addressResponse;

    }
}
