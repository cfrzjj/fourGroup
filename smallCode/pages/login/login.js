const app = getApp();
Page({
  data: {
    focus: false,
    imageUrl: app.globalData.imageUrl,
    // url: app.globalData.url
  },
  bindButtonTap: function (e) {
    this.setData({
      focus: true,
    });
  },
  onfocus: function (e) {
    console.log(e);
    this.setData({ focusDetail: JSON.stringify(e.detail) });
  },
  submit: function(e){
    // console.log(e.detail)
    const userInfo = e.detail.value;
    console.log(e.detail.value);
    tt.request({
      // url: app.globalData.contextUrl +'/login',
      url: app.globalData.header + app.globalData.contextUrl + '/login',
      header: {"content-type": "application/json"},
      method: 'POST',
      data: userInfo
    });
    console.log(app.globalData.contextUrl)
  }
});