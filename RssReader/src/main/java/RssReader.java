import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RssReader {
	
	public static void main(String[] args) {
		
		//コマンドパラメータの解析
		CmdLineParamCategorize cmdLineParamCategorize= new CmdLineParamCategorize();
		Map<String, String> cmdLineParam = new HashMap<>();
		
		try {
			cmdLineParam = cmdLineParamCategorize.categorize(args);
		} catch (IllegalArgumentException e) {
			System.out.println(e);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("コマンドパラメータの指定方法が誤っています。");
			System.out.println(e);
		}
		
		//入力情報の取得
		GetInput getInput = new GetInput();
		Map<String, List<String>> inputValue = new HashMap<String, List<String>>();
		
		try {
			if(cmdLineParam.get("input").contains("http")) {
				inputValue = getInput.getFeed(cmdLineParam);
			} else if (cmdLineParam.get("input").contains(".txt")) {
				inputValue = getInput.getText(cmdLineParam);
			}
			
		} catch (Exception e) {
			
		}
		
		for (int i = 0; i < inputValue.get("title").size(); i++) {
			System.out.println(inputValue.get("title").get(i));
			System.out.println(inputValue.get("value").get(i));
		}
		
		
	}
}
