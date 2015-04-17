@interface A : NSObject<Protocol1, Protocol2>

- (void)oneParamNoRet:(int)p1;
- (void)twoParamsNoRet:(int)n1 opt2:(int)n2;
- (void)threeParamsNoRet:(int)n1 opt2:(int)n2 opt3:(int)n3;
- (int)noParamIntRet;
- (int)oneParamIntRet:(int)n1;

@end