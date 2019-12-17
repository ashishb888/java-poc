package poc.java.service;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;
import poc.java.domain.Key;
import poc.java.domain.Packet;
import poc.java.domain.StructSchema;
import poc.java.domain.Value;

/**
 * @author ashishb888
 */

@Service
@Slf4j
@SuppressWarnings("unused")
public class ReflectionService {

	private ObjectMapper objectMapper = new ObjectMapper();

	private void start() {
		log.debug("start service");

		List<Field> fieldsLs = Arrays.stream(Value.class.getDeclaredFields())
				.filter(f -> !f.getName().toLowerCase().equals("serialversionuid")).collect(Collectors.toList());

		poc.java.domain.Field[] fieldsArr = new poc.java.domain.Field[fieldsLs.size()];
		List<poc.java.domain.Field> fields = new ArrayList<>();
		AtomicInteger ai = new AtomicInteger(0);

		fieldsLs.forEach(f -> {
			// log.debug("f: " + f.getName() + ", t: " + f.getType().getSimpleName());

			switch (f.getType().getSimpleName().toUpperCase()) {
			case "BYTE":
				log.debug("BYTE");

				break;

			case "SHORT":
			case "CHAR":
				fields.add(new poc.java.domain.Field("int16", false, f.getName()));
				fieldsArr[ai.getAndIncrement()] = new poc.java.domain.Field("int16", false, f.getName());
				break;
			case "INT":
				fields.add(new poc.java.domain.Field("int32", false, f.getName()));
				fieldsArr[ai.getAndIncrement()] = new poc.java.domain.Field("int32", false, f.getName());
				break;
			case "LONG":
				fields.add(new poc.java.domain.Field("int64", false, f.getName()));
				fieldsArr[ai.getAndIncrement()] = new poc.java.domain.Field("int64", false, f.getName());
				break;
			case "DOUBLE":
				fields.add(new poc.java.domain.Field("float64", false, f.getName()));
				fieldsArr[ai.getAndIncrement()] = new poc.java.domain.Field("float64", false, f.getName());
				break;
			case "STRING":
				fields.add(new poc.java.domain.Field("string", false, f.getName()));
				fieldsArr[ai.getAndIncrement()] = new poc.java.domain.Field("string", false, f.getName());
				break;
			case "DATE":
				fields.add(new poc.java.domain.Field("date", false, f.getName()));
				fieldsArr[ai.getAndIncrement()] = new poc.java.domain.Field("date", false, f.getName());
				break;
			case "TIMESTAMP":
				fields.add(new poc.java.domain.Field("timestamp", false, f.getName()));
				fieldsArr[ai.getAndIncrement()] = new poc.java.domain.Field("timestamp", false, f.getName());
				break;

			default:
				break;
			}
		});

		log.debug("fields: " + fields);
		Packet packet = new Packet(new StructSchema("struct", fieldsArr, false, "Value"), null);
		try {
			String json = objectMapper.writeValueAsString(packet);
			log.debug("json: " + json);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	public void main() {
		log.debug("main service");

		start();
	}
}
