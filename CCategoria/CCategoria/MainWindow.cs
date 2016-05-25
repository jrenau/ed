using CCategoria;
using Gtk;
using System;
using System.Data;

public partial class MainWindow: Gtk.Window
{	
	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();

		treeView.AppendColumn ("id", new CellRendererText (), "text", 0);
		treeView.AppendColumn ("nombre", new CellRendererText (), "text", 1);

		ListStore listStore = new ListStore (typeof(long), typeof(string));
		treeView.Model = listStore;

		fillListStore (listStore);

		deleteAction.Sensitive = false;

		newAction.Activated += delegate {
			new CategoriaView();
	};
		deleteAction.Activated += delegate {
			MessageDialog messageDialog = new MessageDialog(
				this,
				DialogFlags.Modal,
				MessageType.Question,
				ButtonsType
	};

	}

	private void fillListStore (ListStore listStore) {
		IDbCommand dbCommand = App.Instace.DbConnection.CreateCommand ();
		dbCommand.CommandText = "select * from categoria order by id";
		IDataReader dataReader = dbCommand.ExecuteReader ();
		while (dataReader.Read())
			listStore.AppendValues (dataReader ["id"], dataReader ["nombre"]);
		dataReader.Close ();
	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}
}
