/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface */

#ifndef _Included_org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface
#define _Included_org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface
#ifdef __cplusplus
extern "C" {
#endif
#undef org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_HKEY_CLASSES_ROOT
#define org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_HKEY_CLASSES_ROOT 1L
#undef org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_HKEY_CURRENT_CONFIG
#define org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_HKEY_CURRENT_CONFIG 2L
#undef org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_HKEY_LOCAL_MACHINE
#define org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_HKEY_LOCAL_MACHINE 3L
#undef org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_HKEY_CURRENT_USER
#define org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_HKEY_CURRENT_USER 4L
#undef org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_WM_QUERYENDSESSION
#define org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_WM_QUERYENDSESSION 17L
#undef org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_WM_ENDSESSION
#define org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_WM_ENDSESSION 22L
#undef org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_WM_POWERBROADCAST
#define org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_WM_POWERBROADCAST 536L
#undef org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_PBT_APMQUERYSUSPEND
#define org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_PBT_APMQUERYSUSPEND 0L
#undef org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_PBT_APMSUSPEND
#define org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_PBT_APMSUSPEND 4L
#undef org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_PBT_APMRESUMESUSPEND
#define org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_PBT_APMRESUMESUSPEND 7L
/* Inaccessible static: enabled */
/* Inaccessible static: enabled_set */
/* Inaccessible static: cb */
/*
 * Class:     org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface
 * Method:    initialise
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_initialise
  (JNIEnv *, jclass);

/*
 * Class:     org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface
 * Method:    destroy
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_destroy
  (JNIEnv *, jclass);

/*
 * Class:     org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface
 * Method:    getVersion
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_getVersion
  (JNIEnv *, jclass);

/*
 * Class:     org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface
 * Method:    readStringValue
 * Signature: (ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_readStringValue
  (JNIEnv *, jclass, jint, jstring, jstring);

/*
 * Class:     org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface
 * Method:    writeStringValue
 * Signature: (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_writeStringValue
  (JNIEnv *, jclass, jint, jstring, jstring, jstring);

/*
 * Class:     org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface
 * Method:    readWordValue
 * Signature: (ILjava/lang/String;Ljava/lang/String;)I
 */
JNIEXPORT jint JNICALL Java_org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_readWordValue
  (JNIEnv *, jclass, jint, jstring, jstring);

/*
 * Class:     org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface
 * Method:    writeWordValue
 * Signature: (ILjava/lang/String;Ljava/lang/String;I)V
 */
JNIEXPORT void JNICALL Java_org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_writeWordValue
  (JNIEnv *, jclass, jint, jstring, jstring, jint);

/*
 * Class:     org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface
 * Method:    deleteKey
 * Signature: (ILjava/lang/String;Z)V
 */
JNIEXPORT void JNICALL Java_org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_deleteKey
  (JNIEnv *, jclass, jint, jstring, jboolean);

/*
 * Class:     org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface
 * Method:    deleteValue
 * Signature: (ILjava/lang/String;Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_deleteValue
  (JNIEnv *, jclass, jint, jstring, jstring);

/*
 * Class:     org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface
 * Method:    createProcess
 * Signature: (Ljava/lang/String;Z)V
 */
JNIEXPORT void JNICALL Java_org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_createProcess
  (JNIEnv *, jclass, jstring, jboolean);

/*
 * Class:     org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface
 * Method:    moveToRecycleBin
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_moveToRecycleBin
  (JNIEnv *, jclass, jstring);

/*
 * Class:     org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface
 * Method:    copyPermission
 * Signature: (Ljava/lang/String;Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_copyPermission
  (JNIEnv *, jclass, jstring, jstring);

/*
 * Class:     org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface
 * Method:    testNativeAvailability
 * Signature: (Ljava/lang/String;)Z
 */
JNIEXPORT jboolean JNICALL Java_org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_testNativeAvailability
  (JNIEnv *, jclass, jstring);

/*
 * Class:     org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface
 * Method:    traceRoute
 * Signature: (IIIILorg/gudy/azureus2/platform/win32/access/impl/AEWin32AccessCallback;)V
 */
JNIEXPORT void JNICALL Java_org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_traceRoute
  (JNIEnv *, jclass, jint, jint, jint, jint, jobject);

/*
 * Class:     org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface
 * Method:    shellExecute
 * Signature: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)I
 */
JNIEXPORT jint JNICALL Java_org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_shellExecute
  (JNIEnv *, jclass, jstring, jstring, jstring, jstring, jint);

/*
 * Class:     org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface
 * Method:    shellExecuteAndWait
 * Signature: (Ljava/lang/String;Ljava/lang/String;)I
 */
JNIEXPORT jint JNICALL Java_org_gudy_azureus2_platform_win32_access_impl_AEWin32AccessInterface_shellExecuteAndWait
  (JNIEnv *, jclass, jstring, jstring);

#ifdef __cplusplus
}
#endif
#endif
