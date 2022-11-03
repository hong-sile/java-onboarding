package onboarding.problem6;

import java.util.ArrayList;
import java.util.List;

public class Controller {
	private List<Form> formList;
	private DuplicateCheckerImpl duplicateChecker;
	private static final int EMAIL = 0;
	private static final int NICKNAME = 1;
	private static final int UNDUPLICATED = 1;

	public Controller(List<List<String>> forms) {
		formList = convertFormList(forms);
		duplicateChecker = new DuplicateCheckerImpl();
	}

	public List<String> getDuplicatePatternEmailList(){
		return new ArrayList<>();
	}

	private List<Form> convertFormList(List<List<String>> forms) {
		List<Form> formList = new ArrayList<>();
		for(List<String> form : forms)
			formList.add(new Form(form.get(EMAIL),form.get(NICKNAME)));
		return formList;
	}
}
