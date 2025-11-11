package com.d2big.books.util;

import java.io.File;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Value("${upload.path}")     // 예: /upload/**
    private String uploadPath;

    @Value("${resource.path}")   // 예: D:/resources/upload/
    private String resourcePath;

    private String absolutePath;

    // ✅ 경로 초기화 + 자동 디렉토리 생성
    @PostConstruct
    public void initUploadDirectory() {
        if (!StringUtils.hasText(resourcePath)) {
            throw new IllegalArgumentException("❌ resource.path 설정이 비어 있습니다!");
        }

        File dir = new File(resourcePath);
        absolutePath = dir.getAbsolutePath();

        if (!dir.exists()) {
            boolean created = dir.mkdirs();
            if (created) {
                System.out.println("📁 업로드 디렉토리 생성됨: " + absolutePath);
            } else {
                System.err.println("❌ 업로드 디렉토리 생성 실패: " + absolutePath);
            }
        } else {
            System.out.println("📁 업로드 디렉토리 이미 존재함: " + absolutePath);
        }
    }

    // ✅ 정적 리소스 매핑
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String location = "file:" + absolutePath + (absolutePath.endsWith("/") ? "" : "/");

        registry.addResourceHandler(uploadPath)
                .addResourceLocations(location);
        
        System.out.println("🔗 리소스 핸들러 등록됨: [" + uploadPath + "] → [" + location + "]");
    }
}
