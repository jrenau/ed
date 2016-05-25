using System;
using System.Data;

namespace CCategoria
{
	public partial class CategoriaView : Gtk.Window
	{
		public CategoriaView () : base(Gtk.WindowType.Toplevel)
		{
			this.Build ();

			saveAction.Activated += delegate {
				string nombre = entryNombre.Text;
				IDbCommand dbCommand = App.Instance.DbConnection.CreateCommand ();
				dbCommand.CommandText = "insert into categoria (nombre) value (@nombre)";

				IDbDataParameter dbDataParameter = dbCommand.CreateParameter ();
				dbDataParameter.ParameterName = "nombre";
				IDbDataParameter.Value = nombre;
				dbCommand.Parameters.Add (dbDataParameter);

				dbCommand.ExecuteNonQuery ();
			};
		}
		private void dbCommandAddParameter() {
		}
	}
}