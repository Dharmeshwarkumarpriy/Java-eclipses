package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {

	// Handling exception in our spring mvc...
		@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
		@ExceptionHandler(value = NullPointerException.class)
		public String exceptionHanderNull(Model m) {
			m.addAttribute("msg", "null pointer exception has occured");
			return "null_page";
		}

		@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
		@ExceptionHandler(value = NumberFormatException.class)
		public String exceptionHanderNuberFormat(Model m) {
			m.addAttribute("msg", "number format exception has occured");
			return "null_page";
		}

		@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
		@ExceptionHandler(value = Exception.class)
		public String exceptionHanderGentic(Model m) {
			m.addAttribute("msg", "exception has occured");
			return "null_page";
		}
	
	
}
