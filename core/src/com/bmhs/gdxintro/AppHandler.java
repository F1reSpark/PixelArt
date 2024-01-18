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


	int[][] worldIntArray = {{1,2,3,4,5,6,7},
							 {1,2,3,4,5,6,7},
							 {1,2,3,4,5,6,7},
							 {1,2,3,4,5,6,7}
										};
	@Override
	public void create () {
		batch = new SpriteBatch();

		//delete me
		//img = new Texture("primaryColorSheet.png");
		//subImg = new TextureRegion(TileHandler.getTileHandler().getWorldTileArray().get(0).getTexture(), 64, 0, 128, 128);

		x = 0;
		y = 0;
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();

		for(int r = 0; r < worldIntArray.length; r++) {
			for(int c = 0; c < worldIntArray[r].length; c++) {
				batch.draw(TileHandler.getTileHandler().getWorldTileArray().get(worldIntArray[r][c]).getTexture(), c*64, r*64);
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
