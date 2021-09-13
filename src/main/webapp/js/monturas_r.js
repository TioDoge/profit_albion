function profit_mont(){
    getJson("svl_profit", {accion: 'monturas_raras'}, true,
        function (data) {
            DT_Clear(_TEMP['table-monturas']);
            DT_CargarDatos(_TEMP['table-monturas'], 0, data.lengt, data);
        }
    );
}

function initTableMonturas(){
    if (_TEMP['table-monturas'] === undefined && document.getElementById('table-monturas')) {
        var i = 0;
        _TEMP['table-monturas'] = DT_init('table-monturas', {
            "columnDefs": [
                {
                    "targets": i++,
                    "data": "NOMBRE_MONTURA", 
                    "render": function (data, type, full, meta) {
                        return '<p class="text-center">'+data+'</p>';
                    }
                },
                {
                    "targets": i++,
                    "data": "VALOR_CRIA", 
                    "render": function (data, type, full, meta) {
                        return data;
                    }
                },
                {
                    "targets": i++,
                    "data": "CIUDAD_CRIA", 
                    "render": function (data, type, full, meta) {
                        return data;
                    }
                },
                {
                    "targets": i++,
                    "data": "VALOR_COMIDA", 
                    "render": function (data, type, full, meta) {
                        return data;
                    }
                },
                {
                    "targets": i++,
                    "data": "CIUDAD_COMIDA", 
                    "render": function (data, type, full, meta) {
                        return data;
                    }
                },
                {
                    "targets": i++,
                    "data": "HORAS_CRIANZA", 
                    "render": function (data, type, full, meta) {
                        return '<p class="text-center">'+data+'</p>';
                    }
                },
                {
                    "targets": i++,
                    "data": "COSTE_RECURSO", 
                    "render": function (data, type, full, meta) {
                        return data;
                    }
                },
                {
                    "targets": i++,
                    "data": "CIUDAD_RECURSO", 
                    "render": function (data, type, full, meta) {
                        return data;
                    }
                },
                {
                    "targets": i++,
                    "data": "COSTE_CORAZON", 
                    "render": function (data, type, full, meta) {
                        if(data==-1){
                            return '-';
                        }
                        else{
                            return data;
                        }
                    }
                },
                {
                    "targets": i++,
                    "data": "CIUDAD_CORAZON", 
                    "render": function (data, type, full, meta) {
                        if(data==""){
                            return '-';
                        }
                        else{
                            return data;
                        }
                    }
                },
                {
                    "targets": i++,
                    "data": "PRECIOS_VENTA", 
                    "render": function (data, type, full, meta) {
                        var array=data;
                        array.sort(GetSortOrder("PRECIO"));
                        if(array.length==5){
                            return array[2].PRECIO;
                        }
                        else if(array.length==4||array.length==3){
                            return array[1].PRECIO;
                        }
                        else{
                            return array[0].PRECIO;
                        }
                    }
                },
                {
                    "targets": i++,
                    "data": "PRECIOS_VENTA", 
                    "render": function (data, type, full, meta) {
                        var array=data;
                        array.sort(GetSortOrder("CIUDAD"));
                        if(array.length==5){
                            return array[2].CIUDAD;
                        }
                        else if(array.length==4||array.length==3){
                            return array[1].CIUDAD;
                        }
                        else{
                            return array[0].CIUDAD;
                        }
                    }
                },
                {
                    "targets": i++,
                    "data": "VENTA_MONTURA", 
                    "render": function (data, type, full, meta) {
                        var prom=0;
                        var array=full['PRECIOS_VENTA'];
                        array.sort(GetSortOrder("PRECIO"));
                        if(array.length==5){
                            prom= array[2].PRECIO;
                        }
                        else if(array.length==4||array.length==3){
                            prom= array[1].PRECIO;
                        }
                        else{
                            prom= array[0].PRECIO;
                        }
                        
                        if(full['COSTE_CORAZON']==-1){
                            var profit=prom-full['COSTE_RECURSO']-full['VALOR_COMIDA']-full['VALOR_CRIA'];
                            return '<p class="text-center">'+profit+'</p>';
                        }
                        else{
                            var profit=prom-full['COSTE_RECURSO']-full['VALOR_COMIDA']-full['VALOR_CRIA']-full['COSTE_CORAZON'];
                            return '<p class="text-center">'+profit+'</p>';
                        }
                    }
                }
            ]
        });
    }
    profit_mont();
}

function GetSortOrder(prop) {    
    return function(a, b) {    
        if (a[prop] > b[prop]) {    
            return 1;    
        } else if (a[prop] < b[prop]) {    
            return -1;    
        }    
        return 0;    
    }    
}  