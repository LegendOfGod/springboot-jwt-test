package com.example.auth.pojo;

import com.example.common.utils.JsonUtils;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

/**
 * @author lqb
 * @date 2021/12/28 9:26
 */
@Data
public class RolePojo implements GrantedAuthority {


    private Integer id;
    private String roleName;
    private String roleDesc;

    @JsonIgnore
    @Override
    public String getAuthority() {
        return roleName;
    }

}
