import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CmdLineParamCategorize {
	public Map<String, String> categorize(String[] args) {
		Map<String, String> cmdLineParam = new HashMap<>();
		
		//inputオプションのパラメータ取得
		if (Arrays.asList(args).contains("-i")) {
			cmdLineParam.put("input", args[Arrays.asList(args).indexOf("-i") + 1]);
		} else {
			System.out.println("コマンドパラメータの入力値が誤っています。-i オプションが必要です。");
			throw new IllegalArgumentException();
		}

		if(!cmdLineParam.get("input").contains("http") && !cmdLineParam.get("input").contains(".txt")){
			System.out.println("コマンドパラメータの入力値が誤っています。 -i オプション後にRSS取得先URL、もしくはテキストを指定してください。");
			throw new IllegalArgumentException();
		}
		
		//iconvertオプションのパラメータ取得
		if (Arrays.asList(args).contains("-c")) {
			cmdLineParam.put("convert", args[Arrays.asList(args).indexOf("-c") + 1]);
		} 
		
		return cmdLineParam;
	}
}

