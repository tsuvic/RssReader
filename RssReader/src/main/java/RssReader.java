
public class RssReader {
	static String input;
	static String convert;
	static String output;
	
	public static void main(String[] args) {
		
		CmdLineParamCategorize cmdLineParamCategorize= new CmdLineParamCategorize();
		
		try {
			cmdLineParamCategorize.categorize(args);
		} catch (IllegalArgumentException e) {
			System.out.println(e);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("コマンドパラメータを入力してください。");
		}
		
		
		
	}
}
