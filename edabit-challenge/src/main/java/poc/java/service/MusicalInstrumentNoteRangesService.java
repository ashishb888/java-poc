package poc.java.service;

import org.springframework.stereotype.Service;

@Service
public class MusicalInstrumentNoteRangesService {

	public boolean instrumentRange(String instr, String note) {

		switch (instr) {
		case "Piccolo":
			return note.matches("([D-G]4)|([A-G][5-6])|([A-C]7)"); // D4-C7

		case "Tuba":
			return note.matches("([D-G]1)|([A-G][2-3])|([A-F]4)"); // D1-F4

		case "Guitar":
			return note.matches("([E-G]3)|([A-G][4-5])|([A-E]6)"); // E3-E6

		case "Piano":
			return note.matches("([A-G][0-7])|([A-C]8)"); // A0-C8

		case "Violin":
			return note.matches("(G3)|([A-G][4-6])|(A7)"); // G3-A7

		default:
			return false;
		}
	}
}
