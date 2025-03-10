package racingcar;

import camp.nextstep.edu.missionutils.Console;
import racingcar.util.CarNameValidator;
import racingcar.util.PlayTimeValidator;

public class InputUser {
	private final static String REQUEST_MESSAGE_INPUT_CAR_NAME = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	private final static String ERROR_MESSAGE_WRONG_CAR_NAME = "[ERROR] 잘못된 자동차 이름입니다.";
	private final static String REQUEST_MESSAGE_INPUT_PLAY_TIME = "시도할 회수는 몇회인가요?";
	private final static String ERROR_MESSAGE_WRONG_PLAY_TIME = "[ERROR] 1 이상의 숫자만 입력 가능합니다.";


	public String inputCarNames() {
		String inputCarNames;

		while (true) {
			System.out.println(REQUEST_MESSAGE_INPUT_CAR_NAME);
			inputCarNames = Console.readLine();

			try {
				CarNameValidator.getInstance().carNameValidator(inputCarNames);
				break;
			} catch (IllegalArgumentException e) {
				System.out.println(ERROR_MESSAGE_WRONG_CAR_NAME);
			}

		}

		return inputCarNames;
	}

	public int inputPlayTimes() {
		String inputPlayTimes;

		while (true) {
			System.out.println(REQUEST_MESSAGE_INPUT_PLAY_TIME);
			inputPlayTimes = Console.readLine();
			try {
				PlayTimeValidator.getInstance().playTimeValidator(Integer.parseInt(inputPlayTimes));
				break;
			} catch (IllegalArgumentException e) {
				System.out.println(ERROR_MESSAGE_WRONG_PLAY_TIME);
			}
		}

		return Integer.parseInt(inputPlayTimes);
	}
}
