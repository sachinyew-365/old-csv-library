package com.dummy.service;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

@Component
public class CsvToJsonConverterService {

	public void readCsv() {
		File input = new File("D:/Test.csv");
		try {
			CsvSchema csv = CsvSchema.emptySchema().withHeader();
			CsvMapper csvMapper = new CsvMapper();
			MappingIterator<Map<?, ?>> mappingIterator = csvMapper.reader().forType(Map.class).with(csv)
					.readValues(input);
			List<Map<?, ?>> list = mappingIterator.readAll();
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
