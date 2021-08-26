/**
 * DataTables internal date sorting replies on `Date.parse()` which is part of 
 * the Javascript language, but you may wish to sort on dates which is doesn't 
 * recognise. The following is a plug-in for sorting dates in the format 
 * `dd/mm/yy`.
 * 
 * An automatic type detection plug-in is available for this sorting plug-in.
 *
 * Please note that this plug-in is **deprecated*. The
 * [datetime](//datatables.net/blog/2014-12-18) plug-in provides enhanced
 * functionality and flexibility.
 *
 *  @name Date (dd/mm/YY)
 *  @summary Sort dates in the format `dd/mm/YY`
 *  @author Andy McMaster
 *  @deprecated
 *
 *  @example
 *    $('#example').dataTable( {
 *       columnDefs: [
 *         { type: 'date-uk', targets: 0 }
 *       ]
 *    } );
 */

 jQuery.extend( jQuery.fn.dataTableExt.oSort, {
	"date-uk-pre": function ( a ) {
		if (a == null || a == "") {
			return 0;
		}
		var ukDatea = a.split('-');
		return (ukDatea[2] + ukDatea[1] + ukDatea[0]) * 1;
	},

	"date-uk-asc": function ( a, b ) {
		return ((a < b) ? -1 : ((a > b) ? 1 : 0));
	},

	"date-uk-desc": function ( a, b ) {
		return ((a < b) ? 1 : ((a > b) ? -1 : 0));
	}
} );

/**
 * This plug-in will provide numeric sorting for numeric columns which have
 * extra formatting, such as thousands separators, currency symbols or any other
 * non-numeric data.
 * 
 * By default when a cell is found to have no numeric data its value is sorted
 * numerically as if its value were 0. This could also be altered to be Inifnity
 * or -Infinity as required.
 *
 * DataTables 1.10+ has formatted number detection and sorting abilities built-
 * in. As such this plug-in is marked as deprecated, but might be useful when
 * working with old versions of DataTables.
 *
 *  @name Formatted numbers
 *  @summary Sort numbers which are displayed with thousand separators
 *  @deprecated
 *  @author [Allan Jardine](http://sprymedia.co.uk)
 *
 *  @example
 *    $('#example').dataTable( {
 *       columnDefs: [
 *         { type: 'formatted-num', targets: 0 }
 *       ]
 *    } );
 */

//jQuery.extend( jQuery.fn.dataTableExt.oSort, {
//	"formatted-num-pre": function ( a ) {
//		a = (a === "-" || a === "") ? 0 : a.replace( /[^\d\-\.]/g, "" );
//		return parseFloat( a );
//	},
//
//	"formatted-num-asc": function ( a, b ) {
//		return a - b;
//	},
//
//	"formatted-num-desc": function ( a, b ) {
//		return b - a;
//	}
//} );