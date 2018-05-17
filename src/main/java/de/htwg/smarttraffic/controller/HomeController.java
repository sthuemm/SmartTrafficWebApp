package de.htwg.smarttraffic.controller;

import de.htwg.smarttraffic.model.Intersection;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HomeController {


    @GetMapping(path = "/")
    public String getHomePage(Model model){
        Intersection k1 = new Intersection(Intersection.IntersectionType.WNO);
        Intersection k2 = new Intersection(Intersection.IntersectionType.WNOS);
        Intersection k3 = new Intersection(Intersection.IntersectionType.WNO);

        Map<String, Intersection> intersectionMap = new HashMap<>();
        intersectionMap.put("K1", k1);
        intersectionMap.put("K2", k2);
        intersectionMap.put("K3", k3);

        model.addAttribute("intersections", intersectionMap);

        return "index";
    }
}
