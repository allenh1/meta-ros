# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Service tools"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native rospy rosservice"
SRC_URI = "https://github.com/ipa320/cob_command_tools-release/archive/release/kinetic/service_tools/0.6.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "025e58e0879900b32226b488c2e20ab1"
SRC_URI[sha256sum] = "19551f3327999512bf8b0708094e5dd0c5f0fcd3ce1a4cf834f7b21473ef1cf1"
S = "${WORKDIR}/cob_command_tools-release-release-kinetic-service_tools-0.6.6-0"

inherit catkin
