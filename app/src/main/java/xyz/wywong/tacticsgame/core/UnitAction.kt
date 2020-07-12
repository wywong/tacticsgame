package xyz.wywong.tacticsgame.core

interface UnitAction {
    /**
     * applies the action to the [gameMap] and returns the updated [GameMap]
     */
    fun execute(gameMap: GameMap): GameMap
}