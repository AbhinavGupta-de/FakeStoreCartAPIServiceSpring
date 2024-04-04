package com.abhinavgpt.springmidterm.dtos;

import com.abhinavgpt.springmidterm.modals.Product;

import java.util.List;

public record CartRecieveDTO(long id, long userId, String date, List<Product> products) {

}