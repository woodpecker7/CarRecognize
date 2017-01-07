package neu.iot.zhj;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import javaanpr.intelligence.Intelligence;

public class example {
		
	  public static Intelligence systemLogic;
	  public static void main(String[] args) throws Exception {
		  //测试从文件识别
		  System.out.println(CarRecognize.getPlate("C:/Users/ZhangHaijun/Desktop/车牌识别系统运行测试/snapshots/test_030.jpg"));

		  //测试从流中识别
		  BufferedImage bi = ImageIO.read(new File("C:/Users/ZhangHaijun/Desktop/车牌识别系统运行测试/snapshots/test_030.jpg"));
		  System.out.println(CarRecognize.getPlate(bi));
		  
	}

}
