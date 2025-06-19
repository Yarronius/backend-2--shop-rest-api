package com.yaroslavkislyi.shop.repository;

import com.yaroslavkislyi.shop.entity.Image;
import org.springframework.data.domain.Limit;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ImagesRepository extends JpaRepository<Image, UUID> {
    Image getImageById(UUID imageId);
    Image getImageDataById(UUID id, Limit limit);
    void deleteImageById(UUID id);
    Image save(Image image);
}
