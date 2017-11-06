package chapter99.study;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MyStudyTest extends MyStudy {
	

	@Test
	@Disabled
	void Disabledアノテーションのテスト() {
		fail("@Disabledを付けたテストは実行されない");
		/*
		テストコードの修正が大変な時は、いったんテストを@Disabledで無効化すれば良い。
		@Disabledが付いているテストはスキップされる。
		スキップされたテストがあるということを警告で教えてくれる。
		*/
	}
	
	@Test
	@DisplayName("@DisplayNameでテスト名を指定できる")
	void DisplayNameアノテーションのテスト() {
		// メソッド名を全角日本語にしたくない場合にオススメかも
	}

}
