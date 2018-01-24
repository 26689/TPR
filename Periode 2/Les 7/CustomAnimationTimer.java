import javafx.animation.*;
import java.util.function.*;

public class CustomAnimationTimer extends AnimationTimer
{
	
	private Consumer<Long> handleMethod = null;
	
	public CustomAnimationTimer(Consumer<Long> method)
	{
		handleMethod = method;
	}
	
	
	public void handle(long currentNanoTime)
	{
		handleMethod.accept(currentNanoTime);
	}
	
	
	
	// REPLACE THE UPDATE WHEN NEEDED:
	public void setHandle(Consumer<Long> method) 
	{
		handleMethod = null;
		handleMethod = method;
	}
	
}
