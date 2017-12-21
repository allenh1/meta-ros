# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides service calls for getting ros meta-information, like list of     topics"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime rosbridge-library rosgraph rosnode rospy"
SRC_URI = "https://github.com/RobotWebTools-release/rosbridge_suite-release/archive/release/lunar/${PN}/0.8.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b0b5cbaab2f1c7bb680a36ae22403829"
SRC_URI[sha256sum] = "784ec28a55d3da82d409344ea87f0f78faecfd3d3540cf6c0d6fbf18ac450547"
S = "${WORKDIR}/rosbridge_suite-release-release-lunar-${PN}-0.8.4-0"

inherit catkin
