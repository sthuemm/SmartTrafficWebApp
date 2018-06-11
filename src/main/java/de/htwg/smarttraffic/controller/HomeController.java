package de.htwg.smarttraffic.controller;

import de.htwg.smarttraffic.model.Casestudy;
import de.htwg.smarttraffic.model.Intersection;
import de.htwg.smarttraffic.service.TriggerEventService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.logging.Logger;


@Controller
@Slf4j
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
            log.info("setRailroadBarrier down");
            triggerEventService.triggerRailwayCrossingDownEvent(place);
        } else {
            log.info("setRailroadBarrier open");

            triggerEventService.triggerRailwayCrossingOpenEvent(place);
        }

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/accident/{place}")
    public ResponseEntity setAccident(@RequestBody String isAccidentHappening, @PathVariable String place){
        if(Boolean.parseBoolean(isAccidentHappening)){
            log.info("setAccident start");
            triggerEventService.triggerAccidentCrossingStartEvent(place);
        } else {
            log.info("setAccident end");
            triggerEventService.triggerAccidentCrossingEndEvent(place);
        }

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/nitrogenOxide/{place}")
    public ResponseEntity setNitrogenOxide(@RequestBody String isNitrogenOxideAlert, @PathVariable String place){
        if(Boolean.parseBoolean(isNitrogenOxideAlert)){
            log.info("setNitrogenOxide high");
            triggerEventService.triggerNitroxigenCrossingHighEvent(place);
        } else {
            log.info("setNitroOxide low");
            triggerEventService.triggerNitrooxigenCrossingLowEvent(place);
        }

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/trafficPerMinute/{direction}")
    public ResponseEntity updateTrafficPerMinute(@RequestBody String newTrafficPerMinute, @PathVariable String direction){

        casestudy.getEventStream().setTrafficNtoW(Integer.parseInt(newTrafficPerMinute));

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/events")
    public String openEventPage(Model model){
        model.addAttribute("intersections", casestudy.getIntersectionMap());
        model.addAttribute("eventStream", casestudy.getEventStream());

        return "eventpage";
    }
}
