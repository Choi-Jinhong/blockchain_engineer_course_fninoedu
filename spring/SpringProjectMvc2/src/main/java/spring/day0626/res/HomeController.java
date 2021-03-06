package spring.day0626.res;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		model.addAttribute("myimg1", "image/10.png");
		model.addAttribute("title", "좋아하는 캐릭터");
		
		
		return "shop/list";
	}
	
	@GetMapping("/board/result1.do")
	public String result()
	{
		return "board/result1";	
	}
	
	@GetMapping("/shop/list.do")
	public String result2()
	{
		return "shop/list";
	}
	
}
