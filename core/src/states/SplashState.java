package states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import managers.GameStateManager;

public class SplashState extends GameState {

    float acc = 0f;
    Texture tex;
    public static String sMap;

    public SplashState(GameStateManager gsm) {
        super(gsm);
        tex = new Texture("splash.png");
    }

    public void update(float delta) {

        if (Gdx.input.isButtonPressed(Input.Buttons.LEFT)) {
            gsm.setState(GameStateManager.State.PLAY);
        }

        if (Gdx.input.isKeyJustPressed(Input.Keys.Q)) {
            sMap = "TiledMap.tmx";
            System.out.println("q");


        } else if (Gdx.input.isKeyJustPressed(Input.Keys.W)) {
            sMap = "marioMap2.tmx";
            System.out.println("w");

        } else if (Gdx.input.isKeyJustPressed(Input.Keys.E)) {
            sMap = "marioMap3.tmx";
            System.out.println("e");

        } 
        
//          else if (Gdx.input.isKeyJustPressed(Input.Keys.R)) {
//            sMap = "MapTest3.tmx";
//            System.out.println("r");
//
//        } 
//       
    }

    public void render() {
        Gdx.gl.glClearColor(1f, 1f, 1f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        batch.draw(tex, Gdx.graphics.getWidth() / 4 - tex.getWidth() / 2, Gdx.graphics.getHeight() / 4 - tex.getHeight() / 2, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.end();
    }

    public void dispose() {
    }
}
