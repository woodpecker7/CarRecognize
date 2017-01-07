package neu.iot.zhj;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javaanpr.imageanalysis.CarSnapshot;
import javaanpr.intelligence.Intelligence;

class model {
	private static Intelligence intelligence = null;
	private model() {
	}
	public static Intelligence getIntelligence() {
		if (intelligence == null) {
			try {
				intelligence = new Intelligence(false);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return intelligence;
	}
}
public class CarRecognize {
	public static Intelligence systemLogic = model.getIntelligence();
	public static String getPlate(String filename) {
		CarSnapshot car;
		try {
			car = new CarSnapshot(filename);
			String recognizedText = systemLogic.recognize(car);
			return recognizedText;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public static String getPlate(BufferedImage bi) {
		CarSnapshot car;
		try {
			car = new CarSnapshot(bi);
			String recognizedText = systemLogic.recognize(car);
			return recognizedText;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
