import java.util.ArrayList;
import java.util.List;

public class RssReader {
	
	public static void main(String[] args) {
		
		//コマンドパラメータの解析
		CmdLineParamCategorize cmdLineParamCategorize= new CmdLineParamCategorize();
		List<String> cmdLineParam = new ArrayList<>();
		
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
		List<String> titleList = new ArrayList<>();
		List<String> valueList = new ArrayList<>();
		
		try {
			if(cmdLineParam.get(0).contains("http")) {
				getInput.getFeed(cmdLineParam);
			} else if (cmdLineParam.get(0).contains(".txt")) {
				getInput.getText(cmdLineParam);
			}
			
			
		} catch (Exception e) {
			
		}
		
	}
}
