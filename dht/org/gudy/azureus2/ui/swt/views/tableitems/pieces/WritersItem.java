/*
 * Copyright (C) 2004, 2005, 2006 Aelitis SAS, All rights Reserved
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details ( see the LICENSE file ).
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * AELITIS, SAS au capital de 46,603.30 euros,
 * 8 Allee Lenotre, La Grille Royale, 78600 Le Mesnil le Roi, France.
 */
 
package org.gudy.azureus2.ui.swt.views.tableitems.pieces;

import java.util.HashMap;
import java.util.Map;

import org.gudy.azureus2.core3.peer.PEPiece;
import org.gudy.azureus2.plugins.ui.tables.TableCell;
import org.gudy.azureus2.plugins.ui.tables.TableCellRefreshListener;
import org.gudy.azureus2.plugins.ui.tables.TableColumnInfo;
import org.gudy.azureus2.plugins.ui.tables.TableManager;
import org.gudy.azureus2.ui.swt.views.table.utils.CoreTableColumn;

/**
 *
 * @author TuxPaper
 * @since 2.0.8.5
 */
public class WritersItem
       extends CoreTableColumn 
       implements TableCellRefreshListener
{
  /** Default Constructor */
  public WritersItem() {
    super("writers", ALIGN_LEAD, POSITION_INVISIBLE, 80, TableManager.TABLE_TORRENT_PIECES);
    setObfustication(true);
    setRefreshInterval(4);
  }

	public void fillTableColumnInfo(TableColumnInfo info) {
		info.addCategories(new String[] {
			CAT_SWARM,
		});
	}

  public void refresh(TableCell cell) {
    PEPiece piece = (PEPiece)cell.getDataSource();
    String[] core_writers = piece.getWriters();
    String[] my_writers = new String[core_writers.length];
    int writer_count = 0;
    Map map = new HashMap();

    for(int i = 0 ; ; ) {
	String this_writer = null;

	int start;
	for (start = i ; start < core_writers.length ; start++ ) {
	    this_writer = core_writers[start];
	    if (this_writer != null)
		break;
	}
	if (this_writer == null)
	    break;

	int end;
	for (end = start + 1; end < core_writers.length; end++) {
	    if (! this_writer.equals(core_writers[end]))
		break;
	}

	StringBuffer pieces = (StringBuffer) map.get(this_writer);
	if (pieces == null) {
	    pieces = new StringBuffer();
	    map.put(this_writer, pieces);
	    my_writers[writer_count++] = this_writer;
	} else {
	    pieces.append(',');
	}

	pieces.append(start);
	if (end-1 > start)
	    pieces.append('-').append(end-1);

	i=end;
    }
	
    StringBuffer sb = new StringBuffer();
    for (int i = 0 ; i < writer_count ; i++) {
	String writer = my_writers[i];
	StringBuffer pieces = (StringBuffer) map.get(writer);
	if (i > 0)
	    sb.append(';');
	sb.append(writer).append('[').append(pieces).append(']');
    }
    
    String value = sb.toString();
    if( !cell.setSortValue( value ) && cell.isValid() ) {
      return;
    }
    
    cell.setText(value);
  }
}