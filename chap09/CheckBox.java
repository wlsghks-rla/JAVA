package chap09;

public class CheckBox {
	static interface OnSelectListener {
		void onSelect();
	}
	
	OnSelectListener listener;
	
	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}
	
	void select() {
		listener.onSelect();
	}
}
