function profitcapasf(){
    getJson("svl_profit", {accion: 'profit_capasf'}, true,
        function (data) {
            DT_Clear(_TEMP['table-capasfaccion']);
            DT_CargarDatos(_TEMP['table-capasfaccion'], 0, 4, data);
            var cora=data[5];
            DT_Clear(_TEMP['table-corazones']);
            DT_CargarDatos(_TEMP['table-corazones'], 0, cora.lengt, cora);
            var capa=data[6];
            DT_Clear(_TEMP['table-capa']);
            DT_CargarDatos(_TEMP['table-capa'], 0, capa.lengt, capa);
        }
    );
}
function initTableCapasFacciones(){
    if (_TEMP['table-corazones'] === undefined && document.getElementById('table-corazones')) {
        var i = 0;
        _TEMP['table-corazones'] = DT_init('table-corazones', {
            "columnDefs": [
                {
                    "targets": i++,
                    "data": "CIUDAD", //rut
                    "render": function (data, type, full, meta) {
                        return data;
                    }
                },
                {
                    "targets": i++,
                    "data": "T1_FACTION_HIGHLAND_TOKEN_1", //rut
                    "render": function (data, type, full, meta) {
                        return data;
                    }
                },
                {
                    "targets": i++,
                    "data": "T1_FACTION_STEPPE_TOKEN_1", //rut
                    "render": function (data, type, full, meta) {
                        return data;
                    }
                },
                {
                    "targets": i++,
                    "data": "T1_FACTION_SWAMP_TOKEN_1", //rut
                    "render": function (data, type, full, meta) {
                        return data;
                    }
                },
                {
                    "targets": i++,
                    "data": "T1_FACTION_MOUNTAIN_TOKEN_1", //rut
                    "render": function (data, type, full, meta) {
                        return data;
                    }
                },
                {
                    "targets": i++,
                    "data": "T1_FACTION_FOREST_TOKEN_1", //rut
                    "render": function (data, type, full, meta) {
                        return data;
                    }
                }
            ]
        });
    }
    
    if (_TEMP['table-capa'] === undefined && document.getElementById('table-capa')) {
        var i = 0;
        _TEMP['table-capa'] = DT_init('table-capa', {
            "columnDefs": [
                {
                    "targets": i++,
                    "data": "CIUDAD", //rut
                    "render": function (data, type, full, meta) {
                        return data;
                    }
                },
                {
                    "targets": i++,
                    "data": "T4_CAPE", //rut
                    "render": function (data, type, full, meta) {
                        return data;
                    }
                }
            ]
        });
    }
    
    if (_TEMP['table-capasfaccion'] === undefined && document.getElementById('table-capasfaccion')) {
        var i = 0;
        _TEMP['table-capasfaccion'] = DT_init('table-capasfaccion', {
            "columnDefs": [
                {
                    "targets": i++,
                    "data": "CIUDAD", //rut
                    "render": function (data, type, full, meta) {
                        return data;
                    }
                },
                {
                    "targets": i++,
                    "data": "CAPA_MART", //rut
                    "render": function (data, type, full, meta) {
                        if(data!=null&&data!="null"){
                            if(number_format(data, 0,",",".")>0){
                                return '<p class="text-success text-center">'+data+'</p>';
                            }
                            else{
                                return '<p class="text-danger text-center">'+data+'</p>';
                            }
                        }
                        else{
                            return '<p class="text-center">-</p>';
                        }
                    }
                },
                {
                    "targets": i++,
                    "data": "CAPA_BRIDGE", //rut
                    "render": function (data, type, full, meta) {
                        if(data!=null&&data!="null"){
                            if(number_format(data, 0,",",".")>0){
                                return '<p class="text-success text-center">'+data+'</p>';
                            }
                            else{
                                return '<p class="text-danger text-center">'+data+'</p>';
                            }
                        }
                        else{
                            return '<p class="text-center">-</p>';
                        }
                    }
                },
                {
                    "targets": i++,
                    "data": "CAPA_THET", //rut
                    "render": function (data, type, full, meta) {
                        if(data!=null&&data!="null"){
                            if(number_format(data, 0,",",".")>0){
                                return '<p class="text-success text-center">'+data+'</p>';
                            }
                            else{
                                return '<p class="text-danger text-center">'+data+'</p>';
                            }
                        }
                        else{
                            return '<p class="text-center">-</p>';
                        }
                    }
                },
                {
                    "targets": i++,
                    "data": "CAPA_FORT", //rut
                    "render": function (data, type, full, meta) {
                        if(data!=null&&data!="null"){
                            if(number_format(data, 0,",",".")>0){
                                return '<p class="text-success text-center">'+data+'</p>';
                            }
                            else{
                                return '<p class="text-danger text-center">'+data+'</p>';
                            }
                        }
                        else{
                            return '<p class="text-center">-</p>';
                        }
                    }
                },
                {
                    "targets": i++,
                    "data": "CAPA_LYM", //rut
                    "render": function (data, type, full, meta) {
                        if(data!=null&&data!="null"){
                            if(number_format(data, 0,",",".")>0){
                                return '<p class="text-success text-center">'+data+'</p>';
                            }
                            else{
                                return '<p class="text-danger text-center">'+data+'</p>';
                            }
                        }
                        else{
                            return '<p class="text-center">-</p>';
                        }
                    }
                }
            ]
        });
    }
    
    profitcapasf();
}

function number_format(number, decimals, dec_point, thousands_sep) {
	number = (number + '').replace(/[^0-9+\-Ee.]/g, '');
	var n = !isFinite(+number) ? 0 : +number, prec = !isFinite(+decimals) ? 0 : Math.abs(decimals), sep = (typeof thousands_sep === 'undefined') ? '.' : thousands_sep, dec = (typeof dec_point === 'undefined') ? ','
			: dec_point, s = '', toFixedFix = function(n, prec) {
		var k = Math.pow(10, prec);
		return '' + Math.round(n * k) / k;
	};
	// Fix for IE parseFloat(0.55).toFixed(0) = 0;
	s = (prec ? toFixedFix(n, prec) : '' + Math.round(n)).split('.');
	if (s[0].length > 3) {
		s[0] = s[0].replace(/\B(?=(?:\d{3})+(?!\d))/g, sep);
	}
	if ((s[1] || '').length < prec) {
		s[1] = s[1] || '';
		s[1] += new Array(prec - s[1].length + 1).join('0');
	}
	return s.join(dec);
}