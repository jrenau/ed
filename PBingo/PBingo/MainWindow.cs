using System;
using Gtk;
using System.Diagnostics;
using System.Collections.Generic;

public partial class MainWindow: Gtk.Window
{	
	private Random Random;
	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();

		Random random = new Random ();

		List<Button> buttons = new List<Button> ();

		Table table = new Table (9, 10, true);

		//Opcion 1
		for (uint index = 0; index<90; index++) {

			Button button = new Button ();
			button.Label = (index+1).ToString();
			button.Visible = true;
			uint fila = index / 10;
			uint colum = index % 10;

			table.Attach (button, colum, colum+1, fila, fila+1);
			buttons.Add (button);
		}

		table.Visible = true;
		vbox5.Add (table);

		buttonNumero.Clicked += delegate {
			int indexAleatorio = random.Next(90)+1;
			Button button = buttons[indexAleatorio];
			button.ModifyBg(StateType.Normal, new Gdk.Color(0,255,0));
			indexAleatorio++;
			Process.Start("espeak", "-v es "+indexAleatorio);
		};


	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}
}
