package io.fam.paging;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.ui.*;
import org.springframework.data.domain.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class DocuController {

	@Autowired
	DocuRepository repository;
	
	@GetMapping("/doc/{page}")
	public String getDoc(@PathVariable Integer page, Model model) {
		Pageable pageable = PageRequest.of(page - 1, 2);
		List<Docu> result = repository.findAll(pageable).getContent();
		
		model.addAttribute("page", page);
		model.addAttribute("docus", result);
		return "doc";
	}
	
}
