package com.pavan.expensetracker.mapper;

import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractMapper<FROM, TO> implements Mapper<FROM, TO> {

    @Override
    public List<TO> buildListDto(List<FROM> list) {
        return list.stream()
                .map(this::buildDto)
                .collect(Collectors.toList());
    }
}
