package com.fc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Hetong {
    private Integer id;

    private String chuzu;

    private String chuzuIdcard;

    private String zuke;

    private String zukeIdcard;

    private String fromdate;

    private String todate;

    private String houseId;

    private Integer payday;

    private Houselist houselist;

    private Zulist zulist;
}