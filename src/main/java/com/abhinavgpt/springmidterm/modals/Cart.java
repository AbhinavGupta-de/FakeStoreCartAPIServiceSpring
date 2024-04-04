package com.abhinavgpt.springmidterm.modals;

import java.util.List;

public record Cart(long id, long userId, String date, List<Product> products) {}
