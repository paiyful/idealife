package com.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Set;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComplexType {
    private List<String> list;
    private Set<String> set;
    private Map<Integer,String> map;
    private Object[] objects;
}
