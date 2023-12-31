package com.example.interfaz_parcial;

import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.interfaz_parcial.data.Usuario;

public class UsuarioAdapterRecycler extends RecyclerView.Adapter<UsuarioAdapterRecycler.ViewHolder>{

    private Cursor cursorListaUsuarios;
    private OnItemClickListener listenerClick;

    public UsuarioAdapterRecycler(OnItemClickListener listenerClick){
        this.listenerClick = listenerClick;
    }

    interface OnItemClickListener{
        public void onClick(ViewHolder view, Usuario usuarioactualizado);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from( parent.getContext() ).inflate(R.layout.activity_listar,parent, false );
        return new ViewHolder( v );
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        cursorListaUsuarios.moveToPosition(position);
        Usuario usuarioSeleccionado = new Usuario( cursorListaUsuarios );
        holder.idUsuario.setText( String.valueOf(usuarioSeleccionado.getId()) );
        holder.nombreUsuario.setText( usuarioSeleccionado.getNombre());
        holder.passwordUsuario.setText( String.valueOf(usuarioSeleccionado.getPassword()) );
    }

    @Override
    public int getItemCount() {
        if (cursorListaUsuarios!=null)
            return cursorListaUsuarios.getCount();
        return 0;
    }

    public void swapCursor(Cursor nuevoCursor){
        if(nuevoCursor!=null){
            cursorListaUsuarios = nuevoCursor;
                    notifyDataSetChanged();
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView idUsuario;
        TextView nombreUsuario;
        TextView passwordUsuario;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            idUsuario = (TextView) itemView.findViewById( R.id.Codigo);
            passwordUsuario = (TextView) itemView.findViewById( R.id.edittextcontra);
            itemView.setOnClickListener( this);
        }

        @Override
        public void onClick(View view) {
            Usuario usuarioClickeado = obtenerUsuario( getAdapterPosition());
            usuarioClickeado.setNombre( "El pepe 2");
            listenerClick.onClick( this,usuarioClickeado );
        }
    }

    private Usuario obtenerUsuario(int posicion){
        if (cursorListaUsuarios!=null){
            cursorListaUsuarios.moveToPosition( posicion);
            Usuario nuevoUsuario = new Usuario( cursorListaUsuarios );
            return nuevoUsuario;
        }
        return null;
    }
}
