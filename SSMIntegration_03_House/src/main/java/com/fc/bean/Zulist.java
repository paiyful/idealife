package com.fc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Zulist extends ZulistKey {
    private Integer userlistId;

    private Integer contractId;

    private Houselist houselist;

    private Userlist userlist;
}