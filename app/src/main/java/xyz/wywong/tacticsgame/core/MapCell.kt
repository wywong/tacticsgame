package xyz.wywong.tacticsgame.core

interface MapCell {
    /**
     * returns the key that uniquely identifies this cell
     */
    val key: Coordinate

    /**
     * returns the game unit occupying this cell if it exists
     */
    fun getOccupyingUnit(): GameUnit?
}