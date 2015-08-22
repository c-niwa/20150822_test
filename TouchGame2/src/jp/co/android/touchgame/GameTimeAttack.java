package jp.co.android.touchgame;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.example.touchgame2.R;

public class GameTimeAttack extends Activity {


	/**
	 * タイムアタック画面初期化処理
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		// TODO 処理①：タイムアタック画面の表示設定
		// ************************************************************
		// 処理①：タイムアタック画面の表示設定　Start
		// ************************************************************

		// ActivityクラスのonCreateメソッド呼び出し
		super.onCreate(savedInstanceState);

		// 画面表示次のレイアウトを設定
		setContentView(R.layout.touch_game_time_atack);

		// 画面タイトルの設定
		/*setTitle(TouchGameConst.TITLE_OMIKUJI);*/

		// ************************************************************
		// 処理①：スタート画面の表示設定　End
		// ************************************************************

	}

	/**
	 * タイムアタック画面表示処理
	 */
	@Override
	protected void onStart(){

	}


	/**
	 * タイマー開始処理
	 */
	@Override
	protected void onResume(){



	}


	/**
	 * タイマー停止処理
	 */
	@Override
	protected void onPause(){


	}


	/**
	 * アプリ終了時処理
     */
	@Override
	protected void onDestroy() {

	}


	/**
	 * アプリ終了時処理
     */
	protected void clickNum() {

	}

	/**
     * 数字ボタン押下時の制御を行います。
     */
    public void clickNum(View view) {

    }



}
