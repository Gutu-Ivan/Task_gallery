package dev.gutuivan.service;

import dev.gutuivan.model.Image;

import java.util.List;

public interface ImageService {
    List<Image> getAll();
    Image get(long id);
}
