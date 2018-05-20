package de.htwg.smarttraffic.controller;

import de.htwg.smarttraffic.model.Casestudy;
import de.htwg.smarttraffic.model.Intersection;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;


@Controller
public class HomeController {

    @Resource
    private Casestudy casestudy;

    @GetMapping(path = "/")
    public String getHomePage(Model model){


        model.addAttribute("intersections", casestudy.getIntersectionMap());

        return "index";
    }

    @GetMapping("/trafficLight/{trafficLightId}")
    public ResponseEntity getTrafficLightValues(@PathVariable String trafficLightId){
        System.out.println(trafficLightId);
        Intersection intersection = casestudy.getIntersectionMap().get(trafficLightId);


        System.out.println(intersection);
        return new ResponseEntity<>(intersection.getTrafficLights(), HttpStatus.OK);
    }

    @PostMapping("/railroad/{place}")
    public ResponseEntity setRailroadBarrier(@RequestBody String isRailroadBarrierDown, @PathVariable String place){

        System.out.println("set railroad barrier down: "+isRailroadBarrierDown);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/accident/{place}")
    public ResponseEntity setAccident(@RequestBody String isAccidentHappening, @PathVariable String place){

        System.out.println("isAccidentHappening: "+isAccidentHappening);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/nitrogenOxide/{place}")
    public ResponseEntity setNitrogenOxide(@RequestBody String isNitrogenOxideAlert, @PathVariable String place){

        System.out.println("isNitrogenOxideAlert: "+isNitrogenOxideAlert);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
