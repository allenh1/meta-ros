# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "cob_android_resource_server"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native rospy"
SRC_URI = "https://github.com/ipa320/cob_android-release/archive/release/kinetic/cob_android_resource_server/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7be376e8d8843c47ae9000f2abb76b59"
SRC_URI[sha256sum] = "ab801d54886d8df140b3472a666b3c19e4839e43f0914ac7f4cd3a4ee439179d"
S = "${WORKDIR}/cob_android-release-release-kinetic-cob_android_resource_server-0.1.3-0"

inherit catkin
