package javaa.enums;

import java.util.EnumSet;

import javaa.enums.EnumSetExample.DayEnumSet;

public class EnumSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumSet<DayEnumSet> workdays = EnumSet.range(DayEnumSet.MONDAY, DayEnumSet.FRIDAY);
		
		for(DayEnumSet d : workdays) {
			System.out.println(d);
		}
	}

}
