package dev.gutuivan.service.impl;

import dev.gutuivan.model.Image;
import dev.gutuivan.repo.ImageRepository;
import dev.gutuivan.service.ImageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {
    private final ImageRepository imageRepository;
    public ImageServiceImpl(ImageRepository imageRepository) {
        super();
        this.imageRepository = imageRepository;
    }

    @Override
    public List<Image> getAll() {
        return imageRepository.findAll();
    }

    @Override
    public Image get(long id) {
        return imageRepository.findById(id).orElseThrow();
    }
}