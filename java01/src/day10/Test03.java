package day10;

import java.sql.Time;

public class Test03 {	//시분초 관리

	public static void main(String[] args) {

		Time t1 = new Time(13, 20, 20);
		System.out.println(t1);
		
	class Time {
		int hour;
		int minute;
		int second;

		public Time() {
			super();
		}

		public Time(int hour, int minute, int second) {
			super();
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		}

		public int getHour() {
			return hour;
		}

		public void setHour(int hour) {
			this.hour = hour;
		}

		public int getMinute() {
			return minute;
		}

		public void setMinute(int minute) {
			this.minute = minute;
		}

		public int getSecond() {
			return second;
		}

		public void setSecond(int second) {
			this.second = second;
		}
		
}
	}
}