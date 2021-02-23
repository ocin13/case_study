var options = {
    chart: {
      type: 'line'
    },
    series: [{
      name: 'sales',
      data: [30,40,35,50,49,60,70]
    }],
    xaxis: {
      categories: ['jan','feb','mar','apr','may','jun','jul']
    }
  }
  
  var chart = new ApexCharts(document.querySelector("#chart1"), options);
  
  chart.render();

  /********* */
  var options = {
    chart: {
      height: 280,
      type: "area"
    },
    dataLabels: {
      enabled: false
    },
    series: [
      {
        name: "Series 1",
        data: [45, 52, 38, 45, 19, 23, 80]
      }
    ],
    fill: {
      type: "gradient",
      gradient: {
        shadeIntensity: 1,
        opacityFrom: 0.7,
        opacityTo: 0.9,
        stops: [0, 90, 100]
      }
    },
    xaxis: {
      categories: [
        "01 Jan",
        "02 feb",
        "03 mar",
        "04 apr",
        "05 may",
        "06 jun",
        "07 jul"
      ]
    }
  };
  
  var chart = new ApexCharts(document.querySelector("#chart2"), options);
  
  chart.render();