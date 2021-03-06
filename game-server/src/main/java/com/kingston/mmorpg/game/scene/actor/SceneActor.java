package com.kingston.mmorpg.game.scene.actor;

import com.kingston.mmorpg.framework.net.socket.task.IDispatch;
import com.kingston.mmorpg.game.ai.Scene;

/**
 * 场景里的各种演员
 * 
 * @author kingston
 */
public abstract class SceneActor extends GameObject implements IDispatch {

	protected int mapId;

	protected int lineId;

	private Scene scene;

	private ActorType type;

	@Override
	public int dispatchMap() {
		return mapId;
	}

	@Override
	public int dispatchLine() {
		return lineId;
	}

	public ActorType getActorType() {
		return type;
	}

	public Scene getScene() {
		return scene;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ActorType getType() {
		return type;
	}

	public void setType(ActorType type) {
		this.type = type;
	}

}
