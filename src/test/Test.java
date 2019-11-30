package test;

import java.util.Calendar;
import java.util.Date;

/**
 * @author chenheyang
 * @date 2019/12/1 - 12:37 上午
 */
public class Test {
    public static void main(String[] args) {
        int intA = 42;
        String A = "" + intA;//转为String类型
        float floatA = Float.parseFloat(A);//转为float类型

        System.out.println(String.format("I have %,+010.2f",floatA));//格式化输出
        //%：被替换的开始      ,+：加逗号和正号    010：最小字符数（前面再加"0"则不足10位用0补足）
        //.2：小数点后精确度   f：浮点数

        Date date = new Date();
        System.out.println(String.format("%tc", date));//输出完整时间
        System.out.println(String.format("%tr", date));//输出仅时间
        System.out.println(String.format("%tB %<td日 %<tA", date));//输出月 日 周，"<"表示重复利用之前参数

        Calendar cal = Calendar.getInstance();//获取抽象类的实例，静态的方法
        cal.set(2019,1,1,00,0,0);//设定完整的时间
        System.out.println("自定义时间：" + cal.getTime());//返回Calendar

        long millisc = cal.getTimeInMillis();//以毫秒返回时间
        millisc += 60 * 60 * 1000;//加1小时
        cal.setTimeInMillis(millisc);//以毫秒指定时间
        System.out.println("增加1小时： " + cal.getTime());

        cal.set(cal.HOUR, 2);//设定指定字段的时间
        System.out.println("设置为2点： " + cal.getTime());
        //YEAR年 MONTH月 DARE/Day_OF_MONTH日 HOUR/HOUR_OF_DAY小时 MINUTE分 SECOND秒 MILLISECOND毫米 ZONE_OFFSET时区

        cal.add(cal.MINUTE, 2);//加减时间值（进位）
        System.out.println("增加2分钟： " + cal.getTime());

        cal.roll(cal.SECOND, 2);//加减时间值（不进位）
        System.out.println("滚动2秒钟： " + cal.getTime());
    }
}
