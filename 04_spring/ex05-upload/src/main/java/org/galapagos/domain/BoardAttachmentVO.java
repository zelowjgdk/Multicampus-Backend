package org.galapagos.domain;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.taglibs.standard.tag.el.xml.ExprTag;
import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardAttachmentVO {

	public static final String UPLOAD_PATH = "c:/upload/board";

	private Long no;
	private String filename;
	private String path;
	private String contentType;
	private Long size;
	private Long bno;
	private Date regDate;

	public BoardAttachmentVO(Long bno, MultipartFile part) throws Exception {
		filename = part.getOriginalFilename();
		contentType = part.getContentType();
		size = part.getSize();
		this.bno = bno;
		path = UPLOAD_PATH + "/" + System.currentTimeMillis() + "_" + filename;
		part.transferTo(new File(path));

	}

}
