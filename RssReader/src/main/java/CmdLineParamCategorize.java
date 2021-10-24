import java.util.Arrays;

public class CmdLineParamCategorize {
	public void categorize(String[] args) {
		
		//inputオプションのパラメータ取得
		if (Arrays.asList(args).contains("-i")) {
			RssReader.input = args[Arrays.asList(args).indexOf("-i") + 1];
		} else {
			System.out.println("コマンドパラメータの入力値が謝っています。");
			throw new IllegalArgumentException();
		}
		
		if(!RssReader.input.contains("http") || !RssReader.input.contains(".txt")){
			
		}
		
		
		//iconvertオプションのパラメータ取得
		if (Arrays.asList(args).contains("-c")) {
			RssReader.input = args[Arrays.asList(args).indexOf("-c") + 1];
		} else {
			System.out.println("コマンドパラメータの入力値が謝っています。");
			throw new IllegalArgumentException();
		}
		
	}
}

