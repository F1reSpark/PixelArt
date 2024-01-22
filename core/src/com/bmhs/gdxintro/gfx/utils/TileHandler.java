package com.bmhs.gdxintro.gfx.utils;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;
import com.bmhs.gdxintro.gfx.assets.Tile;
import com.bmhs.gdxintro.gfx.assets.WorldTile;

public class TileHandler {

    public static TileHandler tileHandler = null;

    private int spriteOnSheetHeight, spriteOnSheetWidth;

    private String primaryColorSheetPath = "primaryColorSpriteSheet.png";

    private Array<WorldTile> worldTileArray;

    private TileHandler() {
        worldTileArray = new Array<>();

        spriteOnSheetHeight = Tile.ON_SCREEN_DEFAULT_HEIGHT;
        spriteOnSheetWidth = Tile.ON_SCREEN_DEFAULT_WIDTH;

        Texture tempTexture = new Texture(primaryColorSheetPath);

        TextureRegion tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*2, spriteOnSheetHeight*0, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile blackWorldTile = new WorldTile(tempRegion, 0, "black");
        worldTileArray.add(blackWorldTile);

        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*1, spriteOnSheetHeight*0, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile whiteWorldTile = new WorldTile(tempRegion, 1, "white");
        worldTileArray.add(whiteWorldTile);

        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*0, spriteOnSheetHeight*2, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile purpleWorldTile = new WorldTile(tempRegion, 2, "purple");
        worldTileArray.add(purpleWorldTile);

        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*0, spriteOnSheetHeight*3, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile violetWorldTile = new WorldTile(tempRegion, 3, "violet");
        worldTileArray.add(violetWorldTile);

        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*0, spriteOnSheetHeight*4, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile goldWorldTile = new WorldTile(tempRegion, 4, "gold");
        worldTileArray.add(goldWorldTile);

        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*0, spriteOnSheetHeight*5, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile yellowWorldTile = new WorldTile(tempRegion, 5, "yellow");
        worldTileArray.add(yellowWorldTile);

        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*0, spriteOnSheetHeight*6, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile brownlightWorldTile = new WorldTile(tempRegion, 6, "brown1");
        worldTileArray.add(brownlightWorldTile);

        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*0, spriteOnSheetHeight*7, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile browndarkWorldTile = new WorldTile(tempRegion, 7, "brown2");
        worldTileArray.add(browndarkWorldTile);

        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*9, spriteOnSheetHeight*1, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile greydarkWorldTile = new WorldTile(tempRegion, 8, "grey1");
        worldTileArray.add(greydarkWorldTile);

        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*4, spriteOnSheetHeight*1, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile greylightWorldTile = new WorldTile(tempRegion, 9, "grey2");
        worldTileArray.add(greylightWorldTile);

        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*6, spriteOnSheetHeight*1, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile greymedWorldTile = new WorldTile(tempRegion, 10, "grey3");
        worldTileArray.add(greymedWorldTile);
    }

    public Array<WorldTile> getWorldTileArray() {
        return worldTileArray;
    }

    public static TileHandler getTileHandler() {
        if(tileHandler == null) {
            tileHandler = new TileHandler();
        }
        return tileHandler;
    }
}
