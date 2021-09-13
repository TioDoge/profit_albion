<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profit capas</title>
    </head>
    <body>
        <div class="row"><h3>PROFIT DE MONTURAS</h3></div>
        <div class="row">
            <div class="col-md-12" id="">
                <table class="table table-striped" id="table-monturas">
                    <colgroup>
                        <col width="200px">
                        <col width="200px">
                        <col width="200px">                            
                        <col width="200px">
                        <col width="200px">
                        <col width="200px">
                        <col width="200px">
                        <col width="200px">
                    </colgroup>
                    <thead>
                        <tr>
                            <th>Montura</th>
                            <th>Coste de cria</th>
                            <th>Ciudad cria</th>
                            <th>Coste de comida</th>
                            <th>Ciudad comida</th>
                            <th>Horas de crianza</th>
                            <th>Coste de Recursos</th>
                            <th>Ciudad Recursos</th>
                            <th>Coste corazon</th>
                            <th>Ciudad corazon</th>
                            <th>Venta montura</th>
                            <th>Ciudad venta</th>
                            <th>Profit</th>
                        </tr>
                    </thead>
                    <tbody>

                    </tbody>
                </table>
            </div>
        </div>
        <script src="js/Plugins/js_jquery.min.js" type="text/javascript"></script>
        <script src="js/Plugins/js_bootstrap.min.js" type="text/javascript"></script>
        <script src="js/Plugins/jquery.dataTables.js" type="text/javascript"></script>
        <script src="js/Plugins/bootstrap-datepicker.js" type="text/javascript"></script>
        <script src="js/Plugins/bootstrap-filestyle.js" type="text/javascript"></script>

        <script src="js/Plugins/bootstrap-toggle.min.js" type="text/javascript"></script>

        <script src="js/Plugins/dataTables.bootstrap.js" type="text/javascript"></script>
        <script src="js/Plugins/dataTables.responsive.js" type="text/javascript"></script>
        <script src="js/Plugins/dmuploader-customer.js" type="text/javascript"></script>
        <script src="js/Plugins/highcharts.js" type="text/javascript"></script>
        <script src="js/Plugins/jquery-cookie.js" type="text/javascript"></script>
        <script src="js/Plugins/jquery.dataTables.rowGrouping.js" type="text/javascript"></script>

        <script src="js/Plugins/jquery.fileDownload.js" type="text/javascript"></script>
        <script src="js/Plugins/jquery.poshytip.js" type="text/javascript"></script>
        <script src="js/Plugins/sweetalert-dev.js" type="text/javascript"></script>
        <script src="js/Plugins/jquery.webui-popover.js" type="text/javascript"></script>
        <script src="js/Plugins/rangeSlider.js" type="text/javascript"></script>
        <script src="js/Plugins/bootstrap-slider.js" type="text/javascript"></script>
        <script src="js/Plugins/bootstrap-rating.js" type="text/javascript"></script>
        <script src="js/Plugins/js.tooltip.js" type="text/javascript"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>    
        <script src="js/APPComun.js" type="text/javascript"></script>
        <script src="js/monturas_r.js" type="text/javascript"></script>
        <script>
            initTableMonturas();
        </script>
    </body>
</html>
