public class Test {  public static void main(String[] args) {
  /*  Button btnClose = new Button();
  // 버튼이 눌러졌다고 가정하면  btnClose.click();  // 콜백됨.
    CloseButton btnClose = new CloseButton();    btnClose.click();    // 핸들러...   *    * */     Button btnClose = new Button();  //  MyOnClickListner l = new MyOnClickListner();//  btnClose.setOnClickListener(l);    btnClose.setOnClickListener(new OnClickListener(){   public void onClick()   {    System.out.println("창을 닫습니다.");   }  });    // 버튼이 눌러졌다고 가정하면  btnClose.click(); // 콜백됨   }
}
/*class Button {  // 버튼이 눌러졌을 때, 이벤트 처리 // 버튼이 눌리면 아래 메서드가 호출된다. (콜백 메서드) public void click() {  System.out.println("창을 닫습니다."); } }*/
// 버튼은 이미 라이브러리 형태로 배포되기 때문에 실제로 click 메서드를 수정할 수 없다.// 그래서 이를 재정의 하기위해 버튼 클래스를 상속합니다.
// 템플릿 메소드 패턴.// 이벤트 처리 자식한테 위임./*class Button {  // 버튼이 눌러졌을 때, 이벤트 처리 // 버튼이 눌리면 아래 메서드가 호출된다. (콜백 메서드) public void click() {  System.out.println("창을 닫습니다."); } }
class CloseButton { public void click() {  System.out.println("창을 닫습니다."); }}
*/
interface OnClickListener { void onClick();}
// 리스너를 수정한다.class MyOnClickListner implements OnClickListener { @Override public void onClick() {  // TODO Auto-generated method stub  System.out.println("창을 닫습니다."); }}
class Button { private OnClickListener listener = null;  public void setOnClickListener (OnClickListener listener){  this.listener = listener; }  public void click() {    if( listener != null )   listener.onClick(); }}
