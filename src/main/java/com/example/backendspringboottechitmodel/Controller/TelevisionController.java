package com.example.backendspringboottechitmodel.Controller;


import com.example.backendspringboottechitmodel.Models.Televisions;
import com.example.backendspringboottechitmodel.Repositories.TelevisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/televisions")
public class TelevisionController {

        private final TelevisionRepository televisionrepository;

        public TelevisionController(TelevisionRepository televisionrepository) {
                this.televisionrepository = televisionrepository;
        }

        @GetMapping("")
        public ResponseEntity<Object> getAllTelevision() {
                return ResponseEntity.ok(televisionrepository.findAll());
        }

        @GetMapping("{id}")
        public ResponseEntity<Object> getTelevision(@PathVariable int id) {
                return ResponseEntity.ok(televisionrepository.findById(id));
        }

        @PostMapping("")
        public ResponseEntity<Object> createTelevision(@RequestBody Televisions television) {

                Televisions savedTelevision = televisionrepository.save(television);

                URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/televisions/" + savedTelevision.getId()).toUriString());

                return ResponseEntity.created(uri).body(television);
        }

        @DeleteMapping("{id}")
        public ResponseEntity<Object> deleteTelevision(@PathVariable int id) {
                Optional<Televisions> deleteTelevision = televisionrepository.findById(id);
                if (deleteTelevision.isPresent()) {
                        Televisions ObjectTelevisions = deleteTelevision.get();
                        televisionrepository.delete(ObjectTelevisions);
                        return ResponseEntity.ok("television deleted");
                } else {
                        return new ResponseEntity<>("not exist", HttpStatus.BAD_REQUEST);
                }
        }

        @PutMapping("{id}")
        public ResponseEntity<Object> updateTelevision(@PathVariable int id, @RequestBody Televisions television) {
                Optional<Televisions> optionalTelevisions = televisionrepository.findById(id);
                if (optionalTelevisions.isPresent()) {
                        Televisions Updatedtelevisions = optionalTelevisions.get();
                        Updatedtelevisions.setAmbiLight(television.isAmbiLight());
                        Updatedtelevisions.setBluetooth(television.isBluetooth());
                        Updatedtelevisions.setHDR(television.isHDR());
                        Updatedtelevisions.setName(television.getName());
                        Updatedtelevisions.setPrice(television.getPrice());
                        Updatedtelevisions.setAvailableSize(television.getAvailableSize());
//if(television.getPrice() != null){
//newTelevision.setPrice(television.getPrice())
                        televisionrepository.save(Updatedtelevisions);
                        return ResponseEntity.ok("update successful");
                } else {
                        return ResponseEntity.notFound().build();
                }
        }

        @PatchMapping("{id}")
        public ResponseEntity<Object> modifyTelevisionPrice(@PathVariable int id, @RequestBody Televisions television) {
                Optional<Televisions> optionalTelevisions = televisionrepository.findById(id);
                if (optionalTelevisions.isPresent()) {
                        Televisions patchedTelevision = optionalTelevisions.get();
                        patchedTelevision.setPrice(television.getPrice());
                        televisionrepository.save(patchedTelevision);
                        return ResponseEntity.ok("patched update" + patchedTelevision);
                } else {
                        return ResponseEntity.notFound().build();
                }

        }






}
