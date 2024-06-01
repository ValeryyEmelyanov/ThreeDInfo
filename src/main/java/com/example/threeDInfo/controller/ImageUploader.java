package com.example.threeDInfo.controller;

import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@Component
public class ImageUploader {

    // Папка для сохранения изображений
    // Папка для сохранения изображений
    private final String UPLOAD_DIR = "./images/";

    public String uploadImage(MultipartFile file, Long id) throws IOException {
        if (file == null || file.isEmpty()) {
            throw new IllegalArgumentException("File is empty or null");
        }

        // Генерируем уникальное имя файла
        String fileName = generateUniqueFileName(file);

        // Путь к файлу
        Path uploadPath = Paths.get(UPLOAD_DIR);
        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }

        // Сохраняем изображение на сервере
        Path filePath = uploadPath.resolve(fileName);
        Files.copy(file.getInputStream(), filePath);

        // Возвращаем путь к сохраненному изображению
        return fileName;
    }

    private String generateUniqueFileName(MultipartFile file) {
        String originalFileName = StringUtils.cleanPath(file.getOriginalFilename());
        String extension = FilenameUtils.getExtension(originalFileName);
        String uniqueFileName = UUID.randomUUID().toString() + "." + extension;
        return uniqueFileName;
    }
}
