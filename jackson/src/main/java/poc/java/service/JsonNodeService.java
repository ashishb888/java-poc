package poc.java.service;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.fasterxml.jackson.dataformat.csv.CsvSchema.Builder;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@SuppressWarnings("unused")
public class JsonNodeService {

	private void jsonToCsv() {
		log.info("jsonToCsv serive");

		try {
			JsonNode jsonTree = new ObjectMapper().readTree(new File("src/main/resources/test.json"));

			Builder csvBuilder = CsvSchema.builder();
			JsonNode first = jsonTree.elements().next();
			first.fieldNames().forEachRemaining(csvBuilder::addColumn);
			CsvSchema csvSchema = csvBuilder.build().withHeader();

			CsvMapper csvMapper = new CsvMapper();
			csvMapper.writerFor(JsonNode.class).with(csvSchema).writeValue(new File("src/main/resources/test.csv"),
					jsonTree);

		} catch (IOException e) {
			log.error("", e);
		}
	}

	public void main() {
		log.info("main service");

		jsonToCsv();
	}
}
