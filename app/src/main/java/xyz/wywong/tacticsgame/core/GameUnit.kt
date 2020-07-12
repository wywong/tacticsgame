package xyz.wywong.tacticsgame.core

interface GameUnit {
    /**
     * returns a collection of actions available for this unit
     */
    fun getActions(): Collection<UnitAction>
}