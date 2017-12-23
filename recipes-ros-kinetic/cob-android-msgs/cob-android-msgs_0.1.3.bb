# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "cob_android_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "actionlib actionlib-msgs catkin-native message-generation message-runtime"
SRC_URI = "https://github.com/ipa320/cob_android-release/archive/release/kinetic/cob_android_msgs/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3cb6e180605fc5bc336584ce1a050f18"
SRC_URI[sha256sum] = "bbdbf218275c2337eefe4dc40f9d97ebdd51ba76ce4ba41d319fbe2ac8da09c8"
S = "${WORKDIR}/cob_android-release-release-kinetic-cob_android_msgs-0.1.3-0"

inherit catkin
