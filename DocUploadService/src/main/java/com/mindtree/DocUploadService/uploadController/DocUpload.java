package com.mindtree.DocUploadService.uploadController;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
@RestController
@CrossOrigin
public class DocUpload {

	@PostMapping("/uploadForm")
	public ResponseEntity<?> uploadKYCData(@RequestParam("kyc") List<MultipartFile> fileList) {
		String OUT_PATH = "D:\\Test101\\";
        System.out.println(fileList);
        System.out.println("arpanakumari");
		try {
			for (MultipartFile file : fileList) {
				System.out.println(file.getName());
				byte[] bytes = file.getBytes();
				Path path = Paths.get(OUT_PATH + file.getOriginalFilename());
				System.out.println("arpana");
				System.out.println(path);
				Files.write(path, bytes);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Unable to save images",HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<String>("Successfully saved images", HttpStatus.OK);
	}
}
