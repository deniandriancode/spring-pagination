package io.fam.paging;

import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PagingApplication {

	@Autowired
	DocuRepository docuRepository;

	public static void main(String[] args) {
		SpringApplication.run(PagingApplication.class, args);
	}

	@Bean
	public CommandLineRunner initDocu() {
		return (args) -> {
			docuRepository.save(new Docu("A"));
			docuRepository.save(new Docu("B"));
			docuRepository.save(new Docu("C"));
			docuRepository.save(new Docu("Q"));
			docuRepository.save(new Docu("Y"));
			docuRepository.save(new Docu("O"));
			docuRepository.save(new Docu("X"));
			docuRepository.save(new Docu("N"));
			docuRepository.save(new Docu("K"));
			docuRepository.save(new Docu("I"));
			docuRepository.save(new Docu("T"));
			docuRepository.save(new Docu("R"));
			docuRepository.save(new Docu("Z"));
		};
	}

}
