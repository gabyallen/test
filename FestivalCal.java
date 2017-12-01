package air.tong.com.myapplication;


import android.text.TextUtils;

/**
 * 计算日期，计算是否是节日
 */
public class FestivalCal {

	public static String isFestival(Lunar lunar){
		String festival = null;
		lunar.isLFestival();
		festival = lunar.getSFestivalName();//公历节日
		if (!TextUtils.isEmpty(festival)){
			return festival;
		}
		festival = lunar.getLFestivalName();//
		if (!TextUtils.isEmpty(festival)){
			return festival;
		}
		return null;
	}
}
