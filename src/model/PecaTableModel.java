package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class PecaTableModel extends AbstractTableModel {

    private List<Peca> pecas = new ArrayList<>();
    private String[] colunas = {"Nome", "Código", "Peso", "Preço"};

    @Override
    public String getColumnName(int coluna) {
        return colunas[coluna];
    }

    @Override
    public int getRowCount() {
        return pecas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {

        switch (coluna) {
            case 0:
                return pecas.get(linha).getNome();
            case 1:
                return pecas.get(linha).getCodPeca();
            case 2:
                return pecas.get(linha).getPeso();
            case 3:
                return pecas.get(linha).getPreco();
        }

        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch (coluna) {
            case 0:
                pecas.get(linha).setNome((String) valor);
                break;
            case 1:
                pecas.get(linha).setCodPeca(Integer.parseInt((String) valor));
                break;
            case 2:
                pecas.get(linha).setPeso((double) valor);
                break;
            case 3:
                pecas.get(linha).setPreco((double) valor);
        }

        this.fireTableRowsUpdated(linha, linha);
    }
    
    public Peca getAluno(int linha){
        return pecas.get(linha);
    }
    
    public void addRow(Peca a) {
        this.pecas.add(a);
        this.fireTableDataChanged();
    }

    public void removeRow(int linha) {
        this.pecas.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
}
