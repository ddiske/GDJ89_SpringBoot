package com.root.app.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.root.app.board.BoardVO;
import com.root.app.util.Pager;

@Controller
@RequestMapping("/notice/*")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@Value("${menu.board.notice.name}")
	private String name;
	
	@ModelAttribute("kind")
	public String getName() {
		return this.name;
	}
	
	@GetMapping("list")
	public String getList(Model model, Pager pager) throws Exception {
		List<BoardVO> ar = noticeService.getList(pager);
		model.addAttribute("list", ar);
//		model.addAttribute("pager", pager);
		
		return "board/list";
	}

}
