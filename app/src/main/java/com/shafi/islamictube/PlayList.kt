package com.shafi.islamictube

import androidx.media3.common.C
import androidx.media3.common.MediaItem
import androidx.media3.common.MediaMetadata
import androidx.media3.common.MimeTypes
import io.sanghun.compose.video.uri.VideoPlayerMediaItem

const val MIME_TYPE_DASH = MimeTypes.APPLICATION_MPD
const val MIME_TYPE_HLS = MimeTypes.APPLICATION_M3U8
const val MIME_TYPE_VIDEO_MP4 = MimeTypes.VIDEO_MP4

val samplePlayList = listOf(
    VideoPlayerMediaItem.NetworkMediaItem(
        url = "https://storage.googleapis.com/wvmedia/clear/h264/tears/tears.mpd",
        mediaMetadata = MediaMetadata.Builder().setTitle("Clear DASH: Tears").build(),
        mimeType = MIME_TYPE_DASH,
    ),
    VideoPlayerMediaItem.NetworkMediaItem(
        url = "https://storage.googleapis.com/shaka-demo-assets/angel-one-hls/hls.m3u8",
        mediaMetadata = MediaMetadata.Builder().setTitle("Clear HLS: Angel one").build(),
        mimeType = MIME_TYPE_HLS,
    ),
    VideoPlayerMediaItem.NetworkMediaItem(
        url = "https://html5demos.com/assets/dizzy.mp4",
        mediaMetadata = MediaMetadata.Builder().setTitle("Clear MP4: Dizzy").build(),
        mimeType = MIME_TYPE_VIDEO_MP4,
    ),
    // DRM Content
    VideoPlayerMediaItem.NetworkMediaItem(
        url = "https://storage.googleapis.com/wvmedia/cenc/h264/tears/tears.mpd",
        mediaMetadata = MediaMetadata.Builder().setTitle("Widevine DASH cenc: Tears").build(),
        mimeType = MIME_TYPE_DASH,
        drmConfiguration = MediaItem.DrmConfiguration.Builder(C.WIDEVINE_UUID)
            .setLicenseUri("https://proxy.uat.widevine.com/proxy?provider=widevine_test")
            .build(),
    ),
    VideoPlayerMediaItem.NetworkMediaItem(
        url = "https://storage.googleapis.com/wvmedia/cbc1/h264/tears/tears_aes_cbc1.mpd",
        mediaMetadata = MediaMetadata.Builder().setTitle("Widevine DASH cbc1: Tears").build(),
        mimeType = MIME_TYPE_DASH,
        drmConfiguration = MediaItem.DrmConfiguration.Builder(C.WIDEVINE_UUID)
            .setLicenseUri("https://proxy.uat.widevine.com/proxy?provider=widevine_test")
            .build(),
    ),
    VideoPlayerMediaItem.NetworkMediaItem(
        url = "https://storage.googleapis.com/wvmedia/cbcs/h264/tears/tears_aes_cbcs.mpd",
        mediaMetadata = MediaMetadata.Builder().setTitle("Widevine DASH cbcs: Tears").build(),
        mimeType = MIME_TYPE_DASH,
        drmConfiguration = MediaItem.DrmConfiguration.Builder(C.WIDEVINE_UUID)
            .setLicenseUri("https://proxy.uat.widevine.com/proxy?provider=widevine_test")
            .build(),
    ),
)
