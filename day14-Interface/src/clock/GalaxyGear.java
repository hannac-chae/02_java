package clock;

public class GalaxyGear extends SmartWatch {

	@Override
	public void displayTime() {
		System.out.println(getWatchName() 
				+ "디스플레이에 시간이 표시됩니다.");
	}

	@Override
	public String toString() {
		return "저는 갤럭기 기어4에요...";
	}
}
