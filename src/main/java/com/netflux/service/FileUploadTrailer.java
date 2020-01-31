package com.netflux.service;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileUploadTrailer {
	public void fileUpload(MultipartFile file, String filename) throws IllegalStateException, IOException {
		final String Location = new File("src\\main\\resources\\public\\img\\trailers").getAbsolutePath() + "\\" + filename;
		file.transferTo(new File(Location));
	}
}
