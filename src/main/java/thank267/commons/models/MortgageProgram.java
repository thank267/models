package thank267.commons.models;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MortgageProgram
{   
    @Setter
    @Getter
    private String name;
       

    @Setter
    @Getter
    private MortgageBank mortgageBank;
    
}
