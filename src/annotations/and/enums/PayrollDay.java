package annotations.and.enums;

public enum PayrollDay {

	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY(PayType.WEEKEND),
	SUNDAY(PayType.WEEKEND);
	
	PayrollDay() {
		this(PayType.WEEKDAY);
	}
	
	PayrollDay(PayType pt) {
		this.payType = pt;
	}
	
	private final PayType payType;
	private static final int MINUTES_PER_WORK_DAY = 8 * 60;
	
	double pay(int workTime, int payrate) {
		return payType.pay(workTime, payrate);
	}
	
	private enum PayType {
		WEEKDAY {
			@Override
			double calculateOvertime(double worktime) {
				double overtime = worktime <= MINUTES_PER_WORK_DAY ? 0 : (worktime - MINUTES_PER_WORK_DAY) * BASEPAY / 2;
				return overtime;
			}
		},
		WEEKEND {
			@Override
			double calculateOvertime(double worktime) {
				double overtime = worktime * BASEPAY / 2;
				return overtime;
			}
		};
		
		double pay(int workTime, int payrate) {
			return BASEPAY + calculateOvertime(workTime);
		}
		private static final int BASEPAY = 1000;
		
		abstract double calculateOvertime(double worktime);
	}
}
