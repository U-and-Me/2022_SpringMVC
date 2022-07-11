package kr.hs.study.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class uploadController {
	
	@Autowired
	@Qualifier("uploadPath")
	private String uploadPath;	// ���� ���ε�� ����
	
    @GetMapping("/upload")
    public String upload_get(){
        return"upload/upload_form";
    }

    // ���Ͼ��ε� �� ��µǰ� ����
    @PostMapping("/re_upload")
    public ModelAndView re_upload(MultipartFile file, ModelAndView mv) throws IOException {
    	System.out.println("filename : " + file.getOriginalFilename());
    	System.out.println("fileSize : " + file.getSize());
    	System.out.println("filetype : " + file.getContentType());
    	System.out.println("filename2 : " + file.getName());
    	
    	String savedName = file.getOriginalFilename();
    	File a = new File(uploadPath, savedName);
    	
    	// ���� ���͸������� �̸����� ���� => FileCopyUtil
    	FileCopyUtils.copy(file.getBytes(), a);
    	mv.setViewName("upload/uploadResult");
    	mv.addObject("savedName", savedName);
    	
    	return mv;
    }
    
}