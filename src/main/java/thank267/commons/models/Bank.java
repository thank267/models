package thank267.commons.models;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Bank
{   
    @Setter
    @Getter
    private String account;
    
    @Setter
    @Getter
    private String bank;

    @Setter
    @Getter
    private String city;

    @Setter
    @Getter
    private String corr;

    @Setter
    @Getter
    private String bik;

}
