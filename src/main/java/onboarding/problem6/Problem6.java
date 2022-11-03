package onboarding.problem6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import onboarding.validatechecker.Problem6ValidateChecker;

public class Problem6 {
	public static List<String> solution(List<List<String>> forms) {
		Problem6ValidateChecker.isFormsValidate(forms);
		Controller controller = new Controller(forms);

		return controller.getDuplicatePatternEmailList();
	}
}
