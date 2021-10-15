package dev.gutuivan.controller;

import dev.gutuivan.model.Image;
import dev.gutuivan.service.ImageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class ImageController {
    private final ImageService imageService;

    public ImageController(ImageService imageService){
        super();
        this.imageService = imageService;
    }
    
    @GetMapping("images")
    public List<Image> get(){
        return imageService.getAll();
    }

    @GetMapping("images/{id}")
    public ResponseEntity<Image> get(@PathVariable("id") long id){
        return new ResponseEntity<Image>(imageService.get(id), HttpStatus.OK);
    }




}