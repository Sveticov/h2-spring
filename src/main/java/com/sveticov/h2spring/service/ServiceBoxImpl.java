package com.sveticov.h2spring.service;

import com.sveticov.h2spring.model.Box.Box;
import com.sveticov.h2spring.repository.BoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceBoxImpl implements ServiceBox {

  private BoxRepository boxRepository;
   @Autowired
   public ServiceBoxImpl(BoxRepository boxRepository){
       this.boxRepository=boxRepository;
   }

    @Override
    public void addBox(Box box) {
        boxRepository.save(box);
    }

    @Override
    public Box getBoxByID(int id) {
        return boxRepository.findById(id).orElse(null);
    }

    @Override
    public List<Box> getAllBox() {

        return boxRepository.findAll();
    }
}
