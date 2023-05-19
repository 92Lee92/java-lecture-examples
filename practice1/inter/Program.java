package practice1.inter;

public class Program {

	public static void main(String[] args) {
//		주연배우 mainActor = new Wonyoung();
//		주연배우 mainActor = new KimBS();
//		mainActor.슬픈연기를하다();
//		mainActor.잔잔한대화를하다();
//		mainActor.화를내다();
		
		배우관리 actorManage = new 배우관리();
		actorManage.setMainActor(new KimBS());
		actorManage.setMainActor(new Wonyoung());
		actorManage.setMainActor(new 주연배우() {
			
			@Override
			public void 화를내다() {
				System.out.println("무명배우의 화내는 연기");
			}
			
			@Override
			public void 잔잔한대화를하다() {
				System.out.println("무명배우의 대화하는 연기");
			}
			
			@Override
			public void 슬픈연기를하다() {
				System.out.println("무명배우의 우는 연기");
				
			}
		});
		
		주연배우 mainActor = actorManage.getMainActor();
		mainActor.슬픈연기를하다();
		mainActor.잔잔한대화를하다();
		mainActor.화를내다();
		
	}

}
