package practice1.inter;

public class Wonyoung implements 주연배우{
	public void 일상연기를한다() {
		System.out.println("원영이 일상");
	}
	public void 화내는연기를한다() {
		System.out.println("원영이 화나");
	}
	public void 슬픈감정연기를한다() {
		System.out.println("원영이 슬퍼");
	}
	@Override
	public void 잔잔한대화를하다() {
		일상연기를한다();
	}
	@Override
	public void 화를내다() {
		화내는연기를한다();
	}
	@Override
	public void 슬픈연기를하다() {
		슬픈감정연기를한다();
	}
}
