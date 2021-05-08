package com.fc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Topaid {
    private Integer id;

    private String houseId;

    private Date date;

    private Integer userlistId;

    private String status;

    private Userlist userlist;

    private Houselist houselist;
}