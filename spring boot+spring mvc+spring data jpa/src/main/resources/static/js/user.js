var vue = new Vue({
  el:"#app",
    data:{
      list:[],
      user:{}
    },
    methods: {
        findAll: function () {
            axios.get("./user/findAll").then(function (response) {
                //axios里面的this是window对象，外面才是vue对象，（可以使用_this，在axios外 var _this=this;)
                vue.list = response.data;
            })
        },
        findOne:function (id) {
            axios.get("./user/findOne",{
                params:{
                    id:id
                }
            }).then(function (response) {
                vue.user = response.data;
            })
        },
        update:function () {
            axios.post("./user/update",this.user).then(function (response) {//这里的this还是vue因为还没有进入axios
                vue.findAll();  //新增后在展示所有
            }).catch(function (err) {
                alert("修改失败"+err);
            })
        }

    },
    created: function () {
        this.findAll()
    }
	
})