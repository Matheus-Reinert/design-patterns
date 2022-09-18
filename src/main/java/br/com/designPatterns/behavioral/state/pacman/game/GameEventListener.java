package br.com.designPatterns.behavioral.state.pacman.game;

@FunctionalInterface
public interface GameEventListener {
    
    void onAction(String option);
}
