package com.bmhs.gdxintro;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.ScreenUtils;
import com.bmhs.gdxintro.gfx.assets.Tile;
import com.bmhs.gdxintro.gfx.utils.TileHandler;

public class AppHandler extends ApplicationAdapter {
	SpriteBatch batch;

	//delete me
	//Texture img;
	//TextureRegion subImg;

	int x, y;


	int[][] worldIntArray = {
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,0,4,0,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,0,5,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,0,4,4,5,0,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,0,0,1,1,0,5,5,5,4,0,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,0,4,0,1,0,9,9,9,9,0,1,1,0,0,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,0,4,0,0,5,5,5,5,5,9,0,0,4,0,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,0,9,4,5,5,9,9,9,5,5,9,5,4,0,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,0,0,0,0,4,9,9,3,1,3,9,9,5,5,0,0,0,1,1,1,1,1,1,1},
			{1,1,1,1,0,0,0,0,1,0,9,2,2,1,2,2,9,5,4,0,0,9,0,0,1,1,1,1,1},
			{1,1,1,0,0,0,0,1,1,1,0,9,9,9,9,4,4,0,0,1,1,0,0,9,0,1,1,1,1},
			{1,1,1,1,0,0,0,0,1,0,9,6,6,6,6,9,0,1,1,1,1,1,1,0,9,0,1,1,1},
			{1,1,1,1,1,0,0,0,0,6,6,6,9,5,6,6,6,0,1,1,1,0,0,9,0,1,1,1,1},
			{1,1,1,1,1,1,0,0,9,6,5,7,9,7,5,5,6,0,1,0,0,0,0,0,1,1,1,1,1},
			{1,0,0,0,1,1,1,0,6,6,5,9,1,9,5,5,6,6,0,0,0,0,1,1,1,1,1,1,1},
			{1,0,2,2,0,0,0,9,6,7,9,9,9,9,9,7,5,6,9,0,1,1,1,0,0,0,0,0,1},
			{1,1,0,9,9,2,2,9,7,9,1,9,9,9,1,9,7,6,9,2,0,0,0,3,3,3,3,0,1},
			{1,1,0,2,2,2,2,9,6,9,9,7,5,7,9,9,6,6,9,3,3,3,3,3,3,3,0,1,1},
			{1,1,1,0,9,9,2,2,9,6,5,4,5,4,5,6,6,9,3,3,3,3,2,2,2,0,1,1,1},
			{1,1,1,0,2,2,2,0,0,6,6,6,5,4,6,6,6,9,3,3,3,3,3,3,3,0,1,1,1},
			{1,1,1,1,0,0,0,1,1,0,9,6,6,6,6,9,0,0,3,3,3,2,2,2,0,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,0,8,9,9,9,9,0,1,1,1,1,0,0,0,1,1,1,1,1,1},



										};


	//int[][] worldIntArray = new int[12][10];
	@Override
	public void create () {
		batch = new SpriteBatch();

		//delete me
		//img = new Texture("primaryColorSheet.png");
		//subImg = new TextureRegion(TileHandler.getTileHandler().getWorldTileArray().get(0).getTexture(), 64, 0, 128, 128);

		x = 0;
		y = 0;


	}
	/*
	private void setRandomArray(){
		for (int r  = 0; r < worldIntArray.length; r++){
			for (int c = 0; c < worldIntArray[r].length; c++){
				worldIntArray[r][c] = MathUtils.random(4);
			}
		}
	}

	 */
	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();

		for(int r = 0; r < worldIntArray.length; r++) {
			for(int c = 0; c < worldIntArray[r].length; c++) {
				batch.draw(TileHandler.getTileHandler().getWorldTileArray().get(worldIntArray[r][c]).getTexture(), c*Tile.ON_SCREEN_DEFAULT_WIDTH, Gdx.graphics.getHeight() - Tile.ON_SCREEN_DEFAULT_HEIGHT - (r * Tile.ON_SCREEN_DEFAULT_HEIGHT));
				if(x > 4) {
					x = 0;
				}
			}
		}



		batch.end();

		checkInput();
	}

	public void checkInput() {
		/*
		if(Gdx.input.isKeyJustPressed(Input.Keys.W)) {
			y += 10;
		}
		if(Gdx.input.isKeyJustPressed(Input.Keys.A)) {
			x -= 10;
		}
		if(Gdx.input.isKeyJustPressed(Input.Keys.S)) {
			y -= 10;
		}
		if(Gdx.input.isKeyJustPressed(Input.Keys.D)) {
			x += 10;
		}



		System.out.println(Gdx.input.getX() + " " + Gdx.input.getY());

		x = Gdx.input.getX() - img.getWidth()/2;
		y = Gdx.graphics.getHeight() - Gdx.input.getY() - img.getHeight()/2;



		if(x < (Gdx.input.getX() - img.getWidth()/2)) {
			x += 20;
		}
		if(x > (Gdx.input.getX() - img.getWidth()/2)) {
			x -= 20;
		}
		if(y > (Gdx.graphics.getHeight() - Gdx.input.getY() - img.getHeight()/2)) {
			y -= 20;
		}
		if(y < (Gdx.graphics.getHeight() - Gdx.input.getY() - img.getHeight()/2)) {
			y += 20;
		}
*/



	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
