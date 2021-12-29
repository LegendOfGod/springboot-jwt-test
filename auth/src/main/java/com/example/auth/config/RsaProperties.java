package com.example.auth.config;

import com.example.common.utils.RsaUtils;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.annotation.PostConstruct;
import java.security.PrivateKey;
import java.security.PublicKey;

/**
 * @author lqb
 * @date 2021/12/27 19:18
 */
@ConfigurationProperties(prefix = "rsa.key")
@Data
public class RsaProperties {
    private String pubKeyFile;
    private String priKeyFile;
    private PrivateKey privateKey;
    private PublicKey publicKey;


    @PostConstruct
    public void createKey() {
        try {
            this.privateKey = RsaUtils.getPrivateKey(priKeyFile);
            this.publicKey = RsaUtils.getPublicKey(pubKeyFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
