package com.pavan.expensetracker.mapper;

import java.util.List;

public interface Mapper<FROM, TO> {

    TO buildDto(FROM from);

    FROM buildEntity(TO to);

    List<TO> buildListDto(List<FROM> list);
}