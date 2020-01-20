package com.sveticov.h2spring.service;

import com.sveticov.h2spring.model.Box.Box;

import java.util.List;

public interface ServiceBox {
  void  addBox(Box box);
  Box getBoxByID(int id);
  List<Box> getAllBox();
}
