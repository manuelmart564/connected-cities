package com.challenge.connected.cities;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.internal.org.objectweb.asm.TypeReference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
import static com.fasterxml.jackson.annotation.PropertyAccessor.FIELD;

@SpringBootApplication
public class ConnectedCitiesApplication implements CommandLineRunner {

	@Value("$(importfile)")
	private String importfile;

	public static void main(String[] args) {
		SpringApplication.run(ConnectedCitiesApplication.class, args);
	}

	public void run(String... args) throws Exception{

	}

	//helper class to read datafrom file
	public static class readFromFile{
		private String fromCityName, toCityName;

		/*static List<readFromFile> read(String fileToImport) throws IOException{
			return new ObjectMapper().setVisibility(FIELD, ANY).readValue(new FileInputStream(fileToImport)),
					new TypeReference<List<readFromFile>>();
		}*/
	}
}
