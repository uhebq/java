package sec02.exam03;

public class Tire {
	// 최대회전수
	// 타이어가 생성될 때 매개변수에 의해 초기화
	public int maxRotation;
	// 누적회전수
	public int accumulatedRotation;
	// 타이어의 위치
	public String location;
	
	public Tire(String location, int maxRotation) {
		// 필드를 초기화
		this.location = location;
		this.maxRotation = maxRotation;
	} 
	
	/**
	 * 타이어 1회전 - 
	 * 1번 실행할 때마다 누적회전수를 증가시킵니다.
	 * 만약 maxRotation(최대회전수)보다 크면 false를 리턴합니다.
	 * @return
	 */
	int rotation = 0; // 이 문장 필요없이 불가능?
	public boolean roll() {
		rotation++; // 타이어 1회전
		System.out.println("누적 회전수 : " + rotation);
		System.out.println("최대 회전수 : " + maxRotation);
		
		if(rotation >= maxRotation) {
			// 바퀴 교체해야 한다고 알려줌
			return false;
		}
		return true;
	}
	
}
