import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
import adminexam from '@/views/modules/shijuanliebiao/exam'
    import shetuanhuodong from '@/views/modules/shetuanhuodong/list'
    import shetuanjingfei from '@/views/modules/shetuanjingfei/list'
    import shetuanxinxi from '@/views/modules/shetuanxinxi/list'
    import storeup from '@/views/modules/storeup/list'
    import yonghuzixun from '@/views/modules/yonghuzixun/list'
    import shetuanxinwen from '@/views/modules/shetuanxinwen/list'
    import shetuanchengyuan from '@/views/modules/shetuanchengyuan/list'
    import yonghu from '@/views/modules/yonghu/list'
    import huodongbaoming from '@/views/modules/huodongbaoming/list'
    import messages from '@/views/modules/messages/list'
    import config from '@/views/modules/config/list'
    import shetuanfuzeren from '@/views/modules/shetuanfuzeren/list'
    import shetuanfenlei from '@/views/modules/shetuanfenlei/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/shetuanhuodong',
        name: '社团活动',
        component: shetuanhuodong
      }
          ,{
	path: '/shetuanjingfei',
        name: '社团经费',
        component: shetuanjingfei
      }
          ,{
	path: '/shetuanxinxi',
        name: '社团信息',
        component: shetuanxinxi
      }
          ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
          ,{
	path: '/yonghuzixun',
        name: '用户咨询',
        component: yonghuzixun
      }
          ,{
	path: '/shetuanxinwen',
        name: '社团新闻',
        component: shetuanxinwen
      }
          ,{
	path: '/shetuanchengyuan',
        name: '社团成员',
        component: shetuanchengyuan
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/huodongbaoming',
        name: '活动报名',
        component: huodongbaoming
      }
          ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
          ,{
	path: '/shetuanfuzeren',
        name: '社团负责人',
        component: shetuanfuzeren
      }
          ,{
	path: '/shetuanfenlei',
        name: '社团分类',
        component: shetuanfenlei
      }
        ]
  },
  {
    path: '/adminexam',
    name: 'adminexam',
    component: adminexam,
    meta: {icon:'', title:'adminexam'}
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
