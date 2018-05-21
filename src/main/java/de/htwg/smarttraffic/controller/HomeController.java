package de.htwg.smarttraffic.controller;

import de.htwg.smarttraffic.model.Casestudy;
import de.htwg.smarttraffic.model.Intersection;
import de.htwg.smarttraffic.service.TriggerEventService;
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

    @Resource
    private TriggerEventService triggerEventService;

    @GetMapping(path = "/")
    public String getHomePage(Model model){


        model.addAttribute("intersections", casestudy.getIntersectionMap());
        model.addAttribute("eventStream", casestudy.getEventStream());

        return "index";
    }

    @GetMapping("/trafficLight/{trafficLightId}")
    public ResponseEntity getTrafficLightValues(@PathVariable String trafficLightId){

        Intersection intersection = casestudy.getIntersectionMap().get(trafficLightId);

        return new ResponseEntity<>(intersection.getTrafficLights(), HttpStatus.OK);
    }

    @PostMapping("/railroad/{place}")
    public ResponseEntity setRailroadBarrier(@RequestBody String isRailroadBarrierDown, @PathVariable String place){
        if(Boolean.parseBoolean(isRailroadBarrierDown)){
            System.out.println("down");
            triggerEventService.triggerRailwayCrossingDownEvent(place);
        } else {
            System.out.println("open");
            triggerEventService.triggerRailwayCrossingOpenEvent(place);
        }
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

    @PutMapping("/trafficPerMinute/{direction}")
    public ResponseEntity updateTrafficPerMinute(@RequestBody String newTrafficPerMinute, @PathVariable String direction){

        System.out.println("update Traffic: "+newTrafficPerMinute + "@ "+direction);
        casestudy.getEventStream().setTrafficNtoW(Integer.parseInt(newTrafficPerMinute));

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
