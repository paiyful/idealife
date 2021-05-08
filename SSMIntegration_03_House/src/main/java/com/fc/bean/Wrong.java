package com.fc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Wrong {
    private Integer id;

    private String houseId;

    private Date date;

    private Integer userlistId;

    private String status;

    private String detail;

    private Houselist houselist;

    private Userlist userlist;
}