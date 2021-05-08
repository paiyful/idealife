package com.fc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Applyout {
    private Integer aoid;

    private Integer houseId;

    private Integer userlistId;

    private Userlist userlist;

    private Houselist houselist;
}