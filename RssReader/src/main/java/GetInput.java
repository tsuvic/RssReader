import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

public class GetInput {
	public void getFeed(List<String> cmdLineParam) throws Exception {
		String url = cmdLineParam.get(0); 
		URL feedUrl = new URL(url);
		SyndFeedInput input = new SyndFeedInput();
		
		SyndFeed feed = input.build(new XmlReader(feedUrl));
		List<SyndEntry> entryList = feed.getEntries();
		
		entryList.stream()
			.limit(10)
			.forEach(x -> System.out.println(x.getTitle() + "\r" + x.getDescription().getValue() +"\r"));
	}
	
	public void getFeed(List<String> cmdLineParam) throws Exception {
		
	}
	
}
