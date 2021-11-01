import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CmdLineParamCategorize {
	public List<String> categorize(String[] args) {
		List<String> cmdLineParam = new ArrayList<>();
		
		//inputオプションのパラメータ取得
		if (Arrays.asList(args).contains("-i")) {
			cmdLineParam.add(args[Arrays.asList(args).indexOf("-i") + 1]);
		} else {
			System.out.println("コマンドパラメータの入力値が誤っています。-i オプションが必要です。");
			throw new IllegalArgumentException();
		}

		if(!cmdLineParam.stream().anyMatch(x -> x.contains("http")) && !cmdLineParam.stream().anyMatch(x -> x.contains(".txt"))){
			System.out.println("コマンドパラメータの入力値が誤っています。 -i オプション後にRSS取得先URL、もしくはテキストを指定してください。");
			throw new IllegalArgumentException();
		}
		
		//iconvertオプションのパラメータ取得
		if (Arrays.asList(args).contains("-c")) {
			cmdLineParam.add(args[Arrays.asList(args).indexOf("-c") + 1]);
		} 
		
		
		return cmdLineParam;
	}
}

