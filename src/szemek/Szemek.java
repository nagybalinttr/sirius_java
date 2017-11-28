package szemek;

import java.awt.*;
import java.awt.event.*;

public class Szemek extends Frame {
	int bx, jx; /* A szemek x koordinataja. */
	int sy; /* A szemek y koordinataja. */

	public Szemek() { /* Konstruktor. */
		super("Szemek"); /* Az ŲrŲklŲtt konstruktor. */
		addMouseMotionListener(new Mozgas());
		ComponentListener C = new Atmeretezes();
		addComponentListener(C);
		addWindowListener(new Bezaras());
		setBounds(50, 50, 400, 200);/* Az ablak helye es merete. */
		C.componentResized(new ComponentEvent(this, ComponentEvent.COMPONENT_RESIZED));
	} /* Szemek() */

	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		Szemek Ablak = new Szemek(); /* Letrehozza es */
		Ablak.show(); /* megjelenŪti az ablakot. */
	} /* main() */

	public void paint(Graphics g) { /* Kirajzolas. */
		szem(bx, sy, bx, sy, Color.blue); /* Kirajzolja a */
		szem(jx, sy, jx, sy, Color.blue); /* szemeket. */
	} /* paint() */

	/* x,y kŲzepŻ rx,ry helyre nezű sz szŪnŻ szemet rajzol. */
	private void szem(int x, int y, int rx, int ry, Color sz) {
		Graphics g = getGraphics(); /* Grafikus kŲrnyezet. */
		g.setColor(Color.white); /* A szem alapja egy */
		g.fillOval(x - 20, y - 20, 40, 40); /* feher kŲrlemez. */
		g.setColor(Color.blue); /* A szem szele egy */
		g.drawOval(x - 20, y - 20, 40, 40); /* kek kŲr. */
		rx -= x; /* A nezes relatŪv */
		ry -= y; /* iranya. */
		/* Ilyen tavolsagra nez a szem. */
		int d = (int) Math.round(Math.sqrt(rx * rx + ry * ry));
		if (d > 15) { /* A szem kŲzepet az */
			rx = 15 * rx / d; /* iranynak megfelelű */
			ry = 15 * ry / d; /* helyre rajzolja. */
		}
		g.setColor(sz); /* A szem szŪne. */
		g.fillOval(x + rx - 5, y + ry - 5, 10, 10);
	} /* szem() */

	/* Beagyazott osztaly az ablak atmeretezesenek kezelesere. */
	class Atmeretezes extends ComponentAdapter {
		public void componentResized(ComponentEvent e) {
			Szemek S = (Szemek) e.getComponent();
			S.bx = S.getWidth() / 3; /* A bal szem helye. */
			S.jx = 2 * S.bx; /* A jobb szem helye. */
			S.sy = S.getHeight() / 2; /* y koordinata. */
		} /* componentResized() */
	} /* Atmeretezes */

	/* Beagyazott osztaly az egermozgas kezelesere. */
	class Mozgas implements MouseMotionListener {
		public void mouseMoved(MouseEvent e) {
			Szemek S = (Szemek) e.getComponent();
			Color bszŪn = Color.blue; /* Bal szem szŪne. */
			Color jszŪn = Color.blue; /* Jobb szem szŪne */
			if ((e.getModifiers() & InputEvent.BUTTON1_MASK) != 0) {
				bszŪn = Color.red; /* Bal egergomb */
			} /* lenyomva. */
			if ((e.getModifiers() & InputEvent.BUTTON3_MASK) != 0) {
				jszŪn = Color.red; /* Jobb egergomb */
			} /* lenyomva. */
			szem(bx, sy, e.getX(), e.getY(), bszŪn); /* Bal. */
			szem(jx, sy, e.getX(), e.getY(), jszŪn); /* Jobb. */
		} /* mouseMoved() */

		public void mouseDragged(MouseEvent e) {
			mouseMoved(e);
		} /* mouseDragged() */
	} /* Mozgas */

	/* Beagyazott osztaly a kilepes kezelesere. */
	class Bezaras extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		} /* windowClosing() */
	} /* Bezaras */

} /* Szemek */