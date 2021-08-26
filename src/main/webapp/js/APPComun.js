function getJson(url, data, async, st_200, st_404, metod, st_301, mime) {
//    procces('getJson' + url);
    var contenido;
    $.ajax({
        url: url,
        data: data,
        type: metod || "POST",
        async: async || false,
        'beforeSend': function (xhr) {
            try {
                if (mime === undefined || mime === true) {
                    xhr.overrideMimeType('text/html; charset=iso-8859-1');
                }
            } catch (e) {


            }
        },
        statusCode: {
            200: function (returndata) {
                try {
                    returndata = $.parseJSON(returndata);
                } catch (err) {
                    try {
                        returndata = JSON.parse(returndata);
                    } catch (err) {
                    }

                }
//                unprocces('getJson' + url);
                if (st_200 != undefined) {
                    st_200(returndata);
                }
                contenido = returndata;
            },
            404: function (xhr, status, error) {
//                unprocces('getJson' + url);
                if (st_404 != undefined) {
                    st_404(xhr, status, error);
                } else {
                    alertas("Recurso no encontrado", "aceptar", function () {
                    });
                }
            },
            500: function (xhr, status, error) {
//                unprocces('getJson' + url);
                if (st_404 != undefined) {
                    st_404(xhr, status, error);
                } else {
                    alertas("Ocurrió un problema al realizar la solicitud. Inténtelo más tarde<br>", "Aceptar", function () {
                    });
                }
            },
            301: function (xhr, status, error) {
//                unprocces('getJson' + url);
                if (st_301 != undefined) {
                    st_301(xhr, status, error);
                } else {
                    alertas("Ocurrió un problema al realizar la solicitud. Inténtelo más tarde<br>", "Aceptar", function () {
                    });
                }
            }
        }
    });
    return contenido;
}

function DT_init(a, t) {
    var e = {pageLength: 10, "order": [[1, "desc"]], dom: "<'row'<'col-sm-12 col-md-12 datatable-table table-responsive'tr>><'row'<'col-sm-5'i><'col-sm-7'p>>"};
//    var e = {pageLength: 10, "bSort": false, dom: "<'row'<'col-sm-12 col-md-12 datatable-table table-responsive'tr>><'row'<'col-sm-5'i><'col-sm-7'p>>"};
    return void 0 != t && (e = $.extend(!0, e, t)), $("table#" + a).dataTable(e)
}
function DT_get_row_by_id(a, t) {
    return $("#" + t)
}
function DT(a) {
    a.DataTable();
}
function DT_remove_tr(a, t) {
    a.DataTable().row(t).remove().draw();
}
function DT_remove_tr_by_id(a, t) {
    a.DataTable().row(DT_get_row_by_id(a, t)).remove().draw();
}
function DT_get_data_by_row_id(a, t) {
    return DT_get_data_by_tr(a, $("#" + t));
}
function DT_set_data_by_row_id(a, t, e) {
    a.DataTable().row($("#" + t)).data(e).draw();
}
function DT_set_data_by_row(a, t, e) {
    a.DataTable().row(t).data(e).draw();
}
function DT_search(a, t, e, r, n) {
    t = new String(t), a.DataTable().column(e).search(t, r || !1, n || !1).draw()
}
function DT_search_disabled(a, t) {
    a.DataTable().column(t).search("").draw()
}
function DT_CargarDatos(a, t, e, r, n) {
    var o = 0;
    t = void 0 != t ? t : 0;
    try {
        r = $.parseJSON(r)
    } catch (l) {
    }
    try {
        if ($.isArray(r)) {
            e = void 0 != e ? e : r.length, o = t + e, o > r.length && (o = r.length);
            for (var d = t; o > d; d++)
                $.isArray(r[d]) ? a.DataTable().row.add(r[d]) : $.isPlainObject(r[d]) ? a.DataTable().row.add(r[d]) : a.DataTable().row.add([r[d]]);
            a.DataTable().draw(), void 0 != n && (n -= 1, a.fnPageChange(n))
        } else
            $.isPlainObject(r) ? (a.DataTable().row.add(r), a.DataTable().draw()) : (console.log($.isPlainObject(r) + JSON.stringify(r)), a.DataTable().row.add(r), a.DataTable().draw())
    } catch (l) {
        console.log("Error al cargar la tabla " + $(a).attr("id")), console.log(l.message)
    }
    return o
}
function DT_count(a) {
    return a.DataTable().data().length;
}
function DT_get_all_data(a) {
    return a.fnGetData();
}
function DT_Error(a) {
    DT_Clear(a);
    var t = a.fnSettings().aoColumns.length;
    $(a).find("tbody").html("<tr><td colspan='" + t + "' class='txt-center'>Error al cargar datos</td></tr>");
}
function DT_cargando(a) {
    DT_Clear(a);
    var t = a.fnSettings().aoColumns.length;
    $(a).find("tbody").html("<tr><td colspan='" + t + "' class='txt-center'>Cargando</td></tr>");
}
function DT_Clear(a) {
    a.DataTable().clear().draw()
}
function DT_get_data_by_tr(a, t) {
    return a.DataTable().row(t).data();
}
function DT_UpdateR(a) {
    a.DataTable().responsive.updateClassLogic();
}
function DT_hidden_colum(a, t, e) {
    var r = a.DataTable().column(t);
    r.visible(e || !1)
}
var _TEMP = {};