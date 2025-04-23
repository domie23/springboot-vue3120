const base = {
    get() {
        return {
            url : "http://localhost:8080/mengchongxiaozhishi/",
            name: "mengchongxiaozhishi",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/mengchongxiaozhishi/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "“萌宠小知识”网站"
        } 
    }
}
export default base
