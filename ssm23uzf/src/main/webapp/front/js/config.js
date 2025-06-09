
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '社团信息',
	url: './pages/shetuanxinxi/list.html'
}, 
{
	name: '社团新闻',
	url: './pages/shetuanxinwen/list.html'
}, 
{
	name: '社团活动',
	url: './pages/shetuanhuodong/list.html'
}, 

{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/ssm23uzf/admin/dist/index.html";

var cartFlag = false

var chatFlag = false

var systemName = '大学生社团管理系统'




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"社团负责人","menuJump":"列表","tableName":"shetuanfuzeren"}],"menu":"社团负责人管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"社团信息","menuJump":"列表","tableName":"shetuanxinxi"}],"menu":"社团信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"社团分类","menuJump":"列表","tableName":"shetuanfenlei"}],"menu":"社团分类管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"社团新闻","menuJump":"列表","tableName":"shetuanxinwen"}],"menu":"社团新闻管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"用户咨询","menuJump":"列表","tableName":"yonghuzixun"}],"menu":"用户咨询管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"社团活动","menuJump":"列表","tableName":"shetuanhuodong"}],"menu":"社团活动管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"社团成员","menuJump":"列表","tableName":"shetuanchengyuan"}],"menu":"社团成员管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"社团经费","menuJump":"列表","tableName":"shetuanjingfei"}],"menu":"社团经费管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"活动报名","menuJump":"列表","tableName":"huodongbaoming"}],"menu":"活动报名管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","留言","入团申请"],"menu":"社团信息列表","menuJump":"列表","tableName":"shetuanxinxi"}],"menu":"社团信息模块"},{"child":[{"buttons":["查看"],"menu":"社团新闻列表","menuJump":"列表","tableName":"shetuanxinwen"}],"menu":"社团新闻模块"},{"child":[{"buttons":["查看","报名"],"menu":"社团活动列表","menuJump":"列表","tableName":"shetuanhuodong"}],"menu":"社团活动模块"}],"roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","修改","删除"],"menu":"用户咨询","menuJump":"列表","tableName":"yonghuzixun"}],"menu":"用户咨询管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"社团成员","menuJump":"列表","tableName":"shetuanchengyuan"}],"menu":"社团成员管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"活动报名","menuJump":"列表","tableName":"huodongbaoming"}],"menu":"活动报名管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看","留言","入团申请"],"menu":"社团信息列表","menuJump":"列表","tableName":"shetuanxinxi"}],"menu":"社团信息模块"},{"child":[{"buttons":["查看"],"menu":"社团新闻列表","menuJump":"列表","tableName":"shetuanxinwen"}],"menu":"社团新闻模块"},{"child":[{"buttons":["查看","报名"],"menu":"社团活动列表","menuJump":"列表","tableName":"shetuanhuodong"}],"menu":"社团活动模块"}],"roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"社团信息","menuJump":"列表","tableName":"shetuanxinxi"}],"menu":"社团信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"社团新闻","menuJump":"列表","tableName":"shetuanxinwen"}],"menu":"社团新闻管理"},{"child":[{"buttons":["查看","审核"],"menu":"用户咨询","menuJump":"列表","tableName":"yonghuzixun"}],"menu":"用户咨询管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"社团活动","menuJump":"列表","tableName":"shetuanhuodong"}],"menu":"社团活动管理"},{"child":[{"buttons":["查看","审核"],"menu":"社团成员","menuJump":"列表","tableName":"shetuanchengyuan"}],"menu":"社团成员管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"社团经费","menuJump":"列表","tableName":"shetuanjingfei"}],"menu":"社团经费管理"},{"child":[{"buttons":["查看","审核"],"menu":"活动报名","menuJump":"列表","tableName":"huodongbaoming"}],"menu":"活动报名管理"}],"frontMenu":[{"child":[{"buttons":["查看","留言","入团申请"],"menu":"社团信息列表","menuJump":"列表","tableName":"shetuanxinxi"}],"menu":"社团信息模块"},{"child":[{"buttons":["查看"],"menu":"社团新闻列表","menuJump":"列表","tableName":"shetuanxinwen"}],"menu":"社团新闻模块"},{"child":[{"buttons":["查看","报名"],"menu":"社团活动列表","menuJump":"列表","tableName":"shetuanhuodong"}],"menu":"社团活动模块"}],"roleName":"社团负责人","tableName":"shetuanfuzeren"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
