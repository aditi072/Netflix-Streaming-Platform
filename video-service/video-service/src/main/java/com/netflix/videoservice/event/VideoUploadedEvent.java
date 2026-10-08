package com.netflix.videoservice.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Event published to Kafka when a video is uploaded to S3.
 * Encoding Service consumes this to start FFmpeg processing.
 *
 * Topic: video.uploaded
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VideoUploadedEvent {
    private String movieId;
    private String videoKey;      // S3 key of uploaded raw video
    private String bucketName;    // S3 bucket name
    private String originalFileName;
    private long fileSizeBytes;
}