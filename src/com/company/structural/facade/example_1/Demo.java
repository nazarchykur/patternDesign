package com.company.structural.facade.example_1;

import com.company.structural.facade.example_1.facade.VideoConversionFacade;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...

        // PRINT:
        //
        // VideoConversionFacade: conversion started.
        //CodecFactory: extracting ogg audio...
        //BitrateReader: reading file...
        //BitrateReader: writing file...
        //AudioMixer: fixing audio...
        //VideoConversionFacade: conversion completed.
    }
}
