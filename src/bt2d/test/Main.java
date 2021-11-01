package bt2d.test;

import bt2d.core.loop.GameLoop;

/**
 * @author Lukas Hartwig
 * @since 01.11.2021
 */
public class Main
{
    public static void main(String[] args)
    {
        GameLoop loop = new GameLoop(delta -> {
        }, () -> {
        });

        loop.setFrameRate(70);
        loop.setTickRate(100);
        loop.setRateChecksPerSecond(2);
        loop.onFpsUpdate(System.out::println);
        loop.run();
    }
}