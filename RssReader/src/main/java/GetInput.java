import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

public class GetInput {
	public Map<String, List<String>> getFeed(Map<String, String> cmdLineParam) throws Exception {
		Map<String, List<String>> inputValue = new HashMap<String, List<String>>();
		List<String> titleList = new ArrayList<>();
		List<String> valueList = new ArrayList<>();
		
		String url = cmdLineParam.get("input");
		URL feedUrl = new URL(url);
		SyndFeedInput input = new SyndFeedInput();

		SyndFeed feed = input.build(new XmlReader(feedUrl));
		List<SyndEntry> entryList = feed.getEntries();

		for (SyndEntry entry : entryList) {
			titleList.add(entry.getTitle());
			valueList.add(entry.getDescription().getValue());
		}

		inputValue.put("title", titleList);
		inputValue.put("value", valueList);

		return inputValue;

	}

	public Map<String, List<String>> getText(Map<String, String> cmdLineParam) throws Exception {
		Map<String, List<String>> inputValue = new HashMap<String, List<String>>();
		List<String> titleList = new ArrayList<>();
		List<String> valueList = new ArrayList<>();
		
		File file = new File(cmdLineParam.get("input"));
		FileReader fileReader = new FileReader(file);
		StringBuilder sb = new StringBuilder();

		int ch = fileReader.read();
		while (ch != -1) {
			sb.append(ch);
			ch = fileReader.read();
		}
		
		aaa
		
		return inputValue;
		
	}

}
