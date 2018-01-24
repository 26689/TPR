import javafx.animation.*;
import java.util.function.*;

public class CustomAnimationTimer extends AnimationTimer
{
	
	private Consumer<Long> handleMethod = null;
	
	public CustomAnimationTimer(Consumer<Long> methodReference)
	{
		handleMethod = methodReference;
	}
	
	
	public void handle(long currentNanoTime)
	{
		handleMethod.accept(currentNanoTime);
	}
	
	
	
	// REPLACE THE UPDATE WHEN NEEDED:
	public void setHandle(Consumer<Long> methodReference) 
	{
		handleMethod = null;
		handleMethod = methodReference;
	}
	
}
