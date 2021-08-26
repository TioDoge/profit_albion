var _oTable = {};
function fijar_primera_columna_resumen(tabla, colums, selector) {

    var buttonCommon = {
        exportOptions: {
            format: {
                body: function (data, column, row) {
                    return column === 5 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 6 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 7 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 8 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 9 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 10 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 11 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 12 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 13 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 14 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            data;

                }
            }

        }
    };

    _oTable[tabla] = $('#' + tabla).dataTable({
        "bSort": true,
        "bFilter": true,
        "bPaginate": true,
        "columnDefs": [{
                "targets": 2,
                "data": "dv",
                "render": function (data, type, fullLinea, meta) {
                    return $.Rut.getDigito($.Rut.quitarFormato(fullLinea[1]));
                }
            },
            {className: "dt-body-right", "targets": [1, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]},
            {type: "formatted-num", "targets": [5, 6, 7, 8, 9, 10, 11, 12, 13, 14]}
        ],
        footerCallback: function (row, data, start, end, display) {
            var api = this.api(), data;

            if (colums !== undefined && $('#' + tabla + ' tbody tr').length !== 0) {
                calcular(api, colums, selector);
            }
        },
        dom: 'Bfrtip',
        buttons: [
            //'excel', 'copy' //, 'pdf', 'print','csv'
            $.extend(true, {}, buttonCommon,
                    {
                        extend: 'copyHtml5',
                        exportOptions: {
                            columns: ':visible'
                        }
                    }),
            $.extend(true, {}, buttonCommon,
                    {
                        extend: 'excelHtml5',
                        exportOptions: {
                            columns: ':visible'
                        }

                    })
        ],
        "language": {
            "url": "data/Spanish.json",
            "zeroRecords": "Sin informacion para mostrar"

        }
    }).columnFilter(
            {sPlaceHolder: "head:before",
                aoColumns: [
                    null, {type: "text"}, null, {type: "text"}, {type: "checkbox"}]});

    $("div.toolbar").html('<b>Custom tool bar! Text/images etc.</b>');


    $('#tab_factoring').find('thead').find('tr').eq(0).find('th').eq(1).find('input').css('width', '99%');
    $('#tab_factoring').find('thead').find('tr').eq(0).find('th').eq(3).find('input').css('width', '99%');


    $('#tab_leasing').find('thead').find('tr').eq(0).find('th').eq(1).find('input').css('width', '99%');
    $('#tab_leasing').find('thead').find('tr').eq(0).find('th').eq(3).find('input').css('width', '99%');


    $('#tab_creditos').find('thead').find('tr').eq(0).find('th').eq(1).find('input').css('width', '99%');
    $('#tab_creditos').find('thead').find('tr').eq(0).find('th').eq(3).find('input').css('width', '99%');

}

function fijar_primera_columna_resumen_ej(tabla, colums, selector) {
    console.log($('#' + tabla + ' tbody tr').length);
    var buttonCommon = {
        exportOptions: {
            format: {
                body: function (data, column, row) {
                    return column === 3 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 4 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 5 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 6 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 7 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 8 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 9 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 10 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 11 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 12 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            data;

                }
            }

        }
    };

    _oTable[tabla] = $('#' + tabla).dataTable({
        "bSort": true,
        "bFilter": true,
        "bPaginate": true,
        "columnDefs": [{
                "targets": 2,
                "data": "dv",
                "render": function (data, type, fullLinea, meta) {
                    return $.Rut.getDigito($.Rut.quitarFormato(fullLinea[1]));
                }
            },
            {className: "dt-body-right", "targets": [1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]},
            {type: "formatted-num", "targets": [1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]}
        ],
        footerCallback: function (row, data, start, end, display) {
            var api = this.api(), data;

            if (colums !== undefined && $('#' + tabla + ' tbody tr').length !== 0) {
                calcular(api, colums, selector);
            }
        },
        dom: 'Bfrtip',
        buttons: [
            $.extend(true, {}, buttonCommon,
                    {
                        extend: 'copyHtml5',
                        exportOptions: {
                            columns: ':visible'
                        }
                    }),
            $.extend(true, {}, buttonCommon,
                    {
                        extend: 'excelHtml5',
                        exportOptions: {
                            columns: ':visible'
                        }

                    })
        ],
        "language": {
            "url": "data/Spanish.json",
            "zeroRecords": "Sin informacion para mostrar"
        }
    });

    $("div.toolbar").html('<b>Custom tool bar! Text/images etc.</b>');

}

function fijar_primera_columna_detalle_factoring(tabla, colums, selector) {
    $.datepicker.regional[""].dateFormat = 'dd/mm/yy';
    $.datepicker.setDefaults($.datepicker.regional['']);

    var buttonCommon = {
        exportOptions: {
            format: {
                body: function (data, column, row) {
                    return column === 5 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 13 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 22 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            data;

                }
            }

        }
    };

    _oTable[tabla] = $('#' + tabla).dataTable({
        "bSort": true,
        "bFilter": true,
        "ordering": true,
        "columnDefs": [
            {className: "dt-body-right", "targets": [0, 5, 7, 12, 13, 16, 24]},
            {type: "formatted-num", "targets": [0, 5, 7, 12, 13, 16, 24]}
        ],
        footerCallback: function (row, data, start, end, display) {
            var api = this.api(), data;

            if (colums !== undefined && $('#' + tabla + ' tbody tr').length !== 0) {
                calcular(api, colums, selector);
            }
        },
        dom: 'Bfrtip',
        buttons: [
            $.extend(true, {}, buttonCommon,
                    {
                        extend: 'copyHtml5',
                        exportOptions: {
                            columns: ':visible'
                        }
                    }),
            $.extend(true, {}, buttonCommon,
                    {
                        extend: 'excelHtml5',
                        exportOptions: {
                            columns: ':visible'
                        }

                    })
        ],
        "language": {
            "url": "data/Spanish.json",
            "zeroRecords": "Sin informacion para mostrar"
        }
    }).columnFilter(
            {sPlaceHolder: "head:before",
                aoColumns: [
                    null, null, {type: "text"}, {type: "text"}, {type: "checkbox"}, null, {type: "checkbox"}, {type: "text"}, null, {type: "text"},
                    {type: "date-range"}, null, {type: "text"}, null, {type: "date-range"}, {type: "checkbox"}, {type: "text"}, null, {type: "checkbox"}, {type: "text"},
                    {type: "text"}, {type: "date-range"}, null, {type: "date-range"}]});

    $("div.toolbar").html('<b>Custom tool bar! Text/images etc.</b>');


    $('#tab_factoring').find('thead').find('tr').eq(0).find('th').eq(2).find('input').css('width', '99%');
    $('#tab_factoring').find('thead').find('tr').eq(0).find('th').eq(3).find('input').css('width', '99%');
    $('#tab_factoring').find('thead').find('tr').eq(0).find('th').eq(7).find('input').css('width', '99%');
    $('#tab_factoring').find('thead').find('tr').eq(0).find('th').eq(9).find('input').css('width', '99%');
    $('#tab_factoring').find('thead').find('tr').eq(0).find('th').eq(10).find('input').css('width', '35%');
    $('#tab_factoring').find('thead').find('tr').eq(0).find('th').eq(12).find('input').css('width', '99%');
    $('#tab_factoring').find('thead').find('tr').eq(0).find('th').eq(14).find('input').css('width', '35%');
    $('#tab_factoring').find('thead').find('tr').eq(0).find('th').eq(16).find('input').css('width', '99%');
    $('#tab_factoring').find('thead').find('tr').eq(0).find('th').eq(20).find('input').css('width', '99%');
    $('#tab_factoring').find('thead').find('tr').eq(0).find('th').eq(21).find('input').css('width', '35%');
    $('#tab_factoring').find('thead').find('tr').eq(0).find('th').eq(23).find('input').css('width', '35%');


}

function fijar_primera_columna_detalle_factoring_ej(tabla, colums, selector) {
    $.datepicker.regional[""].dateFormat = 'dd/mm/yy';
    $.datepicker.setDefaults($.datepicker.regional['']);

    var buttonCommon = {
        exportOptions: {
            format: {
                body: function (data, column, row) {
                    return column === 3 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 11 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 20 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            data;

                }
            }

        }
    };


    _oTable[tabla] = $('#' + tabla).dataTable({
        "bSort": true,
        "bFilter": true,
        "ordering": true,
        "columnDefs": [
            {className: "dt-body-right", "targets": [0, 3, 5, 11, 14, 22]},
            {type: "formatted-num", "targets": [0, 3, 5, 11, 14, 22]}
        ],
        footerCallback: function (row, data, start, end, display) {
            var api = this.api(), data;

            if (colums !== undefined && $('#' + tabla + ' tbody tr').length !== 0) {
                calcular(api, colums, selector);
            }
        },
        dom: 'Bfrtip',
        buttons: [
            $.extend(true, {}, buttonCommon,
                    {
                        extend: 'copyHtml5',
                        exportOptions: {
                            columns: ':visible'
                        }
                    }),
            $.extend(true, {}, buttonCommon,
                    {
                        extend: 'excelHtml5',
                        exportOptions: {
                            columns: ':visible'
                        }

                    })
        ],
        "language": {
            "url": "data/Spanish.json",
            "zeroRecords": "Sin informacion para mostrar"
        }
    }).columnFilter(
            {sPlaceHolder: "head:before",
                aoColumns: [
                    null, null, {type: "text"}, {type: "text"}, {type: "checkbox"}, {type: "text"}, null, {type: "text"}, {type: "date-range"}, {type: "text"},
                    {type: "text"}, null, {type: "date-range"}, {type: "checkbox"}, {type: "text"}, {type: "text"}, {type: "checkbox"}, {type: "text"}, {type: "text"}, {type: "date-range"},
                    null, {type: "date-range"}, null]});

    $("div.toolbar").html('<b>Custom tool bar! Text/images etc.</b>');


    $('#tab_factoring').find('thead').find('tr').eq(0).find('th').eq(2).find('input').css('width', '99%');
    $('#tab_factoring').find('thead').find('tr').eq(0).find('th').eq(5).find('input').css('width', '99%');
    $('#tab_factoring').find('thead').find('tr').eq(0).find('th').eq(7).find('input').css('width', '99%');
    $('#tab_factoring').find('thead').find('tr').eq(0).find('th').eq(8).find('input').css('width', '35%');
    $('#tab_factoring').find('thead').find('tr').eq(0).find('th').eq(9).find('input').css('width', '99%');
    $('#tab_factoring').find('thead').find('tr').eq(0).find('th').eq(10).find('input').css('width', '99%');
    $('#tab_factoring').find('thead').find('tr').eq(0).find('th').eq(12).find('input').css('width', '35%');
    $('#tab_factoring').find('thead').find('tr').eq(0).find('th').eq(14).find('input').css('width', '99%');
    $('#tab_factoring').find('thead').find('tr').eq(0).find('th').eq(17).find('input').css('width', '99%');
    $('#tab_factoring').find('thead').find('tr').eq(0).find('th').eq(18).find('input').css('width', '99%');
    $('#tab_factoring').find('thead').find('tr').eq(0).find('th').eq(19).find('input').css('width', '35%');
    $('#tab_factoring').find('thead').find('tr').eq(0).find('th').eq(20).find('input').css('width', '35%');
    $('#tab_factoring').find('thead').find('tr').eq(0).find('th').eq(21).find('input').css('width', '35%');


}

function fijar_primera_columna_detalle_leasing(tabla, colums, selector) {
    $.datepicker.regional[""].dateFormat = 'dd/mm/yy';
    $.datepicker.setDefaults($.datepicker.regional['']);

    var buttonCommon = {
        exportOptions: {
            format: {
                body: function (data, column, row) {
                    return column === 10 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 11 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 12 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 13 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            data;

                }
            }

        }
    };

    _oTable[tabla] = $('#' + tabla).dataTable({
        "bSort": true,
        "bFilter": true,
        "ordering": true,
        "columnDefs": [
            {className: "dt-body-right", "targets": [0, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17]},
            {type: "formatted-num", "targets": [0, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17]}
        ],
        footerCallback: function (row, data, start, end, display) {
            var api = this.api(), data;

            if (colums !== undefined && $('#' + tabla + ' tbody tr').length !== 0) {
                calcular(api, colums, selector);
            }
        },
        dom: 'Bfrtip',
        buttons: [
            $.extend(true, {}, buttonCommon,
                    {
                        extend: 'copyHtml5',
                        exportOptions: {
                            columns: ':visible'
                        }
                    }),
            $.extend(true, {}, buttonCommon,
                    {
                        extend: 'excelHtml5',
                        exportOptions: {
                            columns: ':visible'
                        }

                    })
        ],
        "language": {
            "url": "data/Spanish.json",
            "zeroRecords": "Sin informacion para mostrar"
        }
    }).columnFilter(
            {sPlaceHolder: "head:before",
                aoColumns: [
                    null, null, {type: "text"}, {type: "text"}, {type: "checkbox"}, {type: "text"}, {type: "text"}, {type: "text"}, {type: "text"}, {type: "checkbox"}
                    , null, null, null, null, {type: "text"}, {type: "text"}, {type: "text"}, {type: "text"}, null, null
                            , null, null]});
    ;

    $("div.toolbar").html('<b>Custom tool bar! Text/images etc.</b>');

    $('#tab_leasing').find('thead').find('tr').eq(0).find('th').eq(2).find('input').css('width', '99%');
    $('#tab_leasing').find('thead').find('tr').eq(0).find('th').eq(3).find('input').css('width', '99%');
    $('#tab_leasing').find('thead').find('tr').eq(0).find('th').eq(5).find('input').css('width', '99%');
    $('#tab_leasing').find('thead').find('tr').eq(0).find('th').eq(6).find('input').css('width', '99%');
    $('#tab_leasing').find('thead').find('tr').eq(0).find('th').eq(7).find('input').css('width', '99%');
    $('#tab_leasing').find('thead').find('tr').eq(0).find('th').eq(8).find('input').css('width', '99%');
    $('#tab_leasing').find('thead').find('tr').eq(0).find('th').eq(14).find('input').css('width', '99%');
    $('#tab_leasing').find('thead').find('tr').eq(0).find('th').eq(15).find('input').css('width', '99%');
    $('#tab_leasing').find('thead').find('tr').eq(0).find('th').eq(16).find('input').css('width', '99%');
    $('#tab_leasing').find('thead').find('tr').eq(0).find('th').eq(17).find('input').css('width', '99%');
    $('#tab_leasing').find('thead').find('tr').eq(0).find('th').eq(4).find('button').hide();


}

function fijar_primera_columna_detalle_leasing_ej(tabla, colums, selector) {
    $.datepicker.regional[""].dateFormat = 'dd/mm/yy';
    $.datepicker.setDefaults($.datepicker.regional['']);

    var buttonCommon = {
        exportOptions: {
            format: {
                body: function (data, column, row) {
                    return column === 8 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 9 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 10 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 11 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            data;

                }
            }

        }
    };

    _oTable[tabla] = $('#' + tabla).dataTable({
        "bSort": true,
        "bFilter": true,
        "ordering": true,
        "columnDefs": [
            {className: "dt-body-right", "targets": [0, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15]},
            {type: "formatted-num", "targets": [0, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15]}
        ],
        footerCallback: function (row, data, start, end, display) {
            var api = this.api(), data;

            if (colums !== undefined && $('#' + tabla + ' tbody tr').length !== 0) {
                calcular(api, colums, selector);
            }
        },
        dom: 'Bfrtip',
        buttons: [
            $.extend(true, {}, buttonCommon,
                    {
                        extend: 'copyHtml5',
                        exportOptions: {
                            columns: ':visible'
                        }
                    }),
            $.extend(true, {}, buttonCommon,
                    {
                        extend: 'excelHtml5',
                        exportOptions: {
                            columns: ':visible'
                        }

                    })
        ],
        "language": {
            "url": "data/Spanish.json",
            "zeroRecords": "Sin informacion para mostrar"
        }
    }).columnFilter(
            {sPlaceHolder: "head:before",
                aoColumns: [
                    null, null, {type: "text"}, {type: "text"}, {type: "text"}, {type: "text"}, {type: "text"}, {type: "checkbox"}, null, null
                            , null, null, {type: "text"}, {type: "text"}, {type: "text"}, {type: "text"}]});

    $("div.toolbar").html('<b>Custom tool bar! Text/images etc.</b>');

    $('#tab_leasing').find('thead').find('tr').eq(0).find('th').eq(2).find('input').css('width', '99%');
    $('#tab_leasing').find('thead').find('tr').eq(0).find('th').eq(3).find('input').css('width', '99%');
    $('#tab_leasing').find('thead').find('tr').eq(0).find('th').eq(4).find('input').css('width', '99%');
    $('#tab_leasing').find('thead').find('tr').eq(0).find('th').eq(5).find('input').css('width', '99%');
    $('#tab_leasing').find('thead').find('tr').eq(0).find('th').eq(6).find('input').css('width', '99%');
    $('#tab_leasing').find('thead').find('tr').eq(0).find('th').eq(12).find('input').css('width', '99%');
    $('#tab_leasing').find('thead').find('tr').eq(0).find('th').eq(13).find('input').css('width', '99%');
    $('#tab_leasing').find('thead').find('tr').eq(0).find('th').eq(14).find('input').css('width', '99%');
    $('#tab_leasing').find('thead').find('tr').eq(0).find('th').eq(15).find('input').css('width', '99%');



}

function fijar_primera_columna_detalle_credito(tabla, colums, selector) {
    $.datepicker.regional[""].dateFormat = 'dd/mm/yy';
    $.datepicker.setDefaults($.datepicker.regional['']);


    var buttonCommon = {
        exportOptions: {
            format: {
                body: function (data, column, row) {
                    return column === 9 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 10 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 11 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 12 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            data;

                }
            }

        }
    };

    _oTable[tabla] = $('#' + tabla).dataTable({
        "bSort": true,
        "bFilter": true,
        "ordering": true,
        "columnDefs": [
            {className: "dt-body-right", "targets": [0, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16]},
            {type: "formatted-num", "targets": [0, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16]}
        ],
        footerCallback: function (row, data, start, end, display) {
            var api = this.api(), data;

            if (colums !== undefined && $('#' + tabla + ' tbody tr').length !== 0) {
                calcular(api, colums, selector);
            }
        },
        dom: 'Bfrtip',
        buttons: [
            $.extend(true, {}, buttonCommon,
                    {
                        extend: 'copyHtml5',
                        exportOptions: {
                            columns: ':visible'
                        }
                    }),
            $.extend(true, {}, buttonCommon,
                    {
                        extend: 'excelHtml5',
                        exportOptions: {
                            columns: ':visible'
                        }

                    })
        ],
        "language": {
            "url": "data/Spanish.json",
            "zeroRecords": "Sin informacion para mostrar"
        }
    }).columnFilter(
            {sPlaceHolder: "head:before",
                aoColumns: [
                    null, null, {type: "text"}, {type: "text"}, {type: "checkbox"}, {type: "text"}, {type: "text"}, {type: "text"}, {type: "checkbox"}, null
                            , null, null, null, {type: "text"}, {type: "text"}, {type: "text"}, {type: "text"}, null, null, null
                ]});

    $("div.toolbar").html('<b>Custom tool bar! Text/images etc.</b>');

    /*  new $.fn.dataTable.FixedColumns(_oTable[tabla], {
     "iLeftColumns": 1
     }
     );*/

    $('#tab_creditos').find('thead').find('tr').eq(0).find('th').eq(2).find('input').css('width', '99%');
    $('#tab_creditos').find('thead').find('tr').eq(0).find('th').eq(3).find('input').css('width', '99%');
    $('#tab_creditos').find('thead').find('tr').eq(0).find('th').eq(5).find('input').css('width', '99%');
    $('#tab_creditos').find('thead').find('tr').eq(0).find('th').eq(6).find('input').css('width', '99%');
    $('#tab_creditos').find('thead').find('tr').eq(0).find('th').eq(7).find('input').css('width', '99%');
    $('#tab_creditos').find('thead').find('tr').eq(0).find('th').eq(13).find('input').css('width', '99%');
    $('#tab_creditos').find('thead').find('tr').eq(0).find('th').eq(14).find('input').css('width', '99%');
    $('#tab_creditos').find('thead').find('tr').eq(0).find('th').eq(15).find('input').css('width', '99%');
    $('#tab_creditos').find('thead').find('tr').eq(0).find('th').eq(16).find('input').css('width', '99%');
    $('#tab_creditos').find('thead').find('tr').eq(0).find('th').eq(4).find('button').hide();

}

function fijar_primera_columna_detalle_credito_ej(tabla, colums, selector) {
    $.datepicker.regional[""].dateFormat = 'dd/mm/yy';
    $.datepicker.setDefaults($.datepicker.regional['']);

    var buttonCommon = {
        exportOptions: {
            format: {
                body: function (data, column, row) {
                    return column === 7 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 8 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 9 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            column === 10 ?
                            data = data.replace(/[$.]/g, '') * 1 :
                            data;

                }
            }

        }
    };

    _oTable[tabla] = $('#' + tabla).dataTable({
        "bSort": true,
        "bFilter": true,
        "ordering": true,
        "columnDefs": [
            {className: "dt-body-right", "targets": [0, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16]},
            {type: "formatted-num", "targets": [0, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16]}
        ],
        footerCallback: function (row, data, start, end, display) {
            var api = this.api(), data;

            if (colums !== undefined && $('#' + tabla + ' tbody tr').length !== 0) {
                calcular(api, colums, selector);
            }
        },
        dom: 'Bfrtip',
        buttons: [
            $.extend(true, {}, buttonCommon,
                    {
                        extend: 'copyHtml5',
                        exportOptions: {
                            columns: ':visible'
                        }
                    }),
            $.extend(true, {}, buttonCommon,
                    {
                        extend: 'excelHtml5',
                        exportOptions: {
                            columns: ':visible'
                        }

                    })
        ],
        "language": {
            "url": "data/Spanish.json",
            "zeroRecords": "Sin informacion para mostrar"
        }
    }).columnFilter(
            {sPlaceHolder: "head:before",
                aoColumns: [
                    null, null, {type: "text"}, {type: "text"}, {type: "text"}, {type: "text"}, {type: "checkbox"}, null, null
                            , null, null, {type: "text"}, {type: "text"}, {type: "text"}, {type: "text"}]});


    $("div.toolbar").html('<b>Custom tool bar! Text/images etc.</b>');

    $('#tab_creditos').find('thead').find('tr').eq(0).find('th').eq(2).find('input').css('width', '99%');
    $('#tab_creditos').find('thead').find('tr').eq(0).find('th').eq(3).find('input').css('width', '99%');
    $('#tab_creditos').find('thead').find('tr').eq(0).find('th').eq(4).find('input').css('width', '99%');
    $('#tab_creditos').find('thead').find('tr').eq(0).find('th').eq(5).find('input').css('width', '99%');
    $('#tab_creditos').find('thead').find('tr').eq(0).find('th').eq(11).find('input').css('width', '99%');
    $('#tab_creditos').find('thead').find('tr').eq(0).find('th').eq(12).find('input').css('width', '99%');
    $('#tab_creditos').find('thead').find('tr').eq(0).find('th').eq(13).find('input').css('width', '99%');
    $('#tab_creditos').find('thead').find('tr').eq(0).find('th').eq(14).find('input').css('width', '99%');

}

function calcular(api, colums, selector) {

    // Remove the formatting to get integer data for summation
    var intVal = function (i) {
        return typeof i === 'string' ?
                i.replace(/[\$.]/g, '') * 1 :
                typeof i === 'number' ?
                i : 0;
    };

    for (var colum in colums) {
        var col = colums[colum];
        // Total over all pages
        var total = api
                .column(col)
                .data()
                .reduce(function (a, b) {
                    return intVal(a) + intVal(b);
                });
        // Total over all pages filtered
        var pageTotal = api
                .column(col, {filter: 'applied'})
                .data()
                .reduce(function (a, b) {
                    return intVal(a) + intVal(b);
                }, 0);

        // Update 

        if (selector == undefined || selector == "footer") {
            $(api.column(col).footer()).html(
                    '' + formatN(pageTotal) + '    &nbsp;(' + formatN(total) + ' )'
                    );
        } else {
            $(api.column(col).header()).parents("thead").eq(0).find("tr").eq(0).find("th").eq(col).html(
                    '' + formatN(pageTotal) + '    &nbsp;<br>(' + formatN(total) + ' )'
                    );

        }
    }

}

var _Filtros = {};

function filterTable(tablename, col, element, fila) {
    var value = undefined;

    var inp;
    if ($(element).prop("tagName") == 'SELECT') {
        console.log('select');
        inp = $(element);
        value = $(element).val();
    } else if ($(element).prev().prop("tagName") == 'INPUT') {
        console.log('input');

        value = $(element).prev('input').val();
        inp = $(element).prev('input');
    } else if ($(element).prev().prop("tagName") == 'SELECT') {
        console.log('select');

        value = "" + $(element).prev('select').find('option:selected').eq(0).text();
        inp = $(element).prev('select');
    } else {
        console.log('is ' + $(element).prev().prop("tagName"));
    }


//    console.log("value.trim().length " + value.trim().length + "  " + value)
    if (value.trim().length == 0 || value.trim().length == undefined) {
        return;
    }
    var columna = $(_oTable[tablename].column(col).header()).parents("thead").eq(0).find("tr").eq(fila).find("th").eq(col);
    console.log(columna.html());
    if (columna.find('button').size() == 0) {
        columna.append('<button class="miniboton" style="float: right;white-space: normal !important;" onclick="ResetFilter(this,\'' + tablename + '\',' + col + ')" >R</button>');
    }
    _oTable[tablename].columns(col).search(value).draw();
    if (_Filtros[tablename] == undefined) {
        _Filtros[tablename] = {};
    }


    _Filtros[tablename]['' + col] = inp;
}

function ResetFilter(element, tablename, colum) {
    console.log("reset " + tablename + " colum " + colum);

    _oTable[tablename].columns(colum).search("").draw();
    $(_Filtros[tablename]['' + colum]).val("");
    $(element).remove();
}

function formatN(n) {
    try {
        return new BigNumber(n).toFormat(0).replace(/\,/g, ".");
    } catch (err) {
        console.log("Error en : " + err.message)
    }
}

function filtrar(tabla, col, fila) {
    fila = fila != undefined ? fila : 0;
    if (_oTable[tabla] == undefined) {
        _oTable[tabla] = tabla;
    }

    _oTable[tabla].cant = _oTable[tabla].api().rows().column(col).nodes().length;

    var text = $(_oTable[tabla].api().column(col).header()).parents("thead").eq(0).find("tr").eq(fila).find("th").eq(col).text();
    $(_oTable[tabla].api().column(col).header()).parents("thead").eq(0).find("tr").eq(fila).find("th").eq(col).html("<span>" + text + "</span>");
    $(_oTable[tabla].api().column(col).header()).parents("thead").eq(0).find("tr").eq(fila).find("th").eq(col).find("span").eq(0).poshytip({
        className: 'tip-twitter',
        content: function (updateCallback) {
            var container = $('<div/>');
            var select = $('<select  width="300" onchange="filterTable(\'' + tabla + '\',' + col + ',this,' + fila + ')"/>');


            if (_oTable[tabla]['col-' + col] == undefined) {
                var options = [];
                for (var i = 0; i <= _oTable[tabla].cant; i++) {


                    var data = _oTable[tabla].row(i).data();
                    if (data == undefined) {
                        continue;
                    }

                    if (options.indexOf(data[col * 1]) == -1) {
                        options.push(data[col * 1]);
                    }
                }
                _oTable[tabla]['col-' + col] = options;

            }
            var option = $('<option ></option>')
            option.appendTo(select);
            for (var i = 0; i < _oTable[tabla]['col-' + col].length; i++) {
                var option = $('<option >' + _oTable[tabla]['col-' + col][i] + '</option>')
                option.appendTo(select);
            }
            var boton = $('<button class="paginate_button" onclick="filterTable(\'' + tabla + '\',' + col + ',this,' + fila + ')">Filtrar</button>');


            select.appendTo(container);
            boton.appendTo(container);
            //$('<button/>').addClass('paginate_button').on("click",filterTable(tabla , col,'this',fila));
            console.log(_oTable[tabla].cant)
            return  container;//'<button class="paginate_button" onclick="filterTable(\'' + tabla + '\',' + col + ',this,' + fila + ')">Filtrar</button>';
        }
    });

}


function filtroSelect() {
    $('#example').DataTable( {
        initComplete: function () {
            this.api().columns().every( function () {
                var column = this;
                var select = $('<select><option value=""></option></select>')
                    .appendTo( $(column.footer()).empty() )
                    .on( 'change', function () {
                        var val = $.fn.dataTable.util.escapeRegex(
                            $(this).val()
                        );
 
                        column
                            .search( val ? '^'+val+'$' : '', true, false )
                            .draw();
                    } );
 
                column.data().unique().sort().each( function ( d, j ) {
                    select.append( '<option value="'+d+'">'+d+'</option>' )
                } );
            } );
        }
    } );
}; 