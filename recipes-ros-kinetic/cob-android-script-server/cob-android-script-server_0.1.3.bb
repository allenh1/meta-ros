# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "cob_android_script_server"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-android-msgs cob-script-server rospy"
SRC_URI = "https://github.com/ipa320/cob_android-release/archive/release/kinetic/cob_android_script_server/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "aadd98e93f155ae74d110d785661cc3a"
SRC_URI[sha256sum] = "e40c3e2ba2db18bc86a2497f83dee7a81ebfb89ce27c41a5add6b23c53b689da"
S = "${WORKDIR}/cob_android-release-release-kinetic-cob_android_script_server-0.1.3-0"

inherit catkin
