package altin.capitalcityweb.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("capital")
public class CapitalController {
    ArrayList<Country> list = new ArrayList<>();

    @GetMapping("{country}")
    public String returnCapital(@PathVariable String country){
        add(list,"Austria","Vienna");
        add(list,"Germany","Berlin");
        add(list,"France","Paris");
        add(list,"Italy","Rom");

        for(Country c:list){
            if(c.getName().matches(country)){
                return c.getCapital();
            }
        }
        return country;
    }
    public static void add(ArrayList<Country> list, String name, String capital){
        list.add(new Country(name,capital));
    }
}
