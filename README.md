# pcs
百度网盘接口调用代码示例
# 第一步 获取验证 并且输入验证码
 https://openapi.baidu.com/oauth/2.0/device/code?client_id=ZQT9cHv758TzQqBSrTtMESRI&response_type=device_code&scope=basic,netdisk
# 第二步 获取acctoken
		 https://openapi.baidu.com/oauth/2.0/token?grant_type=device_token&code=0052c712427f47fb4b271ed0c41868d4&client_id=ZQT9cHv758TzQqBSrTtMESRI&client_secret=MVz18SI2seyCucSRBAweuvPz61eaUsFP
# 第三步 根据refreToken重复刷新accessToken
