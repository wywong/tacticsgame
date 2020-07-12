package xyz.wywong.tacticsgame.core

interface GameMap {
    /**
     * the cells for this map
     */
    val cells: Iterator<MapCell>
}