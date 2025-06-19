package com.yaroslavkislyi.shop.dao;

import com.yaroslavkislyi.shop.entity.Image;
import com.yaroslavkislyi.shop.repository.ImagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Limit;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public class ImageDAOImpl implements ImageDAO {

    @Autowired
    private ImagesRepository imagesRepository;

    @Override
    public byte[] getImageDataById(UUID imageId) {
        return imagesRepository.getImageDataById(imageId, Limit.unlimited()).getData();
    }

    @Override
    public void deleteImageById(UUID imageId) {
        imagesRepository.deleteImageById(imageId);
    }

    @Override
    public Image updateImageData(UUID imageId, byte[] data) {
        Image image = imagesRepository.getImageById(imageId);
        image.setData(data);
        return imagesRepository.save(image);
    }

    @Override
    public Image findImageById(UUID imageId) {
        return imagesRepository.findById(imageId).orElse(null);
    }

    @Override
    public Image save(Image image) {
        return imagesRepository.save(image);
    }
}
