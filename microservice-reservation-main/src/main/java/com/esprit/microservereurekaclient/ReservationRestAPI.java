package com.esprit.microservereurekaclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = " *")
@RestController
@RequestMapping("/Reservation")
public class ReservationRestAPI {

    private String hello = "Hello I'm An Reservation";

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/hello")
    public String sayHello() {
        return hello;
    }

    @Autowired
    private ReservationService reservationService;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Reservation> createorganisation(@RequestBody Reservation reservation) {
        return new ResponseEntity<>(reservationService.AddReservation(reservation), HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Reservation> updatereservation(@PathVariable(value = "id") int id,
                                                         @RequestBody Reservation reservation) {
        return new ResponseEntity<>(reservationService.updateReservation(id, reservation),
                HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deletereservation(@PathVariable(value = "id") int id) {
        return new ResponseEntity<>(reservationService.deleteReservation(id), HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Reservation>> getreservation() {
        List<Reservation> reservation = reservationService.getAllReservation();
        if (reservation != null) {
            return new ResponseEntity<>(reservation, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    //@CrossOrigin(origins = "http://localhost:4200/reservations/{id}")
    @GetMapping("/reservations/{id}")
    @ResponseStatus(HttpStatus.OK)
    private ResponseEntity<Reservation> getReservation(@PathVariable("id") int id) {
        Reservation reservation = reservationService.getReservationById(id);
        return ResponseEntity.status(HttpStatus.OK).body(reservation);
    }


}
