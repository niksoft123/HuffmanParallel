public class CLITool {
	/**
	 * Indicator for max tasks
	 * */
	private static final String MAX_TASKS_COUNT_INDICATORS = "-t";
	/**
	 * Indicator for file path
	 * */
	private static final String FILE_PATH_INDICATORS = "-f";

	public static String getFilePath(String[] args){
		System.out.println(args[2]);
		if(args[2].toLowerCase().contains(FILE_PATH_INDICATORS)){
			return args[3];
		}else{
			return "";
		}
	}

	public static Integer getMaxTasksCount(String[] args){
		if(args[0].toLowerCase().contains(MAX_TASKS_COUNT_INDICATORS)){
			return Integer.parseInt(args[1]);
		}else
		{
			return 0;
		}
	}
}
