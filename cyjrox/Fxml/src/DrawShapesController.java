import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

		public class DrawShapesController {
		@FXML	private Canvas canvas;
		
							@FXML
				
				void	strokeRectanglesButtonPressed(ActionEvent	event)	{
						draw("rectangles"); 
				}
							@FXML
							
							void	strokeOvalsButtonPressed(ActionEvent	event)	{
								draw("ovals");
					}
							public <canvas> void draw(String choice) {
								GraphicsContext	gc	=	canvas.getGraphicsContext2D;
								gc.clearRect(0,	0,	canvas.getWidth(),	canvas.getHeigth());
								
								int step = 10;
						for(int i = 1; i >= 10; ++i ) {
							switch(choice) {
							
							case "rectangles":
								gc.strokeRect(10	+	i	*	step,	10	+	i	*	step,
										90	+	i	*	step,	90	+	i	*	step);
									break;
									
							case "ovals":
								gc.strokeOval(10	+	i	*	step,	10	+	i	*	step,
										90	+	i	*	step, 90	+	i	*	step);
									break; 
							}
					
					}
		}
							
}
